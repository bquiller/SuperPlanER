// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to RepartTypeGroupe.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _RepartTypeGroupe extends  EOGenericRecord {
	public static final String ENTITY_NAME = "RepartTypeGroupe";

	// Attributes
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String TGRP_CODE_KEY = "tgrpCode";

	// Relationships

  private static Logger LOG = Logger.getLogger(_RepartTypeGroupe.class);

  public RepartTypeGroupe localInstanceIn(EOEditingContext editingContext) {
    RepartTypeGroupe localInstance = (RepartTypeGroupe)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey("dCreation");
  }

  public void setDCreation(NSTimestamp value) {
    if (_RepartTypeGroupe.LOG.isDebugEnabled()) {
    	_RepartTypeGroupe.LOG.debug( "updating dCreation from " + dCreation() + " to " + value);
    }
    takeStoredValueForKey(value, "dCreation");
  }

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey("dModification");
  }

  public void setDModification(NSTimestamp value) {
    if (_RepartTypeGroupe.LOG.isDebugEnabled()) {
    	_RepartTypeGroupe.LOG.debug( "updating dModification from " + dModification() + " to " + value);
    }
    takeStoredValueForKey(value, "dModification");
  }

  public String tgrpCode() {
    return (String) storedValueForKey("tgrpCode");
  }

  public void setTgrpCode(String value) {
    if (_RepartTypeGroupe.LOG.isDebugEnabled()) {
    	_RepartTypeGroupe.LOG.debug( "updating tgrpCode from " + tgrpCode() + " to " + value);
    }
    takeStoredValueForKey(value, "tgrpCode");
  }


  public static RepartTypeGroupe createRepartTypeGroupe(EOEditingContext editingContext, NSTimestamp dCreation
, NSTimestamp dModification
, String tgrpCode
) {
    RepartTypeGroupe eo = (RepartTypeGroupe) EOUtilities.createAndInsertInstance(editingContext, _RepartTypeGroupe.ENTITY_NAME);    
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
		eo.setTgrpCode(tgrpCode);
    return eo;
  }

  public static NSArray<RepartTypeGroupe> fetchAllRepartTypeGroupes(EOEditingContext editingContext) {
    return _RepartTypeGroupe.fetchAllRepartTypeGroupes(editingContext, null);
  }

  public static NSArray<RepartTypeGroupe> fetchAllRepartTypeGroupes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _RepartTypeGroupe.fetchRepartTypeGroupes(editingContext, null, sortOrderings);
  }

  public static NSArray<RepartTypeGroupe> fetchRepartTypeGroupes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_RepartTypeGroupe.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<RepartTypeGroupe> eoObjects = (NSArray<RepartTypeGroupe>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static RepartTypeGroupe fetchRepartTypeGroupe(EOEditingContext editingContext, String keyName, Object value) {
    return _RepartTypeGroupe.fetchRepartTypeGroupe(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RepartTypeGroupe fetchRepartTypeGroupe(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<RepartTypeGroupe> eoObjects = _RepartTypeGroupe.fetchRepartTypeGroupes(editingContext, qualifier, null);
    RepartTypeGroupe eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (RepartTypeGroupe)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one RepartTypeGroupe that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RepartTypeGroupe fetchRequiredRepartTypeGroupe(EOEditingContext editingContext, String keyName, Object value) {
    return _RepartTypeGroupe.fetchRequiredRepartTypeGroupe(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RepartTypeGroupe fetchRequiredRepartTypeGroupe(EOEditingContext editingContext, EOQualifier qualifier) {
    RepartTypeGroupe eoObject = _RepartTypeGroupe.fetchRepartTypeGroupe(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no RepartTypeGroupe that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RepartTypeGroupe localInstanceIn(EOEditingContext editingContext, RepartTypeGroupe eo) {
    RepartTypeGroupe localInstance = (eo == null) ? null : (RepartTypeGroupe)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
