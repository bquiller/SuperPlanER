// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Occupant.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Occupant extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Occupant";

	// Attributes
	public static final String HCOMP_REC_KEY = "hcompRec";

	// Relationships
	public static final String INDIVIDU_KEY = "individu";
	public static final String RESERVATION_KEY = "reservation";

  private static Logger LOG = Logger.getLogger(_Occupant.class);

  public Occupant localInstanceIn(EOEditingContext editingContext) {
    Occupant localInstance = (Occupant)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer hcompRec() {
    return (Integer) storedValueForKey("hcompRec");
  }

  public void setHcompRec(Integer value) {
    if (_Occupant.LOG.isDebugEnabled()) {
    	_Occupant.LOG.debug( "updating hcompRec from " + hcompRec() + " to " + value);
    }
    takeStoredValueForKey(value, "hcompRec");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individu() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individu");
  }

  public void setIndividuRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_Occupant.LOG.isDebugEnabled()) {
      _Occupant.LOG.debug("updating individu from " + individu() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individu();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individu");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individu");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.Reservation reservation() {
    return (org.cocktail.superplaner.serveur.metier.Reservation)storedValueForKey("reservation");
  }

  public void setReservationRelationship(org.cocktail.superplaner.serveur.metier.Reservation value) {
    if (_Occupant.LOG.isDebugEnabled()) {
      _Occupant.LOG.debug("updating reservation from " + reservation() + " to " + value);
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
  

  public static Occupant createOccupant(EOEditingContext editingContext, Integer hcompRec
, org.cocktail.superplaner.serveur.metier.IndividuUlr individu) {
    Occupant eo = (Occupant) EOUtilities.createAndInsertInstance(editingContext, _Occupant.ENTITY_NAME);    
		eo.setHcompRec(hcompRec);
    eo.setIndividuRelationship(individu);
    return eo;
  }

  public static NSArray<Occupant> fetchAllOccupants(EOEditingContext editingContext) {
    return _Occupant.fetchAllOccupants(editingContext, null);
  }

  public static NSArray<Occupant> fetchAllOccupants(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Occupant.fetchOccupants(editingContext, null, sortOrderings);
  }

  public static NSArray<Occupant> fetchOccupants(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Occupant.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Occupant> eoObjects = (NSArray<Occupant>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Occupant fetchOccupant(EOEditingContext editingContext, String keyName, Object value) {
    return _Occupant.fetchOccupant(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Occupant fetchOccupant(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Occupant> eoObjects = _Occupant.fetchOccupants(editingContext, qualifier, null);
    Occupant eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Occupant)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Occupant that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Occupant fetchRequiredOccupant(EOEditingContext editingContext, String keyName, Object value) {
    return _Occupant.fetchRequiredOccupant(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Occupant fetchRequiredOccupant(EOEditingContext editingContext, EOQualifier qualifier) {
    Occupant eoObject = _Occupant.fetchOccupant(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Occupant that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Occupant localInstanceIn(EOEditingContext editingContext, Occupant eo) {
    Occupant localInstance = (eo == null) ? null : (Occupant)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
