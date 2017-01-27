// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to MaquetteUe.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _MaquetteUe extends  EOGenericRecord {
	public static final String ENTITY_NAME = "MaquetteUe";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String FDOM_CODE_KEY = "fdomCode";
	public static final String MUE_CODE_KEY = "mueCode";
	public static final String MUE_HORAIRE_ETU_KEY = "mueHoraireEtu";
	public static final String MUE_LIBELLE_KEY = "mueLibelle";

	// Relationships
	public static final String REPARTITION_ECS_KEY = "repartitionEcs";

  private static Logger LOG = Logger.getLogger(_MaquetteUe.class);

  public MaquetteUe localInstanceIn(EOEditingContext editingContext) {
    MaquetteUe localInstance = (MaquetteUe)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_MaquetteUe.LOG.isDebugEnabled()) {
    	_MaquetteUe.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public String fdomCode() {
    return (String) storedValueForKey("fdomCode");
  }

  public void setFdomCode(String value) {
    if (_MaquetteUe.LOG.isDebugEnabled()) {
    	_MaquetteUe.LOG.debug( "updating fdomCode from " + fdomCode() + " to " + value);
    }
    takeStoredValueForKey(value, "fdomCode");
  }

  public String mueCode() {
    return (String) storedValueForKey("mueCode");
  }

  public void setMueCode(String value) {
    if (_MaquetteUe.LOG.isDebugEnabled()) {
    	_MaquetteUe.LOG.debug( "updating mueCode from " + mueCode() + " to " + value);
    }
    takeStoredValueForKey(value, "mueCode");
  }

  public java.math.BigDecimal mueHoraireEtu() {
    return (java.math.BigDecimal) storedValueForKey("mueHoraireEtu");
  }

  public void setMueHoraireEtu(java.math.BigDecimal value) {
    if (_MaquetteUe.LOG.isDebugEnabled()) {
    	_MaquetteUe.LOG.debug( "updating mueHoraireEtu from " + mueHoraireEtu() + " to " + value);
    }
    takeStoredValueForKey(value, "mueHoraireEtu");
  }

  public String mueLibelle() {
    return (String) storedValueForKey("mueLibelle");
  }

  public void setMueLibelle(String value) {
    if (_MaquetteUe.LOG.isDebugEnabled()) {
    	_MaquetteUe.LOG.debug( "updating mueLibelle from " + mueLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "mueLibelle");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc> repartitionEcs() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc>)storedValueForKey("repartitionEcs");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc> repartitionEcs(EOQualifier qualifier) {
    return repartitionEcs(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc> repartitionEcs(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc> results;
      results = repartitionEcs();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRepartitionEcsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc object) {
    if (_MaquetteUe.LOG.isDebugEnabled()) {
      _MaquetteUe.LOG.debug("adding " + object + " to repartitionEcs relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartitionEcs");
  }

  public void removeFromRepartitionEcsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc object) {
    if (_MaquetteUe.LOG.isDebugEnabled()) {
      _MaquetteUe.LOG.debug("removing " + object + " from repartitionEcs relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartitionEcs");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc createRepartitionEcsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("MaquetteRepartitionEc");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "repartitionEcs");
    return (org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc) eo;
  }

  public void deleteRepartitionEcsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartitionEcs");
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartitionEcsRelationships() {
    Enumeration objects = repartitionEcs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartitionEcsRelationship((org.cocktail.superplaner.serveur.metier.MaquetteRepartitionEc)objects.nextElement());
    }
  }


  public static MaquetteUe createMaquetteUe(EOEditingContext editingContext, Integer fannKey
, String fdomCode
, String mueCode
, java.math.BigDecimal mueHoraireEtu
) {
    MaquetteUe eo = (MaquetteUe) EOUtilities.createAndInsertInstance(editingContext, _MaquetteUe.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setFdomCode(fdomCode);
		eo.setMueCode(mueCode);
		eo.setMueHoraireEtu(mueHoraireEtu);
    return eo;
  }

  public static NSArray<MaquetteUe> fetchAllMaquetteUes(EOEditingContext editingContext) {
    return _MaquetteUe.fetchAllMaquetteUes(editingContext, null);
  }

  public static NSArray<MaquetteUe> fetchAllMaquetteUes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _MaquetteUe.fetchMaquetteUes(editingContext, null, sortOrderings);
  }

  public static NSArray<MaquetteUe> fetchMaquetteUes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_MaquetteUe.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<MaquetteUe> eoObjects = (NSArray<MaquetteUe>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static MaquetteUe fetchMaquetteUe(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteUe.fetchMaquetteUe(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteUe fetchMaquetteUe(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<MaquetteUe> eoObjects = _MaquetteUe.fetchMaquetteUes(editingContext, qualifier, null);
    MaquetteUe eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (MaquetteUe)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one MaquetteUe that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteUe fetchRequiredMaquetteUe(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteUe.fetchRequiredMaquetteUe(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteUe fetchRequiredMaquetteUe(EOEditingContext editingContext, EOQualifier qualifier) {
    MaquetteUe eoObject = _MaquetteUe.fetchMaquetteUe(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no MaquetteUe that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteUe localInstanceIn(EOEditingContext editingContext, MaquetteUe eo) {
    MaquetteUe localInstance = (eo == null) ? null : (MaquetteUe)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
