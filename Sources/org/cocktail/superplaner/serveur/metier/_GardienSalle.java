// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to GardienSalle.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _GardienSalle extends  EOGenericRecord {
	public static final String ENTITY_NAME = "GardienSalle";

	// Attributes

	// Relationships
	public static final String REPART_STRUCTURES_KEY = "repartStructures";
	public static final String SALLE_KEY = "salle";

  private static Logger LOG = Logger.getLogger(_GardienSalle.class);

  public GardienSalle localInstanceIn(EOEditingContext editingContext) {
    GardienSalle localInstance = (GardienSalle)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public org.cocktail.superplaner.serveur.metier.Salles salle() {
    return (org.cocktail.superplaner.serveur.metier.Salles)storedValueForKey("salle");
  }

  public void setSalleRelationship(org.cocktail.superplaner.serveur.metier.Salles value) {
    if (_GardienSalle.LOG.isDebugEnabled()) {
      _GardienSalle.LOG.debug("updating salle from " + salle() + " to " + value);
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
  
  public NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> repartStructures() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure>)storedValueForKey("repartStructures");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> repartStructures(EOQualifier qualifier) {
    return repartStructures(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> repartStructures(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> results;
      results = repartStructures();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRepartStructuresRelationship(org.cocktail.superplaner.serveur.metier.RepartStructure object) {
    if (_GardienSalle.LOG.isDebugEnabled()) {
      _GardienSalle.LOG.debug("adding " + object + " to repartStructures relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartStructures");
  }

  public void removeFromRepartStructuresRelationship(org.cocktail.superplaner.serveur.metier.RepartStructure object) {
    if (_GardienSalle.LOG.isDebugEnabled()) {
      _GardienSalle.LOG.debug("removing " + object + " from repartStructures relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartStructures");
  }

  public org.cocktail.superplaner.serveur.metier.RepartStructure createRepartStructuresRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartStructure");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "repartStructures");
    return (org.cocktail.superplaner.serveur.metier.RepartStructure) eo;
  }

  public void deleteRepartStructuresRelationship(org.cocktail.superplaner.serveur.metier.RepartStructure object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartStructures");
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartStructuresRelationships() {
    Enumeration objects = repartStructures().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartStructuresRelationship((org.cocktail.superplaner.serveur.metier.RepartStructure)objects.nextElement());
    }
  }


  public static GardienSalle createGardienSalle(EOEditingContext editingContext) {
    GardienSalle eo = (GardienSalle) EOUtilities.createAndInsertInstance(editingContext, _GardienSalle.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<GardienSalle> fetchAllGardienSalles(EOEditingContext editingContext) {
    return _GardienSalle.fetchAllGardienSalles(editingContext, null);
  }

  public static NSArray<GardienSalle> fetchAllGardienSalles(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _GardienSalle.fetchGardienSalles(editingContext, null, sortOrderings);
  }

  public static NSArray<GardienSalle> fetchGardienSalles(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_GardienSalle.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<GardienSalle> eoObjects = (NSArray<GardienSalle>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static GardienSalle fetchGardienSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _GardienSalle.fetchGardienSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static GardienSalle fetchGardienSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<GardienSalle> eoObjects = _GardienSalle.fetchGardienSalles(editingContext, qualifier, null);
    GardienSalle eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (GardienSalle)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one GardienSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static GardienSalle fetchRequiredGardienSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _GardienSalle.fetchRequiredGardienSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static GardienSalle fetchRequiredGardienSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    GardienSalle eoObject = _GardienSalle.fetchGardienSalle(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no GardienSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static GardienSalle localInstanceIn(EOEditingContext editingContext, GardienSalle eo) {
    GardienSalle localInstance = (eo == null) ? null : (GardienSalle)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
