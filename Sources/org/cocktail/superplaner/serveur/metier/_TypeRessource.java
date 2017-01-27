// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to TypeRessource.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _TypeRessource extends  EOGenericRecord {
	public static final String ENTITY_NAME = "TypeRessource";

	// Attributes
	public static final String TYPE_CODE_KEY = "typeCode";
	public static final String TYPE_ORDRE_KEY = "typeOrdre";

	// Relationships

  private static Logger LOG = Logger.getLogger(_TypeRessource.class);

  public TypeRessource localInstanceIn(EOEditingContext editingContext) {
    TypeRessource localInstance = (TypeRessource)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String typeCode() {
    return (String) storedValueForKey("typeCode");
  }

  public void setTypeCode(String value) {
    if (_TypeRessource.LOG.isDebugEnabled()) {
    	_TypeRessource.LOG.debug( "updating typeCode from " + typeCode() + " to " + value);
    }
    takeStoredValueForKey(value, "typeCode");
  }

  public Integer typeOrdre() {
    return (Integer) storedValueForKey("typeOrdre");
  }

  public void setTypeOrdre(Integer value) {
    if (_TypeRessource.LOG.isDebugEnabled()) {
    	_TypeRessource.LOG.debug( "updating typeOrdre from " + typeOrdre() + " to " + value);
    }
    takeStoredValueForKey(value, "typeOrdre");
  }


  public static TypeRessource createTypeRessource(EOEditingContext editingContext, String typeCode
, Integer typeOrdre
) {
    TypeRessource eo = (TypeRessource) EOUtilities.createAndInsertInstance(editingContext, _TypeRessource.ENTITY_NAME);    
		eo.setTypeCode(typeCode);
		eo.setTypeOrdre(typeOrdre);
    return eo;
  }

  public static NSArray<TypeRessource> fetchAllTypeRessources(EOEditingContext editingContext) {
    return _TypeRessource.fetchAllTypeRessources(editingContext, null);
  }

  public static NSArray<TypeRessource> fetchAllTypeRessources(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _TypeRessource.fetchTypeRessources(editingContext, null, sortOrderings);
  }

  public static NSArray<TypeRessource> fetchTypeRessources(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_TypeRessource.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<TypeRessource> eoObjects = (NSArray<TypeRessource>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static TypeRessource fetchTypeRessource(EOEditingContext editingContext, String keyName, Object value) {
    return _TypeRessource.fetchTypeRessource(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TypeRessource fetchTypeRessource(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<TypeRessource> eoObjects = _TypeRessource.fetchTypeRessources(editingContext, qualifier, null);
    TypeRessource eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (TypeRessource)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one TypeRessource that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TypeRessource fetchRequiredTypeRessource(EOEditingContext editingContext, String keyName, Object value) {
    return _TypeRessource.fetchRequiredTypeRessource(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TypeRessource fetchRequiredTypeRessource(EOEditingContext editingContext, EOQualifier qualifier) {
    TypeRessource eoObject = _TypeRessource.fetchTypeRessource(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no TypeRessource that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TypeRessource localInstanceIn(EOEditingContext editingContext, TypeRessource eo) {
    TypeRessource localInstance = (eo == null) ? null : (TypeRessource)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
