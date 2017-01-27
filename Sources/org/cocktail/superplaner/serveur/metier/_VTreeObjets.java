// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VTreeObjets.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VTreeObjets extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VTreeObjets";

	// Attributes
	public static final String C_STRUCTURE_KEY = "cStructure";
	public static final String C_STRUCTURE_PERE_KEY = "cStructurePere";
	public static final String LL_STRUCTURE_KEY = "llStructure";
	public static final String PERS_ID_KEY = "persId";

	// Relationships
	public static final String TO_OBJET_FILS_KEY = "toObjetFils";
	public static final String TO_OBJET_PERE_KEY = "toObjetPere";
	public static final String TO_PERSONNE_KEY = "toPersonne";

  private static Logger LOG = Logger.getLogger(_VTreeObjets.class);

  public VTreeObjets localInstanceIn(EOEditingContext editingContext) {
    VTreeObjets localInstance = (VTreeObjets)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cStructure() {
    return (String) storedValueForKey("cStructure");
  }

  public void setCStructure(String value) {
    if (_VTreeObjets.LOG.isDebugEnabled()) {
    	_VTreeObjets.LOG.debug( "updating cStructure from " + cStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "cStructure");
  }

  public String cStructurePere() {
    return (String) storedValueForKey("cStructurePere");
  }

  public void setCStructurePere(String value) {
    if (_VTreeObjets.LOG.isDebugEnabled()) {
    	_VTreeObjets.LOG.debug( "updating cStructurePere from " + cStructurePere() + " to " + value);
    }
    takeStoredValueForKey(value, "cStructurePere");
  }

  public String llStructure() {
    return (String) storedValueForKey("llStructure");
  }

  public void setLlStructure(String value) {
    if (_VTreeObjets.LOG.isDebugEnabled()) {
    	_VTreeObjets.LOG.debug( "updating llStructure from " + llStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "llStructure");
  }

  public Integer persId() {
    return (Integer) storedValueForKey("persId");
  }

  public void setPersId(Integer value) {
    if (_VTreeObjets.LOG.isDebugEnabled()) {
    	_VTreeObjets.LOG.debug( "updating persId from " + persId() + " to " + value);
    }
    takeStoredValueForKey(value, "persId");
  }

  public org.cocktail.superplaner.serveur.metier.VTreeObjets toObjetPere() {
    return (org.cocktail.superplaner.serveur.metier.VTreeObjets)storedValueForKey("toObjetPere");
  }

  public void setToObjetPereRelationship(org.cocktail.superplaner.serveur.metier.VTreeObjets value) {
    if (_VTreeObjets.LOG.isDebugEnabled()) {
      _VTreeObjets.LOG.debug("updating toObjetPere from " + toObjetPere() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.VTreeObjets oldValue = toObjetPere();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "toObjetPere");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "toObjetPere");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.Personne toPersonne() {
    return (org.cocktail.superplaner.serveur.metier.Personne)storedValueForKey("toPersonne");
  }

  public void setToPersonneRelationship(org.cocktail.superplaner.serveur.metier.Personne value) {
    if (_VTreeObjets.LOG.isDebugEnabled()) {
      _VTreeObjets.LOG.debug("updating toPersonne from " + toPersonne() + " to " + value);
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
  
  public NSArray<org.cocktail.superplaner.serveur.metier.VTreeObjets> toObjetFils() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.VTreeObjets>)storedValueForKey("toObjetFils");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VTreeObjets> toObjetFils(EOQualifier qualifier) {
    return toObjetFils(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VTreeObjets> toObjetFils(EOQualifier qualifier, boolean fetch) {
    return toObjetFils(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VTreeObjets> toObjetFils(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.VTreeObjets> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.VTreeObjets.TO_OBJET_PERE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.VTreeObjets.fetchVTreeObjetses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = toObjetFils();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.VTreeObjets>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.VTreeObjets>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToToObjetFilsRelationship(org.cocktail.superplaner.serveur.metier.VTreeObjets object) {
    if (_VTreeObjets.LOG.isDebugEnabled()) {
      _VTreeObjets.LOG.debug("adding " + object + " to toObjetFils relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "toObjetFils");
  }

  public void removeFromToObjetFilsRelationship(org.cocktail.superplaner.serveur.metier.VTreeObjets object) {
    if (_VTreeObjets.LOG.isDebugEnabled()) {
      _VTreeObjets.LOG.debug("removing " + object + " from toObjetFils relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "toObjetFils");
  }

  public org.cocktail.superplaner.serveur.metier.VTreeObjets createToObjetFilsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("VTreeObjets");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "toObjetFils");
    return (org.cocktail.superplaner.serveur.metier.VTreeObjets) eo;
  }

  public void deleteToObjetFilsRelationship(org.cocktail.superplaner.serveur.metier.VTreeObjets object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "toObjetFils");
    editingContext().deleteObject(object);
  }

  public void deleteAllToObjetFilsRelationships() {
    Enumeration objects = toObjetFils().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteToObjetFilsRelationship((org.cocktail.superplaner.serveur.metier.VTreeObjets)objects.nextElement());
    }
  }


  public static VTreeObjets createVTreeObjets(EOEditingContext editingContext, String cStructure
, Integer persId
) {
    VTreeObjets eo = (VTreeObjets) EOUtilities.createAndInsertInstance(editingContext, _VTreeObjets.ENTITY_NAME);    
		eo.setCStructure(cStructure);
		eo.setPersId(persId);
    return eo;
  }

  public static NSArray<VTreeObjets> fetchAllVTreeObjetses(EOEditingContext editingContext) {
    return _VTreeObjets.fetchAllVTreeObjetses(editingContext, null);
  }

  public static NSArray<VTreeObjets> fetchAllVTreeObjetses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VTreeObjets.fetchVTreeObjetses(editingContext, null, sortOrderings);
  }

  public static NSArray<VTreeObjets> fetchVTreeObjetses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VTreeObjets.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VTreeObjets> eoObjects = (NSArray<VTreeObjets>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VTreeObjets fetchVTreeObjets(EOEditingContext editingContext, String keyName, Object value) {
    return _VTreeObjets.fetchVTreeObjets(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VTreeObjets fetchVTreeObjets(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VTreeObjets> eoObjects = _VTreeObjets.fetchVTreeObjetses(editingContext, qualifier, null);
    VTreeObjets eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VTreeObjets)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VTreeObjets that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VTreeObjets fetchRequiredVTreeObjets(EOEditingContext editingContext, String keyName, Object value) {
    return _VTreeObjets.fetchRequiredVTreeObjets(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VTreeObjets fetchRequiredVTreeObjets(EOEditingContext editingContext, EOQualifier qualifier) {
    VTreeObjets eoObject = _VTreeObjets.fetchVTreeObjets(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VTreeObjets that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VTreeObjets localInstanceIn(EOEditingContext editingContext, VTreeObjets eo) {
    VTreeObjets localInstance = (eo == null) ? null : (VTreeObjets)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
