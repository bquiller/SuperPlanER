// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ComposantEdt.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ComposantEdt extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ComposantEdt";

	// Attributes
	public static final String COMP_LIBELLE_KEY = "compLibelle";
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String TLOC_CODE_KEY = "tlocCode";

	// Relationships
	public static final String ELEMENT_EDTS_KEY = "elementEdts";
	public static final String INDIVIDU_KEY = "individu";
	public static final String SEMESTRE_KEY = "semestre";
	public static final String TYPE_LOCATION_KEY = "typeLocation";

  private static Logger LOG = Logger.getLogger(_ComposantEdt.class);

  public ComposantEdt localInstanceIn(EOEditingContext editingContext) {
    ComposantEdt localInstance = (ComposantEdt)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String compLibelle() {
    return (String) storedValueForKey("compLibelle");
  }

  public void setCompLibelle(String value) {
    if (_ComposantEdt.LOG.isDebugEnabled()) {
    	_ComposantEdt.LOG.debug( "updating compLibelle from " + compLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "compLibelle");
  }

  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey("dCreation");
  }

  public void setDCreation(NSTimestamp value) {
    if (_ComposantEdt.LOG.isDebugEnabled()) {
    	_ComposantEdt.LOG.debug( "updating dCreation from " + dCreation() + " to " + value);
    }
    takeStoredValueForKey(value, "dCreation");
  }

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey("dModification");
  }

  public void setDModification(NSTimestamp value) {
    if (_ComposantEdt.LOG.isDebugEnabled()) {
    	_ComposantEdt.LOG.debug( "updating dModification from " + dModification() + " to " + value);
    }
    takeStoredValueForKey(value, "dModification");
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_ComposantEdt.LOG.isDebugEnabled()) {
    	_ComposantEdt.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public String tlocCode() {
    return (String) storedValueForKey("tlocCode");
  }

  public void setTlocCode(String value) {
    if (_ComposantEdt.LOG.isDebugEnabled()) {
    	_ComposantEdt.LOG.debug( "updating tlocCode from " + tlocCode() + " to " + value);
    }
    takeStoredValueForKey(value, "tlocCode");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individu() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individu");
  }

  public void setIndividuRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_ComposantEdt.LOG.isDebugEnabled()) {
      _ComposantEdt.LOG.debug("updating individu from " + individu() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individu();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individu");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individu");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteSemestre semestre() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteSemestre)storedValueForKey("semestre");
  }

  public void setSemestreRelationship(org.cocktail.superplaner.serveur.metier.MaquetteSemestre value) {
    if (_ComposantEdt.LOG.isDebugEnabled()) {
      _ComposantEdt.LOG.debug("updating semestre from " + semestre() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.TypeLocation typeLocation() {
    return (org.cocktail.superplaner.serveur.metier.TypeLocation)storedValueForKey("typeLocation");
  }

  public void setTypeLocationRelationship(org.cocktail.superplaner.serveur.metier.TypeLocation value) {
    if (_ComposantEdt.LOG.isDebugEnabled()) {
      _ComposantEdt.LOG.debug("updating typeLocation from " + typeLocation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.TypeLocation oldValue = typeLocation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "typeLocation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "typeLocation");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.ElementEdt> elementEdts() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ElementEdt>)storedValueForKey("elementEdts");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ElementEdt> elementEdts(EOQualifier qualifier) {
    return elementEdts(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ElementEdt> elementEdts(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.ElementEdt> results;
      results = elementEdts();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ElementEdt>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ElementEdt>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToElementEdtsRelationship(org.cocktail.superplaner.serveur.metier.ElementEdt object) {
    if (_ComposantEdt.LOG.isDebugEnabled()) {
      _ComposantEdt.LOG.debug("adding " + object + " to elementEdts relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "elementEdts");
  }

  public void removeFromElementEdtsRelationship(org.cocktail.superplaner.serveur.metier.ElementEdt object) {
    if (_ComposantEdt.LOG.isDebugEnabled()) {
      _ComposantEdt.LOG.debug("removing " + object + " from elementEdts relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "elementEdts");
  }

  public org.cocktail.superplaner.serveur.metier.ElementEdt createElementEdtsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ElementEdt");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "elementEdts");
    return (org.cocktail.superplaner.serveur.metier.ElementEdt) eo;
  }

  public void deleteElementEdtsRelationship(org.cocktail.superplaner.serveur.metier.ElementEdt object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "elementEdts");
    editingContext().deleteObject(object);
  }

  public void deleteAllElementEdtsRelationships() {
    Enumeration objects = elementEdts().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteElementEdtsRelationship((org.cocktail.superplaner.serveur.metier.ElementEdt)objects.nextElement());
    }
  }


  public static ComposantEdt createComposantEdt(EOEditingContext editingContext, NSTimestamp dCreation
, NSTimestamp dModification
, Integer fannKey
, String tlocCode
) {
    ComposantEdt eo = (ComposantEdt) EOUtilities.createAndInsertInstance(editingContext, _ComposantEdt.ENTITY_NAME);    
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
		eo.setFannKey(fannKey);
		eo.setTlocCode(tlocCode);
    return eo;
  }

  public static NSArray<ComposantEdt> fetchAllComposantEdts(EOEditingContext editingContext) {
    return _ComposantEdt.fetchAllComposantEdts(editingContext, null);
  }

  public static NSArray<ComposantEdt> fetchAllComposantEdts(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ComposantEdt.fetchComposantEdts(editingContext, null, sortOrderings);
  }

  public static NSArray<ComposantEdt> fetchComposantEdts(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ComposantEdt.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ComposantEdt> eoObjects = (NSArray<ComposantEdt>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ComposantEdt fetchComposantEdt(EOEditingContext editingContext, String keyName, Object value) {
    return _ComposantEdt.fetchComposantEdt(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ComposantEdt fetchComposantEdt(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ComposantEdt> eoObjects = _ComposantEdt.fetchComposantEdts(editingContext, qualifier, null);
    ComposantEdt eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ComposantEdt)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ComposantEdt that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ComposantEdt fetchRequiredComposantEdt(EOEditingContext editingContext, String keyName, Object value) {
    return _ComposantEdt.fetchRequiredComposantEdt(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ComposantEdt fetchRequiredComposantEdt(EOEditingContext editingContext, EOQualifier qualifier) {
    ComposantEdt eoObject = _ComposantEdt.fetchComposantEdt(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ComposantEdt that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ComposantEdt localInstanceIn(EOEditingContext editingContext, ComposantEdt eo) {
    ComposantEdt localInstance = (eo == null) ? null : (ComposantEdt)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
