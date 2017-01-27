// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ResaSalles.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ResaSalles extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ResaSalles";

	// Attributes
	public static final String RESA_SAL_DATE_KEY = "resaSalDate";
	public static final String RESA_SAL_ETAT_KEY = "resaSalEtat";

	// Relationships
	public static final String RESERVATION_KEY = "reservation";
	public static final String SALLE_KEY = "salle";

  private static Logger LOG = Logger.getLogger(_ResaSalles.class);

  public ResaSalles localInstanceIn(EOEditingContext editingContext) {
    ResaSalles localInstance = (ResaSalles)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp resaSalDate() {
    return (NSTimestamp) storedValueForKey("resaSalDate");
  }

  public void setResaSalDate(NSTimestamp value) {
    if (_ResaSalles.LOG.isDebugEnabled()) {
    	_ResaSalles.LOG.debug( "updating resaSalDate from " + resaSalDate() + " to " + value);
    }
    takeStoredValueForKey(value, "resaSalDate");
  }

  public String resaSalEtat() {
    return (String) storedValueForKey("resaSalEtat");
  }

  public void setResaSalEtat(String value) {
    if (_ResaSalles.LOG.isDebugEnabled()) {
    	_ResaSalles.LOG.debug( "updating resaSalEtat from " + resaSalEtat() + " to " + value);
    }
    takeStoredValueForKey(value, "resaSalEtat");
  }

  public org.cocktail.superplaner.serveur.metier.Reservation reservation() {
    return (org.cocktail.superplaner.serveur.metier.Reservation)storedValueForKey("reservation");
  }

  public void setReservationRelationship(org.cocktail.superplaner.serveur.metier.Reservation value) {
    if (_ResaSalles.LOG.isDebugEnabled()) {
      _ResaSalles.LOG.debug("updating reservation from " + reservation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Reservation oldValue = reservation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "reservation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "reservation");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.Salles salle() {
    return (org.cocktail.superplaner.serveur.metier.Salles)storedValueForKey("salle");
  }

  public void setSalleRelationship(org.cocktail.superplaner.serveur.metier.Salles value) {
    if (_ResaSalles.LOG.isDebugEnabled()) {
      _ResaSalles.LOG.debug("updating salle from " + salle() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Salles oldValue = salle();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "salle");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "salle");
    }
  }
  

  public static ResaSalles createResaSalles(EOEditingContext editingContext) {
    ResaSalles eo = (ResaSalles) EOUtilities.createAndInsertInstance(editingContext, _ResaSalles.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<ResaSalles> fetchAllResaSalleses(EOEditingContext editingContext) {
    return _ResaSalles.fetchAllResaSalleses(editingContext, null);
  }

  public static NSArray<ResaSalles> fetchAllResaSalleses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ResaSalles.fetchResaSalleses(editingContext, null, sortOrderings);
  }

  public static NSArray<ResaSalles> fetchResaSalleses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ResaSalles.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ResaSalles> eoObjects = (NSArray<ResaSalles>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ResaSalles fetchResaSalles(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaSalles.fetchResaSalles(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaSalles fetchResaSalles(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ResaSalles> eoObjects = _ResaSalles.fetchResaSalleses(editingContext, qualifier, null);
    ResaSalles eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ResaSalles)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ResaSalles that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaSalles fetchRequiredResaSalles(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaSalles.fetchRequiredResaSalles(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaSalles fetchRequiredResaSalles(EOEditingContext editingContext, EOQualifier qualifier) {
    ResaSalles eoObject = _ResaSalles.fetchResaSalles(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ResaSalles that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaSalles localInstanceIn(EOEditingContext editingContext, ResaSalles eo) {
    ResaSalles localInstance = (eo == null) ? null : (ResaSalles)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
