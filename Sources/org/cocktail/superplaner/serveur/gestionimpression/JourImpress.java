package org.cocktail.superplaner.serveur.gestionimpression;

//
// JourImpress.java
// EdtScol
//
// Created by fadour on Tue Aug 24 2004.
// Copyright (c) 2004 __Universite de La Rochelle__. All rights reserved.
//

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSTimestamp;

import org.cocktail.superplaner.utils.FormatHandler;

public class JourImpress {

	private String jourName;
	private String jourDate;
	private int nbCreneaux;
	private ListeCours listeCours;

	/** constructeur * */
	public JourImpress(int nbCreneaux) {
		this.nbCreneaux = nbCreneaux;
		init();

	}

	private void init() {
		listeCours = new ListeCours();
	}

	public int nbCreneaux() {
		return nbCreneaux;
	}

	public void setJourName(String nom) {
		this.jourName = nom;
	}

	public String jourName() {
		return jourName;
	}

	public void setJourDate(String date) {
		jourDate = date;
	}

	public String jourDate() {
		return jourDate;
	}

	public NSTimestamp timestampJourDate() {
		return FormatHandler.strToDate(jourDate + " 12:00:00", "%d/%m/%Y %H:%M:%S");
	}

	public int getCoursCount() {
		return listeCours.count();
	}

	public ListeCours listCours() {
		return listeCours;
	}

	public void setListCours(ListeCours listCours) {
		this.listeCours = listCours;
	}

	public CoursImpress getCoursAtIndex(int idx) {
		return (CoursImpress) listeCours.objectAtIndex(idx);
	}

	public void ajouterCours(CoursImpress cours) {
		listeCours.addObject(cours);
	}

	public void ajouterListeCours(ListeCours liste) {
		listeCours.addObjects(liste);
	}

	/** ajoute un cours fictif ou reel * */
	public void ajouterCours(CoursImpress cours, int index) {
		listeCours.insertObjectAtIndex(cours, index);
	}

	/** retourne la liste des cours de la journee pour le noCreneau donne * */
	public NSArray listCoursForNoCreneau(int noCreneau) {
		NSMutableArray tmpList = new NSMutableArray();
		for (int i = 0; i < listeCours.count(); i++) {
			CoursImpress currentCours = (CoursImpress) listeCours.objectAtIndex(i);
			if (currentCours.numeroCreneau() == noCreneau) {
				tmpList.addObject(currentCours);
			}
		}
		return tmpList;
	}

	public String toString() {
		String string = "";
		for (int i = 0; i < this.listeCours.count(); i++) {
			string += this.listeCours.objectAtIndex(i).toString() + "\n";
		}
		return string;
	}

	public String toStringDebug() {
		String str = "";
		for (int i = 0; i < listeCours.count(); i++) {
			str += "\n" + listeCours.objectAtIndex(i).toString();
		}
		return str;
	}

}
