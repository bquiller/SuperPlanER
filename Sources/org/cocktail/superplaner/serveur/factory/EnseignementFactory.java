//
// / EnseignementFactory.java
// EdtScol
//
// Created by fadour on Thu Apr 28 2005.
// Copyright (c) 2005 __MyCompanyName__. All rights reserved.
//

package org.cocktail.superplaner.serveur.factory;

import org.cocktail.superplaner.serveur.DBHandler;
import org.cocktail.superplaner.serveur.metier.MaquetteAp;
import org.cocktail.superplaner.serveur.metier.MaquetteParcours;
import org.cocktail.superplaner.serveur.metier.MaquetteRepartitionSem;
import org.cocktail.superplaner.serveur.metier.MaquetteSemestre;
import org.cocktail.superplaner.serveur.metier.Periodicite;
import org.cocktail.superplaner.serveur.metier.ReservationAp;
import org.cocktail.superplaner.serveur.metier.ScolGroupeGrp;
import org.cocktail.superplaner.serveur.metier.ScolTransfertGrp;
import org.cocktail.superplaner.serveur.metier.ScolTransfertMap;
import org.cocktail.superplaner.serveur.metier.VParcoursAp;

import com.webobjects.eocontrol.EOAndQualifier;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOOrQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSTimestamp;


public class EnseignementFactory {

	private EOEditingContext eContext;

	public EnseignementFactory(EOEditingContext eContext) {
		this.eContext = eContext;
	}

	/**
	 * retourne les AP qui concernent les elements pedagogiques passes en parametres. p = Parcours, pc = Parcours Commun, s = Semestre, ssi
	 * = Semestre Impair Inférieur, fannKey : Annee
	 */
	public NSArray getApForParcoursSemestres(MaquetteParcours p, MaquetteParcours pc, MaquetteSemestre s, MaquetteSemestre sii, Number fannKey,
			EOQualifier qualTypeAp) {

		NSMutableArray sumQual = new NSMutableArray();

		int msemOrdreImpair = -1;

		if (sii != null) {
			sii.msemOrdre().intValue();
		}

		NSArray semestres = new NSArray();

		if (pc != null) {
			EOQualifier qSemPC = EOQualifier.qualifierWithQualifierFormat(MaquetteRepartitionSem.MPAR_KEY_KEY + " = %@ and "
					+ MaquetteRepartitionSem.FANN_KEY_KEY + " = %@", new NSArray(new Object[] { pc.mparKey(), fannKey }));

			NSArray repartSem = DBHandler.fetchData(eContext, MaquetteRepartitionSem.ENTITY_NAME, qSemPC);
			semestres = (NSArray) repartSem.valueForKey(MaquetteRepartitionSem.SEMESTRE_KEY);
		}

		EOQualifier tmpQual;
		// boucle pour semestre impair inferieur du parcours commun
		if (sii != null) {
			for (int isem = 0; isem < semestres.count(); isem++) {
				MaquetteSemestre currentSemestre = (MaquetteSemestre) semestres.objectAtIndex(isem);
				if (currentSemestre.msemOrdre().intValue() == msemOrdreImpair) {
					tmpQual = EOQualifier.qualifierWithQualifierFormat(MaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.PARCOURS_KEY + " = %@ and "
							+ MaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.SEMESTRE_KEY + " = %@", new NSArray(
							new Object[] { pc, currentSemestre }));
					sumQual.addObject(tmpQual);
					break;
				}
			}
		}

		for (int isem = 0; isem < semestres.count(); isem++) {
			MaquetteSemestre currentSemestre = (MaquetteSemestre) semestres.objectAtIndex(isem);
			if (currentSemestre.msemOrdre().intValue() == s.msemOrdre().intValue()) {
				tmpQual = EOQualifier.qualifierWithQualifierFormat(MaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.PARCOURS_KEY + " = %@ and "
						+ MaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.SEMESTRE_KEY + " = %@", new NSArray(new Object[] { pc, currentSemestre }));
				sumQual.addObject(tmpQual);
				break;
			}
		}

		// inclusion de semestre choisi par l'utilisateur dans la requette
		tmpQual = EOQualifier.qualifierWithQualifierFormat(MaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.PARCOURS_KEY + " = %@ and "
				+ MaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.SEMESTRE_KEY + " = %@", new NSArray(new Object[] { p, s }));
		sumQual.addObject(tmpQual);

		// si un ssi est demande on l'inclus aussi dans la recherche
		if (sii != null) {
			tmpQual = EOQualifier.qualifierWithQualifierFormat(MaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.PARCOURS_KEY + " = %@ and "
					+ MaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.SEMESTRE_KEY + " = %@", new NSArray(new Object[] { p, sii }));
			sumQual.addObject(tmpQual);
		}

		tmpQual = new EOOrQualifier(sumQual);

		sumQual.removeAllObjects();
		sumQual.addObject(tmpQual);
		tmpQual = DBHandler.getSimpleQualifier(MaquetteAp.FANN_KEY_KEY, fannKey);
		sumQual.addObject(tmpQual);
		if (qualTypeAp != null) {
			sumQual.addObject(qualTypeAp);
		}
		return DBHandler.fetchData(eContext, MaquetteAp.ENTITY_NAME, new EOAndQualifier(sumQual));
	}

