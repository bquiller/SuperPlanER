// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to GrhumParametres.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _GrhumParametres extends  EOGenericRecord {
	public static final String ENTITY_NAME = "GrhumParametres";

	// Attributes
	public static final String PARAM_COMMENTAIRES_KEY = "paramCommentaires";
	public static final String PARAM_KEY_KEY = "paramKey";
	public static final String PARAM_VALUE_KEY = "paramValue";

	// Relationships

  private static Logger LOG = Logger.getLogger(_GrhumParametres.class);

  public GrhumParametres localInstanceIn(EOEditingContext editingContext) {
    GrhumParametres localInstance = (GrhumParametres)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String paramCommentaires() {
    return (String) storedValueForKey("paramCommentaires");
  }

  public void setParamCommentaires(String value) {
    if (_GrhumParametres.LOG.isDebugEnabled()) {
    	_GrhumParametres.LOG.debug( "updating paramCommentaires from " + paramCommentaires() + " to " + value);
    }
    takeStoredValueForKey(value, "paramCommentaires");
  }

  public String paramKey() {
    return (String) storedValueForKey("paramKey");
  }

  public void setParamKey(String value) {
    if (_GrhumParametres.LOG.isDebugEnabled()) {
    	_GrhumParametres.LOG.debug( "updating paramKey from " + paramKey() + " to " + value);
    }
    takeStoredValueForKey(value, "paramKey");
  }

  public String paramValue() {
    return (String) storedValueForKey("paramValue");
  }

  public void setParamValue(String value) {
    if (_GrhumParametres.LOG.isDebugEnabled()) {
    	_GrhumParametres.LOG.debug( "updating paramValue from " + paramValue() + " to " + value);
    }
    takeStoredValueForKey(value, "paramValue");
  }


  public static GrhumParametres createGrhumParametres(EOEditingContext editingContext) {
    GrhumParametres eo = (GrhumParametres) EOUtilities.createAndInsertInstance(editingContext, _GrhumParametres.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<GrhumParametres> fetchAllGrhumParametreses(EOEditingContext editingContext) {
    return _GrhumParametres.fetchAllGrhumParametreses(editingContext, null);
  }

  public static NSArray<GrhumParametres> fetchAllGrhumParametreses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _GrhumParametres.fetchGrhumParametreses(editingContext, null, sortOrderings);
  }

  public static NSArray<GrhumParametres> fetchGrhumParametreses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_GrhumParametres.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<GrhumParametres> eoObjects = (NSArray<GrhumParametres>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static GrhumParametres fetchGrhumParametres(EOEditingContext editingContext, String keyName, Object value) {
    return _GrhumParametres.fetchGrhumParametres(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static GrhumParametres fetchGrhumParametres(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<GrhumParametres> eoObjects = _GrhumParametres.fetchGrhumParametreses(editingContext, qualifier, null);
    GrhumParametres eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (GrhumParametres)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one GrhumParametres that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static GrhumParametres fetchRequiredGrhumParametres(EOEditingContext editingContext, String keyName, Object value) {
    return _GrhumParametres.fetchRequiredGrhumParametres(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static GrhumParametres fetchRequiredGrhumParametres(EOEditingContext editingContext, EOQualifier qualifier) {
    GrhumParametres eoObject = _GrhumParametres.fetchGrhumParametres(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no GrhumParametres that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static GrhumParametres localInstanceIn(EOEditingContext editingContext, GrhumParametres eo) {
    GrhumParametres localInstance = (eo == null) ? null : (GrhumParametres)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
