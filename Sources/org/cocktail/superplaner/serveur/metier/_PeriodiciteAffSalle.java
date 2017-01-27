// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to PeriodiciteAffSalle.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _PeriodiciteAffSalle extends  EOGenericRecord {
	public static final String ENTITY_NAME = "PeriodiciteAffSalle";

	// Attributes
	public static final String DATE_DEB_KEY = "dateDeb";
	public static final String DATE_FIN_KEY = "dateFin";

	// Relationships
	public static final String AFFECTATION_SALLE_KEY = "affectationSalle";

  private static Logger LOG = Logger.getLogger(_PeriodiciteAffSalle.class);

  public PeriodiciteAffSalle localInstanceIn(EOEditingContext editingContext) {
    PeriodiciteAffSalle localInstance = (PeriodiciteAffSalle)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dateDeb() {
    return (NSTimestamp) storedValueForKey("dateDeb");
  }

  public void setDateDeb(NSTimestamp value) {
    if (_PeriodiciteAffSalle.LOG.isDebugEnabled()) {
    	_PeriodiciteAffSalle.LOG.debug( "updating dateDeb from " + dateDeb() + " to " + value);
    }
    takeStoredValueForKey(value, "dateDeb");
  }

  public NSTimestamp dateFin() {
    return (NSTimestamp) storedValueForKey("dateFin");
  }

  public void setDateFin(NSTimestamp value) {
    if (_PeriodiciteAffSalle.LOG.isDebugEnabled()) {
    	_PeriodiciteAffSalle.LOG.debug( "updating dateFin from " + dateFin() + " to " + value);
    }
    takeStoredValueForKey(value, "dateFin");
  }

  public org.cocktail.superplaner.serveur.metier.AffectationSalle affectationSalle() {
    return (org.cocktail.superplaner.serveur.metier.AffectationSalle)storedValueForKey("affectationSalle");
  }

  public void setAffectationSalleRelationship(org.cocktail.superplaner.serveur.metier.AffectationSalle value) {
    if (_PeriodiciteAffSalle.LOG.isDebugEnabled()) {
      _PeriodiciteAffSalle.LOG.debug("updating affectationSalle from " + affectationSalle() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.AffectationSalle oldValue = affectationSalle();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "affectationSalle");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "affectationSalle");
    }
  }
  

  public static PeriodiciteAffSalle createPeriodiciteAffSalle(EOEditingContext editingContext, NSTimestamp dateDeb
, NSTimestamp dateFin
) {
    PeriodiciteAffSalle eo = (PeriodiciteAffSalle) EOUtilities.createAndInsertInstance(editingContext, _PeriodiciteAffSalle.ENTITY_NAME);    
		eo.setDateDeb(dateDeb);
		eo.setDateFin(dateFin);
    return eo;
  }

  public static NSArray<PeriodiciteAffSalle> fetchAllPeriodiciteAffSalles(EOEditingContext editingContext) {
    return _PeriodiciteAffSalle.fetchAllPeriodiciteAffSalles(editingContext, null);
  }

  public static NSArray<PeriodiciteAffSalle> fetchAllPeriodiciteAffSalles(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _PeriodiciteAffSalle.fetchPeriodiciteAffSalles(editingContext, null, sortOrderings);
  }

  public static NSArray<PeriodiciteAffSalle> fetchPeriodiciteAffSalles(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_PeriodiciteAffSalle.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<PeriodiciteAffSalle> eoObjects = (NSArray<PeriodiciteAffSalle>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static PeriodiciteAffSalle fetchPeriodiciteAffSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _PeriodiciteAffSalle.fetchPeriodiciteAffSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static PeriodiciteAffSalle fetchPeriodiciteAffSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<PeriodiciteAffSalle> eoObjects = _PeriodiciteAffSalle.fetchPeriodiciteAffSalles(editingContext, qualifier, null);
    PeriodiciteAffSalle eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (PeriodiciteAffSalle)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one PeriodiciteAffSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static PeriodiciteAffSalle fetchRequiredPeriodiciteAffSalle(EOEditingContext editingContext, String keyName, Object value) {
    return _PeriodiciteAffSalle.fetchRequiredPeriodiciteAffSalle(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static PeriodiciteAffSalle fetchRequiredPeriodiciteAffSalle(EOEditingContext editingContext, EOQualifier qualifier) {
    PeriodiciteAffSalle eoObject = _PeriodiciteAffSalle.fetchPeriodiciteAffSalle(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no PeriodiciteAffSalle that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static PeriodiciteAffSalle localInstanceIn(EOEditingContext editingContext, PeriodiciteAffSalle eo) {
    PeriodiciteAffSalle localInstance = (eo == null) ? null : (PeriodiciteAffSalle)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
