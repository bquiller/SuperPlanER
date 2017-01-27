package org.cocktail.superplaner.serveur.gestionimpression;

//
// CoursImpress.java
// EdtScol
//
// Created by fadour on Tue Aug 24 2004.
// Copyright (c) 2004 __Universite de La Rochelle__. All rights reserved.
//

import com.webobjects.foundation.NSTimestamp;

public class CoursImpress {
	public int width;
	public int height;
	public String color;
	public String contenu, occupants, salles;
	public int numeroCreneau;
	public NSTimestamp heuredeb;
	public static final int REEL = 1;
	public static final int FICTIF = 2;
	public static final int CACHE = 3;

	private int etat;

	public CoursImpress(int width, int height, String color, String contenu, String occupants, String salles, int numeroCreneau, NSTimestamp heure) {
		this.width = width;
		this.height = height;
		this.color = color;
		this.contenu = contenu;
		this.occupants = occupants;
		this.salles = salles;
		this.numeroCreneau = numeroCreneau;
		this.heuredeb = heure;
		this.etat = REEL;
	}

	public CoursImpress(int width, int height, int numeroCreneau, NSTimestamp heure) {
		this.width = width;
		this.height = height;
		this.numeroCreneau = numeroCreneau;
		this.heuredeb = heure;
	}

	public CoursImpress(int width, int height, int numeroCreneau) {
		this.width = width;
		this.height = height;
		this.numeroCreneau = numeroCreneau;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public int etat() {
		return this.etat;
	}

	public int numeroCreneau() {
		return numeroCreneau;
	}

	public NSTimestamp heurefin() {
		return heuredeb.timestampByAddingGregorianUnits(0, 0, 0, 0, width, 0);
	}

	public int width() {
		return width;
	}

	public int height() {
		return height;
	}

	public String color() {
		return color;
	}

	public String contenu() {
		return contenu;
	}

	public String occupants() {
		return occupants;
	}

	public String salles() {
		return salles;
	}

	public NSTimestamp heuredeb() {
		return heuredeb;
	}

	public String toString() {
		return contenu;
	}
}
