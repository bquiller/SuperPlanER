// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to MaquetteAp.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _MaquetteAp extends  EOGenericRecord {
	public static final String ENTITY_NAME = "MaquetteAp";

	// Attributes
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
	public static final String RESERVATION_APS_KEY = "reservationAps";
	public static final String SCOL_FORMATION_ANNEE_KEY = "scolFormationAnnee";
	public static final String SCOL_GROUPE_OBJETS_KEY = "scolGroupeObjets";
	public static final String V_PARCOURS_AP_KEY = "vParcoursAp";

  private static Logger LOG = Logger.getLogger(_MaquetteAp.class);

  public MaquetteAp localInstanceIn(EOEditingContext editingContext) {
    MaquetteAp localInstance = (MaquetteAp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
    	_MaquetteAp.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public Integer mapGroupePrevu() {
    return (Integer) storedValueForKey("mapGroupePrevu");
  }

  public void setMapGroupePrevu(Integer value) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
    	_MaquetteAp.LOG.debug( "updating mapGroupePrevu from " + mapGroupePrevu() + " to " + value);
    }
    takeStoredValueForKey(value, "mapGroupePrevu");
  }

  public Integer mapKey() {
    return (Integer) storedValueForKey("mapKey");
  }

  public void setMapKey(Integer value) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
    	_MaquetteAp.LOG.debug( "updating mapKey from " + mapKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mapKey");
  }

  public String mapLibelle() {
    return (String) storedValueForKey("mapLibelle");
  }

  public void setMapLibelle(String value) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
    	_MaquetteAp.LOG.debug( "updating mapLibelle from " + mapLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "mapLibelle");
  }

  public Integer mapSeuil() {
    return (Integer) storedValueForKey("mapSeuil");
  }

  public void setMapSeuil(Integer value) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
    	_MaquetteAp.LOG.debug( "updating mapSeuil from " + mapSeuil() + " to " + value);
    }
    takeStoredValueForKey(value, "mapSeuil");
  }

  public java.math.BigDecimal mapValeur() {
    return (java.math.BigDecimal) storedValueForKey("mapValeur");
  }

  public void setMapValeur(java.math.BigDecimal value) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
    	_MaquetteAp.LOG.debug( "updating mapValeur from " + mapValeur() + " to " + value);
    }
    takeStoredValueForKey(value, "mapValeur");
  }

  public String mhcoCode() {
    return (String) storedValueForKey("mhcoCode");
  }

  public void setMhcoCode(String value) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
    	_MaquetteAp.LOG.debug( "updating mhcoCode from " + mhcoCode() + " to " + value);
    }
    takeStoredValueForKey(value, "mhcoCode");
  }

  public String mhmoCode() {
    return (String) storedValueForKey("mhmoCode");
  }

  public void setMhmoCode(String value) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
    	_MaquetteAp.LOG.debug( "updating mhmoCode from " + mhmoCode() + " to " + value);
    }
    takeStoredValueForKey(value, "mhmoCode");
  }

  public org.cocktail.superplaner.serveur.metier.HoraireCode horaireCode() {
    return (org.cocktail.superplaner.serveur.metier.HoraireCode)storedValueForKey("horaireCode");
  }

  public void setHoraireCodeRelationship(org.cocktail.superplaner.serveur.metier.HoraireCode value) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
      _MaquetteAp.LOG.debug("updating horaireCode from " + horaireCode() + " to " + value);
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
    if (_MaquetteAp.LOG.isDebugEnabled()) {
      _MaquetteAp.LOG.debug("updating scolFormationAnnee from " + scolFormationAnnee() + " to " + value);
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
    if (_MaquetteAp.LOG.isDebugEnabled()) {
      _MaquetteAp.LOG.debug("updating vParcoursAp from " + vParcoursAp() + " to " + value);
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
  
  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp> reservationAps() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp>)storedValueForKey("reservationAps");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp> reservationAps(EOQualifier qualifier) {
    return reservationAps(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp> reservationAps(EOQualifier qualifier, boolean fetch) {
    return reservationAps(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp> reservationAps(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ReservationAp.MAQUETTE_AP_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ReservationAp.fetchReservationAps(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = reservationAps();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToReservationApsRelationship(org.cocktail.superplaner.serveur.metier.ReservationAp object) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
      _MaquetteAp.LOG.debug("adding " + object + " to reservationAps relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "reservationAps");
  }

  public void removeFromReservationApsRelationship(org.cocktail.superplaner.serveur.metier.ReservationAp object) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
      _MaquetteAp.LOG.debug("removing " + object + " from reservationAps relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "reservationAps");
  }

  public org.cocktail.superplaner.serveur.metier.ReservationAp createReservationApsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ReservationAp");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "reservationAps");
    return (org.cocktail.superplaner.serveur.metier.ReservationAp) eo;
  }

  public void deleteReservationApsRelationship(org.cocktail.superplaner.serveur.metier.ReservationAp object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "reservationAps");
    editingContext().deleteObject(object);
  }

  public void deleteAllReservationApsRelationships() {
    Enumeration objects = reservationAps().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteReservationApsRelationship((org.cocktail.superplaner.serveur.metier.ReservationAp)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> scolGroupeObjets() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet>)storedValueForKey("scolGroupeObjets");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> scolGroupeObjets(EOQualifier qualifier) {
    return scolGroupeObjets(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> scolGroupeObjets(EOQualifier qualifier, boolean fetch) {
    return scolGroupeObjets(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> scolGroupeObjets(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ScolGroupeObjet.MAQUETTE_AP_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ScolGroupeObjet.fetchScolGroupeObjets(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = scolGroupeObjets();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToScolGroupeObjetsRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeObjet object) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
      _MaquetteAp.LOG.debug("adding " + object + " to scolGroupeObjets relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "scolGroupeObjets");
  }

  public void removeFromScolGroupeObjetsRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeObjet object) {
    if (_MaquetteAp.LOG.isDebugEnabled()) {
      _MaquetteAp.LOG.debug("removing " + object + " from scolGroupeObjets relationship");
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


  public static MaquetteAp createMaquetteAp(EOEditingContext editingContext, Integer fannKey
, Integer mapGroupePrevu
, Integer mapKey
, String mapLibelle
, Integer mapSeuil
, java.math.BigDecimal mapValeur
, String mhcoCode
, String mhmoCode
) {
    MaquetteAp eo = (MaquetteAp) EOUtilities.createAndInsertInstance(editingContext, _MaquetteAp.ENTITY_NAME);    
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

  public static NSArray<MaquetteAp> fetchAllMaquetteAps(EOEditingContext editingContext) {
    return _MaquetteAp.fetchAllMaquetteAps(editingContext, null);
  }

  public static NSArray<MaquetteAp> fetchAllMaquetteAps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _MaquetteAp.fetchMaquetteAps(editingContext, null, sortOrderings);
  }

  public static NSArray<MaquetteAp> fetchMaquetteAps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_MaquetteAp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<MaquetteAp> eoObjects = (NSArray<MaquetteAp>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static MaquetteAp fetchMaquetteAp(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteAp.fetchMaquetteAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteAp fetchMaquetteAp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<MaquetteAp> eoObjects = _MaquetteAp.fetchMaquetteAps(editingContext, qualifier, null);
    MaquetteAp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (MaquetteAp)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one MaquetteAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteAp fetchRequiredMaquetteAp(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteAp.fetchRequiredMaquetteAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteAp fetchRequiredMaquetteAp(EOEditingContext editingContext, EOQualifier qualifier) {
    MaquetteAp eoObject = _MaquetteAp.fetchMaquetteAp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no MaquetteAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteAp localInstanceIn(EOEditingContext editingContext, MaquetteAp eo) {
    MaquetteAp localInstance = (eo == null) ? null : (MaquetteAp)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
