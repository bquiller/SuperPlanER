// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to AffectationSalle.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _AffectationSalle extends  EOGenericRecord {
	public static final String ENTITY_NAME = "AffectationSalle";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";

	// Relationships
	public static final String HABILITATION_KEY = "habilitation";
	public static final String INDIVIDU_KEY = "individu";
	public static final String PERIODICITES_AFF_KEY = "periodicitesAff";
	public static final String SALLE_KEY = "salle";

  private static Logger LOG = Logger.getLogger(_AffectationSalle.class);

  public AffectationSalle localInstanceIn(EOEditingContext editingContext) {
    AffectationSalle localInstance = (AffectationSalle)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_AffectationSalle.LOG.isDebugEnabled()) {
    	_AffectationSalle.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public org.cocktail.superplaner.serveur.metier.FormationHabilitation habilitation() {
    return (org.cocktail.superplaner.serveur.metier.FormationHabilitation)storedValueForKey("habilitation");
  }

  public void setHabilitationRelationship(org.cocktail.superplaner.serveur.metier.FormationHabilitation value) {
    if (_AffectationSalle.LOG.isDebugEnabled()) {
      _AffectationSalle.LOG.debug("updating habilitation from " + habilitation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationHabilitation oldValue = habilitation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "habilitation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "habilitation");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.IndividuUlr individu() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individu");
  }

  public void setIndividuRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_AffectationSalle.LOG.isDebugEnabled()) {
      _AffectationSalle.LOG.debug("updating individu from " + individu() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individu();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individu");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individu");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.Salles salle() {
    return (org.cocktail.superplaner.serveur.metier.Salles)storedValueForKey("salle");
  }

  public void setSalleRelationship(org.cocktail.superplaner.serveur.metier.Salles value) {
    if (_AffectationSalle.LOG.isDebugEnabled()) {
      _AffectationSalle.LOG.debug("updating salle from " + salle() + " to " + value);
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
  
  public NSArray<org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle> periodicitesAff() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle>)storedValueForKey("periodicitesAff");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle> periodicitesAff(EOQualifier qualifier) {
    return periodicitesAff(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle> periodicitesAff(EOQualifier qualifier, boolean fetch) {
    return periodicitesAff(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle> periodicitesAff(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle.AFFECTATION_SALLE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle.fetchPeriodiciteAffSalles(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = periodicitesAff();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToPeriodicitesAffRelationship(org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle object) {
    if (_AffectationSalle.LOG.isDebugEnabled()) {
      _AffectationSalle.LOG.debug("adding " + object + " to periodicitesAff relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "periodicitesAff");
  }

  public void removeFromPeriodicitesAffRelationship(org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle object) {
    if (_AffectationSalle.LOG.isDebugEnabled()) {
      _AffectationSalle.LOG.debug("removing " + object + " from periodicitesAff relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "periodicitesAff");
  }

  public org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle createPeriodicitesAffRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("PeriodiciteAffSalle");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "periodicitesAff");
    return (org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle) eo;
  }

  public void deletePeriodicitesAffRelationship(org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "periodicitesAff");
    editingContext().deleteObject(object);
  }

  public void deleteAllPeriodicitesAffRelationships() {
    Enumeration objects = periodicitesAff().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePeriodicitesAffRelationship((org.cocktail.superplaner.serveur.metier.PeriodiciteAffSalle)objects.nextElement());
    }
  }


  public static AffectationSalle createAffectationSalle(EOEditingContext editingContext, Integer fannKey
) {
    AffectationSalle eo = (AffectationSalle) EOUtilities.createAndInsertInstance(editingContext, _AffectationSalle.ENTITY_NAME);    
		eo.setFannKey(fannKey);
    return eo;
  }

  public static NSArray<AffectationSalle> fetchAllAffectationSalles(EOEditingContext editingContext) {
    return _AffectationSalle.fetchAllAffectationSalles(editingContext, null);
  }

  public static NSArray<AffectationSalle> fetchAllAffectationSalles(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _AffectationSalle.fetchAffectationSalles(editingContext, null, sortOrderings);
  }

  public static NSArray<AffectationSalle> fetchAffectationSalles(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_AffectationSalle.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<AffectationSalle> eoObjects = (NSArray<AffectationSalle>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static AffectationSalle fetchAffectationSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _AffectationSalle.fetchAffectationSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static AffectationSalle fetchAffectationSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<AffectationSalle> eoObjects = _AffectationSalle.fetchAffectationSalles(editingContext, qualifier, null);
    AffectationSalle eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (AffectationSalle)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one AffectationSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static AffectationSalle fetchRequiredAffectationSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _AffectationSalle.fetchRequiredAffectationSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static AffectationSalle fetchRequiredAffectationSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    AffectationSalle eoObject = _AffectationSalle.fetchAffectationSalle(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no AffectationSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static AffectationSalle localInstanceIn(EOEditingContext editingContext, AffectationSalle eo) {
    AffectationSalle localInstance = (eo == null) ? null : (AffectationSalle)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
