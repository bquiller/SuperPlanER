// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to FormationHabilitation.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _FormationHabilitation extends  EOGenericRecord {
	public static final String ENTITY_NAME = "FormationHabilitation";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String FHAB_NIVEAU_KEY = "fhabNiveau";
	public static final String FHAB_OUVERT_KEY = "fhabOuvert";

	// Relationships
	public static final String DROIT_DIPLOMES_KEY = "droitDiplomes";
	public static final String FORMATION_ANNEE_KEY = "formationAnnee";
	public static final String FORMATION_SPECIALISATION_KEY = "formationSpecialisation";
	public static final String PREF_SCOL_KEY = "prefScol";
	public static final String VACANCES_SCOLAIRES_KEY = "vacancesScolaires";

  private static Logger LOG = Logger.getLogger(_FormationHabilitation.class);

  public FormationHabilitation localInstanceIn(EOEditingContext editingContext) {
    FormationHabilitation localInstance = (FormationHabilitation)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_FormationHabilitation.LOG.isDebugEnabled()) {
    	_FormationHabilitation.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public Integer fhabNiveau() {
    return (Integer) storedValueForKey("fhabNiveau");
  }

  public void setFhabNiveau(Integer value) {
    if (_FormationHabilitation.LOG.isDebugEnabled()) {
    	_FormationHabilitation.LOG.debug( "updating fhabNiveau from " + fhabNiveau() + " to " + value);
    }
    takeStoredValueForKey(value, "fhabNiveau");
  }

  public String fhabOuvert() {
    return (String) storedValueForKey("fhabOuvert");
  }

  public void setFhabOuvert(String value) {
    if (_FormationHabilitation.LOG.isDebugEnabled()) {
    	_FormationHabilitation.LOG.debug( "updating fhabOuvert from " + fhabOuvert() + " to " + value);
    }
    takeStoredValueForKey(value, "fhabOuvert");
  }

  public org.cocktail.superplaner.serveur.metier.FormationAnnee formationAnnee() {
    return (org.cocktail.superplaner.serveur.metier.FormationAnnee)storedValueForKey("formationAnnee");
  }

  public void setFormationAnneeRelationship(org.cocktail.superplaner.serveur.metier.FormationAnnee value) {
    if (_FormationHabilitation.LOG.isDebugEnabled()) {
      _FormationHabilitation.LOG.debug("updating formationAnnee from " + formationAnnee() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.FormationSpecialisation formationSpecialisation() {
    return (org.cocktail.superplaner.serveur.metier.FormationSpecialisation)storedValueForKey("formationSpecialisation");
  }

  public void setFormationSpecialisationRelationship(org.cocktail.superplaner.serveur.metier.FormationSpecialisation value) {
    if (_FormationHabilitation.LOG.isDebugEnabled()) {
      _FormationHabilitation.LOG.debug("updating formationSpecialisation from " + formationSpecialisation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationSpecialisation oldValue = formationSpecialisation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "formationSpecialisation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "formationSpecialisation");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.ScolDroitDiplome> droitDiplomes() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ScolDroitDiplome>)storedValueForKey("droitDiplomes");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolDroitDiplome> droitDiplomes(EOQualifier qualifier) {
    return droitDiplomes(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolDroitDiplome> droitDiplomes(EOQualifier qualifier, boolean fetch) {
    return droitDiplomes(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolDroitDiplome> droitDiplomes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ScolDroitDiplome> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ScolDroitDiplome.HABILITATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ScolDroitDiplome.fetchScolDroitDiplomes(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = droitDiplomes();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolDroitDiplome>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolDroitDiplome>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToDroitDiplomesRelationship(org.cocktail.superplaner.serveur.metier.ScolDroitDiplome object) {
    if (_FormationHabilitation.LOG.isDebugEnabled()) {
      _FormationHabilitation.LOG.debug("adding " + object + " to droitDiplomes relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "droitDiplomes");
  }

  public void removeFromDroitDiplomesRelationship(org.cocktail.superplaner.serveur.metier.ScolDroitDiplome object) {
    if (_FormationHabilitation.LOG.isDebugEnabled()) {
      _FormationHabilitation.LOG.debug("removing " + object + " from droitDiplomes relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "droitDiplomes");
  }

  public org.cocktail.superplaner.serveur.metier.ScolDroitDiplome createDroitDiplomesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ScolDroitDiplome");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "droitDiplomes");
    return (org.cocktail.superplaner.serveur.metier.ScolDroitDiplome) eo;
  }

  public void deleteDroitDiplomesRelationship(org.cocktail.superplaner.serveur.metier.ScolDroitDiplome object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "droitDiplomes");
    editingContext().deleteObject(object);
  }

  public void deleteAllDroitDiplomesRelationships() {
    Enumeration objects = droitDiplomes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteDroitDiplomesRelationship((org.cocktail.superplaner.serveur.metier.ScolDroitDiplome)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.PrefScol> prefScol() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.PrefScol>)storedValueForKey("prefScol");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.PrefScol> prefScol(EOQualifier qualifier) {
    return prefScol(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.PrefScol> prefScol(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.PrefScol> results;
      results = prefScol();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.PrefScol>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.PrefScol>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToPrefScolRelationship(org.cocktail.superplaner.serveur.metier.PrefScol object) {
    if (_FormationHabilitation.LOG.isDebugEnabled()) {
      _FormationHabilitation.LOG.debug("adding " + object + " to prefScol relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "prefScol");
  }

  public void removeFromPrefScolRelationship(org.cocktail.superplaner.serveur.metier.PrefScol object) {
    if (_FormationHabilitation.LOG.isDebugEnabled()) {
      _FormationHabilitation.LOG.debug("removing " + object + " from prefScol relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "prefScol");
  }

  public org.cocktail.superplaner.serveur.metier.PrefScol createPrefScolRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("PrefScol");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "prefScol");
    return (org.cocktail.superplaner.serveur.metier.PrefScol) eo;
  }

  public void deletePrefScolRelationship(org.cocktail.superplaner.serveur.metier.PrefScol object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "prefScol");
    editingContext().deleteObject(object);
  }

  public void deleteAllPrefScolRelationships() {
    Enumeration objects = prefScol().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePrefScolRelationship((org.cocktail.superplaner.serveur.metier.PrefScol)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VacancesScolaires> vacancesScolaires() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.VacancesScolaires>)storedValueForKey("vacancesScolaires");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VacancesScolaires> vacancesScolaires(EOQualifier qualifier) {
    return vacancesScolaires(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VacancesScolaires> vacancesScolaires(EOQualifier qualifier, boolean fetch) {
    return vacancesScolaires(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VacancesScolaires> vacancesScolaires(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.VacancesScolaires> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.VacancesScolaires.FORMATION_HABILITATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.VacancesScolaires.fetchVacancesScolaireses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = vacancesScolaires();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.VacancesScolaires>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.VacancesScolaires>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToVacancesScolairesRelationship(org.cocktail.superplaner.serveur.metier.VacancesScolaires object) {
    if (_FormationHabilitation.LOG.isDebugEnabled()) {
      _FormationHabilitation.LOG.debug("adding " + object + " to vacancesScolaires relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "vacancesScolaires");
  }

  public void removeFromVacancesScolairesRelationship(org.cocktail.superplaner.serveur.metier.VacancesScolaires object) {
    if (_FormationHabilitation.LOG.isDebugEnabled()) {
      _FormationHabilitation.LOG.debug("removing " + object + " from vacancesScolaires relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "vacancesScolaires");
  }

  public org.cocktail.superplaner.serveur.metier.VacancesScolaires createVacancesScolairesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("VacancesScolaires");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "vacancesScolaires");
    return (org.cocktail.superplaner.serveur.metier.VacancesScolaires) eo;
  }

  public void deleteVacancesScolairesRelationship(org.cocktail.superplaner.serveur.metier.VacancesScolaires object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "vacancesScolaires");
    editingContext().deleteObject(object);
  }

  public void deleteAllVacancesScolairesRelationships() {
    Enumeration objects = vacancesScolaires().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteVacancesScolairesRelationship((org.cocktail.superplaner.serveur.metier.VacancesScolaires)objects.nextElement());
    }
  }


  public static FormationHabilitation createFormationHabilitation(EOEditingContext editingContext, Integer fannKey
, Integer fhabNiveau
, String fhabOuvert
) {
    FormationHabilitation eo = (FormationHabilitation) EOUtilities.createAndInsertInstance(editingContext, _FormationHabilitation.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setFhabNiveau(fhabNiveau);
		eo.setFhabOuvert(fhabOuvert);
    return eo;
  }

  public static NSArray<FormationHabilitation> fetchAllFormationHabilitations(EOEditingContext editingContext) {
    return _FormationHabilitation.fetchAllFormationHabilitations(editingContext, null);
  }

  public static NSArray<FormationHabilitation> fetchAllFormationHabilitations(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _FormationHabilitation.fetchFormationHabilitations(editingContext, null, sortOrderings);
  }

  public static NSArray<FormationHabilitation> fetchFormationHabilitations(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_FormationHabilitation.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<FormationHabilitation> eoObjects = (NSArray<FormationHabilitation>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static FormationHabilitation fetchFormationHabilitation(EOEditingContext editingContext, String keyName, Object value) {
    return _FormationHabilitation.fetchFormationHabilitation(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static FormationHabilitation fetchFormationHabilitation(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<FormationHabilitation> eoObjects = _FormationHabilitation.fetchFormationHabilitations(editingContext, qualifier, null);
    FormationHabilitation eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (FormationHabilitation)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one FormationHabilitation that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static FormationHabilitation fetchRequiredFormationHabilitation(EOEditingContext editingContext, String keyName, Object value) {
    return _FormationHabilitation.fetchRequiredFormationHabilitation(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static FormationHabilitation fetchRequiredFormationHabilitation(EOEditingContext editingContext, EOQualifier qualifier) {
    FormationHabilitation eoObject = _FormationHabilitation.fetchFormationHabilitation(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no FormationHabilitation that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static FormationHabilitation localInstanceIn(EOEditingContext editingContext, FormationHabilitation eo) {
    FormationHabilitation localInstance = (eo == null) ? null : (FormationHabilitation)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
