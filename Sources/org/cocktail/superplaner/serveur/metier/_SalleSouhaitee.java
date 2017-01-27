// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to SalleSouhaitee.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _SalleSouhaitee extends  EOGenericRecord {
	public static final String ENTITY_NAME = "SalleSouhaitee";

	// Attributes
	public static final String SOU_POSITION_KEY = "souPosition";

	// Relationships
	public static final String RESERVATION_KEY = "reservation";
	public static final String SALLE_KEY = "salle";

  private static Logger LOG = Logger.getLogger(_SalleSouhaitee.class);

  public SalleSouhaitee localInstanceIn(EOEditingContext editingContext) {
    SalleSouhaitee localInstance = (SalleSouhaitee)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer souPosition() {
    return (Integer) storedValueForKey("souPosition");
  }

  public void setSouPosition(Integer value) {
    if (_SalleSouhaitee.LOG.isDebugEnabled()) {
    	_SalleSouhaitee.LOG.debug( "updating souPosition from " + souPosition() + " to " + value);
    }
    takeStoredValueForKey(value, "souPosition");
  }

  public org.cocktail.superplaner.serveur.metier.Reservation reservation() {
    return (org.cocktail.superplaner.serveur.metier.Reservation)storedValueForKey("reservation");
  }

  public void setReservationRelationship(org.cocktail.superplaner.serveur.metier.Reservation value) {
    if (_SalleSouhaitee.LOG.isDebugEnabled()) {
      _SalleSouhaitee.LOG.debug("updating reservation from " + reservation() + " to " + value);
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
    if (_SalleSouhaitee.LOG.isDebugEnabled()) {
      _SalleSouhaitee.LOG.debug("updating salle from " + salle() + " to " + value);
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
  

  public static SalleSouhaitee createSalleSouhaitee(EOEditingContext editingContext) {
    SalleSouhaitee eo = (SalleSouhaitee) EOUtilities.createAndInsertInstance(editingContext, _SalleSouhaitee.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<SalleSouhaitee> fetchAllSalleSouhaitees(EOEditingContext editingContext) {
    return _SalleSouhaitee.fetchAllSalleSouhaitees(editingContext, null);
  }

  public static NSArray<SalleSouhaitee> fetchAllSalleSouhaitees(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _SalleSouhaitee.fetchSalleSouhaitees(editingContext, null, sortOrderings);
  }

  public static NSArray<SalleSouhaitee> fetchSalleSouhaitees(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_SalleSouhaitee.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<SalleSouhaitee> eoObjects = (NSArray<SalleSouhaitee>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static SalleSouhaitee fetchSalleSouhaitee(EOEditingContext editingContext, String keyName, Object value) {
    return _SalleSouhaitee.fetchSalleSouhaitee(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static SalleSouhaitee fetchSalleSouhaitee(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<SalleSouhaitee> eoObjects = _SalleSouhaitee.fetchSalleSouhaitees(editingContext, qualifier, null);
    SalleSouhaitee eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (SalleSouhaitee)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one SalleSouhaitee that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static SalleSouhaitee fetchRequiredSalleSouhaitee(EOEditingContext editingContext, String keyName, Object value) {
    return _SalleSouhaitee.fetchRequiredSalleSouhaitee(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static SalleSouhaitee fetchRequiredSalleSouhaitee(EOEditingContext editingContext, EOQualifier qualifier) {
    SalleSouhaitee eoObject = _SalleSouhaitee.fetchSalleSouhaitee(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no SalleSouhaitee that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static SalleSouhaitee localInstanceIn(EOEditingContext editingContext, SalleSouhaitee eo) {
    SalleSouhaitee localInstance = (eo == null) ? null : (SalleSouhaitee)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
