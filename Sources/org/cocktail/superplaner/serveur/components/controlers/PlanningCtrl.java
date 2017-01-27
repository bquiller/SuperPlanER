package org.cocktail.superplaner.serveur.components.controlers;

import java.util.ArrayList;

import org.cocktail.fwkcktlwebapp.common.util.StringCtrl;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteAp;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteParcours;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionSem;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteSemestre;
import org.cocktail.superplaner.serveur.DBHandler;
import org.cocktail.superplaner.serveur.metier.ExamenEntete;
import org.cocktail.superplaner.serveur.metier.IndividuUlr;
import org.cocktail.superplaner.serveur.metier.MaquetteAp;
import org.cocktail.superplaner.serveur.metier.Occupant;
import org.cocktail.superplaner.serveur.metier.Periodicite;
import org.cocktail.superplaner.serveur.metier.ResaExamen;
import org.cocktail.superplaner.serveur.metier.ResaSalles;
import org.cocktail.superplaner.serveur.metier.Reservation;
import org.cocktail.superplaner.serveur.metier.ReservationAp;
import org.cocktail.superplaner.serveur.metier.ReservationSemestre;
import org.cocktail.superplaner.serveur.metier.SalleSouhaitee;
import org.cocktail.superplaner.serveur.metier.Salles;
import org.cocktail.superplaner.serveur.metier.ScolGroupeGrp;
import org.cocktail.superplaner.serveur.metier.ScolGroupeObjet;
import org.cocktail.superplaner.serveur.metier.ScolInscriptionAp;
import org.cocktail.superplaner.serveur.metier.VMaquetteAp;
import org.cocktail.superplaner.serveur.metier.VParcoursAp;
import org.cocktail.superplaner.serveur.pojo.EvenementPojo;
import org.cocktail.superplaner.utils.CalendarHandler;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOAndQualifier;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.eocontrol.EOOrQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSTimestamp;

public class PlanningCtrl {


	private NSArray sortResaAp = new NSArray(EOSortOrdering.sortOrderingWithKey(ReservationAp.LE_MAP_KEY_KEY, EOSortOrdering.CompareAscending));

	private CalendarHandler calendarHandler;
	private NSMutableArray<EvenementPojo> plans;

	private EOEditingContext context;

	public PlanningCtrl(EOEditingContext ec) {
		this.context = ec;
		calendarHandler = new CalendarHandler();
	}

	private NSArray<VMaquetteAp> getApForParcoursSemestres(EOScolMaquetteParcours p, EOScolMaquetteParcours pc, EOScolMaquetteSemestre s, EOScolMaquetteSemestre sii, Number fannKey) {
		NSMutableArray<EOQualifier> sumQual = new NSMutableArray<EOQualifier>();

		int msemOrdreImpair = -1;

		if (sii != null) {
			sii.msemOrdre().intValue();
		}

		NSArray semestres = new NSArray();

		if (pc != null) {
			EOQualifier qSemPC = EOQualifier.qualifierWithQualifierFormat(EOScolMaquetteRepartitionSem.MPAR_KEY_KEY + " = %@ and "
					+ EOScolMaquetteRepartitionSem.FANN_KEY_KEY + " = %@", new NSArray(new Object[] { pc.storedValueForKey("mparKey"), fannKey }));

			NSArray repartSem = DBHandler.fetchData(context, EOScolMaquetteRepartitionSem.ENTITY_NAME, qSemPC);
			semestres = (NSArray) repartSem.valueForKey(EOScolMaquetteRepartitionSem.MSEM_KEY_KEY);
		}

		EOQualifier tmpQual;
		// boucle pour semestre impair inferieur du parcours commun
		if (sii != null) {
			for (int isem = 0; isem < semestres.count(); isem++) {
				EOScolMaquetteSemestre currentSemestre = (EOScolMaquetteSemestre) semestres.objectAtIndex(isem);
				if (currentSemestre.msemOrdre().intValue() == msemOrdreImpair) {
					tmpQual = EOQualifier.qualifierWithQualifierFormat(VMaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.PARCOURS_KEY + " = %@ and "
							+ VMaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.SEMESTRE_KEY + " = %@", 
							new NSArray(new Object[] { pc, currentSemestre }));
					sumQual.addObject(tmpQual);
					break;
				}
			}
		}

		// boucle pour le semestre commun : meme msemordre que le semestre selectionen par l'utilisateur
		for (int isem = 0; isem < semestres.count(); isem++) {
			EOScolMaquetteSemestre currentSemestre = (EOScolMaquetteSemestre) semestres.objectAtIndex(isem);
			if (currentSemestre.msemOrdre().intValue() == s.msemOrdre().intValue()) {
				tmpQual = EOQualifier
				.qualifierWithQualifierFormat(VMaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.PARCOURS_KEY + " = %@ and "
						+ VMaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.SEMESTRE_KEY + " = %@", 
						new NSArray(new Object[] { pc, currentSemestre }));
				sumQual.addObject(tmpQual);
				break;
			}
		}

		//TODO inclusion de semestre choisi par l'utilisateur dans la requette
		/*
		tmpQual = EOQualifier.qualifierWithQualifierFormat(VMaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.PARCOURS_KEY + " = %@ and "
				+ VMaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.SEMESTRE_KEY + " = %@", new NSArray(new Object[] { p, s }));
		sumQual.addObject(tmpQual);

		// si un ssi est demande on l'inclus aussi dans la recherche
		if (sii != null) {
			tmpQual = EOQualifier.qualifierWithQualifierFormat(VMaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.PARCOURS_KEY + " = %@ and "
					+ VMaquetteAp.V_PARCOURS_AP_KEY + "." + VParcoursAp.SEMESTRE_KEY + " = %@", new NSArray(new Object[] { p, sii }));
			sumQual.addObject(tmpQual);
		}
		 */
		tmpQual = new EOOrQualifier(sumQual);

		sumQual.removeAllObjects();
		sumQual.addObject(tmpQual);
		tmpQual = DBHandler.getSimpleQualifier(VMaquetteAp.FANN_KEY_KEY, fannKey);
		sumQual.addObject(tmpQual);

//		System.out.println("EOAndQualifier(sumQual)="+new EOAndQualifier(sumQual));

		NSArray<VMaquetteAp> data = DBHandler.fetchData(context, VMaquetteAp.ENTITY_NAME, new EOAndQualifier(sumQual));
		// System.out.println("data="+data.count());
		return data;
	}


