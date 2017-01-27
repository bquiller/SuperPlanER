// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolAutorisation.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolAutorisation extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ScolAutorisation";

	// Attributes
	public static final String ANNEE_KEY = "annee";
	public static final String CODE_KEY = "code";
	public static final String DROIT_KEY = "droit";
	public static final String LIBELLE_KEY = "libelle";
	public static final String NIVEAU_KEY = "niveau";
	public static final String PERE_KEY = "pere";
	public static final String VOCATION_KEY = "vocation";

	// Relationships
	public static final String FORMATION_SPECIALISATION_KEY = "formationSpecialisation";
	public static final String MAQUETTE_AP_KEY = "maquetteAp";
	public static final String MAQUETTE_EC_KEY = "maquetteEc";
	public static final String MAQUETTE_PARCOURS_KEY = "maquetteParcours";
	public static final String MAQUETTE_SEMESTRE_KEY = "maquetteSemestre";
	public static final String MAQUETTE_UE_KEY = "maquetteUe";

  private static Logger LOG = Logger.getLogger(_ScolAutorisation.class);

  public ScolAutorisation localInstanceIn(EOEditingContext editingContext) {
    ScolAutorisation localInstance = (ScolAutorisation)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer annee() {
    return (Integer) storedValueForKey("annee");
  }

  public void setAnnee(Integer value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
    	_ScolAutorisation.LOG.debug( "updating annee from " + annee() + " to " + value);
    }
    takeStoredValueForKey(value, "annee");
  }

  public String code() {
    return (String) storedValueForKey("code");
  }

  public void setCode(String value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
    	_ScolAutorisation.LOG.debug( "updating code from " + code() + " to " + value);
    }
    takeStoredValueForKey(value, "code");
  }

  public Integer droit() {
    return (Integer) storedValueForKey("droit");
  }

  public void setDroit(Integer value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
    	_ScolAutorisation.LOG.debug( "updating droit from " + droit() + " to " + value);
    }
    takeStoredValueForKey(value, "droit");
  }

  public String libelle() {
    return (String) storedValueForKey("libelle");
  }

  public void setLibelle(String value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
    	_ScolAutorisation.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, "libelle");
  }

  public Integer niveau() {
    return (Integer) storedValueForKey("niveau");
  }

  public void setNiveau(Integer value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
    	_ScolAutorisation.LOG.debug( "updating niveau from " + niveau() + " to " + value);
    }
    takeStoredValueForKey(value, "niveau");
  }

  public String pere() {
    return (String) storedValueForKey("pere");
  }

  public void setPere(String value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
    	_ScolAutorisation.LOG.debug( "updating pere from " + pere() + " to " + value);
    }
    takeStoredValueForKey(value, "pere");
  }

  public String vocation() {
    return (String) storedValueForKey("vocation");
  }

  public void setVocation(String value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
    	_ScolAutorisation.LOG.debug( "updating vocation from " + vocation() + " to " + value);
    }
    takeStoredValueForKey(value, "vocation");
  }

  public org.cocktail.superplaner.serveur.metier.FormationSpecialisation formationSpecialisation() {
    return (org.cocktail.superplaner.serveur.metier.FormationSpecialisation)storedValueForKey("formationSpecialisation");
  }

  public void setFormationSpecialisationRelationship(org.cocktail.superplaner.serveur.metier.FormationSpecialisation value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
      _ScolAutorisation.LOG.debug("updating formationSpecialisation from " + formationSpecialisation() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.MaquetteAp maquetteAp() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("maquetteAp");
  }

  public void setMaquetteApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
      _ScolAutorisation.LOG.debug("updating maquetteAp from " + maquetteAp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteAp oldValue = maquetteAp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteAp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteAp");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteEc maquetteEc() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteEc)storedValueForKey("maquetteEc");
  }

  public void setMaquetteEcRelationship(org.cocktail.superplaner.serveur.metier.MaquetteEc value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
      _ScolAutorisation.LOG.debug("updating maquetteEc from " + maquetteEc() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteEc oldValue = maquetteEc();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteEc");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteEc");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteParcours maquetteParcours() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteParcours)storedValueForKey("maquetteParcours");
  }

  public void setMaquetteParcoursRelationship(org.cocktail.superplaner.serveur.metier.MaquetteParcours value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
      _ScolAutorisation.LOG.debug("updating maquetteParcours from " + maquetteParcours() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteParcours oldValue = maquetteParcours();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteParcours");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteParcours");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteSemestre maquetteSemestre() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteSemestre)storedValueForKey("maquetteSemestre");
  }

  public void setMaquetteSemestreRelationship(org.cocktail.superplaner.serveur.metier.MaquetteSemestre value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
      _ScolAutorisation.LOG.debug("updating maquetteSemestre from " + maquetteSemestre() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteSemestre oldValue = maquetteSemestre();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteSemestre");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteSemestre");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteUe maquetteUe() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteUe)storedValueForKey("maquetteUe");
  }

  public void setMaquetteUeRelationship(org.cocktail.superplaner.serveur.metier.MaquetteUe value) {
    if (_ScolAutorisation.LOG.isDebugEnabled()) {
      _ScolAutorisation.LOG.debug("updating maquetteUe from " + maquetteUe() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteUe oldValue = maquetteUe();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteUe");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteUe");
    }
  }
  

  public static ScolAutorisation createScolAutorisation(EOEditingContext editingContext, Integer annee
, String code
, Integer droit
) {
    ScolAutorisation eo = (ScolAutorisation) EOUtilities.createAndInsertInstance(editingContext, _ScolAutorisation.ENTITY_NAME);    
		eo.setAnnee(annee);
		eo.setCode(code);
		eo.setDroit(droit);
    return eo;
  }

  public static NSArray<ScolAutorisation> fetchAllScolAutorisations(EOEditingContext editingContext) {
    return _ScolAutorisation.fetchAllScolAutorisations(editingContext, null);
  }

  public static NSArray<ScolAutorisation> fetchAllScolAutorisations(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolAutorisation.fetchScolAutorisations(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolAutorisation> fetchScolAutorisations(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolAutorisation.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolAutorisation> eoObjects = (NSArray<ScolAutorisation>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolAutorisation fetchScolAutorisation(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolAutorisation.fetchScolAutorisation(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolAutorisation fetchScolAutorisation(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolAutorisation> eoObjects = _ScolAutorisation.fetchScolAutorisations(editingContext, qualifier, null);
    ScolAutorisation eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolAutorisation)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ScolAutorisation that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolAutorisation fetchRequiredScolAutorisation(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolAutorisation.fetchRequiredScolAutorisation(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolAutorisation fetchRequiredScolAutorisation(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolAutorisation eoObject = _ScolAutorisation.fetchScolAutorisation(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ScolAutorisation that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolAutorisation localInstanceIn(EOEditingContext editingContext, ScolAutorisation eo) {
    ScolAutorisation localInstance = (eo == null) ? null : (ScolAutorisation)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
