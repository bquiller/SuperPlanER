// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to MaquetteRepartitionSem.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _MaquetteRepartitionSem extends  EOGenericRecord {
	public static final String ENTITY_NAME = "MaquetteRepartitionSem";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String MPAR_KEY_KEY = "mparKey";

	// Relationships
	public static final String PARCOURS_KEY = "parcours";
	public static final String SEMESTRE_KEY = "semestre";

  private static Logger LOG = Logger.getLogger(_MaquetteRepartitionSem.class);

  public MaquetteRepartitionSem localInstanceIn(EOEditingContext editingContext) {
    MaquetteRepartitionSem localInstance = (MaquetteRepartitionSem)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_MaquetteRepartitionSem.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionSem.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public Integer mparKey() {
    return (Integer) storedValueForKey("mparKey");
  }

  public void setMparKey(Integer value) {
    if (_MaquetteRepartitionSem.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionSem.LOG.debug( "updating mparKey from " + mparKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mparKey");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteParcours parcours() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteParcours)storedValueForKey("parcours");
  }

  public void setParcoursRelationship(org.cocktail.superplaner.serveur.metier.MaquetteParcours value) {
    if (_MaquetteRepartitionSem.LOG.isDebugEnabled()) {
      _MaquetteRepartitionSem.LOG.debug("updating parcours from " + parcours() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteParcours oldValue = parcours();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "parcours");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "parcours");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteSemestre semestre() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteSemestre)storedValueForKey("semestre");
  }

  public void setSemestreRelationship(org.cocktail.superplaner.serveur.metier.MaquetteSemestre value) {
    if (_MaquetteRepartitionSem.LOG.isDebugEnabled()) {
      _MaquetteRepartitionSem.LOG.debug("updating semestre from " + semestre() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteSemestre oldValue = semestre();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "semestre");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "semestre");
    }
  }
  

  public static MaquetteRepartitionSem createMaquetteRepartitionSem(EOEditingContext editingContext, Integer fannKey
, Integer mparKey
) {
    MaquetteRepartitionSem eo = (MaquetteRepartitionSem) EOUtilities.createAndInsertInstance(editingContext, _MaquetteRepartitionSem.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setMparKey(mparKey);
    return eo;
  }

  public static NSArray<MaquetteRepartitionSem> fetchAllMaquetteRepartitionSems(EOEditingContext editingContext) {
    return _MaquetteRepartitionSem.fetchAllMaquetteRepartitionSems(editingContext, null);
  }

  public static NSArray<MaquetteRepartitionSem> fetchAllMaquetteRepartitionSems(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _MaquetteRepartitionSem.fetchMaquetteRepartitionSems(editingContext, null, sortOrderings);
  }

  public static NSArray<MaquetteRepartitionSem> fetchMaquetteRepartitionSems(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_MaquetteRepartitionSem.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<MaquetteRepartitionSem> eoObjects = (NSArray<MaquetteRepartitionSem>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static MaquetteRepartitionSem fetchMaquetteRepartitionSem(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteRepartitionSem.fetchMaquetteRepartitionSem(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteRepartitionSem fetchMaquetteRepartitionSem(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<MaquetteRepartitionSem> eoObjects = _MaquetteRepartitionSem.fetchMaquetteRepartitionSems(editingContext, qualifier, null);
    MaquetteRepartitionSem eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (MaquetteRepartitionSem)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one MaquetteRepartitionSem that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteRepartitionSem fetchRequiredMaquetteRepartitionSem(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteRepartitionSem.fetchRequiredMaquetteRepartitionSem(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteRepartitionSem fetchRequiredMaquetteRepartitionSem(EOEditingContext editingContext, EOQualifier qualifier) {
    MaquetteRepartitionSem eoObject = _MaquetteRepartitionSem.fetchMaquetteRepartitionSem(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no MaquetteRepartitionSem that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteRepartitionSem localInstanceIn(EOEditingContext editingContext, MaquetteRepartitionSem eo) {
    MaquetteRepartitionSem localInstance = (eo == null) ? null : (MaquetteRepartitionSem)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
