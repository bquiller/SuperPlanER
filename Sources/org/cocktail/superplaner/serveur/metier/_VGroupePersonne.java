// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VGroupePersonne.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VGroupePersonne extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VGroupePersonne";

	// Attributes
	public static final String C_STRUCTURE_KEY = "cStructure";
	public static final String C_STRUCTURE_PERE_KEY = "cStructurePere";
	public static final String LL_STRUCTURE_KEY = "llStructure";
	public static final String PERS_ID_KEY = "persId";

	// Relationships
	public static final String TO_PERSONNE_KEY = "toPersonne";
	public static final String TO_STRUCTURE_PERE_KEY = "toStructurePere";
	public static final String TO_STRUCTURES_FILLES_KEY = "toStructuresFilles";

  private static Logger LOG = Logger.getLogger(_VGroupePersonne.class);

  public VGroupePersonne localInstanceIn(EOEditingContext editingContext) {
    VGroupePersonne localInstance = (VGroupePersonne)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cStructure() {
    return (String) storedValueForKey("cStructure");
  }

  public void setCStructure(String value) {
    if (_VGroupePersonne.LOG.isDebugEnabled()) {
    	_VGroupePersonne.LOG.debug( "updating cStructure from " + cStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "cStructure");
  }

  public String cStructurePere() {
    return (String) storedValueForKey("cStructurePere");
  }

  public void setCStructurePere(String value) {
    if (_VGroupePersonne.LOG.isDebugEnabled()) {
    	_VGroupePersonne.LOG.debug( "updating cStructurePere from " + cStructurePere() + " to " + value);
    }
    takeStoredValueForKey(value, "cStructurePere");
  }

  public String llStructure() {
    return (String) storedValueForKey("llStructure");
  }

  public void setLlStructure(String value) {
    if (_VGroupePersonne.LOG.isDebugEnabled()) {
    	_VGroupePersonne.LOG.debug( "updating llStructure from " + llStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "llStructure");
  }

  public Integer persId() {
    return (Integer) storedValueForKey("persId");
  }

  public void setPersId(Integer value) {
    if (_VGroupePersonne.LOG.isDebugEnabled()) {
    	_VGroupePersonne.LOG.debug( "updating persId from " + persId() + " to " + value);
    }
    takeStoredValueForKey(value, "persId");
  }

  public org.cocktail.superplaner.serveur.metier.Personne toPersonne() {
    return (org.cocktail.superplaner.serveur.metier.Personne)storedValueForKey("toPersonne");
  }

  public void setToPersonneRelationship(org.cocktail.superplaner.serveur.metier.Personne value) {
    if (_VGroupePersonne.LOG.isDebugEnabled()) {
      _VGroupePersonne.LOG.debug("updating toPersonne from " + toPersonne() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Personne oldValue = toPersonne();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "toPersonne");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "toPersonne");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.VGroupePersonne toStructurePere() {
    return (org.cocktail.superplaner.serveur.metier.VGroupePersonne)storedValueForKey("toStructurePere");
  }

  public void setToStructurePereRelationship(org.cocktail.superplaner.serveur.metier.VGroupePersonne value) {
    if (_VGroupePersonne.LOG.isDebugEnabled()) {
      _VGroupePersonne.LOG.debug("updating toStructurePere from " + toStructurePere() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.VGroupePersonne oldValue = toStructurePere();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "toStructurePere");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "toStructurePere");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.VGroupePersonne> toStructuresFilles() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.VGroupePersonne>)storedValueForKey("toStructuresFilles");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VGroupePersonne> toStructuresFilles(EOQualifier qualifier) {
    return toStructuresFilles(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VGroupePersonne> toStructuresFilles(EOQualifier qualifier, boolean fetch) {
    return toStructuresFilles(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VGroupePersonne> toStructuresFilles(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.VGroupePersonne> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.VGroupePersonne.TO_STRUCTURE_PERE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.VGroupePersonne.fetchVGroupePersonnes(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = toStructuresFilles();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.VGroupePersonne>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.VGroupePersonne>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToToStructuresFillesRelationship(org.cocktail.superplaner.serveur.metier.VGroupePersonne object) {
    if (_VGroupePersonne.LOG.isDebugEnabled()) {
      _VGroupePersonne.LOG.debug("adding " + object + " to toStructuresFilles relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "toStructuresFilles");
  }

  public void removeFromToStructuresFillesRelationship(org.cocktail.superplaner.serveur.metier.VGroupePersonne object) {
    if (_VGroupePersonne.LOG.isDebugEnabled()) {
      _VGroupePersonne.LOG.debug("removing " + object + " from toStructuresFilles relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "toStructuresFilles");
  }

  public org.cocktail.superplaner.serveur.metier.VGroupePersonne createToStructuresFillesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("VGroupePersonne");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "toStructuresFilles");
    return (org.cocktail.superplaner.serveur.metier.VGroupePersonne) eo;
  }

  public void deleteToStructuresFillesRelationship(org.cocktail.superplaner.serveur.metier.VGroupePersonne object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "toStructuresFilles");
    editingContext().deleteObject(object);
  }

  public void deleteAllToStructuresFillesRelationships() {
    Enumeration objects = toStructuresFilles().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteToStructuresFillesRelationship((org.cocktail.superplaner.serveur.metier.VGroupePersonne)objects.nextElement());
    }
  }


  public static VGroupePersonne createVGroupePersonne(EOEditingContext editingContext, String cStructure
, Integer persId
) {
    VGroupePersonne eo = (VGroupePersonne) EOUtilities.createAndInsertInstance(editingContext, _VGroupePersonne.ENTITY_NAME);    
		eo.setCStructure(cStructure);
		eo.setPersId(persId);
    return eo;
  }

  public static NSArray<VGroupePersonne> fetchAllVGroupePersonnes(EOEditingContext editingContext) {
    return _VGroupePersonne.fetchAllVGroupePersonnes(editingContext, null);
  }

  public static NSArray<VGroupePersonne> fetchAllVGroupePersonnes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VGroupePersonne.fetchVGroupePersonnes(editingContext, null, sortOrderings);
  }

  public static NSArray<VGroupePersonne> fetchVGroupePersonnes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VGroupePersonne.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VGroupePersonne> eoObjects = (NSArray<VGroupePersonne>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VGroupePersonne fetchVGroupePersonne(EOEditingContext editingContext, String keyName, Object value) {
    return _VGroupePersonne.fetchVGroupePersonne(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VGroupePersonne fetchVGroupePersonne(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VGroupePersonne> eoObjects = _VGroupePersonne.fetchVGroupePersonnes(editingContext, qualifier, null);
    VGroupePersonne eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VGroupePersonne)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VGroupePersonne that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VGroupePersonne fetchRequiredVGroupePersonne(EOEditingContext editingContext, String keyName, Object value) {
    return _VGroupePersonne.fetchRequiredVGroupePersonne(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VGroupePersonne fetchRequiredVGroupePersonne(EOEditingContext editingContext, EOQualifier qualifier) {
    VGroupePersonne eoObject = _VGroupePersonne.fetchVGroupePersonne(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VGroupePersonne that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VGroupePersonne localInstanceIn(EOEditingContext editingContext, VGroupePersonne eo) {
    VGroupePersonne localInstance = (eo == null) ? null : (VGroupePersonne)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
