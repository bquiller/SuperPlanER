// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VMaquetteAp.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VMaquetteAp extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VMaquetteAp";

	// Attributes
	public static final String COLOR_CODE_KEY = "colorCode";
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String MAP_GROUPE_PREVU_KEY = "mapGroupePrevu";
	public static final String MAP_KEY_KEY = "mapKey";
	public static final String MAP_LIBELLE_KEY = "mapLibelle";
	public static final String MAP_SEUIL_KEY = "mapSeuil";
	public static final String MAP_VALEUR_KEY = "mapValeur";
	public static final String MHCO_CODE_KEY = "mhcoCode";
	public static final String MHMO_CODE_KEY = "mhmoCode";

	// Relationships
	public static final String HORAIRE_CODE_KEY = "horaireCode";
	public static final String SCOL_FORMATION_ANNEE_KEY = "scolFormationAnnee";
	public static final String SCOL_GROUPE_OBJETS_KEY = "scolGroupeObjets";
	public static final String V_PARCOURS_AP_KEY = "vParcoursAp";

  private static Logger LOG = Logger.getLogger(_VMaquetteAp.class);

  public VMaquetteAp localInstanceIn(EOEditingContext editingContext) {
    VMaquetteAp localInstance = (VMaquetteAp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String colorCode() {
    return (String) storedValueForKey("colorCode");
  }

  public void setColorCode(String value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
    	_VMaquetteAp.LOG.debug( "updating colorCode from " + colorCode() + " to " + value);
    }
    takeStoredValueForKey(value, "colorCode");
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
    	_VMaquetteAp.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public Integer mapGroupePrevu() {
    return (Integer) storedValueForKey("mapGroupePrevu");
  }

  public void setMapGroupePrevu(Integer value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
    	_VMaquetteAp.LOG.debug( "updating mapGroupePrevu from " + mapGroupePrevu() + " to " + value);
    }
    takeStoredValueForKey(value, "mapGroupePrevu");
  }

  public Integer mapKey() {
    return (Integer) storedValueForKey("mapKey");
  }

  public void setMapKey(Integer value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
    	_VMaquetteAp.LOG.debug( "updating mapKey from " + mapKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mapKey");
  }

  public String mapLibelle() {
    return (String) storedValueForKey("mapLibelle");
  }

  public void setMapLibelle(String value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
    	_VMaquetteAp.LOG.debug( "updating mapLibelle from " + mapLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "mapLibelle");
  }

  public Integer mapSeuil() {
    return (Integer) storedValueForKey("mapSeuil");
  }

  public void setMapSeuil(Integer value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
    	_VMaquetteAp.LOG.debug( "updating mapSeuil from " + mapSeuil() + " to " + value);
    }
    takeStoredValueForKey(value, "mapSeuil");
  }

  public java.math.BigDecimal mapValeur() {
    return (java.math.BigDecimal) storedValueForKey("mapValeur");
  }

  public void setMapValeur(java.math.BigDecimal value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
    	_VMaquetteAp.LOG.debug( "updating mapValeur from " + mapValeur() + " to " + value);
    }
    takeStoredValueForKey(value, "mapValeur");
  }

  public String mhcoCode() {
    return (String) storedValueForKey("mhcoCode");
  }

  public void setMhcoCode(String value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
    	_VMaquetteAp.LOG.debug( "updating mhcoCode from " + mhcoCode() + " to " + value);
    }
    takeStoredValueForKey(value, "mhcoCode");
  }

  public String mhmoCode() {
    return (String) storedValueForKey("mhmoCode");
  }

  public void setMhmoCode(String value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
    	_VMaquetteAp.LOG.debug( "updating mhmoCode from " + mhmoCode() + " to " + value);
    }
    takeStoredValueForKey(value, "mhmoCode");
  }

  public org.cocktail.superplaner.serveur.metier.HoraireCode horaireCode() {
    return (org.cocktail.superplaner.serveur.metier.HoraireCode)storedValueForKey("horaireCode");
  }

  public void setHoraireCodeRelationship(org.cocktail.superplaner.serveur.metier.HoraireCode value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
      _VMaquetteAp.LOG.debug("updating horaireCode from " + horaireCode() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.HoraireCode oldValue = horaireCode();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "horaireCode");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "horaireCode");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.FormationAnnee scolFormationAnnee() {
    return (org.cocktail.superplaner.serveur.metier.FormationAnnee)storedValueForKey("scolFormationAnnee");
  }

  public void setScolFormationAnneeRelationship(org.cocktail.superplaner.serveur.metier.FormationAnnee value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
      _VMaquetteAp.LOG.debug("updating scolFormationAnnee from " + scolFormationAnnee() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationAnnee oldValue = scolFormationAnnee();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "scolFormationAnnee");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "scolFormationAnnee");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.VParcoursAp vParcoursAp() {
    return (org.cocktail.superplaner.serveur.metier.VParcoursAp)storedValueForKey("vParcoursAp");
  }

  public void setVParcoursApRelationship(org.cocktail.superplaner.serveur.metier.VParcoursAp value) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
      _VMaquetteAp.LOG.debug("updating vParcoursAp from " + vParcoursAp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.VParcoursAp oldValue = vParcoursAp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "vParcoursAp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "vParcoursAp");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> scolGroupeObjets() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet>)storedValueForKey("scolGroupeObjets");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> scolGroupeObjets(EOQualifier qualifier) {
    return scolGroupeObjets(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> scolGroupeObjets(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> results;
      results = scolGroupeObjets();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToScolGroupeObjetsRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeObjet object) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
      _VMaquetteAp.LOG.debug("adding " + object + " to scolGroupeObjets relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "scolGroupeObjets");
  }

  public void removeFromScolGroupeObjetsRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeObjet object) {
    if (_VMaquetteAp.LOG.isDebugEnabled()) {
      _VMaquetteAp.LOG.debug("removing " + object + " from scolGroupeObjets relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "scolGroupeObjets");
  }

  public org.cocktail.superplaner.serveur.metier.ScolGroupeObjet createScolGroupeObjetsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ScolGroupeObjet");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "scolGroupeObjets");
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeObjet) eo;
  }

  public void deleteScolGroupeObjetsRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeObjet object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "scolGroupeObjets");
    editingContext().deleteObject(object);
  }

  public void deleteAllScolGroupeObjetsRelationships() {
    Enumeration objects = scolGroupeObjets().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteScolGroupeObjetsRelationship((org.cocktail.superplaner.serveur.metier.ScolGroupeObjet)objects.nextElement());
    }
  }


  public static VMaquetteAp createVMaquetteAp(EOEditingContext editingContext, Integer fannKey
, Integer mapGroupePrevu
, Integer mapKey
, String mapLibelle
, Integer mapSeuil
, java.math.BigDecimal mapValeur
, String mhcoCode
, String mhmoCode
) {
    VMaquetteAp eo = (VMaquetteAp) EOUtilities.createAndInsertInstance(editingContext, _VMaquetteAp.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setMapGroupePrevu(mapGroupePrevu);
		eo.setMapKey(mapKey);
		eo.setMapLibelle(mapLibelle);
		eo.setMapSeuil(mapSeuil);
		eo.setMapValeur(mapValeur);
		eo.setMhcoCode(mhcoCode);
		eo.setMhmoCode(mhmoCode);
    return eo;
  }

  public static NSArray<VMaquetteAp> fetchAllVMaquetteAps(EOEditingContext editingContext) {
    return _VMaquetteAp.fetchAllVMaquetteAps(editingContext, null);
  }

  public static NSArray<VMaquetteAp> fetchAllVMaquetteAps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VMaquetteAp.fetchVMaquetteAps(editingContext, null, sortOrderings);
  }

  public static NSArray<VMaquetteAp> fetchVMaquetteAps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VMaquetteAp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VMaquetteAp> eoObjects = (NSArray<VMaquetteAp>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VMaquetteAp fetchVMaquetteAp(EOEditingContext editingContext, String keyName, Object value) {
    return _VMaquetteAp.fetchVMaquetteAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VMaquetteAp fetchVMaquetteAp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VMaquetteAp> eoObjects = _VMaquetteAp.fetchVMaquetteAps(editingContext, qualifier, null);
    VMaquetteAp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VMaquetteAp)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VMaquetteAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VMaquetteAp fetchRequiredVMaquetteAp(EOEditingContext editingContext, String keyName, Object value) {
    return _VMaquetteAp.fetchRequiredVMaquetteAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VMaquetteAp fetchRequiredVMaquetteAp(EOEditingContext editingContext, EOQualifier qualifier) {
    VMaquetteAp eoObject = _VMaquetteAp.fetchVMaquetteAp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VMaquetteAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VMaquetteAp localInstanceIn(EOEditingContext editingContext, VMaquetteAp eo) {
    VMaquetteAp localInstance = (eo == null) ? null : (VMaquetteAp)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
