// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to RepartLotSalle.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _RepartLotSalle extends  EOGenericRecord {
	public static final String ENTITY_NAME = "RepartLotSalle";

	// Attributes

	// Relationships
	public static final String LOT_SALLE_KEY = "lotSalle";
	public static final String SALLE_KEY = "salle";

  private static Logger LOG = Logger.getLogger(_RepartLotSalle.class);

  public RepartLotSalle localInstanceIn(EOEditingContext editingContext) {
    RepartLotSalle localInstance = (RepartLotSalle)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public org.cocktail.superplaner.serveur.metier.LotSalle lotSalle() {
    return (org.cocktail.superplaner.serveur.metier.LotSalle)storedValueForKey("lotSalle");
  }

  public void setLotSalleRelationship(org.cocktail.superplaner.serveur.metier.LotSalle value) {
    if (_RepartLotSalle.LOG.isDebugEnabled()) {
      _RepartLotSalle.LOG.debug("updating lotSalle from " + lotSalle() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.LotSalle oldValue = lotSalle();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "lotSalle");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "lotSalle");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.Salles salle() {
    return (org.cocktail.superplaner.serveur.metier.Salles)storedValueForKey("salle");
  }

  public void setSalleRelationship(org.cocktail.superplaner.serveur.metier.Salles value) {
    if (_RepartLotSalle.LOG.isDebugEnabled()) {
      _RepartLotSalle.LOG.debug("updating salle from " + salle() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Salles oldValue = salle();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "salle");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "salle");
    }
  }
  

  public static RepartLotSalle createRepartLotSalle(EOEditingContext editingContext) {
    RepartLotSalle eo = (RepartLotSalle) EOUtilities.createAndInsertInstance(editingContext, _RepartLotSalle.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<RepartLotSalle> fetchAllRepartLotSalles(EOEditingContext editingContext) {
    return _RepartLotSalle.fetchAllRepartLotSalles(editingContext, null);
  }

  public static NSArray<RepartLotSalle> fetchAllRepartLotSalles(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _RepartLotSalle.fetchRepartLotSalles(editingContext, null, sortOrderings);
  }

  public static NSArray<RepartLotSalle> fetchRepartLotSalles(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_RepartLotSalle.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<RepartLotSalle> eoObjects = (NSArray<RepartLotSalle>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static RepartLotSalle fetchRepartLotSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _RepartLotSalle.fetchRepartLotSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RepartLotSalle fetchRepartLotSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<RepartLotSalle> eoObjects = _RepartLotSalle.fetchRepartLotSalles(editingContext, qualifier, null);
    RepartLotSalle eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (RepartLotSalle)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one RepartLotSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RepartLotSalle fetchRequiredRepartLotSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _RepartLotSalle.fetchRequiredRepartLotSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RepartLotSalle fetchRequiredRepartLotSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    RepartLotSalle eoObject = _RepartLotSalle.fetchRepartLotSalle(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no RepartLotSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RepartLotSalle localInstanceIn(EOEditingContext editingContext, RepartLotSalle eo) {
    RepartLotSalle localInstance = (eo == null) ? null : (RepartLotSalle)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