	public NSArray<EvenementPojo> requestCalendarIndividu(NSTimestamp debut, NSTimestamp fin, EOGlobalID gidIndividu, Integer rang) {
System.out.println("Dans requestCalendarIndividu");
		boolean appendComments = true; // (((Number) prefUser("commentScol")).intValue() == 1);
		try {
			if (plans != null) {
				// on vide le planning
				plans.removeAllObjects();
			} else {
				plans = new NSMutableArray<EvenementPojo>();
			}
			IndividuUlr individu = (IndividuUlr) context.faultForGlobalID(gidIndividu, context);

			// les enseignements.
			String expr = Periodicite.DATE_FIN_KEY + " >= %@ and " + Periodicite.DATE_DEB_KEY + " <= %@ and " + Periodicite.OCCUPANTS_KEY + "."
			+ Occupant.INDIVIDU_KEY + " = %@";
			NSArray values = new NSArray(new Object[] {debut, fin, individu});
			EOQualifier qualifier = DBHandler.getQualifier(expr, values);
			NSArray<Periodicite> resas = DBHandler.fetchData(context, Periodicite.ENTITY_NAME, qualifier);
			for (int i = 0; i < resas.count(); i++) {
				EvenementPojo event = new EvenementPojo();

				Periodicite currentResaOcc = (Periodicite) resas.objectAtIndex(i);
				Reservation reservation = currentResaOcc.reservation();
				//				event.setReservation(editingContext().globalIDForObject(reservation));
				NSTimestamp debutRes = currentResaOcc.dateDeb();

				event.setStart(debutRes);
				event.setEnd(currentResaOcc.dateFin());

				Integer jour = new Integer(calendarHandler.getDay(debutRes));
				event.setJour(jour);
				event.setResa(new Integer(1));
				StringBuffer titre = new StringBuffer();
				StringBuffer desc = new StringBuffer();
				
				String tlocCode = reservation.tlocCode();
				//dRes.takeValueForKey(tlocCode, "ccolor");

				if (tlocCode.equals("CM") || tlocCode.equals("TD") || tlocCode.equals("TP")) {
					NSArray<ReservationAp> resaAps = reservation.reservationAp();
					for (int iResaAp = 0; iResaAp < resaAps.count(); iResaAp++) {
						ReservationAp currentReservAp = resaAps.objectAtIndex(iResaAp);

						titre.append(StringCtrl.capitalizeWords(currentReservAp.maquetteAp().mapLibelle()));
						if (currentReservAp.scolGroupeGrp() != null) {
							titre.append("(");
							titre.append(currentReservAp.scolGroupeGrp().ggrpCode());
							titre.append(")");
						}

						if (iResaAp < resaAps.count() - 1 && resaAps.count() > 1) {
							titre.append(", ");
						}
					}
					if (appendComments && (reservation.resaCommentaire() != null)) {
						titre.append(" - " + StringCtrl.capitalizeWords(reservation.resaCommentaire()));
					}
				}
				else {
					if (tlocCode.equals("E")) {
						// les examens :
						NSArray<ResaExamen> tmp = reservation.resaExamens();
						int nbocc = tmp.count();
						for (int iex = 0; iex < nbocc; iex++) {
							if (iex == 0) {
								titre.append("Examen : ");
							}
							ResaExamen currentResaEx = tmp.objectAtIndex(iex);
							titre.append(StringCtrl.capitalizeWords(currentResaEx.examenEntete().eentLibelle()));
							if (currentResaEx.scolGroupeGrp() != null) {
								titre.append("(");
								titre.append(currentResaEx.scolGroupeGrp().ggrpCode());
								titre.append(")");
							}
							if (iex < nbocc - 1 && nbocc > 1) {
								titre.append(", ");
							}
						}
					}
					else {
						titre.append(StringCtrl.capitalizeWords(reservation.resaCommentaire()));
					}
				}
				// pdm affichage des salles
				NSArray<ResaSalles> tmpSalle = reservation.resaSalles();
				for (int j = 0; j < tmpSalle.count(); j++) {
					if (j == 0) {
						titre.append(" - ");
					}
					else
						if (j > 0 && j < tmpSalle.count() - 1) {
							titre.append(",");
						}
					Salles sal = (Salles) ((ResaSalles) tmpSalle.objectAtIndex(j)).salle();
					titre.append(StringCtrl.capitalizeWords(sal.cLocal() + " : " + sal.salPorte()));
				}

				event.setClassName(tlocCode);
				event.setTitle(titre.toString());
				event.setDeplace(new Integer(1));
				event.setRang(rang);
				event.setLibelle(individu.prenomNom());

				//				plans.addObject(dRes);
				plans.addObject(event);
			}
		}
		catch (Throwable ex) {
			ex.printStackTrace();
			plans = new NSMutableArray<EvenementPojo>();
		}

		return plans;
	}

	private NSArray<ScolGroupeGrp> getGroupesSemestres(NSArray<EOGlobalID> gidSemestres) {

		if (gidSemestres == null || gidSemestres.count() == 0) {
			System.out.println("gidSemestres null ou vide");
			return new NSArray<ScolGroupeGrp>();
		}
		if (gidSemestres.count() == 2) {
			System.out.println("gidSemestres avec 2 semestres");

			EOScolMaquetteSemestre sem1 = (EOScolMaquetteSemestre) context.faultForGlobalID((EOGlobalID)gidSemestres.objectAtIndex(0), context);
			EOScolMaquetteSemestre sem2 = (EOScolMaquetteSemestre) context.faultForGlobalID((EOGlobalID)gidSemestres.objectAtIndex(1), context);
			return getGroupesSemestres(sem1, sem2);
		}
		if (gidSemestres.count() == 1) {
			System.out.println("gidSemestres avec 1 semestre");
			EOScolMaquetteSemestre sem1 = (EOScolMaquetteSemestre) context.faultForGlobalID((EOGlobalID)gidSemestres.objectAtIndex(0), context);
			return getGroupesSemestres(sem1, null);
		}

		return null;
	}


	/** retourne des faults d'objets à partir des globalIDs */
	public NSArray faultsForGlobalIDs(NSArray ids, EOEditingContext eContext) {
		NSMutableArray objects = new NSMutableArray();
		for (int i = 0; i < ids.count(); i++) {
			objects.addObject(eContext.faultForGlobalID((EOGlobalID) ids.objectAtIndex(i), eContext));
		}
		return objects;
	}
	
	private NSArray<ScolGroupeGrp> getGroupesSemestres(EOScolMaquetteSemestre semestre1, EOScolMaquetteSemestre semestre2) {

		if (semestre1 == null) {
			return new NSArray<ScolGroupeGrp>();
		}

		EOQualifier qualGroupes = null;

		if (semestre2 == null) {
			qualGroupes = EOQualifier.qualifierWithQualifierFormat(ScolGroupeGrp.SCOL_GROUPE_OBJET_KEY + "." + ScolGroupeObjet.SEMESTRE_KEY
					+ " = %@ and " + ScolGroupeGrp.SCOL_GROUPE_OBJET_KEY + "." + ScolGroupeObjet.GOBJ_TYPE_KEY + " = 'VDI'", new NSArray(semestre1));
		}
		else {
			NSArray args = new NSArray(new Object[] { semestre1, semestre2 });
			qualGroupes = EOQualifier.qualifierWithQualifierFormat("(" + ScolGroupeGrp.SCOL_GROUPE_OBJET_KEY + "." + ScolGroupeObjet.SEMESTRE_KEY
					+ " = %@ or " + ScolGroupeGrp.SCOL_GROUPE_OBJET_KEY + "." + ScolGroupeObjet.SEMESTRE_KEY + " = %@) and "
					+ ScolGroupeGrp.SCOL_GROUPE_OBJET_KEY + "." + ScolGroupeObjet.GOBJ_TYPE_KEY + " = 'VDI'", args);
		}

		return DBHandler.fetchData(context, ScolGroupeGrp.ENTITY_NAME, qualGroupes);
	}

