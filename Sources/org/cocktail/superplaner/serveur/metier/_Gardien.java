// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Gardien.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Gardien extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Gardien";

	// Attributes
	public static final String C_LOCAL_KEY = "cLocal";

	// Relationships
	public static final String LOCAL_KEY = "local";
	public static final String REPART_STRUCTURES_KEY = "repartStructures";

  private static Logger LOG = Logger.getLogger(_Gardien.class);

  public Gardien localInstanceIn(EOEditingContext editingContext) {
    Gardien localInstance = (Gardien)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cLocal() {
    return (String) storedValueForKey("cLocal");
  }

  public void setCLocal(String value) {
    if (_Gardien.LOG.isDebugEnabled()) {
    	_Gardien.LOG.debug( "updating cLocal from " + cLocal() + " to " + value);
    }
    takeStoredValueForKey(value, "cLocal");
  }

  public org.cocktail.superplaner.serveur.metier.Local local() {
    return (org.cocktail.superplaner.serveur.metier.Local)storedValueForKey("local");
  }

  public void setLocalRelationship(org.cocktail.superplaner.serveur.metier.Local value) {
    if (_Gardien.LOG.isDebugEnabled()) {
      _Gardien.LOG.debug("updating local from " + local() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Local oldValue = local();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "local");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "local");
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
    if (_Gardien.LOG.isDebugEnabled()) {
      _Gardien.LOG.debug("adding " + object + " to repartStructures relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartStructures");
  }

  public void removeFromRepartStructuresRelationship(org.cocktail.superplaner.serveur.metier.RepartStructure object) {
    if (_Gardien.LOG.isDebugEnabled()) {
      _Gardien.LOG.debug("removing " + object + " from repartStructures relationship");
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


  public static Gardien createGardien(EOEditingContext editingContext, String cLocal
) {
    Gardien eo = (Gardien) EOUtilities.createAndInsertInstance(editingContext, _Gardien.ENTITY_NAME);    
		eo.setCLocal(cLocal);
    return eo;
  }

  public static NSArray<Gardien> fetchAllGardiens(EOEditingContext editingContext) {
    return _Gardien.fetchAllGardiens(editingContext, null);
  }

  public static NSArray<Gardien> fetchAllGardiens(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Gardien.fetchGardiens(editingContext, null, sortOrderings);
  }

  public static NSArray<Gardien> fetchGardiens(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Gardien.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Gardien> eoObjects = (NSArray<Gardien>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Gardien fetchGardien(EOEditingContext editingContext, String keyName, Object value) {
    return _Gardien.fetchGardien(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Gardien fetchGardien(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Gardien> eoObjects = _Gardien.fetchGardiens(editingContext, qualifier, null);
    Gardien eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Gardien)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Gardien that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Gardien fetchRequiredGardien(EOEditingContext editingContext, String keyName, Object value) {
    return _Gardien.fetchRequiredGardien(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Gardien fetchRequiredGardien(EOEditingContext editingContext, EOQualifier qualifier) {
    Gardien eoObject = _Gardien.fetchGardien(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Gardien that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Gardien localInstanceIn(EOEditingContext editingContext, Gardien eo) {
    Gardien localInstance = (eo == null) ? null : (Gardien)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
