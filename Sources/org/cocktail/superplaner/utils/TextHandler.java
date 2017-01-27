// StringHandler.java
// Gedagogie
//
// Created by Adour on Thu Feb 12 2004.
// Copyright (c) 2004 Universite de La Rochelle. All rights reserved.
//

package org.cocktail.superplaner.utils;

public class TextHandler {

	/** donne une chaine vide en cas de chaine nulle : evite certains problemes */
	public static String safeString(String str) {
		if ((str == null) || (str.equals(""))) {
			return "";
		}
		return str;
	}

	/** teste si l'adresse email est dans une forme valide avec une regexp */
	public static boolean isEmailValid(String email) {
		if (email == null) {
			return false;
		}
		else {
			return email.indexOf("@") != -1 && email.indexOf(".") != -1;
			// return (email!=null) && email.matches("^[\\w_.-]+@[\\w_.-]+\\.[\\w]+$");
		}
	}

}