//
// GestionPanier.java
// EdtScol
//
// Created by Adour on Tue Apr 27 2004.
// Copyright (c) 2004 __Université de La Rochelle__. All rights reserved.
//

package org.cocktail.superplaner.utils.panier;

import org.cocktail.superplaner.serveur.metier.ExamenEntete;
import org.cocktail.superplaner.serveur.metier.IndividuUlr;
import org.cocktail.superplaner.serveur.metier.MaquetteAp;
import org.cocktail.superplaner.serveur.metier.MaquetteSemestre;
import org.cocktail.superplaner.serveur.metier.ResaExamen;
import org.cocktail.superplaner.serveur.metier.ResaObjet;
import org.cocktail.superplaner.serveur.metier.ReservationAp;
import org.cocktail.superplaner.serveur.metier.ReservationSemestre;
import org.cocktail.superplaner.serveur.metier.Salles;
import org.cocktail.superplaner.serveur.metier.ScolGroupeGrp;
import org.cocktail.superplaner.serveur.metier.StructuresAutorisees;
import org.cocktail.superplaner.utils.Log;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSMutableArray;

public class GestionPanier {

	public static final int PERSONNE 				= 0;
	public static final int SALLE 					= 1;
	public static final int ENSEIGNEMENT 			= 2;
	public static final int EXAMEN 					= 3;
	public static final int OBJET 					= 4;
	public static final int GROUPE 					= 5;
	public static final int CHOIX 					= 6;
	public static final int GROUPE_SCOL 			= 7;
	public static final int ENSEIGN_AP 				= 8;
	
	public static final int ENSEIGNEMENT_INSP 		= 9;
	public static final int SEMESTRE_GRP_INSP 		= 10;

	/** constitue les ressources panier pour les individus */
	public static NSArray ressourceIndividus(NSArray individus) {
		NSMutableArray retour = new NSMutableArray();
		for (int i = 0; i < individus.count(); i++) {
			IndividuUlr currentIndividu = (IndividuUlr) individus.objectAtIndex(i);
			String libelle = currentIndividu.nomUsuel() + " " + currentIndividu.prenom();
			Object[] objects = { "PERSONNE", libelle, NSKeyValueCoding.NullValue, "1", currentIndividu };
			Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
			NSDictionary ressource = new NSDictionary(objects, keys);
			retour.addObject(ressource);
		}
		return retour;
	}

	/** constitue les ressources panier pour les groupes */
	public static NSArray ressourceGroupes(NSArray groupes) {
		NSMutableArray retour = new NSMutableArray();
		for (int i = 0; i < groupes.count(); i++) {
			StructuresAutorisees currentStructure = (StructuresAutorisees) groupes.objectAtIndex(i);
			String libelle = currentStructure.libelleGroupe();
			Object[] objects = { "GROUPE", libelle, NSKeyValueCoding.NullValue, "GROUPE", currentStructure };
			Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
			NSDictionary ressource = new NSDictionary(objects, keys);
			retour.addObject(ressource);
		}
		return retour;
	}

	/** constitue les ressources panier pour les salles */
	public static NSArray ressourceSalles(NSArray salles) {
		NSMutableArray retour = new NSMutableArray();
		for (int i = 0; i < salles.count(); i++) {
			Salles currentSalle = (Salles) salles.objectAtIndex(i);
			String libelle = currentSalle.salPorte() + " - " + currentSalle.local().appellation();
			Object[] objects = { "SALLE", libelle, NSKeyValueCoding.NullValue, "1", currentSalle };
			Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
			NSDictionary ressource = new NSDictionary(objects, keys);
			retour.addObject(ressource);
		}
		return retour;
	}

	/** constitue les ressources panier pour les salles */
	public static NSArray ressourceChoix(NSArray salles) {
		NSMutableArray retour = new NSMutableArray();
		for (int i = 0; i < salles.count(); i++) {
			Salles currentSalle = (Salles) salles.objectAtIndex(i);
			String libelle = currentSalle.salPorte() + " - " + currentSalle.local().appellation();
			Object[] objects = { "CHOIX", libelle, NSKeyValueCoding.NullValue, "1", currentSalle };
			Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
			NSDictionary ressource = new NSDictionary(objects, keys);
			retour.addObject(ressource);
		}
		return retour;
	}

	/** constitue les ressources panier pour les salles */
	public static NSArray ressourceObjets(NSArray objets) {
		NSMutableArray retour = new NSMutableArray();
		for (int i = 0; i < objets.count(); i++) {
			ResaObjet currentObjet = (ResaObjet) objets.objectAtIndex(i);
			String libelle = currentObjet.roLibelle1();
			Object[] objects = { "OBJET", libelle, NSKeyValueCoding.NullValue, "1", currentObjet };
			Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
			NSDictionary ressource = new NSDictionary(objects, keys);
			retour.addObject(ressource);
		}
		return retour;
	}

