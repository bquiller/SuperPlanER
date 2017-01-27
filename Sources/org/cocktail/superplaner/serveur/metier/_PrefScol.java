// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to PrefScol.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _PrefScol extends  EOGenericRecord {
	public static final String ENTITY_NAME = "PrefScol";

	// Attributes

	// Relationships
	public static final String ANNEE_KEY = "annee";
	public static final String HABILITATION_KEY = "habilitation";
	public static final String INDIVIDU_KEY = "individu";

  private static Logger LOG = Logger.getLogger(_PrefScol.class);

  public PrefScol localInstanceIn(EOEditingContext editingContext) {
    PrefScol localInstance = (PrefScol)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public org.cocktail.superplaner.serveur.metier.FormationAnnee annee() {
    return (org.cocktail.superplaner.serveur.metier.FormationAnnee)storedValueForKey("annee");
  }

  public void setAnneeRelationship(org.cocktail.superplaner.serveur.metier.FormationAnnee value) {
    if (_PrefScol.LOG.isDebugEnabled()) {
      _PrefScol.LOG.debug("updating annee from " + annee() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationAnnee oldValue = annee();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "annee");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "annee");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.FormationHabilitation habilitation() {
    return (org.cocktail.superplaner.serveur.metier.FormationHabilitation)storedValueForKey("habilitation");
  }

  public void setHabilitationRelationship(org.cocktail.superplaner.serveur.metier.FormationHabilitation value) {
    if (_PrefScol.LOG.isDebugEnabled()) {
      _PrefScol.LOG.debug("updating habilitation from " + habilitation() + " to " + value);
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
    if (_PrefScol.LOG.isDebugEnabled()) {
      _PrefScol.LOG.debug("updating individu from " + individu() + " to " + value);
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
  

  public static PrefScol createPrefScol(EOEditingContext editingContext) {
    PrefScol eo = (PrefScol) EOUtilities.createAndInsertInstance(editingContext, _PrefScol.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<PrefScol> fetchAllPrefScols(EOEditingContext editingContext) {
    return _PrefScol.fetchAllPrefScols(editingContext, null);
  }

  public static NSArray<PrefScol> fetchAllPrefScols(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _PrefScol.fetchPrefScols(editingContext, null, sortOrderings);
  }

  public static NSArray<PrefScol> fetchPrefScols(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_PrefScol.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<PrefScol> eoObjects = (NSArray<PrefScol>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static PrefScol fetchPrefScol(EOEditingContext editingContext, String keyName, Object value) {
    return _PrefScol.fetchPrefScol(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static PrefScol fetchPrefScol(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<PrefScol> eoObjects = _PrefScol.fetchPrefScols(editingContext, qualifier, null);
    PrefScol eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (PrefScol)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one PrefScol that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static PrefScol fetchRequiredPrefScol(EOEditingContext editingContext, String keyName, Object value) {
    return _PrefScol.fetchRequiredPrefScol(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static PrefScol fetchRequiredPrefScol(EOEditingContext editingContext, EOQualifier qualifier) {
    PrefScol eoObject = _PrefScol.fetchPrefScol(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no PrefScol that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static PrefScol localInstanceIn(EOEditingContext editingContext, PrefScol eo) {
    PrefScol localInstance = (eo == null) ? null : (PrefScol)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
