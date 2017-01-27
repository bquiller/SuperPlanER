// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to CtrlIndividuJours.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _CtrlIndividuJours extends  EOGenericRecord {
	public static final String ENTITY_NAME = "CtrlIndividuJours";

	// Attributes
	public static final String CIJ_DATE_KEY = "cijDate";
	public static final String CIJ_NO_JOUR_KEY = "cijNoJour";

	// Relationships
	public static final String CTRL_INDIVIDU_HEURESES_KEY = "ctrlIndividuHeureses";
	public static final String CTRL_INDIVIDU_SEMAINES_KEY = "ctrlIndividuSemaines";

  private static Logger LOG = Logger.getLogger(_CtrlIndividuJours.class);

  public CtrlIndividuJours localInstanceIn(EOEditingContext editingContext) {
    CtrlIndividuJours localInstance = (CtrlIndividuJours)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp cijDate() {
    return (NSTimestamp) storedValueForKey("cijDate");
  }

  public void setCijDate(NSTimestamp value) {
    if (_CtrlIndividuJours.LOG.isDebugEnabled()) {
    	_CtrlIndividuJours.LOG.debug( "updating cijDate from " + cijDate() + " to " + value);
    }
    takeStoredValueForKey(value, "cijDate");
  }

  public Integer cijNoJour() {
    return (Integer) storedValueForKey("cijNoJour");
  }

  public void setCijNoJour(Integer value) {
    if (_CtrlIndividuJours.LOG.isDebugEnabled()) {
    	_CtrlIndividuJours.LOG.debug( "updating cijNoJour from " + cijNoJour() + " to " + value);
    }
    takeStoredValueForKey(value, "cijNoJour");
  }

  public org.cocktail.superplaner.serveur.metier.CtrlIndividuSemaines ctrlIndividuSemaines() {
    return (org.cocktail.superplaner.serveur.metier.CtrlIndividuSemaines)storedValueForKey("ctrlIndividuSemaines");
  }

  public void setCtrlIndividuSemainesRelationship(org.cocktail.superplaner.serveur.metier.CtrlIndividuSemaines value) {
    if (_CtrlIndividuJours.LOG.isDebugEnabled()) {
      _CtrlIndividuJours.LOG.debug("updating ctrlIndividuSemaines from " + ctrlIndividuSemaines() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.CtrlIndividuSemaines oldValue = ctrlIndividuSemaines();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "ctrlIndividuSemaines");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "ctrlIndividuSemaines");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures> ctrlIndividuHeureses() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures>)storedValueForKey("ctrlIndividuHeureses");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures> ctrlIndividuHeureses(EOQualifier qualifier) {
    return ctrlIndividuHeureses(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures> ctrlIndividuHeureses(EOQualifier qualifier, boolean fetch) {
    return ctrlIndividuHeureses(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures> ctrlIndividuHeureses(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures.CTRL_INDIVIDU_JOURS_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures.fetchCtrlIndividuHeureses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = ctrlIndividuHeureses();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToCtrlIndividuHeuresesRelationship(org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures object) {
    if (_CtrlIndividuJours.LOG.isDebugEnabled()) {
      _CtrlIndividuJours.LOG.debug("adding " + object + " to ctrlIndividuHeureses relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "ctrlIndividuHeureses");
  }

  public void removeFromCtrlIndividuHeuresesRelationship(org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures object) {
    if (_CtrlIndividuJours.LOG.isDebugEnabled()) {
      _CtrlIndividuJours.LOG.debug("removing " + object + " from ctrlIndividuHeureses relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "ctrlIndividuHeureses");
  }

  public org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures createCtrlIndividuHeuresesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("CtrlIndividuHeures");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "ctrlIndividuHeureses");
    return (org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures) eo;
  }

  public void deleteCtrlIndividuHeuresesRelationship(org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "ctrlIndividuHeureses");
    editingContext().deleteObject(object);
  }

  public void deleteAllCtrlIndividuHeuresesRelationships() {
    Enumeration objects = ctrlIndividuHeureses().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteCtrlIndividuHeuresesRelationship((org.cocktail.superplaner.serveur.metier.CtrlIndividuHeures)objects.nextElement());
    }
  }


  public static CtrlIndividuJours createCtrlIndividuJours(EOEditingContext editingContext, NSTimestamp cijDate
, Integer cijNoJour
, org.cocktail.superplaner.serveur.metier.CtrlIndividuSemaines ctrlIndividuSemaines) {
    CtrlIndividuJours eo = (CtrlIndividuJours) EOUtilities.createAndInsertInstance(editingContext, _CtrlIndividuJours.ENTITY_NAME);    
		eo.setCijDate(cijDate);
		eo.setCijNoJour(cijNoJour);
    eo.setCtrlIndividuSemainesRelationship(ctrlIndividuSemaines);
    return eo;
  }

  public static NSArray<CtrlIndividuJours> fetchAllCtrlIndividuJourses(EOEditingContext editingContext) {
    return _CtrlIndividuJours.fetchAllCtrlIndividuJourses(editingContext, null);
  }

  public static NSArray<CtrlIndividuJours> fetchAllCtrlIndividuJourses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _CtrlIndividuJours.fetchCtrlIndividuJourses(editingContext, null, sortOrderings);
  }

  public static NSArray<CtrlIndividuJours> fetchCtrlIndividuJourses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_CtrlIndividuJours.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<CtrlIndividuJours> eoObjects = (NSArray<CtrlIndividuJours>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static CtrlIndividuJours fetchCtrlIndividuJours(EOEditingContext editingContext, String keyName, Object value) {
    return _CtrlIndividuJours.fetchCtrlIndividuJours(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static CtrlIndividuJours fetchCtrlIndividuJours(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<CtrlIndividuJours> eoObjects = _CtrlIndividuJours.fetchCtrlIndividuJourses(editingContext, qualifier, null);
    CtrlIndividuJours eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (CtrlIndividuJours)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one CtrlIndividuJours that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static CtrlIndividuJours fetchRequiredCtrlIndividuJours(EOEditingContext editingContext, String keyName, Object value) {
    return _CtrlIndividuJours.fetchRequiredCtrlIndividuJours(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static CtrlIndividuJours fetchRequiredCtrlIndividuJours(EOEditingContext editingContext, EOQualifier qualifier) {
    CtrlIndividuJours eoObject = _CtrlIndividuJours.fetchCtrlIndividuJours(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no CtrlIndividuJours that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static CtrlIndividuJours localInstanceIn(EOEditingContext editingContext, CtrlIndividuJours eo) {
    CtrlIndividuJours localInstance = (eo == null) ? null : (CtrlIndividuJours)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
