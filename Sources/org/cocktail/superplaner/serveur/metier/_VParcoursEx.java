// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VParcoursEx.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VParcoursEx extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VParcoursEx";

	// Attributes

	// Relationships
	public static final String DIPLOME_KEY = "diplome";
	public static final String EXAMEN_ENTETE_KEY = "examenEntete";
	public static final String PARCOURS_KEY = "parcours";
	public static final String SEMESTRE_KEY = "semestre";
	public static final String SPECIALISATION_KEY = "specialisation";

  private static Logger LOG = Logger.getLogger(_VParcoursEx.class);

  public VParcoursEx localInstanceIn(EOEditingContext editingContext) {
    VParcoursEx localInstance = (VParcoursEx)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public org.cocktail.superplaner.serveur.metier.FormationDiplome diplome() {
    return (org.cocktail.superplaner.serveur.metier.FormationDiplome)storedValueForKey("diplome");
  }

  public void setDiplomeRelationship(org.cocktail.superplaner.serveur.metier.FormationDiplome value) {
    if (_VParcoursEx.LOG.isDebugEnabled()) {
      _VParcoursEx.LOG.debug("updating diplome from " + diplome() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.ExamenEntete examenEntete() {
    return (org.cocktail.superplaner.serveur.metier.ExamenEntete)storedValueForKey("examenEntete");
  }

  public void setExamenEnteteRelationship(org.cocktail.superplaner.serveur.metier.ExamenEntete value) {
    if (_VParcoursEx.LOG.isDebugEnabled()) {
      _VParcoursEx.LOG.debug("updating examenEntete from " + examenEntete() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ExamenEntete oldValue = examenEntete();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "examenEntete");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "examenEntete");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteParcours parcours() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteParcours)storedValueForKey("parcours");
  }

  public void setParcoursRelationship(org.cocktail.superplaner.serveur.metier.MaquetteParcours value) {
    if (_VParcoursEx.LOG.isDebugEnabled()) {
      _VParcoursEx.LOG.debug("updating parcours from " + parcours() + " to " + value);
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
    if (_VParcoursEx.LOG.isDebugEnabled()) {
      _VParcoursEx.LOG.debug("updating semestre from " + semestre() + " to " + value);
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
    if (_VParcoursEx.LOG.isDebugEnabled()) {
      _VParcoursEx.LOG.debug("updating specialisation from " + specialisation() + " to " + value);
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
  

  public static VParcoursEx createVParcoursEx(EOEditingContext editingContext) {
    VParcoursEx eo = (VParcoursEx) EOUtilities.createAndInsertInstance(editingContext, _VParcoursEx.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<VParcoursEx> fetchAllVParcoursExes(EOEditingContext editingContext) {
    return _VParcoursEx.fetchAllVParcoursExes(editingContext, null);
  }

  public static NSArray<VParcoursEx> fetchAllVParcoursExes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VParcoursEx.fetchVParcoursExes(editingContext, null, sortOrderings);
  }

  public static NSArray<VParcoursEx> fetchVParcoursExes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VParcoursEx.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VParcoursEx> eoObjects = (NSArray<VParcoursEx>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VParcoursEx fetchVParcoursEx(EOEditingContext editingContext, String keyName, Object value) {
    return _VParcoursEx.fetchVParcoursEx(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VParcoursEx fetchVParcoursEx(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VParcoursEx> eoObjects = _VParcoursEx.fetchVParcoursExes(editingContext, qualifier, null);
    VParcoursEx eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VParcoursEx)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VParcoursEx that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VParcoursEx fetchRequiredVParcoursEx(EOEditingContext editingContext, String keyName, Object value) {
    return _VParcoursEx.fetchRequiredVParcoursEx(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VParcoursEx fetchRequiredVParcoursEx(EOEditingContext editingContext, EOQualifier qualifier) {
    VParcoursEx eoObject = _VParcoursEx.fetchVParcoursEx(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VParcoursEx that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VParcoursEx localInstanceIn(EOEditingContext editingContext, VParcoursEx eo) {
    VParcoursEx localInstance = (eo == null) ? null : (VParcoursEx)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