	public NSArray fetchReservationsExamens(NSArray examEntetes, EOQualifier qualifierDates) {

		ArrayList sumExamQual = new ArrayList();
		for (int i = 0; i < examEntetes.count(); i++) {
			sumExamQual.add(DBHandler.getSimpleQualifier(Periodicite.RESA_EXAMENS_KEY + "." + ResaExamen.EXAMEN_ENTETE_KEY, examEntetes
					.objectAtIndex(i)));
		}
		EOQualifier qResaExam = new EOOrQualifier(new NSArray(sumExamQual.toArray()));
		EOQualifier totalResaExamQualifier = new EOAndQualifier(new NSArray(new Object[] { qResaExam, qualifierDates }));

		EOFetchSpecification myFetch = new EOFetchSpecification(Periodicite.ENTITY_NAME, totalResaExamQualifier, null);
		myFetch.setUsesDistinct(true);
		myFetch.setRefreshesRefetchedObjects(true);

		NSArray retour = context.objectsWithFetchSpecification(myFetch);

		return retour;
	}

	public NSArray<EvenementPojo> requestPlanningGrpsSemestres(NSTimestamp debut, NSTimestamp fin, NSArray groupesSemestres) {

		NSMutableArray elementsPlanning = new NSMutableArray();

		if (groupesSemestres == null || groupesSemestres.count() == 0) {
			return elementsPlanning;
		}
//		System.out.println("grps=" + groupesSemestres);
		try {
			// NSArray semestres = DBHandler.objectsForGlobalIDs(context, gidSemestres);
			NSArray semestres = DBHandler.faultsForGlobalIDs(context, groupesSemestres);
			EOScolMaquetteSemestre currentSemestre = null;

			NSMutableArray qualifierArray = new NSMutableArray();

			StringBuffer qualBuffer = new StringBuffer();

			for (int iSem = 0; iSem < semestres.count(); iSem++) {
				currentSemestre = (EOScolMaquetteSemestre) semestres.objectAtIndex(iSem);
				qualBuffer.append(Periodicite.RESERVATION_SEMESTRES_KEY + "." + ReservationSemestre.MSEM_KEY_KEY + " = ").append(
						EOUtilities.primaryKeyForObject(context,currentSemestre));
				if (iSem < semestres.count() - 1) {
					qualBuffer.append(" or ");
				}
			}

			qualBuffer.append("))");

			EOQualifier qualSemestre = EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null);
			qualifierArray.addObject(qualSemestre);

			int grpCount = groupesSemestres.count();

			if (grpCount > 0) {
				qualBuffer = new StringBuffer();
				ScolGroupeGrp currentGrp;
				for (int iGr = 0; iGr < grpCount; iGr++) {
					currentGrp = (ScolGroupeGrp) groupesSemestres.objectAtIndex(iGr);
					qualBuffer.append(Periodicite.RESERVATION_SEMESTRES_KEY + "." + ReservationSemestre.GGRP_KEY_KEY + " = ").append(
							currentGrp.ggrpKey().intValue());

					if (iGr < grpCount - 1) {
						qualBuffer.append(" or "); // 2er or
					}
				}
				qualBuffer.append(" or " + Periodicite.RESERVATION_SEMESTRES_KEY + "." + ReservationSemestre.GGRP_KEY_KEY + " = nil");
				qualBuffer.append(")");

				EOQualifier qualGroupe = EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null);
				qualifierArray.addObject(qualGroupe);
			}

			EOAndQualifier qualifierResSemGrp = new EOAndQualifier(qualifierArray);
			EOQualifier qualifierDates = EOQualifier.qualifierWithQualifierFormat(Periodicite.DATE_FIN_KEY + " >= %@ and " + Periodicite.DATE_DEB_KEY
					+ " <= %@", new NSArray(new Object[] { debut, fin }));

			EOQualifier qualifier = new EOAndQualifier(new NSArray(new Object[] { qualifierResSemGrp, qualifierDates }));
			EOFetchSpecification myFetch = new EOFetchSpecification(Periodicite.ENTITY_NAME, qualifier, null);

			myFetch.setUsesDistinct(true);
			myFetch.setRefreshesRefetchedObjects(true);
			NSArray periodicites = context.objectsWithFetchSpecification(myFetch);

			Periodicite currentPeriod = null;
			Reservation resa = null;

