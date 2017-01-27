// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ReservationObjet.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ReservationObjet extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ReservationObjet";

	// Attributes
	public static final String DATE_VALIDATION_KEY = "dateValidation";
	public static final String RESA_ETAT_KEY = "resaEtat";

	// Relationships
	public static final String INDIVIDU_VALIDEUR_KEY = "individuValideur";
	public static final String RESA_OBJET_KEY = "resaObjet";
	public static final String RESERVATION_KEY = "reservation";

  private static Logger LOG = Logger.getLogger(_ReservationObjet.class);

  public ReservationObjet localInstanceIn(EOEditingContext editingContext) {
    ReservationObjet localInstance = (ReservationObjet)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dateValidation() {
    return (NSTimestamp) storedValueForKey("dateValidation");
  }

  public void setDateValidation(NSTimestamp value) {
    if (_ReservationObjet.LOG.isDebugEnabled()) {
    	_ReservationObjet.LOG.debug( "updating dateValidation from " + dateValidation() + " to " + value);
    }
    takeStoredValueForKey(value, "dateValidation");
  }

  public String resaEtat() {
    return (String) storedValueForKey("resaEtat");
  }

  public void setResaEtat(String value) {
    if (_ReservationObjet.LOG.isDebugEnabled()) {
    	_ReservationObjet.LOG.debug( "updating resaEtat from " + resaEtat() + " to " + value);
    }
    takeStoredValueForKey(value, "resaEtat");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuValideur() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuValideur");
  }

  public void setIndividuValideurRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_ReservationObjet.LOG.isDebugEnabled()) {
      _ReservationObjet.LOG.debug("updating individuValideur from " + individuValideur() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individuValideur();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individuValideur");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individuValideur");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.ResaObjet resaObjet() {
    return (org.cocktail.superplaner.serveur.metier.ResaObjet)storedValueForKey("resaObjet");
  }

  public void setResaObjetRelationship(org.cocktail.superplaner.serveur.metier.ResaObjet value) {
    if (_ReservationObjet.LOG.isDebugEnabled()) {
      _ReservationObjet.LOG.debug("updating resaObjet from " + resaObjet() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ResaObjet oldValue = resaObjet();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "resaObjet");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "resaObjet");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.Reservation reservation() {
    return (org.cocktail.superplaner.serveur.metier.Reservation)storedValueForKey("reservation");
  }

  public void setReservationRelationship(org.cocktail.superplaner.serveur.metier.Reservation value) {
    if (_ReservationObjet.LOG.isDebugEnabled()) {
      _ReservationObjet.LOG.debug("updating reservation from " + reservation() + " to " + value);
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
  

  public static ReservationObjet createReservationObjet(EOEditingContext editingContext, String resaEtat
) {
    ReservationObjet eo = (ReservationObjet) EOUtilities.createAndInsertInstance(editingContext, _ReservationObjet.ENTITY_NAME);    
		eo.setResaEtat(resaEtat);
    return eo;
  }

  public static NSArray<ReservationObjet> fetchAllReservationObjets(EOEditingContext editingContext) {
    return _ReservationObjet.fetchAllReservationObjets(editingContext, null);
  }

  public static NSArray<ReservationObjet> fetchAllReservationObjets(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ReservationObjet.fetchReservationObjets(editingContext, null, sortOrderings);
  }

  public static NSArray<ReservationObjet> fetchReservationObjets(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ReservationObjet.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ReservationObjet> eoObjects = (NSArray<ReservationObjet>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ReservationObjet fetchReservationObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _ReservationObjet.fetchReservationObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ReservationObjet fetchReservationObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ReservationObjet> eoObjects = _ReservationObjet.fetchReservationObjets(editingContext, qualifier, null);
    ReservationObjet eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ReservationObjet)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ReservationObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ReservationObjet fetchRequiredReservationObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _ReservationObjet.fetchRequiredReservationObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ReservationObjet fetchRequiredReservationObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    ReservationObjet eoObject = _ReservationObjet.fetchReservationObjet(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ReservationObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ReservationObjet localInstanceIn(EOEditingContext editingContext, ReservationObjet eo) {
    ReservationObjet localInstance = (eo == null) ? null : (ReservationObjet)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