	/** constitue les ressources panier pour les AP dans le mode inspecteur : resa deja existante */
	public static NSArray ressourceApsInspection(NSArray resAps) {
		NSMutableArray retour = new NSMutableArray();
		ReservationAp currentResAp = null;
		MaquetteAp currentAp = null;
		ScolGroupeGrp grp = null;
		String libelle = null;

		for (int i = 0; i < resAps.count(); i++) {
			currentResAp = (ReservationAp) resAps.objectAtIndex(i);
			currentAp = currentResAp.maquetteAp();
			grp = currentResAp.scolGroupeGrp();

			NSDictionary ressource;

			if (currentAp != null) {
				libelle = currentAp.mapLibelle();
				if (grp != null) {
					Object[] objects = { "ENSEIGNEMENT", libelle, NSKeyValueCoding.NullValue, grp, currentAp };
					Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
					ressource = new NSDictionary(objects, keys);
				}
				else {
					Object[] objects = { "ENSEIGNEMENT", libelle, NSKeyValueCoding.NullValue, "(Tous)", currentAp };
					Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
					ressource = new NSDictionary(objects, keys);
				}

				retour.addObject(ressource);
			}
		}
		return retour;
	}
	
	
	public static NSArray ressourceSemetresGroupesInspection(NSArray reservationsSemestres) {
//		System.out.println("reservationsSemestres="+reservationsSemestres);
		NSMutableArray retour = new NSMutableArray();
		ReservationSemestre currentResSem = null;
		MaquetteSemestre currentSem = null;
		ScolGroupeGrp grp = null;
		String libelle = null;
		
		Log.printArray(reservationsSemestres, "Lignes");
		
		for (int i = 0; i < reservationsSemestres.count(); i++) {
			currentResSem = (ReservationSemestre) reservationsSemestres.objectAtIndex(i);
			currentSem = currentResSem.semestre();
			grp = currentResSem.scolGroupeGrp();
			
//			System.out.println("currentResSem="+currentResSem);
//			System.out.println("grp="+grp);
			
			NSDictionary ressource;
			if (currentSem != null) {
				//libelle = currentSem.libellePanier();
				if (grp != null) {
					Object[] objects = { "SEMESTRE", libelle, NSKeyValueCoding.NullValue, grp, currentSem };
					Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
					ressource = new NSDictionary(objects, keys);
				}
				else {
					Object[] objects = { "SEMESTRE", libelle, NSKeyValueCoding.NullValue, "(TOUS)", currentSem };
					Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
					ressource = new NSDictionary(objects, keys);
				}

				retour.addObject(ressource);
			}
		}
//		System.out.println("ressourceSemetresGroupesInspection="+retour);
		return retour;
	}
	
	
	public static NSArray resourcesExamens(NSArray resaExams) {
		NSMutableArray retour = new NSMutableArray();
		ResaExamen resExam = null;
		ExamenEntete eentete = null;
		ScolGroupeGrp grp = null;
		String libelle = null;
		for (int i = 0; i < resaExams.count(); i++) {
			resExam = (ResaExamen) resaExams.objectAtIndex(i);
			eentete = resExam.examenEntete();
			grp = resExam.scolGroupeGrp();
			libelle = eentete.eentLibelle();
			NSDictionary ressource;
			if (grp != null) {
				Object[] objects = { "EXAMEN", libelle, NSKeyValueCoding.NullValue, grp, eentete };
				Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
				ressource = new NSDictionary(objects, keys);
			}
			else {
				Object[] objects = { "EXAMEN", libelle, NSKeyValueCoding.NullValue, "(Tous)", eentete };
				Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
				ressource = new NSDictionary(objects, keys);
			}

			retour.addObject(ressource);
		}
		return retour;
	}

	/** constitue les ressources panier pour les AP */
	public static NSArray ressourceAp(NSArray aps) {
		NSMutableArray retour = new NSMutableArray();
		for (int i = 0; i < aps.count(); i++) {
			MaquetteAp currentAp = (MaquetteAp) aps.objectAtIndex(i);
			String libelle = currentAp.mapLibelle();
			Object[] objects = { "ENSEIGNEMENT", libelle, NSKeyValueCoding.NullValue, "(Tous)", currentAp };
			Object[] keys = { "resType", "resLibelle", "resDepos", "resUnite", "resRecord" };
			NSDictionary ressource = new NSDictionary(objects, keys);
			retour.addObject(ressource);
		}
		return retour;
	}

	/** renvoi la ressource selectionnee */
	public static NSArray ressourcesFromRecords(NSArray ressources, int type) {

		if (type == PERSONNE) {
			return ressourceIndividus(ressources);
		}

		if (type == GROUPE) {
			return ressourceGroupes(ressources);
		}

		if (type == EXAMEN) {
			return resourcesExamens(ressources);
		}

		if (type == ENSEIGN_AP) {
			return ressourceAp(ressources);
		}

		if (type == ENSEIGNEMENT_INSP) {
			return ressourceApsInspection(ressources);
		}

		if (type == SALLE) {
			return ressourceSalles(ressources);
		}

		if (type == CHOIX) {
			return ressourceChoix(ressources);
		}

		if (type == OBJET) {
			return ressourceObjets(ressources);
		}
		
		if(type == SEMESTRE_GRP_INSP ) {
			return ressourceSemetresGroupesInspection(ressources);
		}
		
		return null;
	}

}
