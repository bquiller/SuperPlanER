// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to HcompRec.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _HcompRec extends  EOGenericRecord {
	public static final String ENTITY_NAME = "HcompRec";

	// Attributes
	public static final String DATE_RESA_KEY = "dateResa";
	public static final String HCR_TAG_KEY = "hcrTag";

	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String MAQUETTE_AP_KEY = "maquetteAp";
	public static final String RESERVATION_KEY = "reservation";

  private static Logger LOG = Logger.getLogger(_HcompRec.class);

  public HcompRec localInstanceIn(EOEditingContext editingContext) {
    HcompRec localInstance = (HcompRec)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dateResa() {
    return (NSTimestamp) storedValueForKey("dateResa");
  }

  public void setDateResa(NSTimestamp value) {
    if (_HcompRec.LOG.isDebugEnabled()) {
    	_HcompRec.LOG.debug( "updating dateResa from " + dateResa() + " to " + value);
    }
    takeStoredValueForKey(value, "dateResa");
  }

  public Integer hcrTag() {
    return (Integer) storedValueForKey("hcrTag");
  }

  public void setHcrTag(Integer value) {
    if (_HcompRec.LOG.isDebugEnabled()) {
    	_HcompRec.LOG.debug( "updating hcrTag from " + hcrTag() + " to " + value);
    }
    takeStoredValueForKey(value, "hcrTag");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_HcompRec.LOG.isDebugEnabled()) {
      _HcompRec.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
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
    if (_HcompRec.LOG.isDebugEnabled()) {
      _HcompRec.LOG.debug("updating maquetteAp from " + maquetteAp() + " to " + value);
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
    if (_HcompRec.LOG.isDebugEnabled()) {
      _HcompRec.LOG.debug("updating reservation from " + reservation() + " to " + value);
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
  

  public static HcompRec createHcompRec(EOEditingContext editingContext, NSTimestamp dateResa
, Integer hcrTag
) {
    HcompRec eo = (HcompRec) EOUtilities.createAndInsertInstance(editingContext, _HcompRec.ENTITY_NAME);    
		eo.setDateResa(dateResa);
		eo.setHcrTag(hcrTag);
    return eo;
  }

  public static NSArray<HcompRec> fetchAllHcompRecs(EOEditingContext editingContext) {
    return _HcompRec.fetchAllHcompRecs(editingContext, null);
  }

  public static NSArray<HcompRec> fetchAllHcompRecs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _HcompRec.fetchHcompRecs(editingContext, null, sortOrderings);
  }

  public static NSArray<HcompRec> fetchHcompRecs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_HcompRec.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<HcompRec> eoObjects = (NSArray<HcompRec>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static HcompRec fetchHcompRec(EOEditingContext editingContext, String keyName, Object value) {
    return _HcompRec.fetchHcompRec(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static HcompRec fetchHcompRec(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<HcompRec> eoObjects = _HcompRec.fetchHcompRecs(editingContext, qualifier, null);
    HcompRec eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (HcompRec)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one HcompRec that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static HcompRec fetchRequiredHcompRec(EOEditingContext editingContext, String keyName, Object value) {
    return _HcompRec.fetchRequiredHcompRec(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static HcompRec fetchRequiredHcompRec(EOEditingContext editingContext, EOQualifier qualifier) {
    HcompRec eoObject = _HcompRec.fetchHcompRec(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no HcompRec that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static HcompRec localInstanceIn(EOEditingContext editingContext, HcompRec eo) {
    HcompRec localInstance = (eo == null) ? null : (HcompRec)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
