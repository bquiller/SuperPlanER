// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to CtrlIndividuHeures.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _CtrlIndividuHeures extends  EOGenericRecord {
	public static final String ENTITY_NAME = "CtrlIndividuHeures";

	// Attributes
	public static final String CIH_HEURE_DEBUT_KEY = "cihHeureDebut";
	public static final String CIH_HEURE_FIN_KEY = "cihHeureFin";

	// Relationships
	public static final String CTRL_INDIVIDU_JOURS_KEY = "ctrlIndividuJours";

  private static Logger LOG = Logger.getLogger(_CtrlIndividuHeures.class);

  public CtrlIndividuHeures localInstanceIn(EOEditingContext editingContext) {
    CtrlIndividuHeures localInstance = (CtrlIndividuHeures)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp cihHeureDebut() {
    return (NSTimestamp) storedValueForKey("cihHeureDebut");
  }

  public void setCihHeureDebut(NSTimestamp value) {
    if (_CtrlIndividuHeures.LOG.isDebugEnabled()) {
    	_CtrlIndividuHeures.LOG.debug( "updating cihHeureDebut from " + cihHeureDebut() + " to " + value);
    }
    takeStoredValueForKey(value, "cihHeureDebut");
  }

  public NSTimestamp cihHeureFin() {
    return (NSTimestamp) storedValueForKey("cihHeureFin");
  }

  public void setCihHeureFin(NSTimestamp value) {
    if (_CtrlIndividuHeures.LOG.isDebugEnabled()) {
    	_CtrlIndividuHeures.LOG.debug( "updating cihHeureFin from " + cihHeureFin() + " to " + value);
    }
    takeStoredValueForKey(value, "cihHeureFin");
  }

  public org.cocktail.superplaner.serveur.metier.CtrlIndividuJours ctrlIndividuJours() {
    return (org.cocktail.superplaner.serveur.metier.CtrlIndividuJours)storedValueForKey("ctrlIndividuJours");
  }

  public void setCtrlIndividuJoursRelationship(org.cocktail.superplaner.serveur.metier.CtrlIndividuJours value) {
    if (_CtrlIndividuHeures.LOG.isDebugEnabled()) {
      _CtrlIndividuHeures.LOG.debug("updating ctrlIndividuJours from " + ctrlIndividuJours() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.CtrlIndividuJours oldValue = ctrlIndividuJours();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "ctrlIndividuJours");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "ctrlIndividuJours");
    }
  }
  

  public static CtrlIndividuHeures createCtrlIndividuHeures(EOEditingContext editingContext, NSTimestamp cihHeureDebut
, NSTimestamp cihHeureFin
, org.cocktail.superplaner.serveur.metier.CtrlIndividuJours ctrlIndividuJours) {
    CtrlIndividuHeures eo = (CtrlIndividuHeures) EOUtilities.createAndInsertInstance(editingContext, _CtrlIndividuHeures.ENTITY_NAME);    
		eo.setCihHeureDebut(cihHeureDebut);
		eo.setCihHeureFin(cihHeureFin);
    eo.setCtrlIndividuJoursRelationship(ctrlIndividuJours);
    return eo;
  }

  public static NSArray<CtrlIndividuHeures> fetchAllCtrlIndividuHeureses(EOEditingContext editingContext) {
    return _CtrlIndividuHeures.fetchAllCtrlIndividuHeureses(editingContext, null);
  }

  public static NSArray<CtrlIndividuHeures> fetchAllCtrlIndividuHeureses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _CtrlIndividuHeures.fetchCtrlIndividuHeureses(editingContext, null, sortOrderings);
  }

  public static NSArray<CtrlIndividuHeures> fetchCtrlIndividuHeureses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_CtrlIndividuHeures.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<CtrlIndividuHeures> eoObjects = (NSArray<CtrlIndividuHeures>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static CtrlIndividuHeures fetchCtrlIndividuHeures(EOEditingContext editingContext, String keyName, Object value) {
    return _CtrlIndividuHeures.fetchCtrlIndividuHeures(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static CtrlIndividuHeures fetchCtrlIndividuHeures(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<CtrlIndividuHeures> eoObjects = _CtrlIndividuHeures.fetchCtrlIndividuHeureses(editingContext, qualifier, null);
    CtrlIndividuHeures eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (CtrlIndividuHeures)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one CtrlIndividuHeures that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static CtrlIndividuHeures fetchRequiredCtrlIndividuHeures(EOEditingContext editingContext, String keyName, Object value) {
    return _CtrlIndividuHeures.fetchRequiredCtrlIndividuHeures(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static CtrlIndividuHeures fetchRequiredCtrlIndividuHeures(EOEditingContext editingContext, EOQualifier qualifier) {
    CtrlIndividuHeures eoObject = _CtrlIndividuHeures.fetchCtrlIndividuHeures(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no CtrlIndividuHeures that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static CtrlIndividuHeures localInstanceIn(EOEditingContext editingContext, CtrlIndividuHeures eo) {
    CtrlIndividuHeures localInstance = (eo == null) ? null : (CtrlIndividuHeures)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
