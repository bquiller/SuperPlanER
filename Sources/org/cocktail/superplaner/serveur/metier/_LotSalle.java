// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to LotSalle.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _LotSalle extends  EOGenericRecord {
	public static final String ENTITY_NAME = "LotSalle";

	// Attributes
	public static final String LOT_LIBELLE_KEY = "lotLibelle";

	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String REPART_LOT_INDIVIDUS_KEY = "repartLotIndividus";
	public static final String REPART_LOT_SALLES_KEY = "repartLotSalles";

  private static Logger LOG = Logger.getLogger(_LotSalle.class);

  public LotSalle localInstanceIn(EOEditingContext editingContext) {
    LotSalle localInstance = (LotSalle)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String lotLibelle() {
    return (String) storedValueForKey("lotLibelle");
  }

  public void setLotLibelle(String value) {
    if (_LotSalle.LOG.isDebugEnabled()) {
    	_LotSalle.LOG.debug( "updating lotLibelle from " + lotLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "lotLibelle");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_LotSalle.LOG.isDebugEnabled()) {
      _LotSalle.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individuUlr();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individuUlr");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individuUlr");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu> repartLotIndividus() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu>)storedValueForKey("repartLotIndividus");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu> repartLotIndividus(EOQualifier qualifier) {
    return repartLotIndividus(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu> repartLotIndividus(EOQualifier qualifier, boolean fetch) {
    return repartLotIndividus(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu> repartLotIndividus(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.RepartLotIndividu.LOT_SALLE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.RepartLotIndividu.fetchRepartLotIndividus(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartLotIndividus();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartLotIndividusRelationship(org.cocktail.superplaner.serveur.metier.RepartLotIndividu object) {
    if (_LotSalle.LOG.isDebugEnabled()) {
      _LotSalle.LOG.debug("adding " + object + " to repartLotIndividus relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartLotIndividus");
  }

  public void removeFromRepartLotIndividusRelationship(org.cocktail.superplaner.serveur.metier.RepartLotIndividu object) {
    if (_LotSalle.LOG.isDebugEnabled()) {
      _LotSalle.LOG.debug("removing " + object + " from repartLotIndividus relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartLotIndividus");
  }

  public org.cocktail.superplaner.serveur.metier.RepartLotIndividu createRepartLotIndividusRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartLotIndividu");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "repartLotIndividus");
    return (org.cocktail.superplaner.serveur.metier.RepartLotIndividu) eo;
  }

  public void deleteRepartLotIndividusRelationship(org.cocktail.superplaner.serveur.metier.RepartLotIndividu object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartLotIndividus");
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartLotIndividusRelationships() {
    Enumeration objects = repartLotIndividus().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartLotIndividusRelationship((org.cocktail.superplaner.serveur.metier.RepartLotIndividu)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle> repartLotSalles() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle>)storedValueForKey("repartLotSalles");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle> repartLotSalles(EOQualifier qualifier) {
    return repartLotSalles(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle> repartLotSalles(EOQualifier qualifier, boolean fetch) {
    return repartLotSalles(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle> repartLotSalles(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.RepartLotSalle.LOT_SALLE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.RepartLotSalle.fetchRepartLotSalles(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartLotSalles();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartLotSallesRelationship(org.cocktail.superplaner.serveur.metier.RepartLotSalle object) {
    if (_LotSalle.LOG.isDebugEnabled()) {
      _LotSalle.LOG.debug("adding " + object + " to repartLotSalles relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartLotSalles");
  }

  public void removeFromRepartLotSallesRelationship(org.cocktail.superplaner.serveur.metier.RepartLotSalle object) {
    if (_LotSalle.LOG.isDebugEnabled()) {
      _LotSalle.LOG.debug("removing " + object + " from repartLotSalles relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartLotSalles");
  }

  public org.cocktail.superplaner.serveur.metier.RepartLotSalle createRepartLotSallesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartLotSalle");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "repartLotSalles");
    return (org.cocktail.superplaner.serveur.metier.RepartLotSalle) eo;
  }

  public void deleteRepartLotSallesRelationship(org.cocktail.superplaner.serveur.metier.RepartLotSalle object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartLotSalles");
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartLotSallesRelationships() {
    Enumeration objects = repartLotSalles().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartLotSallesRelationship((org.cocktail.superplaner.serveur.metier.RepartLotSalle)objects.nextElement());
    }
  }


  public static LotSalle createLotSalle(EOEditingContext editingContext, String lotLibelle
) {
    LotSalle eo = (LotSalle) EOUtilities.createAndInsertInstance(editingContext, _LotSalle.ENTITY_NAME);    
		eo.setLotLibelle(lotLibelle);
    return eo;
  }

  public static NSArray<LotSalle> fetchAllLotSalles(EOEditingContext editingContext) {
    return _LotSalle.fetchAllLotSalles(editingContext, null);
  }

  public static NSArray<LotSalle> fetchAllLotSalles(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _LotSalle.fetchLotSalles(editingContext, null, sortOrderings);
  }

  public static NSArray<LotSalle> fetchLotSalles(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_LotSalle.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<LotSalle> eoObjects = (NSArray<LotSalle>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static LotSalle fetchLotSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _LotSalle.fetchLotSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static LotSalle fetchLotSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<LotSalle> eoObjects = _LotSalle.fetchLotSalles(editingContext, qualifier, null);
    LotSalle eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (LotSalle)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one LotSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static LotSalle fetchRequiredLotSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _LotSalle.fetchRequiredLotSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static LotSalle fetchRequiredLotSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    LotSalle eoObject = _LotSalle.fetchLotSalle(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no LotSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static LotSalle localInstanceIn(EOEditingContext editingContext, LotSalle eo) {
    LotSalle localInstance = (eo == null) ? null : (LotSalle)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
