// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ElementTypeEdt.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ElementTypeEdt extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ElementTypeEdt";

	// Attributes
	public static final String ELEM_TYPE_KEY = "elemType";
	public static final String LIBELLE_KEY = "libelle";

	// Relationships

  private static Logger LOG = Logger.getLogger(_ElementTypeEdt.class);

  public ElementTypeEdt localInstanceIn(EOEditingContext editingContext) {
    ElementTypeEdt localInstance = (ElementTypeEdt)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String elemType() {
    return (String) storedValueForKey("elemType");
  }

  public void setElemType(String value) {
    if (_ElementTypeEdt.LOG.isDebugEnabled()) {
    	_ElementTypeEdt.LOG.debug( "updating elemType from " + elemType() + " to " + value);
    }
    takeStoredValueForKey(value, "elemType");
  }

  public String libelle() {
    return (String) storedValueForKey("libelle");
  }

  public void setLibelle(String value) {
    if (_ElementTypeEdt.LOG.isDebugEnabled()) {
    	_ElementTypeEdt.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, "libelle");
  }


  public static ElementTypeEdt createElementTypeEdt(EOEditingContext editingContext, String elemType
, String libelle
) {
    ElementTypeEdt eo = (ElementTypeEdt) EOUtilities.createAndInsertInstance(editingContext, _ElementTypeEdt.ENTITY_NAME);    
		eo.setElemType(elemType);
		eo.setLibelle(libelle);
    return eo;
  }

  public static NSArray<ElementTypeEdt> fetchAllElementTypeEdts(EOEditingContext editingContext) {
    return _ElementTypeEdt.fetchAllElementTypeEdts(editingContext, null);
  }

  public static NSArray<ElementTypeEdt> fetchAllElementTypeEdts(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ElementTypeEdt.fetchElementTypeEdts(editingContext, null, sortOrderings);
  }

  public static NSArray<ElementTypeEdt> fetchElementTypeEdts(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ElementTypeEdt.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ElementTypeEdt> eoObjects = (NSArray<ElementTypeEdt>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ElementTypeEdt fetchElementTypeEdt(EOEditingContext editingContext, String keyName, Object value) {
    return _ElementTypeEdt.fetchElementTypeEdt(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ElementTypeEdt fetchElementTypeEdt(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ElementTypeEdt> eoObjects = _ElementTypeEdt.fetchElementTypeEdts(editingContext, qualifier, null);
    ElementTypeEdt eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ElementTypeEdt)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ElementTypeEdt that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ElementTypeEdt fetchRequiredElementTypeEdt(EOEditingContext editingContext, String keyName, Object value) {
    return _ElementTypeEdt.fetchRequiredElementTypeEdt(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ElementTypeEdt fetchRequiredElementTypeEdt(EOEditingContext editingContext, EOQualifier qualifier) {
    ElementTypeEdt eoObject = _ElementTypeEdt.fetchElementTypeEdt(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ElementTypeEdt that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ElementTypeEdt localInstanceIn(EOEditingContext editingContext, ElementTypeEdt eo) {
    ElementTypeEdt localInstance = (eo == null) ? null : (ElementTypeEdt)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
