// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to FormationAnnee.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _FormationAnnee extends  EOGenericRecord {
	public static final String ENTITY_NAME = "FormationAnnee";

	// Attributes
	public static final String FANN_COURANTE_KEY = "fannCourante";
	public static final String FANN_DEBUT_KEY = "fannDebut";
	public static final String FANN_FIN_KEY = "fannFin";
	public static final String FANN_KEY_KEY = "fannKey";

	// Relationships
	public static final String RESA_COULEUR_EC_KEY = "resaCouleurEc";

  private static Logger LOG = Logger.getLogger(_FormationAnnee.class);

  public FormationAnnee localInstanceIn(EOEditingContext editingContext) {
    FormationAnnee localInstance = (FormationAnnee)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String fannCourante() {
    return (String) storedValueForKey("fannCourante");
  }

  public void setFannCourante(String value) {
    if (_FormationAnnee.LOG.isDebugEnabled()) {
    	_FormationAnnee.LOG.debug( "updating fannCourante from " + fannCourante() + " to " + value);
    }
    takeStoredValueForKey(value, "fannCourante");
  }

  public Integer fannDebut() {
    return (Integer) storedValueForKey("fannDebut");
  }

  public void setFannDebut(Integer value) {
    if (_FormationAnnee.LOG.isDebugEnabled()) {
    	_FormationAnnee.LOG.debug( "updating fannDebut from " + fannDebut() + " to " + value);
    }
    takeStoredValueForKey(value, "fannDebut");
  }

  public Integer fannFin() {
    return (Integer) storedValueForKey("fannFin");
  }

  public void setFannFin(Integer value) {
    if (_FormationAnnee.LOG.isDebugEnabled()) {
    	_FormationAnnee.LOG.debug( "updating fannFin from " + fannFin() + " to " + value);
    }
    takeStoredValueForKey(value, "fannFin");
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_FormationAnnee.LOG.isDebugEnabled()) {
    	_FormationAnnee.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc> resaCouleurEc() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc>)storedValueForKey("resaCouleurEc");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc> resaCouleurEc(EOQualifier qualifier) {
    return resaCouleurEc(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc> resaCouleurEc(EOQualifier qualifier, boolean fetch) {
    return resaCouleurEc(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc> resaCouleurEc(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ResaCouleurEc.FORMATION_ANNEE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ResaCouleurEc.fetchResaCouleurEcs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = resaCouleurEc();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToResaCouleurEcRelationship(org.cocktail.superplaner.serveur.metier.ResaCouleurEc object) {
    if (_FormationAnnee.LOG.isDebugEnabled()) {
      _FormationAnnee.LOG.debug("adding " + object + " to resaCouleurEc relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "resaCouleurEc");
  }

  public void removeFromResaCouleurEcRelationship(org.cocktail.superplaner.serveur.metier.ResaCouleurEc object) {
    if (_FormationAnnee.LOG.isDebugEnabled()) {
      _FormationAnnee.LOG.debug("removing " + object + " from resaCouleurEc relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaCouleurEc");
  }

  public org.cocktail.superplaner.serveur.metier.ResaCouleurEc createResaCouleurEcRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ResaCouleurEc");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "resaCouleurEc");
    return (org.cocktail.superplaner.serveur.metier.ResaCouleurEc) eo;
  }

  public void deleteResaCouleurEcRelationship(org.cocktail.superplaner.serveur.metier.ResaCouleurEc object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaCouleurEc");
    editingContext().deleteObject(object);
  }

  public void deleteAllResaCouleurEcRelationships() {
    Enumeration objects = resaCouleurEc().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteResaCouleurEcRelationship((org.cocktail.superplaner.serveur.metier.ResaCouleurEc)objects.nextElement());
    }
  }


  public static FormationAnnee createFormationAnnee(EOEditingContext editingContext, String fannCourante
, Integer fannDebut
, Integer fannFin
, Integer fannKey
) {
    FormationAnnee eo = (FormationAnnee) EOUtilities.createAndInsertInstance(editingContext, _FormationAnnee.ENTITY_NAME);    
		eo.setFannCourante(fannCourante);
		eo.setFannDebut(fannDebut);
		eo.setFannFin(fannFin);
		eo.setFannKey(fannKey);
    return eo;
  }

  public static NSArray<FormationAnnee> fetchAllFormationAnnees(EOEditingContext editingContext) {
    return _FormationAnnee.fetchAllFormationAnnees(editingContext, null);
  }

  public static NSArray<FormationAnnee> fetchAllFormationAnnees(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _FormationAnnee.fetchFormationAnnees(editingContext, null, sortOrderings);
  }

  public static NSArray<FormationAnnee> fetchFormationAnnees(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_FormationAnnee.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<FormationAnnee> eoObjects = (NSArray<FormationAnnee>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static FormationAnnee fetchFormationAnnee(EOEditingContext editingContext, String keyName, Object value) {
    return _FormationAnnee.fetchFormationAnnee(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static FormationAnnee fetchFormationAnnee(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<FormationAnnee> eoObjects = _FormationAnnee.fetchFormationAnnees(editingContext, qualifier, null);
    FormationAnnee eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (FormationAnnee)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one FormationAnnee that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static FormationAnnee fetchRequiredFormationAnnee(EOEditingContext editingContext, String keyName, Object value) {
    return _FormationAnnee.fetchRequiredFormationAnnee(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static FormationAnnee fetchRequiredFormationAnnee(EOEditingContext editingContext, EOQualifier qualifier) {
    FormationAnnee eoObject = _FormationAnnee.fetchFormationAnnee(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no FormationAnnee that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static FormationAnnee localInstanceIn(EOEditingContext editingContext, FormationAnnee eo) {
    FormationAnnee localInstance = (eo == null) ? null : (FormationAnnee)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
