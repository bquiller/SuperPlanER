// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VParcoursEc.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VParcoursEc extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VParcoursEc";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";

	// Relationships
	public static final String EXAMEN_ENTETES_KEY = "examenEntetes";
	public static final String FORMATION_DIPLOME_KEY = "formationDiplome";
	public static final String MAQUETTE_EC_KEY = "maquetteEc";
	public static final String PARCOURS_KEY = "parcours";
	public static final String SEMESTRE_KEY = "semestre";

  private static Logger LOG = Logger.getLogger(_VParcoursEc.class);

  public VParcoursEc localInstanceIn(EOEditingContext editingContext) {
    VParcoursEc localInstance = (VParcoursEc)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_VParcoursEc.LOG.isDebugEnabled()) {
    	_VParcoursEc.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public org.cocktail.superplaner.serveur.metier.FormationDiplome formationDiplome() {
    return (org.cocktail.superplaner.serveur.metier.FormationDiplome)storedValueForKey("formationDiplome");
  }

  public void setFormationDiplomeRelationship(org.cocktail.superplaner.serveur.metier.FormationDiplome value) {
    if (_VParcoursEc.LOG.isDebugEnabled()) {
      _VParcoursEc.LOG.debug("updating formationDiplome from " + formationDiplome() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationDiplome oldValue = formationDiplome();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "formationDiplome");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "formationDiplome");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteEc maquetteEc() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteEc)storedValueForKey("maquetteEc");
  }

  public void setMaquetteEcRelationship(org.cocktail.superplaner.serveur.metier.MaquetteEc value) {
    if (_VParcoursEc.LOG.isDebugEnabled()) {
      _VParcoursEc.LOG.debug("updating maquetteEc from " + maquetteEc() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.MaquetteParcours parcours() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteParcours)storedValueForKey("parcours");
  }

  public void setParcoursRelationship(org.cocktail.superplaner.serveur.metier.MaquetteParcours value) {
    if (_VParcoursEc.LOG.isDebugEnabled()) {
      _VParcoursEc.LOG.debug("updating parcours from " + parcours() + " to " + value);
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
    if (_VParcoursEc.LOG.isDebugEnabled()) {
      _VParcoursEc.LOG.debug("updating semestre from " + semestre() + " to " + value);
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
    if (_VParcoursEc.LOG.isDebugEnabled()) {
      _VParcoursEc.LOG.debug("adding " + object + " to examenEntetes relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "examenEntetes");
  }

  public void removeFromExamenEntetesRelationship(org.cocktail.superplaner.serveur.metier.ExamenEntete object) {
    if (_VParcoursEc.LOG.isDebugEnabled()) {
      _VParcoursEc.LOG.debug("removing " + object + " from examenEntetes relationship");
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


  public static VParcoursEc createVParcoursEc(EOEditingContext editingContext, Integer fannKey
) {
    VParcoursEc eo = (VParcoursEc) EOUtilities.createAndInsertInstance(editingContext, _VParcoursEc.ENTITY_NAME);    
		eo.setFannKey(fannKey);
    return eo;
  }

  public static NSArray<VParcoursEc> fetchAllVParcoursEcs(EOEditingContext editingContext) {
    return _VParcoursEc.fetchAllVParcoursEcs(editingContext, null);
  }

  public static NSArray<VParcoursEc> fetchAllVParcoursEcs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VParcoursEc.fetchVParcoursEcs(editingContext, null, sortOrderings);
  }

  public static NSArray<VParcoursEc> fetchVParcoursEcs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VParcoursEc.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VParcoursEc> eoObjects = (NSArray<VParcoursEc>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VParcoursEc fetchVParcoursEc(EOEditingContext editingContext, String keyName, Object value) {
    return _VParcoursEc.fetchVParcoursEc(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VParcoursEc fetchVParcoursEc(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VParcoursEc> eoObjects = _VParcoursEc.fetchVParcoursEcs(editingContext, qualifier, null);
    VParcoursEc eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VParcoursEc)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VParcoursEc that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VParcoursEc fetchRequiredVParcoursEc(EOEditingContext editingContext, String keyName, Object value) {
    return _VParcoursEc.fetchRequiredVParcoursEc(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VParcoursEc fetchRequiredVParcoursEc(EOEditingContext editingContext, EOQualifier qualifier) {
    VParcoursEc eoObject = _VParcoursEc.fetchVParcoursEc(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VParcoursEc that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VParcoursEc localInstanceIn(EOEditingContext editingContext, VParcoursEc eo) {
    VParcoursEc localInstance = (eo == null) ? null : (VParcoursEc)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
