// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VTreeSalles.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VTreeSalles extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VTreeSalles";

	// Attributes
	public static final String C_STRUCTURE_KEY = "cStructure";
	public static final String C_STRUCTURE_PERE_KEY = "cStructurePere";
	public static final String LL_STRUCTURE_KEY = "llStructure";
	public static final String NIVEAU_KEY = "niveau";
	public static final String PERS_ID_KEY = "persId";

	// Relationships
	public static final String TO_PERSONNE_KEY = "toPersonne";
	public static final String TO_SALLE_FILS_KEY = "toSalleFils";
	public static final String TO_SALLE_PERE_KEY = "toSallePere";

  private static Logger LOG = Logger.getLogger(_VTreeSalles.class);

  public VTreeSalles localInstanceIn(EOEditingContext editingContext) {
    VTreeSalles localInstance = (VTreeSalles)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cStructure() {
    return (String) storedValueForKey("cStructure");
  }

  public void setCStructure(String value) {
    if (_VTreeSalles.LOG.isDebugEnabled()) {
    	_VTreeSalles.LOG.debug( "updating cStructure from " + cStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "cStructure");
  }

  public String cStructurePere() {
    return (String) storedValueForKey("cStructurePere");
  }

  public void setCStructurePere(String value) {
    if (_VTreeSalles.LOG.isDebugEnabled()) {
    	_VTreeSalles.LOG.debug( "updating cStructurePere from " + cStructurePere() + " to " + value);
    }
    takeStoredValueForKey(value, "cStructurePere");
  }

  public String llStructure() {
    return (String) storedValueForKey("llStructure");
  }

  public void setLlStructure(String value) {
    if (_VTreeSalles.LOG.isDebugEnabled()) {
    	_VTreeSalles.LOG.debug( "updating llStructure from " + llStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "llStructure");
  }

  public Integer niveau() {
    return (Integer) storedValueForKey("niveau");
  }

  public void setNiveau(Integer value) {
    if (_VTreeSalles.LOG.isDebugEnabled()) {
    	_VTreeSalles.LOG.debug( "updating niveau from " + niveau() + " to " + value);
    }
    takeStoredValueForKey(value, "niveau");
  }

  public Integer persId() {
    return (Integer) storedValueForKey("persId");
  }

  public void setPersId(Integer value) {
    if (_VTreeSalles.LOG.isDebugEnabled()) {
    	_VTreeSalles.LOG.debug( "updating persId from " + persId() + " to " + value);
    }
    takeStoredValueForKey(value, "persId");
  }

  public org.cocktail.superplaner.serveur.metier.Personne toPersonne() {
    return (org.cocktail.superplaner.serveur.metier.Personne)storedValueForKey("toPersonne");
  }

  public void setToPersonneRelationship(org.cocktail.superplaner.serveur.metier.Personne value) {
    if (_VTreeSalles.LOG.isDebugEnabled()) {
      _VTreeSalles.LOG.debug("updating toPersonne from " + toPersonne() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.VTreeSalles toSallePere() {
    return (org.cocktail.superplaner.serveur.metier.VTreeSalles)storedValueForKey("toSallePere");
  }

  public void setToSallePereRelationship(org.cocktail.superplaner.serveur.metier.VTreeSalles value) {
    if (_VTreeSalles.LOG.isDebugEnabled()) {
      _VTreeSalles.LOG.debug("updating toSallePere from " + toSallePere() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.VTreeSalles oldValue = toSallePere();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "toSallePere");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "toSallePere");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.VTreeSalles> toSalleFils() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.VTreeSalles>)storedValueForKey("toSalleFils");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VTreeSalles> toSalleFils(EOQualifier qualifier) {
    return toSalleFils(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VTreeSalles> toSalleFils(EOQualifier qualifier, boolean fetch) {
    return toSalleFils(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VTreeSalles> toSalleFils(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.VTreeSalles> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.VTreeSalles.TO_SALLE_PERE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.VTreeSalles.fetchVTreeSalleses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = toSalleFils();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.VTreeSalles>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.VTreeSalles>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToToSalleFilsRelationship(org.cocktail.superplaner.serveur.metier.VTreeSalles object) {
    if (_VTreeSalles.LOG.isDebugEnabled()) {
      _VTreeSalles.LOG.debug("adding " + object + " to toSalleFils relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "toSalleFils");
  }

  public void removeFromToSalleFilsRelationship(org.cocktail.superplaner.serveur.metier.VTreeSalles object) {
    if (_VTreeSalles.LOG.isDebugEnabled()) {
      _VTreeSalles.LOG.debug("removing " + object + " from toSalleFils relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "toSalleFils");
  }

  public org.cocktail.superplaner.serveur.metier.VTreeSalles createToSalleFilsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("VTreeSalles");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "toSalleFils");
    return (org.cocktail.superplaner.serveur.metier.VTreeSalles) eo;
  }

  public void deleteToSalleFilsRelationship(org.cocktail.superplaner.serveur.metier.VTreeSalles object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "toSalleFils");
    editingContext().deleteObject(object);
  }

  public void deleteAllToSalleFilsRelationships() {
    Enumeration objects = toSalleFils().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteToSalleFilsRelationship((org.cocktail.superplaner.serveur.metier.VTreeSalles)objects.nextElement());
    }
  }


  public static VTreeSalles createVTreeSalles(EOEditingContext editingContext, String cStructure
, Integer niveau
, Integer persId
) {
    VTreeSalles eo = (VTreeSalles) EOUtilities.createAndInsertInstance(editingContext, _VTreeSalles.ENTITY_NAME);    
		eo.setCStructure(cStructure);
		eo.setNiveau(niveau);
		eo.setPersId(persId);
    return eo;
  }

  public static NSArray<VTreeSalles> fetchAllVTreeSalleses(EOEditingContext editingContext) {
    return _VTreeSalles.fetchAllVTreeSalleses(editingContext, null);
  }

  public static NSArray<VTreeSalles> fetchAllVTreeSalleses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VTreeSalles.fetchVTreeSalleses(editingContext, null, sortOrderings);
  }

  public static NSArray<VTreeSalles> fetchVTreeSalleses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VTreeSalles.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VTreeSalles> eoObjects = (NSArray<VTreeSalles>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VTreeSalles fetchVTreeSalles(EOEditingContext editingContext, String keyName, Object value) {
    return _VTreeSalles.fetchVTreeSalles(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VTreeSalles fetchVTreeSalles(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VTreeSalles> eoObjects = _VTreeSalles.fetchVTreeSalleses(editingContext, qualifier, null);
    VTreeSalles eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VTreeSalles)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VTreeSalles that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VTreeSalles fetchRequiredVTreeSalles(EOEditingContext editingContext, String keyName, Object value) {
    return _VTreeSalles.fetchRequiredVTreeSalles(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VTreeSalles fetchRequiredVTreeSalles(EOEditingContext editingContext, EOQualifier qualifier) {
    VTreeSalles eoObject = _VTreeSalles.fetchVTreeSalles(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VTreeSalles that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VTreeSalles localInstanceIn(EOEditingContext editingContext, VTreeSalles eo) {
    VTreeSalles localInstance = (eo == null) ? null : (VTreeSalles)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