			for (int i = 0; i < periodicites.count(); i++) {
				currentPeriod = (Periodicite) periodicites.objectAtIndex(i);

				resa = (Reservation) currentPeriod.reservation();

				StringBuffer strOccupants = new StringBuffer();
				StringBuffer sCommentaireGrp = new StringBuffer(resa.resaCommentaire());
				sCommentaireGrp.append(" ");

				NSArray tmp = (NSArray) resa.valueForKeyPath(Reservation.OCCUPANTS_KEY + "." + Occupant.INDIVIDU_KEY);
				tmp = DBHandler.retirerMultiples(tmp);
				int nbocc = tmp.count();

				for (int io = 0; io < nbocc; io++) {
					IndividuUlr ioccupant = (IndividuUlr) tmp.objectAtIndex(io);
					strOccupants.append(ioccupant.prenom().substring(0, 1) + "." + StringCtrl.capitalizeWords(ioccupant.nomUsuel()));
					strOccupants.append(" ");
				}

				tmp = resa.reservationsSemestres();
				nbocc = tmp.count();

				ReservationSemestre currentResaSem = null;

				for (int iResaSem = 0; iResaSem < nbocc; iResaSem++) {
					currentResaSem = (ReservationSemestre) tmp.objectAtIndex(iResaSem);

					if (currentResaSem.scolGroupeGrp() != null) {
						sCommentaireGrp.append("(");
						sCommentaireGrp.append(currentResaSem.scolGroupeGrp().ggrpCode());
						sCommentaireGrp.append(")");
					}

					if (iResaSem < nbocc - 1 && nbocc > 1) {
						sCommentaireGrp.append(", ");
					}
				} // semestres/groupes

				EvenementPojo event = new EvenementPojo();

				NSTimestamp debutRes = currentPeriod.dateDeb();

				event.setStart(debutRes);
				event.setEnd(currentPeriod.dateFin());

				Integer jour = new Integer(calendarHandler.getDay(debutRes));
				event.setJour(jour);
				event.setResa(new Integer(1));


				//				NSMutableDictionary dRes = new NSMutableDictionary();
				//				dRes.takeValueForKey(context.globalIDForObject(resa), "reservation");
				//				
				//				dRes.takeValueForKey(debutRes, "debut");
				//				dRes.takeValueForKey(currentPeriod.dateFin(), "fin");
				//
				//				dRes.takeValueForKey(jour, "jour");
				//				dRes.takeValueForKey(new Integer(1), "resa");

				StringBuffer strSal = new StringBuffer();

				tmp = resa.resaSalles();
				nbocc = tmp.count();
				ResaSalles resaSalle = null;

				for (int j = 0; j < nbocc; j++) {
					resaSalle = (ResaSalles) tmp.objectAtIndex(j);
					Salles sal = (Salles) resaSalle.salle();
					strSal.append(StringCtrl.capitalizeWords(sal.cLocal() + " : " + sal.salPorte()));

					if (j > 0 && j < nbocc - 1) {
						strSal.append(",");
					}

					if (resaSalle.resaSalEtat().equals("O")) {
						//						dRes.takeValueForKey("O", "salleValide");
					}
				}

				tmp = resa.sallesSouhaitees();
				nbocc = tmp.count();
				for (int j = 0; j < nbocc; j++) {
					Salles sal = (Salles) ((SalleSouhaitee) tmp.objectAtIndex(j)).salle();
					strSal.append(StringCtrl.capitalizeWords(sal.cLocal() + " : " + sal.salPorte()));

					if (j > 0 && j < nbocc - 1) {
						strSal.append(",");
					}
				}

				StringBuffer titre = new StringBuffer();
				StringBuffer desc = new StringBuffer();
				
				titre.append(sCommentaireGrp.toString());
				titre.append(" - ");
				titre.append(strOccupants.toString());
				if (strSal != null) {
					titre.append(" : ");
					titre.append(strSal.toString());
				}

				//				dRes.takeValueForKey(texteResa, "texte");
				//				dRes.takeValueForKey("COURS", "type");
				//				dRes.takeValueForKey("SEM", "ccolor");
				//				dRes.takeValueForKey(new Integer(1), "deplace");
				//				elementsPlanning.addObject(dRes);
				event.setClassName(resa.tlocCode());
				event.setTitle(titre.toString());
				plans.add(event);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return plans;
		//return elementsPlanning;
	}

	public NSArray<EvenementPojo> requestPlanningSemestres(NSTimestamp debut, NSTimestamp fin, NSArray gidSemestres) {

		NSMutableArray elementsPlanning = new NSMutableArray();

		if (gidSemestres == null || gidSemestres.count() == 0) {
			return elementsPlanning;
		}
//		System.out.println("gidSemestres=" + gidSemestres);
		try {
			// NSArray semestres = DBHandler.objectsForGlobalIDs(context, gidSemestres);
			NSArray semestres = DBHandler.faultsForGlobalIDs(context, gidSemestres);
			NSArray groupesSemestres = getGroupesSemestres(gidSemestres);
			EOScolMaquetteSemestre currentSemestre = null;

			NSMutableArray qualifierArray = new NSMutableArray();

			StringBuffer qualBuffer = new StringBuffer();

			for (int iSem = 0; iSem < semestres.count(); iSem++) {
				currentSemestre = (EOScolMaquetteSemestre) semestres.objectAtIndex(iSem);
				qualBuffer.append(Periodicite.RESERVATION_SEMESTRES_KEY + "." + ReservationSemestre.MSEM_KEY_KEY + " = ").append(
						EOUtilities.primaryKeyForObject(context,currentSemestre));
				if (iSem < semestres.count() - 1) {
					qualBuffer.append(" or ");
				}
			}

			qualBuffer.append("))");

			EOQualifier qualSemestre = EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null);
			qualifierArray.addObject(qualSemestre);

			int grpCount = groupesSemestres.count();

			if (grpCount > 0) {
				qualBuffer = new StringBuffer();
				ScolGroupeGrp currentGrp;
				for (int iGr = 0; iGr < grpCount; iGr++) {
					currentGrp = (ScolGroupeGrp) groupesSemestres.objectAtIndex(iGr);
					qualBuffer.append(Periodicite.RESERVATION_SEMESTRES_KEY + "." + ReservationSemestre.GGRP_KEY_KEY + " = ").append(
							currentGrp.ggrpKey().intValue());

					if (iGr < grpCount - 1) {
						qualBuffer.append(" or "); // 2er or
					}
				}
				qualBuffer.append(" or " + Periodicite.RESERVATION_SEMESTRES_KEY + "." + ReservationSemestre.GGRP_KEY_KEY + " = nil");
				qualBuffer.append(")");

				EOQualifier qualGroupe = EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null);
				qualifierArray.addObject(qualGroupe);
			}

			EOAndQualifier qualifierResSemGrp = new EOAndQualifier(qualifierArray);
			EOQualifier qualifierDates = EOQualifier.qualifierWithQualifierFormat(Periodicite.DATE_FIN_KEY + " >= %@ and " + Periodicite.DATE_DEB_KEY
					+ " <= %@", new NSArray(new Object[] { debut, fin }));

			EOQualifier qualifier = new EOAndQualifier(new NSArray(new Object[] { qualifierResSemGrp, qualifierDates }));
			EOFetchSpecification myFetch = new EOFetchSpecification(Periodicite.ENTITY_NAME, qualifier, null);

			myFetch.setUsesDistinct(true);
			myFetch.setRefreshesRefetchedObjects(true);
			NSArray periodicites = context.objectsWithFetchSpecification(myFetch);

			Periodicite currentPeriod = null;
			Reservation resa = null;

