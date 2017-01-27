// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to TypeLocation.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _TypeLocation extends  EOGenericRecord {
	public static final String ENTITY_NAME = "TypeLocation";

	// Attributes
	public static final String TLOC_APPLI_KEY = "tlocAppli";
	public static final String TLOC_ECRASABLE_KEY = "tlocEcrasable";
	public static final String TLOC_LIBELLE_KEY = "tlocLibelle";

	// Relationships

  private static Logger LOG = Logger.getLogger(_TypeLocation.class);

  public TypeLocation localInstanceIn(EOEditingContext editingContext) {
    TypeLocation localInstance = (TypeLocation)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String tlocAppli() {
    return (String) storedValueForKey("tlocAppli");
  }

  public void setTlocAppli(String value) {
    if (_TypeLocation.LOG.isDebugEnabled()) {
    	_TypeLocation.LOG.debug( "updating tlocAppli from " + tlocAppli() + " to " + value);
    }
    takeStoredValueForKey(value, "tlocAppli");
  }

  public String tlocEcrasable() {
    return (String) storedValueForKey("tlocEcrasable");
  }

  public void setTlocEcrasable(String value) {
    if (_TypeLocation.LOG.isDebugEnabled()) {
    	_TypeLocation.LOG.debug( "updating tlocEcrasable from " + tlocEcrasable() + " to " + value);
    }
    takeStoredValueForKey(value, "tlocEcrasable");
  }

  public String tlocLibelle() {
    return (String) storedValueForKey("tlocLibelle");
  }

  public void setTlocLibelle(String value) {
    if (_TypeLocation.LOG.isDebugEnabled()) {
    	_TypeLocation.LOG.debug( "updating tlocLibelle from " + tlocLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "tlocLibelle");
  }


  public static TypeLocation createTypeLocation(EOEditingContext editingContext, String tlocAppli
, String tlocEcrasable
, String tlocLibelle
) {
    TypeLocation eo = (TypeLocation) EOUtilities.createAndInsertInstance(editingContext, _TypeLocation.ENTITY_NAME);    
		eo.setTlocAppli(tlocAppli);
		eo.setTlocEcrasable(tlocEcrasable);
		eo.setTlocLibelle(tlocLibelle);
    return eo;
  }

  public static NSArray<TypeLocation> fetchAllTypeLocations(EOEditingContext editingContext) {
    return _TypeLocation.fetchAllTypeLocations(editingContext, null);
  }

  public static NSArray<TypeLocation> fetchAllTypeLocations(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _TypeLocation.fetchTypeLocations(editingContext, null, sortOrderings);
  }

  public static NSArray<TypeLocation> fetchTypeLocations(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_TypeLocation.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<TypeLocation> eoObjects = (NSArray<TypeLocation>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static TypeLocation fetchTypeLocation(EOEditingContext editingContext, String keyName, Object value) {
    return _TypeLocation.fetchTypeLocation(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TypeLocation fetchTypeLocation(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<TypeLocation> eoObjects = _TypeLocation.fetchTypeLocations(editingContext, qualifier, null);
    TypeLocation eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (TypeLocation)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one TypeLocation that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TypeLocation fetchRequiredTypeLocation(EOEditingContext editingContext, String keyName, Object value) {
    return _TypeLocation.fetchRequiredTypeLocation(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TypeLocation fetchRequiredTypeLocation(EOEditingContext editingContext, EOQualifier qualifier) {
    TypeLocation eoObject = _TypeLocation.fetchTypeLocation(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no TypeLocation that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TypeLocation localInstanceIn(EOEditingContext editingContext, TypeLocation eo) {
    TypeLocation localInstance = (eo == null) ? null : (TypeLocation)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
