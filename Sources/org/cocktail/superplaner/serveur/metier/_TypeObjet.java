// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to TypeObjet.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _TypeObjet extends  EOGenericRecord {
	public static final String ENTITY_NAME = "TypeObjet";

	// Attributes
	public static final String TYPE_CODE_KEY = "typeCode";

	// Relationships
	public static final String CATEG_OBJET_KEY = "categObjet";

  private static Logger LOG = Logger.getLogger(_TypeObjet.class);

  public TypeObjet localInstanceIn(EOEditingContext editingContext) {
    TypeObjet localInstance = (TypeObjet)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String typeCode() {
    return (String) storedValueForKey("typeCode");
  }

  public void setTypeCode(String value) {
    if (_TypeObjet.LOG.isDebugEnabled()) {
    	_TypeObjet.LOG.debug( "updating typeCode from " + typeCode() + " to " + value);
    }
    takeStoredValueForKey(value, "typeCode");
  }

  public org.cocktail.superplaner.serveur.metier.CategObjet categObjet() {
    return (org.cocktail.superplaner.serveur.metier.CategObjet)storedValueForKey("categObjet");
  }

  public void setCategObjetRelationship(org.cocktail.superplaner.serveur.metier.CategObjet value) {
    if (_TypeObjet.LOG.isDebugEnabled()) {
      _TypeObjet.LOG.debug("updating categObjet from " + categObjet() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.CategObjet oldValue = categObjet();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "categObjet");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "categObjet");
    }
  }
  

  public static TypeObjet createTypeObjet(EOEditingContext editingContext, String typeCode
) {
    TypeObjet eo = (TypeObjet) EOUtilities.createAndInsertInstance(editingContext, _TypeObjet.ENTITY_NAME);    
		eo.setTypeCode(typeCode);
    return eo;
  }

  public static NSArray<TypeObjet> fetchAllTypeObjets(EOEditingContext editingContext) {
    return _TypeObjet.fetchAllTypeObjets(editingContext, null);
  }

  public static NSArray<TypeObjet> fetchAllTypeObjets(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _TypeObjet.fetchTypeObjets(editingContext, null, sortOrderings);
  }

  public static NSArray<TypeObjet> fetchTypeObjets(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_TypeObjet.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<TypeObjet> eoObjects = (NSArray<TypeObjet>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static TypeObjet fetchTypeObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _TypeObjet.fetchTypeObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TypeObjet fetchTypeObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<TypeObjet> eoObjects = _TypeObjet.fetchTypeObjets(editingContext, qualifier, null);
    TypeObjet eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (TypeObjet)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one TypeObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TypeObjet fetchRequiredTypeObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _TypeObjet.fetchRequiredTypeObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TypeObjet fetchRequiredTypeObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    TypeObjet eoObject = _TypeObjet.fetchTypeObjet(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no TypeObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TypeObjet localInstanceIn(EOEditingContext editingContext, TypeObjet eo) {
    TypeObjet localInstance = (eo == null) ? null : (TypeObjet)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
