// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to MaquetteRepartitionAp.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _MaquetteRepartitionAp extends  EOGenericRecord {
	public static final String ENTITY_NAME = "MaquetteRepartitionAp";

	// Attributes

	// Relationships
	public static final String FORMATION_ANNEE_KEY = "formationAnnee";
	public static final String MAQUETTE_AP_KEY = "maquetteAp";
	public static final String MAQUETTE_EC_KEY = "maquetteEc";

  private static Logger LOG = Logger.getLogger(_MaquetteRepartitionAp.class);

  public MaquetteRepartitionAp localInstanceIn(EOEditingContext editingContext) {
    MaquetteRepartitionAp localInstance = (MaquetteRepartitionAp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public org.cocktail.superplaner.serveur.metier.FormationAnnee formationAnnee() {
    return (org.cocktail.superplaner.serveur.metier.FormationAnnee)storedValueForKey("formationAnnee");
  }

  public void setFormationAnneeRelationship(org.cocktail.superplaner.serveur.metier.FormationAnnee value) {
    if (_MaquetteRepartitionAp.LOG.isDebugEnabled()) {
      _MaquetteRepartitionAp.LOG.debug("updating formationAnnee from " + formationAnnee() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationAnnee oldValue = formationAnnee();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "formationAnnee");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "formationAnnee");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteAp maquetteAp() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("maquetteAp");
  }

  public void setMaquetteApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_MaquetteRepartitionAp.LOG.isDebugEnabled()) {
      _MaquetteRepartitionAp.LOG.debug("updating maquetteAp from " + maquetteAp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteAp oldValue = maquetteAp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteAp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteAp");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteEc maquetteEc() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteEc)storedValueForKey("maquetteEc");
  }

  public void setMaquetteEcRelationship(org.cocktail.superplaner.serveur.metier.MaquetteEc value) {
    if (_MaquetteRepartitionAp.LOG.isDebugEnabled()) {
      _MaquetteRepartitionAp.LOG.debug("updating maquetteEc from " + maquetteEc() + " to " + value);
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
  

  public static MaquetteRepartitionAp createMaquetteRepartitionAp(EOEditingContext editingContext) {
    MaquetteRepartitionAp eo = (MaquetteRepartitionAp) EOUtilities.createAndInsertInstance(editingContext, _MaquetteRepartitionAp.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<MaquetteRepartitionAp> fetchAllMaquetteRepartitionAps(EOEditingContext editingContext) {
    return _MaquetteRepartitionAp.fetchAllMaquetteRepartitionAps(editingContext, null);
  }

  public static NSArray<MaquetteRepartitionAp> fetchAllMaquetteRepartitionAps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _MaquetteRepartitionAp.fetchMaquetteRepartitionAps(editingContext, null, sortOrderings);
  }

  public static NSArray<MaquetteRepartitionAp> fetchMaquetteRepartitionAps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_MaquetteRepartitionAp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<MaquetteRepartitionAp> eoObjects = (NSArray<MaquetteRepartitionAp>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static MaquetteRepartitionAp fetchMaquetteRepartitionAp(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteRepartitionAp.fetchMaquetteRepartitionAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteRepartitionAp fetchMaquetteRepartitionAp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<MaquetteRepartitionAp> eoObjects = _MaquetteRepartitionAp.fetchMaquetteRepartitionAps(editingContext, qualifier, null);
    MaquetteRepartitionAp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (MaquetteRepartitionAp)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one MaquetteRepartitionAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteRepartitionAp fetchRequiredMaquetteRepartitionAp(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteRepartitionAp.fetchRequiredMaquetteRepartitionAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteRepartitionAp fetchRequiredMaquetteRepartitionAp(EOEditingContext editingContext, EOQualifier qualifier) {
    MaquetteRepartitionAp eoObject = _MaquetteRepartitionAp.fetchMaquetteRepartitionAp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no MaquetteRepartitionAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteRepartitionAp localInstanceIn(EOEditingContext editingContext, MaquetteRepartitionAp eo) {
    MaquetteRepartitionAp localInstance = (eo == null) ? null : (MaquetteRepartitionAp)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
