// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ReservationAp.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ReservationAp extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ReservationAp";

	// Attributes
	public static final String GGRP_KEY_KEY = "ggrpKey";
	public static final String HCOMP_REC_KEY = "hcompRec";
	public static final String LE_MAP_KEY_KEY = "leMapKey";

	// Relationships
	public static final String MAQUETTE_AP_KEY = "maquetteAp";
	public static final String PERIODICITES_KEY = "periodicites";
	public static final String RESERVATION_KEY = "reservation";
	public static final String SCOL_GROUPE_GRP_KEY = "scolGroupeGrp";
	public static final String V_MAQUETTE_AP_KEY = "vMaquetteAp";

  private static Logger LOG = Logger.getLogger(_ReservationAp.class);

  public ReservationAp localInstanceIn(EOEditingContext editingContext) {
    ReservationAp localInstance = (ReservationAp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer ggrpKey() {
    return (Integer) storedValueForKey("ggrpKey");
  }

  public void setGgrpKey(Integer value) {
    if (_ReservationAp.LOG.isDebugEnabled()) {
    	_ReservationAp.LOG.debug( "updating ggrpKey from " + ggrpKey() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpKey");
  }

  public Integer hcompRec() {
    return (Integer) storedValueForKey("hcompRec");
  }

  public void setHcompRec(Integer value) {
    if (_ReservationAp.LOG.isDebugEnabled()) {
    	_ReservationAp.LOG.debug( "updating hcompRec from " + hcompRec() + " to " + value);
    }
    takeStoredValueForKey(value, "hcompRec");
  }

  public Integer leMapKey() {
    return (Integer) storedValueForKey("leMapKey");
  }

  public void setLeMapKey(Integer value) {
    if (_ReservationAp.LOG.isDebugEnabled()) {
    	_ReservationAp.LOG.debug( "updating leMapKey from " + leMapKey() + " to " + value);
    }
    takeStoredValueForKey(value, "leMapKey");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteAp maquetteAp() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("maquetteAp");
  }

  public void setMaquetteApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_ReservationAp.LOG.isDebugEnabled()) {
      _ReservationAp.LOG.debug("updating maquetteAp from " + maquetteAp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteAp oldValue = maquetteAp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteAp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteAp");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.Reservation reservation() {
    return (org.cocktail.superplaner.serveur.metier.Reservation)storedValueForKey("reservation");
  }

  public void setReservationRelationship(org.cocktail.superplaner.serveur.metier.Reservation value) {
    if (_ReservationAp.LOG.isDebugEnabled()) {
      _ReservationAp.LOG.debug("updating reservation from " + reservation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Reservation oldValue = reservation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "reservation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "reservation");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.ScolGroupeGrp scolGroupeGrp() {
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeGrp)storedValueForKey("scolGroupeGrp");
  }

  public void setScolGroupeGrpRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeGrp value) {
    if (_ReservationAp.LOG.isDebugEnabled()) {
      _ReservationAp.LOG.debug("updating scolGroupeGrp from " + scolGroupeGrp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ScolGroupeGrp oldValue = scolGroupeGrp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "scolGroupeGrp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "scolGroupeGrp");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.VMaquetteAp vMaquetteAp() {
    return (org.cocktail.superplaner.serveur.metier.VMaquetteAp)storedValueForKey("vMaquetteAp");
  }

  public void setVMaquetteApRelationship(org.cocktail.superplaner.serveur.metier.VMaquetteAp value) {
    if (_ReservationAp.LOG.isDebugEnabled()) {
      _ReservationAp.LOG.debug("updating vMaquetteAp from " + vMaquetteAp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.VMaquetteAp oldValue = vMaquetteAp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "vMaquetteAp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "vMaquetteAp");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.Periodicite> periodicites() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.Periodicite>)storedValueForKey("periodicites");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Periodicite> periodicites(EOQualifier qualifier) {
    return periodicites(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Periodicite> periodicites(EOQualifier qualifier, boolean fetch) {
    return periodicites(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Periodicite> periodicites(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.Periodicite> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.Periodicite.RESERVATION_AP_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.Periodicite.fetchPeriodicites(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = periodicites();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Periodicite>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Periodicite>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToPeriodicitesRelationship(org.cocktail.superplaner.serveur.metier.Periodicite object) {
    if (_ReservationAp.LOG.isDebugEnabled()) {
      _ReservationAp.LOG.debug("adding " + object + " to periodicites relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "periodicites");
  }

  public void removeFromPeriodicitesRelationship(org.cocktail.superplaner.serveur.metier.Periodicite object) {
    if (_ReservationAp.LOG.isDebugEnabled()) {
      _ReservationAp.LOG.debug("removing " + object + " from periodicites relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "periodicites");
  }

  public org.cocktail.superplaner.serveur.metier.Periodicite createPeriodicitesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Periodicite");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "periodicites");
    return (org.cocktail.superplaner.serveur.metier.Periodicite) eo;
  }

  public void deletePeriodicitesRelationship(org.cocktail.superplaner.serveur.metier.Periodicite object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "periodicites");
    editingContext().deleteObject(object);
  }

  public void deleteAllPeriodicitesRelationships() {
    Enumeration objects = periodicites().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePeriodicitesRelationship((org.cocktail.superplaner.serveur.metier.Periodicite)objects.nextElement());
    }
  }


  public static ReservationAp createReservationAp(EOEditingContext editingContext, Integer hcompRec
) {
    ReservationAp eo = (ReservationAp) EOUtilities.createAndInsertInstance(editingContext, _ReservationAp.ENTITY_NAME);    
		eo.setHcompRec(hcompRec);
    return eo;
  }

  public static NSArray<ReservationAp> fetchAllReservationAps(EOEditingContext editingContext) {
    return _ReservationAp.fetchAllReservationAps(editingContext, null);
  }

  public static NSArray<ReservationAp> fetchAllReservationAps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ReservationAp.fetchReservationAps(editingContext, null, sortOrderings);
  }

  public static NSArray<ReservationAp> fetchReservationAps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ReservationAp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ReservationAp> eoObjects = (NSArray<ReservationAp>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ReservationAp fetchReservationAp(EOEditingContext editingContext, String keyName, Object value) {
    return _ReservationAp.fetchReservationAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ReservationAp fetchReservationAp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ReservationAp> eoObjects = _ReservationAp.fetchReservationAps(editingContext, qualifier, null);
    ReservationAp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ReservationAp)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ReservationAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ReservationAp fetchRequiredReservationAp(EOEditingContext editingContext, String keyName, Object value) {
    return _ReservationAp.fetchRequiredReservationAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ReservationAp fetchRequiredReservationAp(EOEditingContext editingContext, EOQualifier qualifier) {
    ReservationAp eoObject = _ReservationAp.fetchReservationAp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ReservationAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ReservationAp localInstanceIn(EOEditingContext editingContext, ReservationAp eo) {
    ReservationAp localInstance = (eo == null) ? null : (ReservationAp)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
