// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolTransfertMap.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolTransfertMap extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ScolTransfertMap";

	// Attributes

	// Relationships
	public static final String NEW_AP_KEY = "newAp";
	public static final String OLD_AP_KEY = "oldAp";

  private static Logger LOG = Logger.getLogger(_ScolTransfertMap.class);

  public ScolTransfertMap localInstanceIn(EOEditingContext editingContext) {
    ScolTransfertMap localInstance = (ScolTransfertMap)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteAp newAp() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("newAp");
  }

  public void setNewApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_ScolTransfertMap.LOG.isDebugEnabled()) {
      _ScolTransfertMap.LOG.debug("updating newAp from " + newAp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteAp oldValue = newAp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "newAp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "newAp");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteAp oldAp() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("oldAp");
  }

  public void setOldApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_ScolTransfertMap.LOG.isDebugEnabled()) {
      _ScolTransfertMap.LOG.debug("updating oldAp from " + oldAp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteAp oldValue = oldAp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "oldAp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "oldAp");
    }
  }
  

  public static ScolTransfertMap createScolTransfertMap(EOEditingContext editingContext, org.cocktail.superplaner.serveur.metier.MaquetteAp newAp, org.cocktail.superplaner.serveur.metier.MaquetteAp oldAp) {
    ScolTransfertMap eo = (ScolTransfertMap) EOUtilities.createAndInsertInstance(editingContext, _ScolTransfertMap.ENTITY_NAME);    
    eo.setNewApRelationship(newAp);
    eo.setOldApRelationship(oldAp);
    return eo;
  }

  public static NSArray<ScolTransfertMap> fetchAllScolTransfertMaps(EOEditingContext editingContext) {
    return _ScolTransfertMap.fetchAllScolTransfertMaps(editingContext, null);
  }

  public static NSArray<ScolTransfertMap> fetchAllScolTransfertMaps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolTransfertMap.fetchScolTransfertMaps(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolTransfertMap> fetchScolTransfertMaps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolTransfertMap.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolTransfertMap> eoObjects = (NSArray<ScolTransfertMap>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolTransfertMap fetchScolTransfertMap(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolTransfertMap.fetchScolTransfertMap(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolTransfertMap fetchScolTransfertMap(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolTransfertMap> eoObjects = _ScolTransfertMap.fetchScolTransfertMaps(editingContext, qualifier, null);
    ScolTransfertMap eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolTransfertMap)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ScolTransfertMap that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolTransfertMap fetchRequiredScolTransfertMap(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolTransfertMap.fetchRequiredScolTransfertMap(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolTransfertMap fetchRequiredScolTransfertMap(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolTransfertMap eoObject = _ScolTransfertMap.fetchScolTransfertMap(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ScolTransfertMap that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolTransfertMap localInstanceIn(EOEditingContext editingContext, ScolTransfertMap eo) {
    ScolTransfertMap localInstance = (eo == null) ? null : (ScolTransfertMap)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
