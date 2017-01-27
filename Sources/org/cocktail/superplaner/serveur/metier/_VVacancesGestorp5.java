// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VVacancesGestorp5.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VVacancesGestorp5 extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VVacancesGestorp5";

	// Attributes
	public static final String CODE_KEY = "code";
	public static final String DATEDEB_KEY = "datedeb";
	public static final String DATEFIN_KEY = "datefin";
	public static final String DUREE_KEY = "duree";
	public static final String HDEB_KEY = "hdeb";
	public static final String HFIN_KEY = "hfin";
	public static final String LIBELLE_KEY = "libelle";
	public static final String NO_INDIVIDU_KEY = "noIndividu";

	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";

  private static Logger LOG = Logger.getLogger(_VVacancesGestorp5.class);

  public VVacancesGestorp5 localInstanceIn(EOEditingContext editingContext) {
    VVacancesGestorp5 localInstance = (VVacancesGestorp5)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String code() {
    return (String) storedValueForKey("code");
  }

  public void setCode(String value) {
    if (_VVacancesGestorp5.LOG.isDebugEnabled()) {
    	_VVacancesGestorp5.LOG.debug( "updating code from " + code() + " to " + value);
    }
    takeStoredValueForKey(value, "code");
  }

  public NSTimestamp datedeb() {
    return (NSTimestamp) storedValueForKey("datedeb");
  }

  public void setDatedeb(NSTimestamp value) {
    if (_VVacancesGestorp5.LOG.isDebugEnabled()) {
    	_VVacancesGestorp5.LOG.debug( "updating datedeb from " + datedeb() + " to " + value);
    }
    takeStoredValueForKey(value, "datedeb");
  }

  public NSTimestamp datefin() {
    return (NSTimestamp) storedValueForKey("datefin");
  }

  public void setDatefin(NSTimestamp value) {
    if (_VVacancesGestorp5.LOG.isDebugEnabled()) {
    	_VVacancesGestorp5.LOG.debug( "updating datefin from " + datefin() + " to " + value);
    }
    takeStoredValueForKey(value, "datefin");
  }

  public Float duree() {
    return (Float) storedValueForKey("duree");
  }

  public void setDuree(Float value) {
    if (_VVacancesGestorp5.LOG.isDebugEnabled()) {
    	_VVacancesGestorp5.LOG.debug( "updating duree from " + duree() + " to " + value);
    }
    takeStoredValueForKey(value, "duree");
  }

  public Float hdeb() {
    return (Float) storedValueForKey("hdeb");
  }

  public void setHdeb(Float value) {
    if (_VVacancesGestorp5.LOG.isDebugEnabled()) {
    	_VVacancesGestorp5.LOG.debug( "updating hdeb from " + hdeb() + " to " + value);
    }
    takeStoredValueForKey(value, "hdeb");
  }

  public Float hfin() {
    return (Float) storedValueForKey("hfin");
  }

  public void setHfin(Float value) {
    if (_VVacancesGestorp5.LOG.isDebugEnabled()) {
    	_VVacancesGestorp5.LOG.debug( "updating hfin from " + hfin() + " to " + value);
    }
    takeStoredValueForKey(value, "hfin");
  }

  public String libelle() {
    return (String) storedValueForKey("libelle");
  }

  public void setLibelle(String value) {
    if (_VVacancesGestorp5.LOG.isDebugEnabled()) {
    	_VVacancesGestorp5.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, "libelle");
  }

  public Integer noIndividu() {
    return (Integer) storedValueForKey("noIndividu");
  }

  public void setNoIndividu(Integer value) {
    if (_VVacancesGestorp5.LOG.isDebugEnabled()) {
    	_VVacancesGestorp5.LOG.debug( "updating noIndividu from " + noIndividu() + " to " + value);
    }
    takeStoredValueForKey(value, "noIndividu");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_VVacancesGestorp5.LOG.isDebugEnabled()) {
      _VVacancesGestorp5.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
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
  

  public static VVacancesGestorp5 createVVacancesGestorp5(EOEditingContext editingContext, NSTimestamp datedeb
, Integer noIndividu
) {
    VVacancesGestorp5 eo = (VVacancesGestorp5) EOUtilities.createAndInsertInstance(editingContext, _VVacancesGestorp5.ENTITY_NAME);    
		eo.setDatedeb(datedeb);
		eo.setNoIndividu(noIndividu);
    return eo;
  }

  public static NSArray<VVacancesGestorp5> fetchAllVVacancesGestorp5s(EOEditingContext editingContext) {
    return _VVacancesGestorp5.fetchAllVVacancesGestorp5s(editingContext, null);
  }

  public static NSArray<VVacancesGestorp5> fetchAllVVacancesGestorp5s(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VVacancesGestorp5.fetchVVacancesGestorp5s(editingContext, null, sortOrderings);
  }

  public static NSArray<VVacancesGestorp5> fetchVVacancesGestorp5s(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VVacancesGestorp5.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VVacancesGestorp5> eoObjects = (NSArray<VVacancesGestorp5>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VVacancesGestorp5 fetchVVacancesGestorp5(EOEditingContext editingContext, String keyName, Object value) {
    return _VVacancesGestorp5.fetchVVacancesGestorp5(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VVacancesGestorp5 fetchVVacancesGestorp5(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VVacancesGestorp5> eoObjects = _VVacancesGestorp5.fetchVVacancesGestorp5s(editingContext, qualifier, null);
    VVacancesGestorp5 eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VVacancesGestorp5)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VVacancesGestorp5 that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VVacancesGestorp5 fetchRequiredVVacancesGestorp5(EOEditingContext editingContext, String keyName, Object value) {
    return _VVacancesGestorp5.fetchRequiredVVacancesGestorp5(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VVacancesGestorp5 fetchRequiredVVacancesGestorp5(EOEditingContext editingContext, EOQualifier qualifier) {
    VVacancesGestorp5 eoObject = _VVacancesGestorp5.fetchVVacancesGestorp5(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VVacancesGestorp5 that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VVacancesGestorp5 localInstanceIn(EOEditingContext editingContext, VVacancesGestorp5 eo) {
    VVacancesGestorp5 localInstance = (eo == null) ? null : (VVacancesGestorp5)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
