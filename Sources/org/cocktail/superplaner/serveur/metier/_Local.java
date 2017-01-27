// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Local.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Local extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Local";

	// Attributes
	public static final String APPELLATION_KEY = "appellation";
	public static final String C_LOCAL_KEY = "cLocal";

	// Relationships
	public static final String REPART_BAT_IMP_GEOS_KEY = "repartBatImpGeos";
	public static final String SALLESS_KEY = "salless";

  private static Logger LOG = Logger.getLogger(_Local.class);

  public Local localInstanceIn(EOEditingContext editingContext) {
    Local localInstance = (Local)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String appellation() {
    return (String) storedValueForKey("appellation");
  }

  public void setAppellation(String value) {
    if (_Local.LOG.isDebugEnabled()) {
    	_Local.LOG.debug( "updating appellation from " + appellation() + " to " + value);
    }
    takeStoredValueForKey(value, "appellation");
  }

  public String cLocal() {
    return (String) storedValueForKey("cLocal");
  }

  public void setCLocal(String value) {
    if (_Local.LOG.isDebugEnabled()) {
    	_Local.LOG.debug( "updating cLocal from " + cLocal() + " to " + value);
    }
    takeStoredValueForKey(value, "cLocal");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo> repartBatImpGeos() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo>)storedValueForKey("repartBatImpGeos");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo> repartBatImpGeos(EOQualifier qualifier) {
    return repartBatImpGeos(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo> repartBatImpGeos(EOQualifier qualifier, boolean fetch) {
    return repartBatImpGeos(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo> repartBatImpGeos(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.RepartBatImpGeo.LOCAL_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.RepartBatImpGeo.fetchRepartBatImpGeos(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartBatImpGeos();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartBatImpGeosRelationship(org.cocktail.superplaner.serveur.metier.RepartBatImpGeo object) {
    if (_Local.LOG.isDebugEnabled()) {
      _Local.LOG.debug("adding " + object + " to repartBatImpGeos relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartBatImpGeos");
  }

  public void removeFromRepartBatImpGeosRelationship(org.cocktail.superplaner.serveur.metier.RepartBatImpGeo object) {
    if (_Local.LOG.isDebugEnabled()) {
      _Local.LOG.debug("removing " + object + " from repartBatImpGeos relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartBatImpGeos");
  }

  public org.cocktail.superplaner.serveur.metier.RepartBatImpGeo createRepartBatImpGeosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartBatImpGeo");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "repartBatImpGeos");
    return (org.cocktail.superplaner.serveur.metier.RepartBatImpGeo) eo;
  }

  public void deleteRepartBatImpGeosRelationship(org.cocktail.superplaner.serveur.metier.RepartBatImpGeo object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartBatImpGeos");
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartBatImpGeosRelationships() {
    Enumeration objects = repartBatImpGeos().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartBatImpGeosRelationship((org.cocktail.superplaner.serveur.metier.RepartBatImpGeo)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Salles> salless() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.Salles>)storedValueForKey("salless");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Salles> salless(EOQualifier qualifier) {
    return salless(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Salles> salless(EOQualifier qualifier, boolean fetch) {
    return salless(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Salles> salless(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.Salles> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.Salles.LOCAL_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.Salles.fetchSalleses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = salless();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Salles>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Salles>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToSallessRelationship(org.cocktail.superplaner.serveur.metier.Salles object) {
    if (_Local.LOG.isDebugEnabled()) {
      _Local.LOG.debug("adding " + object + " to salless relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "salless");
  }

  public void removeFromSallessRelationship(org.cocktail.superplaner.serveur.metier.Salles object) {
    if (_Local.LOG.isDebugEnabled()) {
      _Local.LOG.debug("removing " + object + " from salless relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "salless");
  }

  public org.cocktail.superplaner.serveur.metier.Salles createSallessRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Salles");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "salless");
    return (org.cocktail.superplaner.serveur.metier.Salles) eo;
  }

  public void deleteSallessRelationship(org.cocktail.superplaner.serveur.metier.Salles object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "salless");
    editingContext().deleteObject(object);
  }

  public void deleteAllSallessRelationships() {
    Enumeration objects = salless().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteSallessRelationship((org.cocktail.superplaner.serveur.metier.Salles)objects.nextElement());
    }
  }


  public static Local createLocal(EOEditingContext editingContext, String cLocal
) {
    Local eo = (Local) EOUtilities.createAndInsertInstance(editingContext, _Local.ENTITY_NAME);    
		eo.setCLocal(cLocal);
    return eo;
  }

  public static NSArray<Local> fetchAllLocals(EOEditingContext editingContext) {
    return _Local.fetchAllLocals(editingContext, null);
  }

  public static NSArray<Local> fetchAllLocals(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Local.fetchLocals(editingContext, null, sortOrderings);
  }

  public static NSArray<Local> fetchLocals(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Local.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Local> eoObjects = (NSArray<Local>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Local fetchLocal(EOEditingContext editingContext, String keyName, Object value) {
    return _Local.fetchLocal(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Local fetchLocal(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Local> eoObjects = _Local.fetchLocals(editingContext, qualifier, null);
    Local eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Local)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Local that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Local fetchRequiredLocal(EOEditingContext editingContext, String keyName, Object value) {
    return _Local.fetchRequiredLocal(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Local fetchRequiredLocal(EOEditingContext editingContext, EOQualifier qualifier) {
    Local eoObject = _Local.fetchLocal(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Local that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Local localInstanceIn(EOEditingContext editingContext, Local eo) {
    Local localInstance = (eo == null) ? null : (Local)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
