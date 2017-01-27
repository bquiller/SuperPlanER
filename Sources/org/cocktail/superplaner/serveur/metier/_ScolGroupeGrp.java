// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolGroupeGrp.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolGroupeGrp extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ScolGroupeGrp";

	// Attributes
	public static final String GGRP_CODE_KEY = "ggrpCode";
	public static final String GGRP_DATE_DEBUT_KEY = "ggrpDateDebut";
	public static final String GGRP_DATE_FIN_KEY = "ggrpDateFin";
	public static final String GGRP_INT_CAPACITE_KEY = "ggrpIntCapacite";
	public static final String GGRP_KEY_KEY = "ggrpKey";
	public static final String GGRP_LIBELLE_KEY = "ggrpLibelle";
	public static final String GGRP_MAX_CAPACITE_KEY = "ggrpMaxCapacite";
	public static final String GGRP_MAX_TEMOIN_KEY = "ggrpMaxTemoin";

	// Relationships
	public static final String INCLUS_FILS_KEY = "inclusFils";
	public static final String INCLUS_PERE_KEY = "inclusPere";
	public static final String SCOL_GROUPE_OBJET_KEY = "scolGroupeObjet";

  private static Logger LOG = Logger.getLogger(_ScolGroupeGrp.class);

  public ScolGroupeGrp localInstanceIn(EOEditingContext editingContext) {
    ScolGroupeGrp localInstance = (ScolGroupeGrp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String ggrpCode() {
    return (String) storedValueForKey("ggrpCode");
  }

  public void setGgrpCode(String value) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
    	_ScolGroupeGrp.LOG.debug( "updating ggrpCode from " + ggrpCode() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpCode");
  }

  public Integer ggrpDateDebut() {
    return (Integer) storedValueForKey("ggrpDateDebut");
  }

  public void setGgrpDateDebut(Integer value) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
    	_ScolGroupeGrp.LOG.debug( "updating ggrpDateDebut from " + ggrpDateDebut() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpDateDebut");
  }

  public Integer ggrpDateFin() {
    return (Integer) storedValueForKey("ggrpDateFin");
  }

  public void setGgrpDateFin(Integer value) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
    	_ScolGroupeGrp.LOG.debug( "updating ggrpDateFin from " + ggrpDateFin() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpDateFin");
  }

  public Integer ggrpIntCapacite() {
    return (Integer) storedValueForKey("ggrpIntCapacite");
  }

  public void setGgrpIntCapacite(Integer value) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
    	_ScolGroupeGrp.LOG.debug( "updating ggrpIntCapacite from " + ggrpIntCapacite() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpIntCapacite");
  }

  public Integer ggrpKey() {
    return (Integer) storedValueForKey("ggrpKey");
  }

  public void setGgrpKey(Integer value) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
    	_ScolGroupeGrp.LOG.debug( "updating ggrpKey from " + ggrpKey() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpKey");
  }

  public String ggrpLibelle() {
    return (String) storedValueForKey("ggrpLibelle");
  }

  public void setGgrpLibelle(String value) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
    	_ScolGroupeGrp.LOG.debug( "updating ggrpLibelle from " + ggrpLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpLibelle");
  }

  public Integer ggrpMaxCapacite() {
    return (Integer) storedValueForKey("ggrpMaxCapacite");
  }

  public void setGgrpMaxCapacite(Integer value) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
    	_ScolGroupeGrp.LOG.debug( "updating ggrpMaxCapacite from " + ggrpMaxCapacite() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpMaxCapacite");
  }

  public String ggrpMaxTemoin() {
    return (String) storedValueForKey("ggrpMaxTemoin");
  }

  public void setGgrpMaxTemoin(String value) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
    	_ScolGroupeGrp.LOG.debug( "updating ggrpMaxTemoin from " + ggrpMaxTemoin() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpMaxTemoin");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusFils() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion>)storedValueForKey("inclusFils");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusFils(EOQualifier qualifier) {
    return inclusFils(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusFils(EOQualifier qualifier, boolean fetch) {
    return inclusFils(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusFils(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion.GROUPE_PERE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion.fetchScolGroupeInclusions(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = inclusFils();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToInclusFilsRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion object) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
      _ScolGroupeGrp.LOG.debug("adding " + object + " to inclusFils relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "inclusFils");
  }

  public void removeFromInclusFilsRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion object) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
      _ScolGroupeGrp.LOG.debug("removing " + object + " from inclusFils relationship");
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
    return inclusPere(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusPere(EOQualifier qualifier, boolean fetch) {
    return inclusPere(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> inclusPere(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion.GROUPE_FILS_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion.fetchScolGroupeInclusions(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = inclusPere();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToInclusPereRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion object) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
      _ScolGroupeGrp.LOG.debug("adding " + object + " to inclusPere relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "inclusPere");
  }

  public void removeFromInclusPereRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeInclusion object) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
      _ScolGroupeGrp.LOG.debug("removing " + object + " from inclusPere relationship");
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

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> scolGroupeObjet() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet>)storedValueForKey("scolGroupeObjet");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> scolGroupeObjet(EOQualifier qualifier) {
    return scolGroupeObjet(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> scolGroupeObjet(EOQualifier qualifier, boolean fetch) {
    return scolGroupeObjet(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> scolGroupeObjet(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ScolGroupeObjet.SCOL_GROUPE_GRP_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
      results = scolGroupeObjet();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolGroupeObjet>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToScolGroupeObjetRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeObjet object) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
      _ScolGroupeGrp.LOG.debug("adding " + object + " to scolGroupeObjet relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "scolGroupeObjet");
  }

  public void removeFromScolGroupeObjetRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeObjet object) {
    if (_ScolGroupeGrp.LOG.isDebugEnabled()) {
      _ScolGroupeGrp.LOG.debug("removing " + object + " from scolGroupeObjet relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "scolGroupeObjet");
  }

  public org.cocktail.superplaner.serveur.metier.ScolGroupeObjet createScolGroupeObjetRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ScolGroupeObjet");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "scolGroupeObjet");
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeObjet) eo;
  }

  public void deleteScolGroupeObjetRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeObjet object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "scolGroupeObjet");
    editingContext().deleteObject(object);
  }

  public void deleteAllScolGroupeObjetRelationships() {
    Enumeration objects = scolGroupeObjet().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteScolGroupeObjetRelationship((org.cocktail.superplaner.serveur.metier.ScolGroupeObjet)objects.nextElement());
    }
  }


  public static ScolGroupeGrp createScolGroupeGrp(EOEditingContext editingContext, String ggrpCode
, Integer ggrpDateDebut
, Integer ggrpKey
, String ggrpLibelle
, String ggrpMaxTemoin
) {
    ScolGroupeGrp eo = (ScolGroupeGrp) EOUtilities.createAndInsertInstance(editingContext, _ScolGroupeGrp.ENTITY_NAME);    
		eo.setGgrpCode(ggrpCode);
		eo.setGgrpDateDebut(ggrpDateDebut);
		eo.setGgrpKey(ggrpKey);
		eo.setGgrpLibelle(ggrpLibelle);
		eo.setGgrpMaxTemoin(ggrpMaxTemoin);
    return eo;
  }

  public static NSArray<ScolGroupeGrp> fetchAllScolGroupeGrps(EOEditingContext editingContext) {
    return _ScolGroupeGrp.fetchAllScolGroupeGrps(editingContext, null);
  }

  public static NSArray<ScolGroupeGrp> fetchAllScolGroupeGrps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolGroupeGrp.fetchScolGroupeGrps(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolGroupeGrp> fetchScolGroupeGrps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolGroupeGrp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolGroupeGrp> eoObjects = (NSArray<ScolGroupeGrp>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolGroupeGrp fetchScolGroupeGrp(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolGroupeGrp.fetchScolGroupeGrp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolGroupeGrp fetchScolGroupeGrp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolGroupeGrp> eoObjects = _ScolGroupeGrp.fetchScolGroupeGrps(editingContext, qualifier, null);
    ScolGroupeGrp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolGroupeGrp)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ScolGroupeGrp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolGroupeGrp fetchRequiredScolGroupeGrp(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolGroupeGrp.fetchRequiredScolGroupeGrp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolGroupeGrp fetchRequiredScolGroupeGrp(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolGroupeGrp eoObject = _ScolGroupeGrp.fetchScolGroupeGrp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ScolGroupeGrp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolGroupeGrp localInstanceIn(EOEditingContext editingContext, ScolGroupeGrp eo) {
    ScolGroupeGrp localInstance = (eo == null) ? null : (ScolGroupeGrp)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
