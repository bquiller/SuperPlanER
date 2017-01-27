// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolInscriptionAp.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolInscriptionAp extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ScolInscriptionAp";

	// Attributes
	public static final String IMRAP_DISPENSE_KEY = "imrapDispense";
	public static final String MRAP_KEY_KEY = "mrapKey";

	// Relationships
	public static final String MAQUETTE_REPARTITION_AP_KEY = "maquetteRepartitionAp";
	public static final String SCOL_MAQUETTE_REPARTITION_AP_KEY = "scolMaquetteRepartitionAp";

  private static Logger LOG = Logger.getLogger(_ScolInscriptionAp.class);

  public ScolInscriptionAp localInstanceIn(EOEditingContext editingContext) {
    ScolInscriptionAp localInstance = (ScolInscriptionAp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Long imrapDispense() {
    return (Long) storedValueForKey("imrapDispense");
  }

  public void setImrapDispense(Long value) {
    if (_ScolInscriptionAp.LOG.isDebugEnabled()) {
    	_ScolInscriptionAp.LOG.debug( "updating imrapDispense from " + imrapDispense() + " to " + value);
    }
    takeStoredValueForKey(value, "imrapDispense");
  }

  public Integer mrapKey() {
    return (Integer) storedValueForKey("mrapKey");
  }

  public void setMrapKey(Integer value) {
    if (_ScolInscriptionAp.LOG.isDebugEnabled()) {
    	_ScolInscriptionAp.LOG.debug( "updating mrapKey from " + mrapKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mrapKey");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp maquetteRepartitionAp() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp)storedValueForKey("maquetteRepartitionAp");
  }

  public void setMaquetteRepartitionApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp value) {
    if (_ScolInscriptionAp.LOG.isDebugEnabled()) {
      _ScolInscriptionAp.LOG.debug("updating maquetteRepartitionAp from " + maquetteRepartitionAp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp oldValue = maquetteRepartitionAp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteRepartitionAp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteRepartitionAp");
    }
  }
  
  public org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionAp scolMaquetteRepartitionAp() {
    return (org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionAp)storedValueForKey("scolMaquetteRepartitionAp");
  }

  public void setScolMaquetteRepartitionApRelationship(org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionAp value) {
    if (_ScolInscriptionAp.LOG.isDebugEnabled()) {
      _ScolInscriptionAp.LOG.debug("updating scolMaquetteRepartitionAp from " + scolMaquetteRepartitionAp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionAp oldValue = scolMaquetteRepartitionAp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "scolMaquetteRepartitionAp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "scolMaquetteRepartitionAp");
    }
  }
  

  public static ScolInscriptionAp createScolInscriptionAp(EOEditingContext editingContext, Long imrapDispense
, Integer mrapKey
, org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp maquetteRepartitionAp, org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionAp scolMaquetteRepartitionAp) {
    ScolInscriptionAp eo = (ScolInscriptionAp) EOUtilities.createAndInsertInstance(editingContext, _ScolInscriptionAp.ENTITY_NAME);    
		eo.setImrapDispense(imrapDispense);
		eo.setMrapKey(mrapKey);
    eo.setMaquetteRepartitionApRelationship(maquetteRepartitionAp);
    eo.setScolMaquetteRepartitionApRelationship(scolMaquetteRepartitionAp);
    return eo;
  }

  public static NSArray<ScolInscriptionAp> fetchAllScolInscriptionAps(EOEditingContext editingContext) {
    return _ScolInscriptionAp.fetchAllScolInscriptionAps(editingContext, null);
  }

  public static NSArray<ScolInscriptionAp> fetchAllScolInscriptionAps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolInscriptionAp.fetchScolInscriptionAps(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolInscriptionAp> fetchScolInscriptionAps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolInscriptionAp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolInscriptionAp> eoObjects = (NSArray<ScolInscriptionAp>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolInscriptionAp fetchScolInscriptionAp(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolInscriptionAp.fetchScolInscriptionAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolInscriptionAp fetchScolInscriptionAp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolInscriptionAp> eoObjects = _ScolInscriptionAp.fetchScolInscriptionAps(editingContext, qualifier, null);
    ScolInscriptionAp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolInscriptionAp)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ScolInscriptionAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolInscriptionAp fetchRequiredScolInscriptionAp(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolInscriptionAp.fetchRequiredScolInscriptionAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolInscriptionAp fetchRequiredScolInscriptionAp(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolInscriptionAp eoObject = _ScolInscriptionAp.fetchScolInscriptionAp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ScolInscriptionAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolInscriptionAp localInstanceIn(EOEditingContext editingContext, ScolInscriptionAp eo) {
    ScolInscriptionAp localInstance = (eo == null) ? null : (ScolInscriptionAp)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
