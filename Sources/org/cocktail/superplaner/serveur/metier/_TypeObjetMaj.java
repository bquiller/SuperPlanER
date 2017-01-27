// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to TypeObjetMaj.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _TypeObjetMaj extends  EOGenericRecord {
	public static final String ENTITY_NAME = "TypeObjetMaj";

	// Attributes
	public static final String TYPE_CODE_KEY = "typeCode";

	// Relationships
	public static final String CATEG_OBJET_KEY = "categObjet";

  private static Logger LOG = Logger.getLogger(_TypeObjetMaj.class);

  public TypeObjetMaj localInstanceIn(EOEditingContext editingContext) {
    TypeObjetMaj localInstance = (TypeObjetMaj)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String typeCode() {
    return (String) storedValueForKey("typeCode");
  }

  public void setTypeCode(String value) {
    if (_TypeObjetMaj.LOG.isDebugEnabled()) {
    	_TypeObjetMaj.LOG.debug( "updating typeCode from " + typeCode() + " to " + value);
    }
    takeStoredValueForKey(value, "typeCode");
  }

  public org.cocktail.superplaner.serveur.metier.CategObjet categObjet() {
    return (org.cocktail.superplaner.serveur.metier.CategObjet)storedValueForKey("categObjet");
  }

  public void setCategObjetRelationship(org.cocktail.superplaner.serveur.metier.CategObjet value) {
    if (_TypeObjetMaj.LOG.isDebugEnabled()) {
      _TypeObjetMaj.LOG.debug("updating categObjet from " + categObjet() + " to " + value);
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
  

  public static TypeObjetMaj createTypeObjetMaj(EOEditingContext editingContext, String typeCode
) {
    TypeObjetMaj eo = (TypeObjetMaj) EOUtilities.createAndInsertInstance(editingContext, _TypeObjetMaj.ENTITY_NAME);    
		eo.setTypeCode(typeCode);
    return eo;
  }

  public static NSArray<TypeObjetMaj> fetchAllTypeObjetMajs(EOEditingContext editingContext) {
    return _TypeObjetMaj.fetchAllTypeObjetMajs(editingContext, null);
  }

  public static NSArray<TypeObjetMaj> fetchAllTypeObjetMajs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _TypeObjetMaj.fetchTypeObjetMajs(editingContext, null, sortOrderings);
  }

  public static NSArray<TypeObjetMaj> fetchTypeObjetMajs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_TypeObjetMaj.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<TypeObjetMaj> eoObjects = (NSArray<TypeObjetMaj>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static TypeObjetMaj fetchTypeObjetMaj(EOEditingContext editingContext, String keyName, Object value) {
    return _TypeObjetMaj.fetchTypeObjetMaj(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TypeObjetMaj fetchTypeObjetMaj(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<TypeObjetMaj> eoObjects = _TypeObjetMaj.fetchTypeObjetMajs(editingContext, qualifier, null);
    TypeObjetMaj eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (TypeObjetMaj)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one TypeObjetMaj that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TypeObjetMaj fetchRequiredTypeObjetMaj(EOEditingContext editingContext, String keyName, Object value) {
    return _TypeObjetMaj.fetchRequiredTypeObjetMaj(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TypeObjetMaj fetchRequiredTypeObjetMaj(EOEditingContext editingContext, EOQualifier qualifier) {
    TypeObjetMaj eoObject = _TypeObjetMaj.fetchTypeObjetMaj(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no TypeObjetMaj that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TypeObjetMaj localInstanceIn(EOEditingContext editingContext, TypeObjetMaj eo) {
    TypeObjetMaj localInstance = (eo == null) ? null : (TypeObjetMaj)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
