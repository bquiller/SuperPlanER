// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VacancesScolaires.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VacancesScolaires extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VacancesScolaires";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String VS_COMMENTAIRE_KEY = "vsCommentaire";
	public static final String VS_DATE_DEBUT_KEY = "vsDateDebut";
	public static final String VS_DATE_FIN_KEY = "vsDateFin";

	// Relationships
	public static final String FORMATION_HABILITATION_KEY = "formationHabilitation";

  private static Logger LOG = Logger.getLogger(_VacancesScolaires.class);

  public VacancesScolaires localInstanceIn(EOEditingContext editingContext) {
    VacancesScolaires localInstance = (VacancesScolaires)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_VacancesScolaires.LOG.isDebugEnabled()) {
    	_VacancesScolaires.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public String vsCommentaire() {
    return (String) storedValueForKey("vsCommentaire");
  }

  public void setVsCommentaire(String value) {
    if (_VacancesScolaires.LOG.isDebugEnabled()) {
    	_VacancesScolaires.LOG.debug( "updating vsCommentaire from " + vsCommentaire() + " to " + value);
    }
    takeStoredValueForKey(value, "vsCommentaire");
  }

  public NSTimestamp vsDateDebut() {
    return (NSTimestamp) storedValueForKey("vsDateDebut");
  }

  public void setVsDateDebut(NSTimestamp value) {
    if (_VacancesScolaires.LOG.isDebugEnabled()) {
    	_VacancesScolaires.LOG.debug( "updating vsDateDebut from " + vsDateDebut() + " to " + value);
    }
    takeStoredValueForKey(value, "vsDateDebut");
  }

  public NSTimestamp vsDateFin() {
    return (NSTimestamp) storedValueForKey("vsDateFin");
  }

  public void setVsDateFin(NSTimestamp value) {
    if (_VacancesScolaires.LOG.isDebugEnabled()) {
    	_VacancesScolaires.LOG.debug( "updating vsDateFin from " + vsDateFin() + " to " + value);
    }
    takeStoredValueForKey(value, "vsDateFin");
  }

  public org.cocktail.superplaner.serveur.metier.FormationHabilitation formationHabilitation() {
    return (org.cocktail.superplaner.serveur.metier.FormationHabilitation)storedValueForKey("formationHabilitation");
  }

  public void setFormationHabilitationRelationship(org.cocktail.superplaner.serveur.metier.FormationHabilitation value) {
    if (_VacancesScolaires.LOG.isDebugEnabled()) {
      _VacancesScolaires.LOG.debug("updating formationHabilitation from " + formationHabilitation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationHabilitation oldValue = formationHabilitation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "formationHabilitation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "formationHabilitation");
    }
  }
  

  public static VacancesScolaires createVacancesScolaires(EOEditingContext editingContext, Integer fannKey
, NSTimestamp vsDateDebut
, NSTimestamp vsDateFin
) {
    VacancesScolaires eo = (VacancesScolaires) EOUtilities.createAndInsertInstance(editingContext, _VacancesScolaires.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setVsDateDebut(vsDateDebut);
		eo.setVsDateFin(vsDateFin);
    return eo;
  }

  public static NSArray<VacancesScolaires> fetchAllVacancesScolaireses(EOEditingContext editingContext) {
    return _VacancesScolaires.fetchAllVacancesScolaireses(editingContext, null);
  }

  public static NSArray<VacancesScolaires> fetchAllVacancesScolaireses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VacancesScolaires.fetchVacancesScolaireses(editingContext, null, sortOrderings);
  }

  public static NSArray<VacancesScolaires> fetchVacancesScolaireses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VacancesScolaires.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VacancesScolaires> eoObjects = (NSArray<VacancesScolaires>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VacancesScolaires fetchVacancesScolaires(EOEditingContext editingContext, String keyName, Object value) {
    return _VacancesScolaires.fetchVacancesScolaires(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VacancesScolaires fetchVacancesScolaires(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VacancesScolaires> eoObjects = _VacancesScolaires.fetchVacancesScolaireses(editingContext, qualifier, null);
    VacancesScolaires eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VacancesScolaires)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VacancesScolaires that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VacancesScolaires fetchRequiredVacancesScolaires(EOEditingContext editingContext, String keyName, Object value) {
    return _VacancesScolaires.fetchRequiredVacancesScolaires(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VacancesScolaires fetchRequiredVacancesScolaires(EOEditingContext editingContext, EOQualifier qualifier) {
    VacancesScolaires eoObject = _VacancesScolaires.fetchVacancesScolaires(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VacancesScolaires that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VacancesScolaires localInstanceIn(EOEditingContext editingContext, VacancesScolaires eo) {
    VacancesScolaires localInstance = (eo == null) ? null : (VacancesScolaires)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
