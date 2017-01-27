// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to MaquetteParcours.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _MaquetteParcours extends  EOGenericRecord {
	public static final String ENTITY_NAME = "MaquetteParcours";

	// Attributes
	public static final String MPAR_ABREVIATION_KEY = "mparAbreviation";
	public static final String MPAR_CODE_KEY = "mparCode";
	public static final String MPAR_KEY_KEY = "mparKey";
	public static final String MPAR_LIBELLE_KEY = "mparLibelle";
	public static final String MPAR_VALIDITE_KEY = "mparValidite";

	// Relationships
	public static final String FORMATION_SPECIALISATION_KEY = "formationSpecialisation";

  private static Logger LOG = Logger.getLogger(_MaquetteParcours.class);

  public MaquetteParcours localInstanceIn(EOEditingContext editingContext) {
    MaquetteParcours localInstance = (MaquetteParcours)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String mparAbreviation() {
    return (String) storedValueForKey("mparAbreviation");
  }

  public void setMparAbreviation(String value) {
    if (_MaquetteParcours.LOG.isDebugEnabled()) {
    	_MaquetteParcours.LOG.debug( "updating mparAbreviation from " + mparAbreviation() + " to " + value);
    }
    takeStoredValueForKey(value, "mparAbreviation");
  }

  public String mparCode() {
    return (String) storedValueForKey("mparCode");
  }

  public void setMparCode(String value) {
    if (_MaquetteParcours.LOG.isDebugEnabled()) {
    	_MaquetteParcours.LOG.debug( "updating mparCode from " + mparCode() + " to " + value);
    }
    takeStoredValueForKey(value, "mparCode");
  }

  public Integer mparKey() {
    return (Integer) storedValueForKey("mparKey");
  }

  public void setMparKey(Integer value) {
    if (_MaquetteParcours.LOG.isDebugEnabled()) {
    	_MaquetteParcours.LOG.debug( "updating mparKey from " + mparKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mparKey");
  }

  public String mparLibelle() {
    return (String) storedValueForKey("mparLibelle");
  }

  public void setMparLibelle(String value) {
    if (_MaquetteParcours.LOG.isDebugEnabled()) {
    	_MaquetteParcours.LOG.debug( "updating mparLibelle from " + mparLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "mparLibelle");
  }

  public String mparValidite() {
    return (String) storedValueForKey("mparValidite");
  }

  public void setMparValidite(String value) {
    if (_MaquetteParcours.LOG.isDebugEnabled()) {
    	_MaquetteParcours.LOG.debug( "updating mparValidite from " + mparValidite() + " to " + value);
    }
    takeStoredValueForKey(value, "mparValidite");
  }

  public org.cocktail.superplaner.serveur.metier.FormationSpecialisation formationSpecialisation() {
    return (org.cocktail.superplaner.serveur.metier.FormationSpecialisation)storedValueForKey("formationSpecialisation");
  }

  public void setFormationSpecialisationRelationship(org.cocktail.superplaner.serveur.metier.FormationSpecialisation value) {
    if (_MaquetteParcours.LOG.isDebugEnabled()) {
      _MaquetteParcours.LOG.debug("updating formationSpecialisation from " + formationSpecialisation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationSpecialisation oldValue = formationSpecialisation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "formationSpecialisation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "formationSpecialisation");
    }
  }
  

  public static MaquetteParcours createMaquetteParcours(EOEditingContext editingContext, String mparCode
, Integer mparKey
, String mparLibelle
, String mparValidite
) {
    MaquetteParcours eo = (MaquetteParcours) EOUtilities.createAndInsertInstance(editingContext, _MaquetteParcours.ENTITY_NAME);    
		eo.setMparCode(mparCode);
		eo.setMparKey(mparKey);
		eo.setMparLibelle(mparLibelle);
		eo.setMparValidite(mparValidite);
    return eo;
  }

  public static NSArray<MaquetteParcours> fetchAllMaquetteParcourses(EOEditingContext editingContext) {
    return _MaquetteParcours.fetchAllMaquetteParcourses(editingContext, null);
  }

  public static NSArray<MaquetteParcours> fetchAllMaquetteParcourses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _MaquetteParcours.fetchMaquetteParcourses(editingContext, null, sortOrderings);
  }

  public static NSArray<MaquetteParcours> fetchMaquetteParcourses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_MaquetteParcours.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<MaquetteParcours> eoObjects = (NSArray<MaquetteParcours>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static MaquetteParcours fetchMaquetteParcours(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteParcours.fetchMaquetteParcours(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteParcours fetchMaquetteParcours(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<MaquetteParcours> eoObjects = _MaquetteParcours.fetchMaquetteParcourses(editingContext, qualifier, null);
    MaquetteParcours eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (MaquetteParcours)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one MaquetteParcours that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteParcours fetchRequiredMaquetteParcours(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteParcours.fetchRequiredMaquetteParcours(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteParcours fetchRequiredMaquetteParcours(EOEditingContext editingContext, EOQualifier qualifier) {
    MaquetteParcours eoObject = _MaquetteParcours.fetchMaquetteParcours(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no MaquetteParcours that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteParcours localInstanceIn(EOEditingContext editingContext, MaquetteParcours eo) {
    MaquetteParcours localInstance = (eo == null) ? null : (MaquetteParcours)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
