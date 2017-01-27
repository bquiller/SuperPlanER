// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to RepartStructure.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _RepartStructure extends  EOGenericRecord {
	public static final String ENTITY_NAME = "RepartStructure";

	// Attributes
	public static final String C_STRUCTURE_KEY = "cStructure";
	public static final String PERS_ID_KEY = "persId";

	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String STRUCTURE_ULR_KEY = "structureUlr";

  private static Logger LOG = Logger.getLogger(_RepartStructure.class);

  public RepartStructure localInstanceIn(EOEditingContext editingContext) {
    RepartStructure localInstance = (RepartStructure)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cStructure() {
    return (String) storedValueForKey("cStructure");
  }

  public void setCStructure(String value) {
    if (_RepartStructure.LOG.isDebugEnabled()) {
    	_RepartStructure.LOG.debug( "updating cStructure from " + cStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "cStructure");
  }

  public Integer persId() {
    return (Integer) storedValueForKey("persId");
  }

  public void setPersId(Integer value) {
    if (_RepartStructure.LOG.isDebugEnabled()) {
    	_RepartStructure.LOG.debug( "updating persId from " + persId() + " to " + value);
    }
    takeStoredValueForKey(value, "persId");
  }

  public org.cocktail.superplaner.serveur.metier.StructureUlr structureUlr() {
    return (org.cocktail.superplaner.serveur.metier.StructureUlr)storedValueForKey("structureUlr");
  }

  public void setStructureUlrRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr value) {
    if (_RepartStructure.LOG.isDebugEnabled()) {
      _RepartStructure.LOG.debug("updating structureUlr from " + structureUlr() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.StructureUlr oldValue = structureUlr();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "structureUlr");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "structureUlr");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.IndividuUlr> individuUlr() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.IndividuUlr>)storedValueForKey("individuUlr");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.IndividuUlr> individuUlr(EOQualifier qualifier) {
    return individuUlr(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.IndividuUlr> individuUlr(EOQualifier qualifier, boolean fetch) {
    return individuUlr(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.IndividuUlr> individuUlr(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.IndividuUlr> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.IndividuUlr.REPART_STRUCTURES_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.IndividuUlr.fetchIndividuUlrs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = individuUlr();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.IndividuUlr>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.IndividuUlr>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr object) {
    if (_RepartStructure.LOG.isDebugEnabled()) {
      _RepartStructure.LOG.debug("adding " + object + " to individuUlr relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "individuUlr");
  }

  public void removeFromIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr object) {
    if (_RepartStructure.LOG.isDebugEnabled()) {
      _RepartStructure.LOG.debug("removing " + object + " from individuUlr relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "individuUlr");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr createIndividuUlrRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("IndividuUlr");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "individuUlr");
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr) eo;
  }

  public void deleteIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "individuUlr");
    editingContext().deleteObject(object);
  }

  public void deleteAllIndividuUlrRelationships() {
    Enumeration objects = individuUlr().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteIndividuUlrRelationship((org.cocktail.superplaner.serveur.metier.IndividuUlr)objects.nextElement());
    }
  }


  public static RepartStructure createRepartStructure(EOEditingContext editingContext, String cStructure
, Integer persId
) {
    RepartStructure eo = (RepartStructure) EOUtilities.createAndInsertInstance(editingContext, _RepartStructure.ENTITY_NAME);    
		eo.setCStructure(cStructure);
		eo.setPersId(persId);
    return eo;
  }

  public static NSArray<RepartStructure> fetchAllRepartStructures(EOEditingContext editingContext) {
    return _RepartStructure.fetchAllRepartStructures(editingContext, null);
  }

  public static NSArray<RepartStructure> fetchAllRepartStructures(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _RepartStructure.fetchRepartStructures(editingContext, null, sortOrderings);
  }

  public static NSArray<RepartStructure> fetchRepartStructures(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_RepartStructure.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<RepartStructure> eoObjects = (NSArray<RepartStructure>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static RepartStructure fetchRepartStructure(EOEditingContext editingContext, String keyName, Object value) {
    return _RepartStructure.fetchRepartStructure(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RepartStructure fetchRepartStructure(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<RepartStructure> eoObjects = _RepartStructure.fetchRepartStructures(editingContext, qualifier, null);
    RepartStructure eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (RepartStructure)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one RepartStructure that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RepartStructure fetchRequiredRepartStructure(EOEditingContext editingContext, String keyName, Object value) {
    return _RepartStructure.fetchRequiredRepartStructure(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RepartStructure fetchRequiredRepartStructure(EOEditingContext editingContext, EOQualifier qualifier) {
    RepartStructure eoObject = _RepartStructure.fetchRepartStructure(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no RepartStructure that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RepartStructure localInstanceIn(EOEditingContext editingContext, RepartStructure eo) {
    RepartStructure localInstance = (eo == null) ? null : (RepartStructure)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
