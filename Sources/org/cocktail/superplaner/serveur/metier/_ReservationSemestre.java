// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ReservationSemestre.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ReservationSemestre extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ReservationSemestre";

	// Attributes
	public static final String HCOMP_REC_KEY = "hcompRec";

	// Relationships
	public static final String RESERVATION_KEY = "reservation";
	public static final String SCOL_GROUPE_GRP_KEY = "scolGroupeGrp";
	public static final String SEMESTRE_KEY = "semestre";

  private static Logger LOG = Logger.getLogger(_ReservationSemestre.class);

  public ReservationSemestre localInstanceIn(EOEditingContext editingContext) {
    ReservationSemestre localInstance = (ReservationSemestre)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer hcompRec() {
    return (Integer) storedValueForKey("hcompRec");
  }

  public void setHcompRec(Integer value) {
    if (_ReservationSemestre.LOG.isDebugEnabled()) {
    	_ReservationSemestre.LOG.debug( "updating hcompRec from " + hcompRec() + " to " + value);
    }
    takeStoredValueForKey(value, "hcompRec");
  }

  public org.cocktail.superplaner.serveur.metier.Reservation reservation() {
    return (org.cocktail.superplaner.serveur.metier.Reservation)storedValueForKey("reservation");
  }

  public void setReservationRelationship(org.cocktail.superplaner.serveur.metier.Reservation value) {
    if (_ReservationSemestre.LOG.isDebugEnabled()) {
      _ReservationSemestre.LOG.debug("updating reservation from " + reservation() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.ScolGroupeGrp scolGroupeGrp() {
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeGrp)storedValueForKey("scolGroupeGrp");
  }

  public void setScolGroupeGrpRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeGrp value) {
    if (_ReservationSemestre.LOG.isDebugEnabled()) {
      _ReservationSemestre.LOG.debug("updating scolGroupeGrp from " + scolGroupeGrp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ScolGroupeGrp oldValue = scolGroupeGrp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "scolGroupeGrp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "scolGroupeGrp");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteSemestre semestre() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteSemestre)storedValueForKey("semestre");
  }

  public void setSemestreRelationship(org.cocktail.superplaner.serveur.metier.MaquetteSemestre value) {
    if (_ReservationSemestre.LOG.isDebugEnabled()) {
      _ReservationSemestre.LOG.debug("updating semestre from " + semestre() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteSemestre oldValue = semestre();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "semestre");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "semestre");
    }
  }
  

  public static ReservationSemestre createReservationSemestre(EOEditingContext editingContext, Integer hcompRec
) {
    ReservationSemestre eo = (ReservationSemestre) EOUtilities.createAndInsertInstance(editingContext, _ReservationSemestre.ENTITY_NAME);    
		eo.setHcompRec(hcompRec);
    return eo;
  }

  public static NSArray<ReservationSemestre> fetchAllReservationSemestres(EOEditingContext editingContext) {
    return _ReservationSemestre.fetchAllReservationSemestres(editingContext, null);
  }

  public static NSArray<ReservationSemestre> fetchAllReservationSemestres(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ReservationSemestre.fetchReservationSemestres(editingContext, null, sortOrderings);
  }

  public static NSArray<ReservationSemestre> fetchReservationSemestres(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ReservationSemestre.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ReservationSemestre> eoObjects = (NSArray<ReservationSemestre>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ReservationSemestre fetchReservationSemestre(EOEditingContext editingContext, String keyName, Object value) {
    return _ReservationSemestre.fetchReservationSemestre(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ReservationSemestre fetchReservationSemestre(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ReservationSemestre> eoObjects = _ReservationSemestre.fetchReservationSemestres(editingContext, qualifier, null);
    ReservationSemestre eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ReservationSemestre)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ReservationSemestre that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ReservationSemestre fetchRequiredReservationSemestre(EOEditingContext editingContext, String keyName, Object value) {
    return _ReservationSemestre.fetchRequiredReservationSemestre(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ReservationSemestre fetchRequiredReservationSemestre(EOEditingContext editingContext, EOQualifier qualifier) {
    ReservationSemestre eoObject = _ReservationSemestre.fetchReservationSemestre(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ReservationSemestre that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ReservationSemestre localInstanceIn(EOEditingContext editingContext, ReservationSemestre eo) {
    ReservationSemestre localInstance = (eo == null) ? null : (ReservationSemestre)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
