package org.cocktail.superplaner.serveur.components;

import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolGroupeGrp;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolGroupeObjet;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteAp;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

public abstract class FinderScolMaquetteAp {

	public static NSArray<EOScolGroupeGrp> getGroupeForAp(
			EOEditingContext ec, EOScolMaquetteAp ap) {

		NSMutableArray<Object> tbKeys = new NSMutableArray<Object>();
		String conditionStr = EOScolGroupeGrp.TO_FWK_SCOLARITE__SCOL_GROUPE_OBJETS_KEY
				+ "."
				+ EOScolGroupeObjet.TO_FWK_SCOLARITE__SCOL_MAQUETTE_AP_KEY
				+ " = %@";
		tbKeys.add(ap);
		
		// CktlLog.log(" - "+conditionStr);
		EOFetchSpecification fetchSpec = new EOFetchSpecification(
				EOScolGroupeGrp.ENTITY_NAME, EOQualifier
						.qualifierWithQualifierFormat(conditionStr, tbKeys),
				new NSArray<EOSortOrdering>(new EOSortOrdering[] { new EOSortOrdering(
						EOScolGroupeGrp.GGRP_LIBELLE_KEY,
						EOSortOrdering.CompareCaseInsensitiveAscending) }));
		fetchSpec.setUsesDistinct(true);
		fetchSpec.setIsDeep(true);
		NSArray<EOScolGroupeGrp> retour = ec.objectsWithFetchSpecification(fetchSpec);
		return retour;

	}

}
