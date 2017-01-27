// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolGroupeObjet.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolGroupeObjet extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ScolGroupeObjet";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String GGRP_KEY_KEY = "ggrpKey";
	public static final String GOBJ_KEY_KEY = "gobjKey";
	public static final String GOBJ_TYPE_KEY = "gobjType";
	public static final String MAP_KEY_KEY = "mapKey";
	public static final String MSEM_KEY_KEY = "msemKey";

	// Relationships
	public static final String INCLUS_FILS_KEY = "inclusFils";
	public static final String INCLUS_PERE_KEY = "inclusPere";
	public static final String MAQUETTE_AP_KEY = "maquetteAp";
	public static final String SCOL_GROUPE_GRP_KEY = "scolGroupeGrp";
	public static final String SEMESTRE_KEY = "semestre";

  private static Logger LOG = Logger.getLogger(_ScolGroupeObjet.class);

  public ScolGroupeObjet localInstanceIn(EOEditingContext editingContext) {
    ScolGroupeObjet localInstance = (ScolGroupeObjet)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
    	_ScolGroupeObjet.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public Integer ggrpKey() {
    return (Integer) storedValueForKey("ggrpKey");
  }

  public void setGgrpKey(Integer value) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
    	_ScolGroupeObjet.LOG.debug( "updating ggrpKey from " + ggrpKey() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpKey");
  }

  public Integer gobjKey() {
    return (Integer) storedValueForKey("gobjKey");
  }

  public void setGobjKey(Integer value) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
    	_ScolGroupeObjet.LOG.debug( "updating gobjKey from " + gobjKey() + " to " + value);
    }
    takeStoredValueForKey(value, "gobjKey");
  }

  public String gobjType() {
    return (String) storedValueForKey("gobjType");
  }

  public void setGobjType(String value) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
    	_ScolGroupeObjet.LOG.debug( "updating gobjType from " + gobjType() + " to " + value);
    }
    takeStoredValueForKey(value, "gobjType");
  }

  public Integer mapKey() {
    return (Integer) storedValueForKey("mapKey");
  }

  public void setMapKey(Integer value) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
    	_ScolGroupeObjet.LOG.debug( "updating mapKey from " + mapKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mapKey");
  }

  public Integer msemKey() {
    return (Integer) storedValueForKey("msemKey");
  }

  public void setMsemKey(Integer value) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
    	_ScolGroupeObjet.LOG.debug( "updating msemKey from " + msemKey() + " to " + value);
    }
    takeStoredValueForKey(value, "msemKey");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteAp maquetteAp() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("maquetteAp");
  }

  public void setMaquetteApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
      _ScolGroupeObjet.LOG.debug("updating maquetteAp from " + maquetteAp() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.ScolGroupeGrp scolGroupeGrp() {
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeGrp)storedValueForKey("scolGroupeGrp");
  }

  public void setScolGroupeGrpRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeGrp value) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
      _ScolGroupeObjet.LOG.debug("updating scolGroupeGrp from " + scolGroupeGrp() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.MaquetteSemestre semestre() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteSemestre)storedValueForKey("semestre");
  }

  public void setSemestreRelationship(org.cocktail.superplaner.serveur.metier.MaquetteSemestre value) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
      _ScolGroupeObjet.LOG.debug("updating semestre from " + semestre() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteSemestre oldValue = semestre();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "semestre");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "semestre");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusFils() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion>)storedValueForKey("inclusFils");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusFils(EOQualifier qualifier) {
    return inclusFils(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusFils(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> results;
      results = inclusFils();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToInclusFilsRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion object) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
      _ScolGroupeObjet.LOG.debug("adding " + object + " to inclusFils relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "inclusFils");
  }

  public void removeFromInclusFilsRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion object) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
      _ScolGroupeObjet.LOG.debug("removing " + object + " from inclusFils relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "inclusFils");
  }

  public org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion createInclusFilsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ScolGroupeInclusion");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "inclusFils");
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion) eo;
  }

  public void deleteInclusFilsRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "inclusFils");
    editingContext().deleteObject(object);
  }

  public void deleteAllInclusFilsRelationships() {
    Enumeration objects = inclusFils().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteInclusFilsRelationship((org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusPere() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion>)storedValueForKey("inclusPere");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusPere(EOQualifier qualifier) {
    return inclusPere(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusPere(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> results;
      results = inclusPere();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToInclusPereRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion object) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
      _ScolGroupeObjet.LOG.debug("adding " + object + " to inclusPere relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "inclusPere");
  }

  public void removeFromInclusPereRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion object) {
    if (_ScolGroupeObjet.LOG.isDebugEnabled()) {
      _ScolGroupeObjet.LOG.debug("removing " + object + " from inclusPere relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "inclusPere");
  }

  public org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion createInclusPereRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ScolGroupeInclusion");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "inclusPere");
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion) eo;
  }

  public void deleteInclusPereRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "inclusPere");
    editingContext().deleteObject(object);
  }

  public void deleteAllInclusPereRelationships() {
    Enumeration objects = inclusPere().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteInclusPereRelationship((org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion)objects.nextElement());
    }
  }


  public static ScolGroupeObjet createScolGroupeObjet(EOEditingContext editingContext, Integer fannKey
, Integer ggrpKey
, Integer gobjKey
, String gobjType
) {
    ScolGroupeObjet eo = (ScolGroupeObjet) EOUtilities.createAndInsertInstance(editingContext, _ScolGroupeObjet.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setGgrpKey(ggrpKey);
		eo.setGobjKey(gobjKey);
		eo.setGobjType(gobjType);
    return eo;
  }

  public static NSArray<ScolGroupeObjet> fetchAllScolGroupeObjets(EOEditingContext editingContext) {
    return _ScolGroupeObjet.fetchAllScolGroupeObjets(editingContext, null);
  }

  public static NSArray<ScolGroupeObjet> fetchAllScolGroupeObjets(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolGroupeObjet.fetchScolGroupeObjets(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolGroupeObjet> fetchScolGroupeObjets(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolGroupeObjet.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolGroupeObjet> eoObjects = (NSArray<ScolGroupeObjet>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolGroupeObjet fetchScolGroupeObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolGroupeObjet.fetchScolGroupeObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolGroupeObjet fetchScolGroupeObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolGroupeObjet> eoObjects = _ScolGroupeObjet.fetchScolGroupeObjets(editingContext, qualifier, null);
    ScolGroupeObjet eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolGroupeObjet)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ScolGroupeObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolGroupeObjet fetchRequiredScolGroupeObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolGroupeObjet.fetchRequiredScolGroupeObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolGroupeObjet fetchRequiredScolGroupeObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolGroupeObjet eoObject = _ScolGroupeObjet.fetchScolGroupeObjet(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ScolGroupeObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolGroupeObjet localInstanceIn(EOEditingContext editingContext, ScolGroupeObjet eo) {
    ScolGroupeObjet localInstance = (eo == null) ? null : (ScolGroupeObjet)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
