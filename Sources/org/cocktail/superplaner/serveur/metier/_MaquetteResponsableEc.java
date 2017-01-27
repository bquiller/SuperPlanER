// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to MaquetteResponsableEc.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _MaquetteResponsableEc extends  EOGenericRecord {
	public static final String ENTITY_NAME = "MaquetteResponsableEc";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String MBEC_TYPE_KEY = "mbecType";
	public static final String PERS_ID_KEY = "persId";

	// Relationships
	public static final String MAQUETTE_EC_KEY = "maquetteEc";

  private static Logger LOG = Logger.getLogger(_MaquetteResponsableEc.class);

  public MaquetteResponsableEc localInstanceIn(EOEditingContext editingContext) {
    MaquetteResponsableEc localInstance = (MaquetteResponsableEc)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_MaquetteResponsableEc.LOG.isDebugEnabled()) {
    	_MaquetteResponsableEc.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public String mbecType() {
    return (String) storedValueForKey("mbecType");
  }

  public void setMbecType(String value) {
    if (_MaquetteResponsableEc.LOG.isDebugEnabled()) {
    	_MaquetteResponsableEc.LOG.debug( "updating mbecType from " + mbecType() + " to " + value);
    }
    takeStoredValueForKey(value, "mbecType");
  }

  public Integer persId() {
    return (Integer) storedValueForKey("persId");
  }

  public void setPersId(Integer value) {
    if (_MaquetteResponsableEc.LOG.isDebugEnabled()) {
    	_MaquetteResponsableEc.LOG.debug( "updating persId from " + persId() + " to " + value);
    }
    takeStoredValueForKey(value, "persId");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteEc maquetteEc() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteEc)storedValueForKey("maquetteEc");
  }

  public void setMaquetteEcRelationship(org.cocktail.superplaner.serveur.metier.MaquetteEc value) {
    if (_MaquetteResponsableEc.LOG.isDebugEnabled()) {
      _MaquetteResponsableEc.LOG.debug("updating maquetteEc from " + maquetteEc() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteEc oldValue = maquetteEc();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteEc");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteEc");
    }
  }
  

  public static MaquetteResponsableEc createMaquetteResponsableEc(EOEditingContext editingContext, Integer fannKey
, String mbecType
) {
    MaquetteResponsableEc eo = (MaquetteResponsableEc) EOUtilities.createAndInsertInstance(editingContext, _MaquetteResponsableEc.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setMbecType(mbecType);
    return eo;
  }

  public static NSArray<MaquetteResponsableEc> fetchAllMaquetteResponsableEcs(EOEditingContext editingContext) {
    return _MaquetteResponsableEc.fetchAllMaquetteResponsableEcs(editingContext, null);
  }

  public static NSArray<MaquetteResponsableEc> fetchAllMaquetteResponsableEcs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _MaquetteResponsableEc.fetchMaquetteResponsableEcs(editingContext, null, sortOrderings);
  }

  public static NSArray<MaquetteResponsableEc> fetchMaquetteResponsableEcs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_MaquetteResponsableEc.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<MaquetteResponsableEc> eoObjects = (NSArray<MaquetteResponsableEc>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static MaquetteResponsableEc fetchMaquetteResponsableEc(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteResponsableEc.fetchMaquetteResponsableEc(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteResponsableEc fetchMaquetteResponsableEc(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<MaquetteResponsableEc> eoObjects = _MaquetteResponsableEc.fetchMaquetteResponsableEcs(editingContext, qualifier, null);
    MaquetteResponsableEc eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (MaquetteResponsableEc)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one MaquetteResponsableEc that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteResponsableEc fetchRequiredMaquetteResponsableEc(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteResponsableEc.fetchRequiredMaquetteResponsableEc(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteResponsableEc fetchRequiredMaquetteResponsableEc(EOEditingContext editingContext, EOQualifier qualifier) {
    MaquetteResponsableEc eoObject = _MaquetteResponsableEc.fetchMaquetteResponsableEc(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no MaquetteResponsableEc that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteResponsableEc localInstanceIn(EOEditingContext editingContext, MaquetteResponsableEc eo) {
    MaquetteResponsableEc localInstance = (eo == null) ? null : (MaquetteResponsableEc)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