			for (int i = 0; i < periodicites.count(); i++) {
				currentPeriod = (Periodicite) periodicites.objectAtIndex(i);

				resa = (Reservation) currentPeriod.reservation();

				StringBuffer strOccupants = new StringBuffer();
				StringBuffer sCommentaireGrp = new StringBuffer(resa.resaCommentaire());
				sCommentaireGrp.append(" ");

				NSArray tmp = (NSArray) resa.valueForKeyPath(Reservation.OCCUPANTS_KEY + "." + Occupant.INDIVIDU_KEY);
				tmp = DBHandler.retirerMultiples(tmp);
				int nbocc = tmp.count();

				for (int io = 0; io < nbocc; io++) {
					IndividuUlr ioccupant = (IndividuUlr) tmp.objectAtIndex(io);
					strOccupants.append(ioccupant.prenom().substring(0, 1) + "." + StringCtrl.capitalizeWords(ioccupant.nomUsuel()));
					strOccupants.append(" ");
				}

				tmp = resa.reservationsSemestres();
				nbocc = tmp.count();

				ReservationSemestre currentResaSem = null;

				for (int iResaSem = 0; iResaSem < nbocc; iResaSem++) {
					currentResaSem = (ReservationSemestre) tmp.objectAtIndex(iResaSem);

					if (currentResaSem.scolGroupeGrp() != null) {
						sCommentaireGrp.append("(");
						sCommentaireGrp.append(currentResaSem.scolGroupeGrp().ggrpCode());
						sCommentaireGrp.append(")");
					}

					if (iResaSem < nbocc - 1 && nbocc > 1) {
						sCommentaireGrp.append(", ");
					}
				} // semestres/groupes

				EvenementPojo event = new EvenementPojo();

				NSTimestamp debutRes = currentPeriod.dateDeb();

				event.setStart(debutRes);
				event.setEnd(currentPeriod.dateFin());

				Integer jour = new Integer(calendarHandler.getDay(debutRes));
				event.setJour(jour);
				event.setResa(new Integer(1));


				//				NSMutableDictionary dRes = new NSMutableDictionary();
				//				dRes.takeValueForKey(context.globalIDForObject(resa), "reservation");
				//				
				//				dRes.takeValueForKey(debutRes, "debut");
				//				dRes.takeValueForKey(currentPeriod.dateFin(), "fin");
				//
				//				dRes.takeValueForKey(jour, "jour");
				//				dRes.takeValueForKey(new Integer(1), "resa");

				StringBuffer strSal = new StringBuffer();

				tmp = resa.resaSalles();
				nbocc = tmp.count();
				ResaSalles resaSalle = null;

				for (int j = 0; j < nbocc; j++) {
					resaSalle = (ResaSalles) tmp.objectAtIndex(j);
					Salles sal = (Salles) resaSalle.salle();
					strSal.append(StringCtrl.capitalizeWords(sal.cLocal() + " : " + sal.salPorte()));

					if (j > 0 && j < nbocc - 1) {
						strSal.append(",");
					}

					if (resaSalle.resaSalEtat().equals("O")) {
						//						dRes.takeValueForKey("O", "salleValide");
					}
				}

				tmp = resa.sallesSouhaitees();
				nbocc = tmp.count();
				for (int j = 0; j < nbocc; j++) {
					Salles sal = (Salles) ((SalleSouhaitee) tmp.objectAtIndex(j)).salle();
					strSal.append(StringCtrl.capitalizeWords(sal.cLocal() + " : " + sal.salPorte()));

					if (j > 0 && j < nbocc - 1) {
						strSal.append(",");
					}
				}

				StringBuffer titre = new StringBuffer();
				StringBuffer desc = new StringBuffer();
				
				titre.append(sCommentaireGrp.toString());
				titre.append(" - ");
				titre.append(strOccupants.toString());
				if (strSal != null) {
					titre.append(" : ");
					titre.append(strSal.toString());
				}

				
				//				dRes.takeValueForKey(texteResa, "texte");
				//				dRes.takeValueForKey("COURS", "type");
				//				dRes.takeValueForKey("SEM", "ccolor");
				//				dRes.takeValueForKey(new Integer(1), "deplace");
				//				elementsPlanning.addObject(dRes);
				event.setClassName(resa.tlocCode());
				event.setTitle(titre.toString());
				plans.add(event);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			e.getCause();
		}

