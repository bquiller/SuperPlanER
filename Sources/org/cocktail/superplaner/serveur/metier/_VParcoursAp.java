// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VParcoursAp.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VParcoursAp extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VParcoursAp";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String MEC_KEY_KEY = "mecKey";

	// Relationships
	public static final String AP_KEY = "ap";
	public static final String DIPLOME_KEY = "diplome";
	public static final String EC_KEY = "ec";
	public static final String EXAMEN_ENTETES_KEY = "examenEntetes";
	public static final String PARCOURS_KEY = "parcours";
	public static final String SEMESTRE_KEY = "semestre";
	public static final String SPECIALISATION_KEY = "specialisation";

  private static Logger LOG = Logger.getLogger(_VParcoursAp.class);

  public VParcoursAp localInstanceIn(EOEditingContext editingContext) {
    VParcoursAp localInstance = (VParcoursAp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_VParcoursAp.LOG.isDebugEnabled()) {
    	_VParcoursAp.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public Integer mecKey() {
    return (Integer) storedValueForKey("mecKey");
  }

  public void setMecKey(Integer value) {
    if (_VParcoursAp.LOG.isDebugEnabled()) {
    	_VParcoursAp.LOG.debug( "updating mecKey from " + mecKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mecKey");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteAp ap() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("ap");
  }

  public void setApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_VParcoursAp.LOG.isDebugEnabled()) {
      _VParcoursAp.LOG.debug("updating ap from " + ap() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteAp oldValue = ap();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "ap");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "ap");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.FormationDiplome diplome() {
    return (org.cocktail.superplaner.serveur.metier.FormationDiplome)storedValueForKey("diplome");
  }

  public void setDiplomeRelationship(org.cocktail.superplaner.serveur.metier.FormationDiplome value) {
    if (_VParcoursAp.LOG.isDebugEnabled()) {
      _VParcoursAp.LOG.debug("updating diplome from " + diplome() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationDiplome oldValue = diplome();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "diplome");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "diplome");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteEc ec() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteEc)storedValueForKey("ec");
  }

  public void setEcRelationship(org.cocktail.superplaner.serveur.metier.MaquetteEc value) {
    if (_VParcoursAp.LOG.isDebugEnabled()) {
      _VParcoursAp.LOG.debug("updating ec from " + ec() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteEc oldValue = ec();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "ec");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "ec");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteParcours parcours() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteParcours)storedValueForKey("parcours");
  }

  public void setParcoursRelationship(org.cocktail.superplaner.serveur.metier.MaquetteParcours value) {
    if (_VParcoursAp.LOG.isDebugEnabled()) {
      _VParcoursAp.LOG.debug("updating parcours from " + parcours() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteParcours oldValue = parcours();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "parcours");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "parcours");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteSemestre semestre() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteSemestre)storedValueForKey("semestre");
  }

  public void setSemestreRelationship(org.cocktail.superplaner.serveur.metier.MaquetteSemestre value) {
    if (_VParcoursAp.LOG.isDebugEnabled()) {
      _VParcoursAp.LOG.debug("updating semestre from " + semestre() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteSemestre oldValue = semestre();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "semestre");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "semestre");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.FormationSpecialisation specialisation() {
    return (org.cocktail.superplaner.serveur.metier.FormationSpecialisation)storedValueForKey("specialisation");
  }

  public void setSpecialisationRelationship(org.cocktail.superplaner.serveur.metier.FormationSpecialisation value) {
    if (_VParcoursAp.LOG.isDebugEnabled()) {
      _VParcoursAp.LOG.debug("updating specialisation from " + specialisation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationSpecialisation oldValue = specialisation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "specialisation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "specialisation");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete> examenEntetes() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete>)storedValueForKey("examenEntetes");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete> examenEntetes(EOQualifier qualifier) {
    return examenEntetes(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete> examenEntetes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete> results;
      results = examenEntetes();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToExamenEntetesRelationship(org.cocktail.superplaner.serveur.metier.ExamenEntete object) {
    if (_VParcoursAp.LOG.isDebugEnabled()) {
      _VParcoursAp.LOG.debug("adding " + object + " to examenEntetes relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "examenEntetes");
  }

  public void removeFromExamenEntetesRelationship(org.cocktail.superplaner.serveur.metier.ExamenEntete object) {
    if (_VParcoursAp.LOG.isDebugEnabled()) {
      _VParcoursAp.LOG.debug("removing " + object + " from examenEntetes relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "examenEntetes");
  }

  public org.cocktail.superplaner.serveur.metier.ExamenEntete createExamenEntetesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ExamenEntete");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "examenEntetes");
    return (org.cocktail.superplaner.serveur.metier.ExamenEntete) eo;
  }

  public void deleteExamenEntetesRelationship(org.cocktail.superplaner.serveur.metier.ExamenEntete object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "examenEntetes");
    editingContext().deleteObject(object);
  }

  public void deleteAllExamenEntetesRelationships() {
    Enumeration objects = examenEntetes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteExamenEntetesRelationship((org.cocktail.superplaner.serveur.metier.ExamenEntete)objects.nextElement());
    }
  }


  public static VParcoursAp createVParcoursAp(EOEditingContext editingContext, Integer fannKey
, Integer mecKey
) {
    VParcoursAp eo = (VParcoursAp) EOUtilities.createAndInsertInstance(editingContext, _VParcoursAp.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setMecKey(mecKey);
    return eo;
  }

  public static NSArray<VParcoursAp> fetchAllVParcoursAps(EOEditingContext editingContext) {
    return _VParcoursAp.fetchAllVParcoursAps(editingContext, null);
  }

  public static NSArray<VParcoursAp> fetchAllVParcoursAps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VParcoursAp.fetchVParcoursAps(editingContext, null, sortOrderings);
  }

  public static NSArray<VParcoursAp> fetchVParcoursAps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VParcoursAp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VParcoursAp> eoObjects = (NSArray<VParcoursAp>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VParcoursAp fetchVParcoursAp(EOEditingContext editingContext, String keyName, Object value) {
    return _VParcoursAp.fetchVParcoursAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VParcoursAp fetchVParcoursAp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VParcoursAp> eoObjects = _VParcoursAp.fetchVParcoursAps(editingContext, qualifier, null);
    VParcoursAp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VParcoursAp)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VParcoursAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VParcoursAp fetchRequiredVParcoursAp(EOEditingContext editingContext, String keyName, Object value) {
    return _VParcoursAp.fetchRequiredVParcoursAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VParcoursAp fetchRequiredVParcoursAp(EOEditingContext editingContext, EOQualifier qualifier) {
    VParcoursAp eoObject = _VParcoursAp.fetchVParcoursAp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VParcoursAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VParcoursAp localInstanceIn(EOEditingContext editingContext, VParcoursAp eo) {
    VParcoursAp localInstance = (eo == null) ? null : (VParcoursAp)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
