// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to HcompRecup.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _HcompRecup extends  EOGenericRecord {
	public static final String ENTITY_NAME = "HcompRecup";

	// Attributes
	public static final String HCR_TAG_KEY = "hcrTag";

	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String MAQUETTE_AP_KEY = "maquetteAp";
	public static final String PERIODICITE_KEY = "periodicite";
	public static final String RESERVATION_KEY = "reservation";

  private static Logger LOG = Logger.getLogger(_HcompRecup.class);

  public HcompRecup localInstanceIn(EOEditingContext editingContext) {
    HcompRecup localInstance = (HcompRecup)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer hcrTag() {
    return (Integer) storedValueForKey("hcrTag");
  }

  public void setHcrTag(Integer value) {
    if (_HcompRecup.LOG.isDebugEnabled()) {
    	_HcompRecup.LOG.debug( "updating hcrTag from " + hcrTag() + " to " + value);
    }
    takeStoredValueForKey(value, "hcrTag");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_HcompRecup.LOG.isDebugEnabled()) {
      _HcompRecup.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individuUlr();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individuUlr");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individuUlr");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteAp maquetteAp() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("maquetteAp");
  }

  public void setMaquetteApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_HcompRecup.LOG.isDebugEnabled()) {
      _HcompRecup.LOG.debug("updating maquetteAp from " + maquetteAp() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.Periodicite periodicite() {
    return (org.cocktail.superplaner.serveur.metier.Periodicite)storedValueForKey("periodicite");
  }

  public void setPeriodiciteRelationship(org.cocktail.superplaner.serveur.metier.Periodicite value) {
    if (_HcompRecup.LOG.isDebugEnabled()) {
      _HcompRecup.LOG.debug("updating periodicite from " + periodicite() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Periodicite oldValue = periodicite();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "periodicite");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "periodicite");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.Reservation reservation() {
    return (org.cocktail.superplaner.serveur.metier.Reservation)storedValueForKey("reservation");
  }

  public void setReservationRelationship(org.cocktail.superplaner.serveur.metier.Reservation value) {
    if (_HcompRecup.LOG.isDebugEnabled()) {
      _HcompRecup.LOG.debug("updating reservation from " + reservation() + " to " + value);
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
  

  public static HcompRecup createHcompRecup(EOEditingContext editingContext, Integer hcrTag
) {
    HcompRecup eo = (HcompRecup) EOUtilities.createAndInsertInstance(editingContext, _HcompRecup.ENTITY_NAME);    
		eo.setHcrTag(hcrTag);
    return eo;
  }

  public static NSArray<HcompRecup> fetchAllHcompRecups(EOEditingContext editingContext) {
    return _HcompRecup.fetchAllHcompRecups(editingContext, null);
  }

  public static NSArray<HcompRecup> fetchAllHcompRecups(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _HcompRecup.fetchHcompRecups(editingContext, null, sortOrderings);
  }

  public static NSArray<HcompRecup> fetchHcompRecups(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_HcompRecup.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<HcompRecup> eoObjects = (NSArray<HcompRecup>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static HcompRecup fetchHcompRecup(EOEditingContext editingContext, String keyName, Object value) {
    return _HcompRecup.fetchHcompRecup(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static HcompRecup fetchHcompRecup(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<HcompRecup> eoObjects = _HcompRecup.fetchHcompRecups(editingContext, qualifier, null);
    HcompRecup eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (HcompRecup)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one HcompRecup that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static HcompRecup fetchRequiredHcompRecup(EOEditingContext editingContext, String keyName, Object value) {
    return _HcompRecup.fetchRequiredHcompRecup(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static HcompRecup fetchRequiredHcompRecup(EOEditingContext editingContext, EOQualifier qualifier) {
    HcompRecup eoObject = _HcompRecup.fetchHcompRecup(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no HcompRecup that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static HcompRecup localInstanceIn(EOEditingContext editingContext, HcompRecup eo) {
    HcompRecup localInstance = (eo == null) ? null : (HcompRecup)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