	/**
	 * recherche les reservations des ap passes en parametres pour les periodicites donnees
	 * 
	 * @param ap
	 *            tableau des AP dont on cherche les reservationd
	 * @param periodicites
	 *            tableau avec des suites de timestamp (debut-fin)
	 */
	public NSArray lookupReservationsEnseignement(NSArray ap, NSArray periodicites) {
		NSMutableArray sumQualifierAp = new NSMutableArray();
		for (int i = 0; i < ap.count(); i++) {
			MaquetteAp currentAp = (MaquetteAp) ap.objectAtIndex(i);
			sumQualifierAp.addObject(DBHandler.getSimpleQualifier(Periodicite.RESERVATION_AP_KEY + "." + ReservationAp.MAQUETTE_AP_KEY, currentAp));
		}
		NSMutableArray sumQualifierDates = new NSMutableArray();
		for (int i = 0; i < periodicites.count(); i += 2) {
			NSTimestamp deb = (NSTimestamp) periodicites.objectAtIndex(i);
			NSTimestamp fin = (NSTimestamp) periodicites.objectAtIndex(i + 1);
			sumQualifierDates.addObject(EOQualifier.qualifierWithQualifierFormat(Periodicite.DATE_FIN_KEY + " >= %@ and " + Periodicite.DATE_DEB_KEY
					+ " <= %@", new NSArray(new Object[] { deb, fin })));
		}
		EOQualifier qualAp = new EOOrQualifier(sumQualifierAp);
		EOQualifier qualDate = new EOOrQualifier(sumQualifierDates);

		EOQualifier qualResa = new EOAndQualifier(new NSArray(new Object[] { qualAp, qualDate }));
		return DBHandler.fetchData(eContext, Periodicite.ENTITY_NAME, qualResa);
	}

	/** retourne l'ap recopie de l'annee precedentes */
	public MaquetteAp getApTranfertMap(MaquetteAp oldAp) {
		ScolTransfertMap transfertAp = ScolTransfertMap.fetchScolTransfertMap(eContext, ScolTransfertMap.OLD_AP_KEY, oldAp);
		if (transfertAp != null) {
			return transfertAp.newAp();
		}
		else {
			return null;
		}
	}

	/** retourne le groupe recopie de l'annee precedentes */
	public ScolGroupeGrp getGrpTranfertGrp(ScolGroupeGrp oldGrp) {
		ScolTransfertGrp transfertGrp = ScolTransfertGrp.fetchScolTransfertGrp(eContext, ScolTransfertGrp.OLD_GRP_KEY, oldGrp);
		if (transfertGrp != null) {
			return transfertGrp.newGrp();
		}
		else {
			return null;
		}
	}

}
