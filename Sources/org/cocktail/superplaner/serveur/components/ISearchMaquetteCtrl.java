/**
 * 
 */
package org.cocktail.superplaner.serveur.components;

import org.cocktail.fwkcktlajaxwebext.serveur.component.tableview.column.CktlAjaxTableViewColumn;

import com.webobjects.eocontrol.EOGenericRecord;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

/**
 * @author jlmatas
 *
 */
public interface ISearchMaquetteCtrl {

	
	/**
	 * Retourne une liste d'objets selon la recherche
	 * @return
	 */
	public NSArray<EOGenericRecord> getLstObjFromSearch();
	
	/**
	 * Retourne la liste des colonnes a afficher dans la recherche par libelle 
	 * @return
	 */
	public NSArray<CktlAjaxTableViewColumn> getColonnes() ;
	
	/**
	 * Retourne le libelle du champs de recherche pour la recherche par libelle
	 * @return
	 */
	public String getLibSearchField();
	
}