		return plans;
		//return elementsPlanning;
	}
	public NSArray<MaquetteAp> requestGrps(NSArray gidAps) {
		NSMutableArray<MaquetteAp> groupes = new NSMutableArray<MaquetteAp>();

		NSArray maquettes = DBHandler.faultsForGlobalIDs(context, gidAps);

		for (int iAp = 0; iAp < maquettes.count(); iAp++) {
			ScolInscriptionAp currentAp = (ScolInscriptionAp) maquettes.objectAtIndex(iAp);
			NSArray<ScolGroupeObjet> groups = currentAp.maquetteRepartitionAp().maquetteAp().scolGroupeObjets();
			if (!groups.isEmpty()) {
				groupes.add(currentAp.maquetteRepartitionAp().maquetteAp());
			}
//			for (ScolGroupeObjet group : groups) {
//				groupes.add(group.scolGroupeGrp().ggrpCode());
//			}
		}
		
		return groupes;
	}

	

	public NSArray<EvenementPojo> requestPlanningInscAp(NSTimestamp debut, NSTimestamp fin, NSArray gidAps, NSArray gidSemestres, NSMutableArray groupesSemestres) {

		boolean dispExam = false;
		boolean appendComments = true;

		try {
			if (gidSemestres != null  && !gidSemestres.isEmpty())
				groupesSemestres.addAll(getGroupesSemestres(gidSemestres));

			if (plans != null) {
				// on vide le planning
				plans.removeAllObjects();
			} else {
				plans = new NSMutableArray<EvenementPojo>();
			}
			NSArray maquettes = DBHandler.faultsForGlobalIDs(context, gidAps);

			NSMutableArray<EOQualifier> sumQualifierAp = new NSMutableArray<EOQualifier>();

			EOQualifier qualAp = null;
			EOQualifier qualGr = null;

			// recuperation des entetes d'examens.
			NSMutableArray qEcs = new NSMutableArray();

			StringBuffer qualBuffer = new StringBuffer("((");

			int mapKey = -1;
			int ggrpKey = -1;

			System.out.println(maquettes.count());
			for (int iAp = 0; iAp < maquettes.count(); iAp++) {
				ScolInscriptionAp currentAp = (ScolInscriptionAp) maquettes.objectAtIndex(iAp);
				// pour les exams
				if (dispExam) {
					try {
						Integer currentMecKey = ((VParcoursAp) currentAp.valueForKey("vParcoursAp")).mecKey();
						qEcs.addObject(EOQualifier.qualifierWithQualifierFormat(ExamenEntete.MEC_KEY_KEY + " = " + currentMecKey, null));
					} catch (Exception e) {
						// TODO: voir pourquoi exception VUE / MAP
					}
				}
				// fin pour les exams

				mapKey = currentAp.maquetteRepartitionAp().maquetteAp().mapKey();
				qualBuffer.append(Periodicite.RESERVATION_AP_KEY + "." + ReservationAp.MAP_KEY_KEY + " = ").append(mapKey);
				if (iAp < maquettes.count() - 1) {
					qualBuffer.append(" or ");
				}
			}

			// qualBuffer.append(") and (" + Periodicite.RESERVATION_AP_KEY + "." + ReservationAp.GGRP_KEY_KEY + " = nil))");
			qualBuffer.append("))");

			System.out.println("QUALIFIER AP="+qualBuffer.toString());

			// sumQualifierAp.addObject(EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null));
			qualAp = EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null);

			if (groupesSemestres != null) {
//				System.out.println("groupesSemestres != null");
				// qualBuffer.append("and (");
				if (groupesSemestres.count() > 0) {
//					System.out.println("groupesSemestres.count() > 0");
					int grpCount = groupesSemestres.count();
					qualBuffer = new StringBuffer();
					ScolGroupeGrp currentGrp;
					for (int iGr = 0; iGr < grpCount; iGr++) {
						currentGrp = (ScolGroupeGrp) groupesSemestres.objectAtIndex(iGr);
						ggrpKey = currentGrp.ggrpKey().intValue();
						qualBuffer.append(Periodicite.RESERVATION_AP_KEY + "." + ReservationAp.GGRP_KEY_KEY + " = ").append(ggrpKey);

						if (iGr < grpCount - 1) {
							qualBuffer.append(" or "); // 2er or
						}

					}

					qualBuffer.append(" or " + Periodicite.RESERVATION_AP_KEY + "." + ReservationAp.GGRP_KEY_KEY + " = nil");

					qualBuffer.append(")");
				} else {
//					System.out.println("groupesSemestres.count() < 0");
					qualBuffer.append(" and " + Periodicite.RESERVATION_AP_KEY + "." + ReservationAp.GGRP_KEY_KEY + " = nil");
				}

			}

			// System.out.println("QUALIFIER GRP="+qualBuffer.toString());

			// sumQualifierAp.addObject(EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null));

			qualGr = EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null);

			sumQualifierAp.addObject(qualAp);
			sumQualifierAp.addObject(qualGr);

			EOAndQualifier qualifierAp = new EOAndQualifier(sumQualifierAp);
			// System.out.println("qualifierAp="+qualifierAp);

			// debut recuperation des entetes d'examens
			NSArray examenEntetes = null;

			if (dispExam) {
				EOQualifier totalExamQualifier = new EOOrQualifier(qEcs);
				examenEntetes = DBHandler.fetchData(context, ExamenEntete.ENTITY_NAME, totalExamQualifier);
			}
			// fin recuperation des entetes d'examens

			EOQualifier qualifierDates = EOQualifier.qualifierWithQualifierFormat(Periodicite.DATE_FIN_KEY + " >= %@ and " + Periodicite.DATE_DEB_KEY
					+ " <= %@", new NSArray(new Object[] { debut, fin }));

			// EOOrQualifier qualifierAp = new EOOrQualifier(sumQualifierAp);

			EOAndQualifier qualifier = new EOAndQualifier(new NSArray(new Object[] { qualifierAp, qualifierDates }));
			EOFetchSpecification myFetch = new EOFetchSpecification(Periodicite.ENTITY_NAME, (EOQualifier) qualifier, null);

			myFetch.setUsesDistinct(true);
			myFetch.setRefreshesRefetchedObjects(true);

			NSArray<Periodicite> periods = context.objectsWithFetchSpecification(myFetch);

			// si l'on veut les examens aussi
			if (dispExam) {
				if (examenEntetes.count() > 0) {
					periods = periods.arrayByAddingObjectsFromArray(fetchReservationsExamens(examenEntetes, qualifierDates));
				}
			}

			for (int i = 0; i < periods.count(); i++) {
				Periodicite period = (Periodicite) periods.objectAtIndex(i);

				Reservation resa = (Reservation) period.reservation();

				StringBuffer strOccupants = new StringBuffer("");
				StringBuffer sApGrp = new StringBuffer("");

				NSArray tmp = (NSArray) resa.valueForKeyPath(Reservation.OCCUPANTS_KEY + "." + Occupant.INDIVIDU_KEY);
				tmp = DBHandler.retirerMultiples(tmp);
				int nbocc = tmp.count();

				for (int io = 0; io < nbocc; io++) {
					IndividuUlr ioccupant = (IndividuUlr) tmp.objectAtIndex(io);
					strOccupants.append(ioccupant.prenom().substring(0, 1) + "." + StringCtrl.capitalizeWords(ioccupant.nomUsuel()));
					strOccupants.append(" ");
				}

				VMaquetteAp ap = null;

				tmp = EOSortOrdering.sortedArrayUsingKeyOrderArray(resa.reservationAp(), sortResaAp);

				nbocc = tmp.count();

				VMaquetteAp lastAp = null;
				for (int iResaAp = 0; iResaAp < nbocc; iResaAp++) {
					ReservationAp currentReservAp = (ReservationAp) tmp.objectAtIndex(iResaAp);
					ap = currentReservAp.vMaquetteAp();

					if (lastAp != ap) {
						sApGrp.append(StringCtrl.capitalizeWords(ap.mapLibelle()));
					}
					lastAp = ap;

					if (currentReservAp.scolGroupeGrp() != null) {
						sApGrp.append("(");
						sApGrp.append(currentReservAp.scolGroupeGrp().ggrpCode());
						sApGrp.append(")");
					}

					if (iResaAp < nbocc - 1 && nbocc > 1) {
						sApGrp.append(", ");
					}


				}

				// les examens :
				tmp = resa.resaExamens();
				nbocc = tmp.count();
				for (int iex = 0; iex < nbocc; iex++) {
					if (iex == 0) {
						sApGrp.append("Examen : ");
					}
					ResaExamen currentResaEx = (ResaExamen) tmp.objectAtIndex(iex);
					sApGrp.append(StringCtrl.capitalizeWords(currentResaEx.examenEntete().eentLibelle()));

					if (currentResaEx.scolGroupeGrp() != null) {
						sApGrp.append("(");
						sApGrp.append(currentResaEx.scolGroupeGrp().ggrpCode());
						sApGrp.append(")");
					}

					if (iex < nbocc - 1 && nbocc > 1) {
						sApGrp.append(", ");
					}
				}

				EvenementPojo event = new EvenementPojo();

				NSTimestamp debutRes = period.dateDeb();

				event.setStart(debutRes);
				event.setEnd(period.dateFin());

				Integer jour = new Integer(calendarHandler.getDay(debutRes));
				event.setJour(jour);
				event.setResa(new Integer(1));

				//				NSMutableDictionary dRes = new NSMutableDictionary();
				//				dRes.takeValueForKey(context.globalIDForObject(resa), "reservation");
				//				dRes.takeValueForKey(debutRes, "debut");
				//				dRes.takeValueForKey(period.dateFin(), "fin");
				//
				//				dRes.takeValueForKey(jour, "jour");
				//				dRes.takeValueForKey(new Integer(1), "resa");

				StringBuffer strSal = new StringBuffer();

				tmp = resa.resaSalles();
				nbocc = tmp.count();
				ResaSalles resaSalle = null;

				for (int j = 0; j < nbocc; j++) {
					resaSalle = (ResaSalles) tmp.objectAtIndex(j);
					Salles sal = (Salles) resaSalle.salle();
					strSal.append(StringCtrl.capitalizeWords(sal.cLocal() + " : " + sal.salPorte()));

					if (j > 0 && j < nbocc - 1) {
						strSal.append(",");
					}

					if (resaSalle.resaSalEtat().equals("O")) {
						//						dRes.takeValueForKey("O", "salleValide");
					}
				}

				tmp = resa.sallesSouhaitees();
				nbocc = tmp.count();
				for (int j = 0; j < nbocc; j++) {
					Salles sal = (Salles) ((SalleSouhaitee) tmp.objectAtIndex(j)).salle();
					strSal.append(StringCtrl.capitalizeWords(sal.cLocal() + " : " + sal.salPorte()));

					if (j > 0 && j < nbocc - 1) {
						strSal.append(",");
					}
				}
				StringBuffer com = new StringBuffer();
				StringBuffer titre = new StringBuffer();
				StringBuffer desc = new StringBuffer();
				
				// ajout les commentaires si choix effectue par utilisateur
				if (appendComments && (resa.resaCommentaire() != null)) {
					com.append(resa.resaCommentaire());
				}

				desc.append("<b>Cours</b> : " + sApGrp.toString() + "</br>");
				if (com.length() > 0) {
					desc.append("<b>Commentaire</b> : " + com.toString() + "</br>");
				}
				if (strOccupants.length() > 0) {
					desc.append("<b>Enseignant(s)</b> : " + strOccupants.toString() + "</br>");
				}
				titre.append(sApGrp.toString());
				titre.append("-" + com.toString());
				titre.append(strOccupants.toString());
				if (strSal.length() > 0) {
					desc.append("<b>Salle</b> : " + strSal.toString());
					titre.append(strSal.toString());
				}

				//				dRes.takeValueForKey(texteResa, "texte");
				//				dRes.takeValueForKey("COURS", "type");

				//				dRes.takeValueForKey(new Integer(1), "deplace");

				event.setClassName(resa.tlocCode());
				event.setLibelle(desc.toString());
				event.setTitle(titre.toString());

				plans.add(event);
				// plans.addObject(dRes);

			}
			// log.endOp("fin fetch");

			plans.addObjectsFromArray(requestPlanningSemestres(debut, fin, gidSemestres));

			return plans;

		}
		catch (Throwable e) {
			NSLog.out.appendln("clientSideRequestPlanningAp : " + e.getMessage());
			e.printStackTrace();
			return new NSArray<EvenementPojo>();
		}
	}

	public NSArray<EvenementPojo> requestPlanningAp(NSTimestamp debut, NSTimestamp fin, NSArray gidAps, NSArray gidSemestres, NSMutableArray groupesSemestres) {

		boolean dispExam = false;
		boolean appendComments = true;

		try {
			if (gidSemestres != null  && !gidSemestres.isEmpty())
				groupesSemestres.addAll(getGroupesSemestres(gidSemestres));

			if (plans != null) {
				// on vide le planning
				plans.removeAllObjects();
			} else {
				plans = new NSMutableArray<EvenementPojo>();
			}
			NSArray maquettes = DBHandler.faultsForGlobalIDs(context, gidAps);

			NSMutableArray<EOQualifier> sumQualifierAp = new NSMutableArray<EOQualifier>();

			EOQualifier qualAp = null;
			EOQualifier qualGr = null;

			// recuperation des entetes d'examens.
			NSMutableArray qEcs = new NSMutableArray();

			StringBuffer qualBuffer = new StringBuffer("((");

			int mapKey = -1;
			int ggrpKey = -1;

			System.out.println(maquettes.count());
			for (int iAp = 0; iAp < maquettes.count(); iAp++) {
				EOScolMaquetteAp currentAp = (EOScolMaquetteAp) maquettes.objectAtIndex(iAp);
				// pour les exams
				if (dispExam) {
					try {
						Integer currentMecKey = ((VParcoursAp) currentAp.valueForKey("vParcoursAp")).mecKey();
						qEcs.addObject(EOQualifier.qualifierWithQualifierFormat(ExamenEntete.MEC_KEY_KEY + " = " + currentMecKey, null));
					} catch (Exception e) {
						// TODO: voir pourquoi exception VUE / MAP
					}
				}
				// fin pour les exams

				qualBuffer.append(Periodicite.RESERVATION_AP_KEY + "." + ReservationAp.MAP_KEY_KEY + " = " + EOUtilities.primaryKeyForObject(context, currentAp).objectForKey("mapKey"));
				
				if (iAp < maquettes.count() - 1) {
					qualBuffer.append(" or ");
				}
			}

			// qualBuffer.append(") and (" + Periodicite.RESERVATION_AP_KEY + "." + ReservationAp.GGRP_KEY_KEY + " = nil))");
			qualBuffer.append("))");

			System.out.println("QUALIFIER AP="+qualBuffer.toString());

			// sumQualifierAp.addObject(EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null));
			qualAp = EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null);

			if (groupesSemestres != null) {
//				System.out.println("groupesSemestres != null");
				// qualBuffer.append("and (");
				if (groupesSemestres.count() > 0) {
//					System.out.println("groupesSemestres.count() > 0");
					int grpCount = groupesSemestres.count();
					qualBuffer = new StringBuffer();
					ScolGroupeGrp currentGrp;
					for (int iGr = 0; iGr < grpCount; iGr++) {
						currentGrp = (ScolGroupeGrp) groupesSemestres.objectAtIndex(iGr);
						ggrpKey = currentGrp.ggrpKey().intValue();
						qualBuffer.append(Periodicite.RESERVATION_AP_KEY + "." + ReservationAp.GGRP_KEY_KEY + " = ").append(ggrpKey);

						if (iGr < grpCount - 1) {
							qualBuffer.append(" or "); // 2er or
						}

					}

					qualBuffer.append(" or " + Periodicite.RESERVATION_AP_KEY + "." + ReservationAp.GGRP_KEY_KEY + " = nil");

					qualBuffer.append(")");
				} else {
//					System.out.println("groupesSemestres.count() < 0");
					qualBuffer.append(" and " + Periodicite.RESERVATION_AP_KEY + "." + ReservationAp.GGRP_KEY_KEY + " = nil");
				}

			}

			// System.out.println("QUALIFIER GRP="+qualBuffer.toString());

			// sumQualifierAp.addObject(EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null));

			qualGr = EOQualifier.qualifierWithQualifierFormat(qualBuffer.toString(), null);

			sumQualifierAp.addObject(qualAp);
			sumQualifierAp.addObject(qualGr);

			EOAndQualifier qualifierAp = new EOAndQualifier(sumQualifierAp);
			// System.out.println("qualifierAp="+qualifierAp);

			// debut recuperation des entetes d'examens
			NSArray examenEntetes = null;

			if (dispExam) {
				EOQualifier totalExamQualifier = new EOOrQualifier(qEcs);
				examenEntetes = DBHandler.fetchData(context, ExamenEntete.ENTITY_NAME, totalExamQualifier);
			}
			// fin recuperation des entetes d'examens

			EOQualifier qualifierDates = EOQualifier.qualifierWithQualifierFormat(Periodicite.DATE_FIN_KEY + " >= %@ and " + Periodicite.DATE_DEB_KEY
					+ " <= %@", new NSArray(new Object[] { debut, fin }));

			// EOOrQualifier qualifierAp = new EOOrQualifier(sumQualifierAp);

			EOAndQualifier qualifier = new EOAndQualifier(new NSArray(new Object[] { qualifierAp, qualifierDates }));
			EOFetchSpecification myFetch = new EOFetchSpecification(Periodicite.ENTITY_NAME, (EOQualifier) qualifier, null);

			myFetch.setUsesDistinct(true);
			myFetch.setRefreshesRefetchedObjects(true);

			NSArray<Periodicite> periods = context.objectsWithFetchSpecification(myFetch);

			// si l'on veut les examens aussi
			if (dispExam) {
				if (examenEntetes.count() > 0) {
					periods = periods.arrayByAddingObjectsFromArray(fetchReservationsExamens(examenEntetes, qualifierDates));
				}
			}

			for (int i = 0; i < periods.count(); i++) {
				Periodicite period = (Periodicite) periods.objectAtIndex(i);

				Reservation resa = (Reservation) period.reservation();

				StringBuffer strOccupants = new StringBuffer("");
				StringBuffer sApGrp = new StringBuffer("");

				NSArray tmp = (NSArray) resa.valueForKeyPath(Reservation.OCCUPANTS_KEY + "." + Occupant.INDIVIDU_KEY);
				tmp = DBHandler.retirerMultiples(tmp);
				int nbocc = tmp.count();

				for (int io = 0; io < nbocc; io++) {
					IndividuUlr ioccupant = (IndividuUlr) tmp.objectAtIndex(io);
					strOccupants.append(ioccupant.prenom().substring(0, 1) + "." + StringCtrl.capitalizeWords(ioccupant.nomUsuel()));
					strOccupants.append(" ");
				}

				VMaquetteAp ap = null;

				tmp = EOSortOrdering.sortedArrayUsingKeyOrderArray(resa.reservationAp(), sortResaAp);

				nbocc = tmp.count();

				VMaquetteAp lastAp = null;
				for (int iResaAp = 0; iResaAp < nbocc; iResaAp++) {
					ReservationAp currentReservAp = (ReservationAp) tmp.objectAtIndex(iResaAp);
					ap = currentReservAp.vMaquetteAp();

					if (lastAp != ap) {
						sApGrp.append(StringCtrl.capitalizeWords(ap.mapLibelle()));
					}
					lastAp = ap;

					if (currentReservAp.scolGroupeGrp() != null) {
						sApGrp.append("(");
						sApGrp.append(currentReservAp.scolGroupeGrp().ggrpCode());
						sApGrp.append(")");
					}

					if (iResaAp < nbocc - 1 && nbocc > 1) {
						sApGrp.append(", ");
					}


				}

				// les examens :
				tmp = resa.resaExamens();
				nbocc = tmp.count();
				for (int iex = 0; iex < nbocc; iex++) {
					if (iex == 0) {
						sApGrp.append("Examen : ");
					}
					ResaExamen currentResaEx = (ResaExamen) tmp.objectAtIndex(iex);
					sApGrp.append(StringCtrl.capitalizeWords(currentResaEx.examenEntete().eentLibelle()));

					if (currentResaEx.scolGroupeGrp() != null) {
						sApGrp.append("(");
						sApGrp.append(currentResaEx.scolGroupeGrp().ggrpCode());
						sApGrp.append(")");
					}

					if (iex < nbocc - 1 && nbocc > 1) {
						sApGrp.append(", ");
					}
				}

				EvenementPojo event = new EvenementPojo();

				NSTimestamp debutRes = period.dateDeb();

				event.setStart(debutRes);
				event.setEnd(period.dateFin());

				Integer jour = new Integer(calendarHandler.getDay(debutRes));
				event.setJour(jour);
				event.setResa(new Integer(1));

				//				NSMutableDictionary dRes = new NSMutableDictionary();
				//				dRes.takeValueForKey(context.globalIDForObject(resa), "reservation");
				//				dRes.takeValueForKey(debutRes, "debut");
				//				dRes.takeValueForKey(period.dateFin(), "fin");
				//
				//				dRes.takeValueForKey(jour, "jour");
				//				dRes.takeValueForKey(new Integer(1), "resa");

				StringBuffer strSal = new StringBuffer();

				tmp = resa.resaSalles();
				nbocc = tmp.count();
				ResaSalles resaSalle = null;

				for (int j = 0; j < nbocc; j++) {
					resaSalle = (ResaSalles) tmp.objectAtIndex(j);
					Salles sal = (Salles) resaSalle.salle();
					strSal.append(StringCtrl.capitalizeWords(sal.cLocal() + " : " + sal.salPorte()));

					if (j > 0 && j < nbocc - 1) {
						strSal.append(",");
					}

					if (resaSalle.resaSalEtat().equals("O")) {
						//						dRes.takeValueForKey("O", "salleValide");
					}
				}

				tmp = resa.sallesSouhaitees();
				nbocc = tmp.count();
				for (int j = 0; j < nbocc; j++) {
					Salles sal = (Salles) ((SalleSouhaitee) tmp.objectAtIndex(j)).salle();
					strSal.append(StringCtrl.capitalizeWords(sal.cLocal() + " : " + sal.salPorte()));

					if (j > 0 && j < nbocc - 1) {
						strSal.append(",");
					}
				}
				StringBuffer com = new StringBuffer();
				StringBuffer titre = new StringBuffer();
				StringBuffer desc = new StringBuffer();
				
				// ajout les commentaires si choix effectue par utilisateur
				if (appendComments && (resa.resaCommentaire() != null)) {
					com.append(resa.resaCommentaire());
				}

				desc.append("<b>Cours</b> : " + sApGrp.toString() + "</br>");
				if (com.length() > 0) {
					desc.append("<b>Commentaire</b> : " + com.toString() + "</br>");
				}
				if (strOccupants.length() > 0) {
					desc.append("<b>Enseignant(s)</b> : " + strOccupants.toString() + "</br>");
				}
				titre.append(sApGrp.toString());
				titre.append("-" + com.toString());
				titre.append(strOccupants.toString());
				if (strSal.length() > 0) {
					desc.append("<b>Salle</b> : " + strSal.toString());
					titre.append(strSal.toString());
				}

				//				dRes.takeValueForKey(texteResa, "texte");
				//				dRes.takeValueForKey("COURS", "type");

				//				dRes.takeValueForKey(new Integer(1), "deplace");

				event.setClassName(resa.tlocCode());
				event.setLibelle(desc.toString());
				event.setTitle(titre.toString());

				plans.add(event);
				// plans.addObject(dRes);

			}
			// log.endOp("fin fetch");

			plans.addObjectsFromArray(requestPlanningSemestres(debut, fin, gidSemestres));

			return plans;

		}
		catch (Throwable e) {
			NSLog.out.appendln("clientSideRequestPlanningAp : " + e.getMessage());
			e.printStackTrace();
			return new NSArray<EvenementPojo>();
		}
	}

}
