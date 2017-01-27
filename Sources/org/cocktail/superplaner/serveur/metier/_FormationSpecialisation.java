// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to FormationSpecialisation.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _FormationSpecialisation extends  EOGenericRecord {
	public static final String ENTITY_NAME = "FormationSpecialisation";

	// Attributes
	public static final String FSPN_ABREVIATION_KEY = "fspnAbreviation";
	public static final String FSPN_LIBELLE_KEY = "fspnLibelle";

	// Relationships
	public static final String HABILITATIONS_KEY = "habilitations";
	public static final String MAQUETTE_PARCOURS_KEY = "maquetteParcours";
	public static final String SCOL_FORMATION_DIPLOME_KEY = "scolFormationDiplome";
	public static final String V_PARCOURS_AP_KEY = "vParcoursAp";

  private static Logger LOG = Logger.getLogger(_FormationSpecialisation.class);

  public FormationSpecialisation localInstanceIn(EOEditingContext editingContext) {
    FormationSpecialisation localInstance = (FormationSpecialisation)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String fspnAbreviation() {
    return (String) storedValueForKey("fspnAbreviation");
  }

  public void setFspnAbreviation(String value) {
    if (_FormationSpecialisation.LOG.isDebugEnabled()) {
    	_FormationSpecialisation.LOG.debug( "updating fspnAbreviation from " + fspnAbreviation() + " to " + value);
    }
    takeStoredValueForKey(value, "fspnAbreviation");
  }

  public String fspnLibelle() {
    return (String) storedValueForKey("fspnLibelle");
  }

  public void setFspnLibelle(String value) {
    if (_FormationSpecialisation.LOG.isDebugEnabled()) {
    	_FormationSpecialisation.LOG.debug( "updating fspnLibelle from " + fspnLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "fspnLibelle");
  }

  public org.cocktail.superplaner.serveur.metier.FormationDiplome scolFormationDiplome() {
    return (org.cocktail.superplaner.serveur.metier.FormationDiplome)storedValueForKey("scolFormationDiplome");
  }

  public void setScolFormationDiplomeRelationship(org.cocktail.superplaner.serveur.metier.FormationDiplome value) {
    if (_FormationSpecialisation.LOG.isDebugEnabled()) {
      _FormationSpecialisation.LOG.debug("updating scolFormationDiplome from " + scolFormationDiplome() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationDiplome oldValue = scolFormationDiplome();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "scolFormationDiplome");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "scolFormationDiplome");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.FormationHabilitation> habilitations() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.FormationHabilitation>)storedValueForKey("habilitations");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.FormationHabilitation> habilitations(EOQualifier qualifier) {
    return habilitations(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.FormationHabilitation> habilitations(EOQualifier qualifier, boolean fetch) {
    return habilitations(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.FormationHabilitation> habilitations(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.FormationHabilitation> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.FormationHabilitation.FORMATION_SPECIALISATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.FormationHabilitation.fetchFormationHabilitations(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = habilitations();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.FormationHabilitation>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.FormationHabilitation>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToHabilitationsRelationship(org.cocktail.superplaner.serveur.metier.FormationHabilitation object) {
    if (_FormationSpecialisation.LOG.isDebugEnabled()) {
      _FormationSpecialisation.LOG.debug("adding " + object + " to habilitations relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "habilitations");
  }

  public void removeFromHabilitationsRelationship(org.cocktail.superplaner.serveur.metier.FormationHabilitation object) {
    if (_FormationSpecialisation.LOG.isDebugEnabled()) {
      _FormationSpecialisation.LOG.debug("removing " + object + " from habilitations relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "habilitations");
  }

  public org.cocktail.superplaner.serveur.metier.FormationHabilitation createHabilitationsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("FormationHabilitation");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "habilitations");
    return (org.cocktail.superplaner.serveur.metier.FormationHabilitation) eo;
  }

  public void deleteHabilitationsRelationship(org.cocktail.superplaner.serveur.metier.FormationHabilitation object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "habilitations");
    editingContext().deleteObject(object);
  }

  public void deleteAllHabilitationsRelationships() {
    Enumeration objects = habilitations().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteHabilitationsRelationship((org.cocktail.superplaner.serveur.metier.FormationHabilitation)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteParcours> maquetteParcours() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteParcours>)storedValueForKey("maquetteParcours");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteParcours> maquetteParcours(EOQualifier qualifier) {
    return maquetteParcours(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteParcours> maquetteParcours(EOQualifier qualifier, boolean fetch) {
    return maquetteParcours(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteParcours> maquetteParcours(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.MaquetteParcours> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.MaquetteParcours.FORMATION_SPECIALISATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.MaquetteParcours.fetchMaquetteParcourses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = maquetteParcours();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteParcours>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteParcours>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToMaquetteParcoursRelationship(org.cocktail.superplaner.serveur.metier.MaquetteParcours object) {
    if (_FormationSpecialisation.LOG.isDebugEnabled()) {
      _FormationSpecialisation.LOG.debug("adding " + object + " to maquetteParcours relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "maquetteParcours");
  }

  public void removeFromMaquetteParcoursRelationship(org.cocktail.superplaner.serveur.metier.MaquetteParcours object) {
    if (_FormationSpecialisation.LOG.isDebugEnabled()) {
      _FormationSpecialisation.LOG.debug("removing " + object + " from maquetteParcours relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "maquetteParcours");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteParcours createMaquetteParcoursRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("MaquetteParcours");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "maquetteParcours");
    return (org.cocktail.superplaner.serveur.metier.MaquetteParcours) eo;
  }

  public void deleteMaquetteParcoursRelationship(org.cocktail.superplaner.serveur.metier.MaquetteParcours object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "maquetteParcours");
    editingContext().deleteObject(object);
  }

  public void deleteAllMaquetteParcoursRelationships() {
    Enumeration objects = maquetteParcours().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteMaquetteParcoursRelationship((org.cocktail.superplaner.serveur.metier.MaquetteParcours)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VParcoursAp> vParcoursAp() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.VParcoursAp>)storedValueForKey("vParcoursAp");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VParcoursAp> vParcoursAp(EOQualifier qualifier) {
    return vParcoursAp(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VParcoursAp> vParcoursAp(EOQualifier qualifier, boolean fetch) {
    return vParcoursAp(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.VParcoursAp> vParcoursAp(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.VParcoursAp> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.VParcoursAp.SPECIALISATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.VParcoursAp.fetchVParcoursAps(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = vParcoursAp();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.VParcoursAp>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.VParcoursAp>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToVParcoursApRelationship(org.cocktail.superplaner.serveur.metier.VParcoursAp object) {
    if (_FormationSpecialisation.LOG.isDebugEnabled()) {
      _FormationSpecialisation.LOG.debug("adding " + object + " to vParcoursAp relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "vParcoursAp");
  }

  public void removeFromVParcoursApRelationship(org.cocktail.superplaner.serveur.metier.VParcoursAp object) {
    if (_FormationSpecialisation.LOG.isDebugEnabled()) {
      _FormationSpecialisation.LOG.debug("removing " + object + " from vParcoursAp relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "vParcoursAp");
  }

  public org.cocktail.superplaner.serveur.metier.VParcoursAp createVParcoursApRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("VParcoursAp");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "vParcoursAp");
    return (org.cocktail.superplaner.serveur.metier.VParcoursAp) eo;
  }

  public void deleteVParcoursApRelationship(org.cocktail.superplaner.serveur.metier.VParcoursAp object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "vParcoursAp");
    editingContext().deleteObject(object);
  }

  public void deleteAllVParcoursApRelationships() {
    Enumeration objects = vParcoursAp().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteVParcoursApRelationship((org.cocktail.superplaner.serveur.metier.VParcoursAp)objects.nextElement());
    }
  }


  public static FormationSpecialisation createFormationSpecialisation(EOEditingContext editingContext) {
    FormationSpecialisation eo = (FormationSpecialisation) EOUtilities.createAndInsertInstance(editingContext, _FormationSpecialisation.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<FormationSpecialisation> fetchAllFormationSpecialisations(EOEditingContext editingContext) {
    return _FormationSpecialisation.fetchAllFormationSpecialisations(editingContext, null);
  }

  public static NSArray<FormationSpecialisation> fetchAllFormationSpecialisations(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _FormationSpecialisation.fetchFormationSpecialisations(editingContext, null, sortOrderings);
  }

  public static NSArray<FormationSpecialisation> fetchFormationSpecialisations(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_FormationSpecialisation.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<FormationSpecialisation> eoObjects = (NSArray<FormationSpecialisation>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static FormationSpecialisation fetchFormationSpecialisation(EOEditingContext editingContext, String keyName, Object value) {
    return _FormationSpecialisation.fetchFormationSpecialisation(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static FormationSpecialisation fetchFormationSpecialisation(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<FormationSpecialisation> eoObjects = _FormationSpecialisation.fetchFormationSpecialisations(editingContext, qualifier, null);
    FormationSpecialisation eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (FormationSpecialisation)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one FormationSpecialisation that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static FormationSpecialisation fetchRequiredFormationSpecialisation(EOEditingContext editingContext, String keyName, Object value) {
    return _FormationSpecialisation.fetchRequiredFormationSpecialisation(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static FormationSpecialisation fetchRequiredFormationSpecialisation(EOEditingContext editingContext, EOQualifier qualifier) {
    FormationSpecialisation eoObject = _FormationSpecialisation.fetchFormationSpecialisation(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no FormationSpecialisation that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static FormationSpecialisation localInstanceIn(EOEditingContext editingContext, FormationSpecialisation eo) {
    FormationSpecialisation localInstance = (eo == null) ? null : (FormationSpecialisation)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
