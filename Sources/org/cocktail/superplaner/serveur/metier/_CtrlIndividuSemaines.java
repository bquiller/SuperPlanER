// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to CtrlIndividuSemaines.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _CtrlIndividuSemaines extends  EOGenericRecord {
	public static final String ENTITY_NAME = "CtrlIndividuSemaines";

	// Attributes
	public static final String CIS_DATE_KEY = "cisDate";
	public static final String CIS_NO_SEMAINE_KEY = "cisNoSemaine";

	// Relationships
	public static final String CTRL_INDIVIDU_JOURSES_KEY = "ctrlIndividuJourses";
	public static final String FORMATION_ANNEE_KEY = "formationAnnee";
	public static final String INDIVIDU_ULR_KEY = "individuUlr";

  private static Logger LOG = Logger.getLogger(_CtrlIndividuSemaines.class);

  public CtrlIndividuSemaines localInstanceIn(EOEditingContext editingContext) {
    CtrlIndividuSemaines localInstance = (CtrlIndividuSemaines)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp cisDate() {
    return (NSTimestamp) storedValueForKey("cisDate");
  }

  public void setCisDate(NSTimestamp value) {
    if (_CtrlIndividuSemaines.LOG.isDebugEnabled()) {
    	_CtrlIndividuSemaines.LOG.debug( "updating cisDate from " + cisDate() + " to " + value);
    }
    takeStoredValueForKey(value, "cisDate");
  }

  public Integer cisNoSemaine() {
    return (Integer) storedValueForKey("cisNoSemaine");
  }

  public void setCisNoSemaine(Integer value) {
    if (_CtrlIndividuSemaines.LOG.isDebugEnabled()) {
    	_CtrlIndividuSemaines.LOG.debug( "updating cisNoSemaine from " + cisNoSemaine() + " to " + value);
    }
    takeStoredValueForKey(value, "cisNoSemaine");
  }

  public org.cocktail.superplaner.serveur.metier.FormationAnnee formationAnnee() {
    return (org.cocktail.superplaner.serveur.metier.FormationAnnee)storedValueForKey("formationAnnee");
  }

  public void setFormationAnneeRelationship(org.cocktail.superplaner.serveur.metier.FormationAnnee value) {
    if (_CtrlIndividuSemaines.LOG.isDebugEnabled()) {
      _CtrlIndividuSemaines.LOG.debug("updating formationAnnee from " + formationAnnee() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationAnnee oldValue = formationAnnee();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "formationAnnee");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "formationAnnee");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_CtrlIndividuSemaines.LOG.isDebugEnabled()) {
      _CtrlIndividuSemaines.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individuUlr();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individuUlr");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individuUlr");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuJours> ctrlIndividuJourses() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuJours>)storedValueForKey("ctrlIndividuJourses");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuJours> ctrlIndividuJourses(EOQualifier qualifier) {
    return ctrlIndividuJourses(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuJours> ctrlIndividuJourses(EOQualifier qualifier, boolean fetch) {
    return ctrlIndividuJourses(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuJours> ctrlIndividuJourses(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuJours> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.CtrlIndividuJours.CTRL_INDIVIDU_SEMAINES_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.CtrlIndividuJours.fetchCtrlIndividuJourses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = ctrlIndividuJourses();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuJours>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.CtrlIndividuJours>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToCtrlIndividuJoursesRelationship(org.cocktail.superplaner.serveur.metier.CtrlIndividuJours object) {
    if (_CtrlIndividuSemaines.LOG.isDebugEnabled()) {
      _CtrlIndividuSemaines.LOG.debug("adding " + object + " to ctrlIndividuJourses relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "ctrlIndividuJourses");
  }

  public void removeFromCtrlIndividuJoursesRelationship(org.cocktail.superplaner.serveur.metier.CtrlIndividuJours object) {
    if (_CtrlIndividuSemaines.LOG.isDebugEnabled()) {
      _CtrlIndividuSemaines.LOG.debug("removing " + object + " from ctrlIndividuJourses relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "ctrlIndividuJourses");
  }

  public org.cocktail.superplaner.serveur.metier.CtrlIndividuJours createCtrlIndividuJoursesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("CtrlIndividuJours");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "ctrlIndividuJourses");
    return (org.cocktail.superplaner.serveur.metier.CtrlIndividuJours) eo;
  }

  public void deleteCtrlIndividuJoursesRelationship(org.cocktail.superplaner.serveur.metier.CtrlIndividuJours object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "ctrlIndividuJourses");
    editingContext().deleteObject(object);
  }

  public void deleteAllCtrlIndividuJoursesRelationships() {
    Enumeration objects = ctrlIndividuJourses().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteCtrlIndividuJoursesRelationship((org.cocktail.superplaner.serveur.metier.CtrlIndividuJours)objects.nextElement());
    }
  }


  public static CtrlIndividuSemaines createCtrlIndividuSemaines(EOEditingContext editingContext, NSTimestamp cisDate
, Integer cisNoSemaine
, org.cocktail.superplaner.serveur.metier.FormationAnnee formationAnnee, org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr) {
    CtrlIndividuSemaines eo = (CtrlIndividuSemaines) EOUtilities.createAndInsertInstance(editingContext, _CtrlIndividuSemaines.ENTITY_NAME);    
		eo.setCisDate(cisDate);
		eo.setCisNoSemaine(cisNoSemaine);
    eo.setFormationAnneeRelationship(formationAnnee);
    eo.setIndividuUlrRelationship(individuUlr);
    return eo;
  }

  public static NSArray<CtrlIndividuSemaines> fetchAllCtrlIndividuSemaineses(EOEditingContext editingContext) {
    return _CtrlIndividuSemaines.fetchAllCtrlIndividuSemaineses(editingContext, null);
  }

  public static NSArray<CtrlIndividuSemaines> fetchAllCtrlIndividuSemaineses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _CtrlIndividuSemaines.fetchCtrlIndividuSemaineses(editingContext, null, sortOrderings);
  }

  public static NSArray<CtrlIndividuSemaines> fetchCtrlIndividuSemaineses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_CtrlIndividuSemaines.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<CtrlIndividuSemaines> eoObjects = (NSArray<CtrlIndividuSemaines>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static CtrlIndividuSemaines fetchCtrlIndividuSemaines(EOEditingContext editingContext, String keyName, Object value) {
    return _CtrlIndividuSemaines.fetchCtrlIndividuSemaines(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static CtrlIndividuSemaines fetchCtrlIndividuSemaines(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<CtrlIndividuSemaines> eoObjects = _CtrlIndividuSemaines.fetchCtrlIndividuSemaineses(editingContext, qualifier, null);
    CtrlIndividuSemaines eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (CtrlIndividuSemaines)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one CtrlIndividuSemaines that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static CtrlIndividuSemaines fetchRequiredCtrlIndividuSemaines(EOEditingContext editingContext, String keyName, Object value) {
    return _CtrlIndividuSemaines.fetchRequiredCtrlIndividuSemaines(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static CtrlIndividuSemaines fetchRequiredCtrlIndividuSemaines(EOEditingContext editingContext, EOQualifier qualifier) {
    CtrlIndividuSemaines eoObject = _CtrlIndividuSemaines.fetchCtrlIndividuSemaines(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no CtrlIndividuSemaines that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static CtrlIndividuSemaines localInstanceIn(EOEditingContext editingContext, CtrlIndividuSemaines eo) {
    CtrlIndividuSemaines localInstance = (eo == null) ? null : (CtrlIndividuSemaines)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
