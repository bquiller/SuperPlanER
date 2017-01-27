package org.cocktail.superplaner.serveur.gestionimpression;

//
// ReservationClassifier.java
// EdtScol
//
// Created by Adour on Wed May 05 2004.
// Copyright (c) 2004 __Université de La Rochelle__. All rights reserved.
//

import java.util.Calendar;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSComparator;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSTimestamp;

public class ServerSideReservationClassifier {

	public ServerSideReservationClassifier() {
	}

	/**
	 * permet de classifier les reservations pour le planning graphique voir les methodes appellees pour plus de details
	 */
	public NSArray classifyReservations(NSArray reservations) {

		NSMutableArray resaLundi, resaMardi, resaMercredi, resaJeudi, resaVendredi, resaSamedi, resaDimanche;

		NSArray sortedResa = null;
		try {
			sortedResa = reservations.sortedArrayUsingComparator(new ReservComparator());
		}
		catch (NSComparator.ComparisonException e) {
			NSLog.out.appendln("erreur sort : " + e.getMessage());
		}

		resaLundi = new NSMutableArray();
		resaMardi = new NSMutableArray();
		resaMercredi = new NSMutableArray();
		resaJeudi = new NSMutableArray();
		resaVendredi = new NSMutableArray();
		resaSamedi = new NSMutableArray();
		resaDimanche = new NSMutableArray();

		for (int i = 0; i < sortedResa.count(); i++) {

			NSDictionary currentResa = (NSDictionary) sortedResa.objectAtIndex(i);
			Number jour = (Number) currentResa.valueForKey("jour");

			switch (jour.intValue()) {

			case Calendar.MONDAY:
				resaLundi.addObject(currentResa);
				break;

			case Calendar.TUESDAY:
				resaMardi.addObject(currentResa);
				break;

			case Calendar.WEDNESDAY:
				resaMercredi.addObject(currentResa);
				break;

			case Calendar.THURSDAY:
				resaJeudi.addObject(currentResa);
				break;

			case Calendar.FRIDAY:
				resaVendredi.addObject(currentResa);
				break;

			case Calendar.SATURDAY:
				resaSamedi.addObject(currentResa);
				break;

			case Calendar.SUNDAY:
				resaDimanche.addObject(currentResa);
				break;
			}
		}

		NSMutableArray classifiedResa = new NSMutableArray();

		if (resaLundi.count() > 0) {
			classifiedResa.addObjectsFromArray(classifyForDay(resaLundi));
		}

		if (resaMardi.count() > 0) {
			classifiedResa.addObjectsFromArray(classifyForDay(resaMardi));
		}

		if (resaMercredi.count() > 0) {
			classifiedResa.addObjectsFromArray(classifyForDay(resaMercredi));
		}

		if (resaJeudi.count() > 0) {
			classifiedResa.addObjectsFromArray(classifyForDay(resaJeudi));
		}

		if (resaVendredi.count() > 0) {
			classifiedResa.addObjectsFromArray(classifyForDay(resaVendredi));
		}

		if (resaSamedi.count() > 0) {
			classifiedResa.addObjectsFromArray(classifyForDay(resaSamedi));
		}

		if (resaDimanche.count() > 0) {
			classifiedResa.addObjectsFromArray(classifyForDay(resaDimanche));
		}

		return classifiedResa;
	}

	/**
	 * permet de classifier les resa pour affichage sur l'edt graphique resaDisplay contient une resa -Hashtable- dans le cas
	 * mono-reservation/creneau il contient un NSArray de resas -Hashtable- dans le cas multi-reservation/creneau
	 */
	public NSArray classifyForDay(NSArray resaDay) {

		NSMutableArray crossed = null;
		NSMutableArray total = new NSMutableArray();

		for (int i = 0; i < resaDay.count(); i++) {

			NSDictionary courante = (NSDictionary) resaDay.objectAtIndex(i);
			NSTimestamp fCourante = (NSTimestamp) courante.valueForKey("fin");
			NSTimestamp finMax = fCourante;
			boolean crossFound = false;
			int j = 0;
			for (j = i + 1; j < resaDay.count(); j++) {

				if (j == i + 1) {
					crossed = new NSMutableArray();
				}

				NSDictionary suivante = (NSDictionary) resaDay.objectAtIndex(j);
				NSTimestamp dSuivante = (NSTimestamp) suivante.valueForKey("debut");
				NSTimestamp fSuivante = (NSTimestamp) suivante.valueForKey("fin");

				if (finMax.compare(dSuivante) == NSComparator.OrderedDescending) { // dSuivante < fCourante : chevauchement
					if (finMax.compare(fSuivante) == NSComparator.OrderedAscending) {
						finMax = fSuivante;
					}
					crossFound = true;
					if (j == i + 1) {
						crossed.addObject(courante);
					}
					crossed.addObject(suivante);
				}
				else {
					break;
				}
			}

			if (crossFound) {
				total.addObject(crossed);
				i = j - 1;
			}
			else {
				total.addObject(courante);
				crossFound = false;
			}
		} // for

		return total;
	}

	/** permet de comparer chaques créneau par sa date de debut */
	public class ReservComparator extends NSComparator {

		public int compare(Object object1, Object object2) throws NSComparator.ComparisonException {

			if (!(object1 instanceof NSDictionary) || !(object2 instanceof NSDictionary)) {
				throw new NSComparator.ComparisonException("Les objets compares doivent etres des instances de Hashtable");
			}

			NSDictionary o1 = (NSDictionary) object1;
			NSDictionary o2 = (NSDictionary) object2;

			if (!(o1.allKeys().containsObject("debut")) || !(o2.allKeys().containsObject("debut")) || !(o1.allKeys().containsObject("fin"))
					|| !(o2.allKeys().containsObject("fin"))) {
				throw new NSComparator.ComparisonException("Les objets compares doivent contenir debut et fin");
			}

			NSTimestamp time1 = (NSTimestamp) o1.valueForKey("debut");
			NSTimestamp time2 = (NSTimestamp) o2.valueForKey("debut");

			return time1.compare(time2);
		}
	}

}
