// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to TypeSalle.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _TypeSalle extends  EOGenericRecord {
	public static final String ENTITY_NAME = "TypeSalle";

	// Attributes
	public static final String TSAL_LIBELLE_KEY = "tsalLibelle";

	// Relationships

  private static Logger LOG = Logger.getLogger(_TypeSalle.class);

  public TypeSalle localInstanceIn(EOEditingContext editingContext) {
    TypeSalle localInstance = (TypeSalle)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String tsalLibelle() {
    return (String) storedValueForKey("tsalLibelle");
  }

  public void setTsalLibelle(String value) {
    if (_TypeSalle.LOG.isDebugEnabled()) {
    	_TypeSalle.LOG.debug( "updating tsalLibelle from " + tsalLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "tsalLibelle");
  }


  public static TypeSalle createTypeSalle(EOEditingContext editingContext) {
    TypeSalle eo = (TypeSalle) EOUtilities.createAndInsertInstance(editingContext, _TypeSalle.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<TypeSalle> fetchAllTypeSalles(EOEditingContext editingContext) {
    return _TypeSalle.fetchAllTypeSalles(editingContext, null);
  }

  public static NSArray<TypeSalle> fetchAllTypeSalles(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _TypeSalle.fetchTypeSalles(editingContext, null, sortOrderings);
  }

  public static NSArray<TypeSalle> fetchTypeSalles(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_TypeSalle.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<TypeSalle> eoObjects = (NSArray<TypeSalle>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static TypeSalle fetchTypeSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _TypeSalle.fetchTypeSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TypeSalle fetchTypeSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<TypeSalle> eoObjects = _TypeSalle.fetchTypeSalles(editingContext, qualifier, null);
    TypeSalle eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (TypeSalle)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one TypeSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TypeSalle fetchRequiredTypeSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _TypeSalle.fetchRequiredTypeSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TypeSalle fetchRequiredTypeSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    TypeSalle eoObject = _TypeSalle.fetchTypeSalle(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no TypeSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TypeSalle localInstanceIn(EOEditingContext editingContext, TypeSalle eo) {
    TypeSalle localInstance = (eo == null) ? null : (TypeSalle)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
