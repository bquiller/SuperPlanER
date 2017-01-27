// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to FournisUlr.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _FournisUlr extends  EOGenericRecord {
	public static final String ENTITY_NAME = "FournisUlr";

	// Attributes
	public static final String PERS_ID_KEY = "persId";

	// Relationships

  private static Logger LOG = Logger.getLogger(_FournisUlr.class);

  public FournisUlr localInstanceIn(EOEditingContext editingContext) {
    FournisUlr localInstance = (FournisUlr)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer persId() {
    return (Integer) storedValueForKey("persId");
  }

  public void setPersId(Integer value) {
    if (_FournisUlr.LOG.isDebugEnabled()) {
    	_FournisUlr.LOG.debug( "updating persId from " + persId() + " to " + value);
    }
    takeStoredValueForKey(value, "persId");
  }


  public static FournisUlr createFournisUlr(EOEditingContext editingContext, Integer persId
) {
    FournisUlr eo = (FournisUlr) EOUtilities.createAndInsertInstance(editingContext, _FournisUlr.ENTITY_NAME);    
		eo.setPersId(persId);
    return eo;
  }

  public static NSArray<FournisUlr> fetchAllFournisUlrs(EOEditingContext editingContext) {
    return _FournisUlr.fetchAllFournisUlrs(editingContext, null);
  }

  public static NSArray<FournisUlr> fetchAllFournisUlrs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _FournisUlr.fetchFournisUlrs(editingContext, null, sortOrderings);
  }

  public static NSArray<FournisUlr> fetchFournisUlrs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_FournisUlr.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<FournisUlr> eoObjects = (NSArray<FournisUlr>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static FournisUlr fetchFournisUlr(EOEditingContext editingContext, String keyName, Object value) {
    return _FournisUlr.fetchFournisUlr(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static FournisUlr fetchFournisUlr(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<FournisUlr> eoObjects = _FournisUlr.fetchFournisUlrs(editingContext, qualifier, null);
    FournisUlr eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (FournisUlr)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one FournisUlr that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static FournisUlr fetchRequiredFournisUlr(EOEditingContext editingContext, String keyName, Object value) {
    return _FournisUlr.fetchRequiredFournisUlr(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static FournisUlr fetchRequiredFournisUlr(EOEditingContext editingContext, EOQualifier qualifier) {
    FournisUlr eoObject = _FournisUlr.fetchFournisUlr(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no FournisUlr that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static FournisUlr localInstanceIn(EOEditingContext editingContext, FournisUlr eo) {
    FournisUlr localInstance = (eo == null) ? null : (FournisUlr)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
