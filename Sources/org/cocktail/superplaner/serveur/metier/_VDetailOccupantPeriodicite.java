// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VDetailOccupantPeriodicite.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VDetailOccupantPeriodicite extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VDetailOccupantPeriodicite";

	// Attributes
	public static final String DATE_DEB_KEY = "dateDeb";
	public static final String DATE_FIN_KEY = "dateFin";
	public static final String MAP_KEY_KEY = "mapKey";
	public static final String TLOC_CODE_KEY = "tlocCode";

	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String MAQUETTE_AP_KEY = "maquetteAp";
	public static final String RESERVATION_KEY = "reservation";

  private static Logger LOG = Logger.getLogger(_VDetailOccupantPeriodicite.class);

  public VDetailOccupantPeriodicite localInstanceIn(EOEditingContext editingContext) {
    VDetailOccupantPeriodicite localInstance = (VDetailOccupantPeriodicite)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dateDeb() {
    return (NSTimestamp) storedValueForKey("dateDeb");
  }

  public void setDateDeb(NSTimestamp value) {
    if (_VDetailOccupantPeriodicite.LOG.isDebugEnabled()) {
    	_VDetailOccupantPeriodicite.LOG.debug( "updating dateDeb from " + dateDeb() + " to " + value);
    }
    takeStoredValueForKey(value, "dateDeb");
  }

  public NSTimestamp dateFin() {
    return (NSTimestamp) storedValueForKey("dateFin");
  }

  public void setDateFin(NSTimestamp value) {
    if (_VDetailOccupantPeriodicite.LOG.isDebugEnabled()) {
    	_VDetailOccupantPeriodicite.LOG.debug( "updating dateFin from " + dateFin() + " to " + value);
    }
    takeStoredValueForKey(value, "dateFin");
  }

  public Integer mapKey() {
    return (Integer) storedValueForKey("mapKey");
  }

  public void setMapKey(Integer value) {
    if (_VDetailOccupantPeriodicite.LOG.isDebugEnabled()) {
    	_VDetailOccupantPeriodicite.LOG.debug( "updating mapKey from " + mapKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mapKey");
  }

  public String tlocCode() {
    return (String) storedValueForKey("tlocCode");
  }

  public void setTlocCode(String value) {
    if (_VDetailOccupantPeriodicite.LOG.isDebugEnabled()) {
    	_VDetailOccupantPeriodicite.LOG.debug( "updating tlocCode from " + tlocCode() + " to " + value);
    }
    takeStoredValueForKey(value, "tlocCode");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_VDetailOccupantPeriodicite.LOG.isDebugEnabled()) {
      _VDetailOccupantPeriodicite.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individuUlr();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individuUlr");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individuUlr");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteAp maquetteAp() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("maquetteAp");
  }

  public void setMaquetteApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_VDetailOccupantPeriodicite.LOG.isDebugEnabled()) {
      _VDetailOccupantPeriodicite.LOG.debug("updating maquetteAp from " + maquetteAp() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.Reservation reservation() {
    return (org.cocktail.superplaner.serveur.metier.Reservation)storedValueForKey("reservation");
  }

  public void setReservationRelationship(org.cocktail.superplaner.serveur.metier.Reservation value) {
    if (_VDetailOccupantPeriodicite.LOG.isDebugEnabled()) {
      _VDetailOccupantPeriodicite.LOG.debug("updating reservation from " + reservation() + " to " + value);
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
  

  public static VDetailOccupantPeriodicite createVDetailOccupantPeriodicite(EOEditingContext editingContext, NSTimestamp dateDeb
, NSTimestamp dateFin
, Integer mapKey
, String tlocCode
) {
    VDetailOccupantPeriodicite eo = (VDetailOccupantPeriodicite) EOUtilities.createAndInsertInstance(editingContext, _VDetailOccupantPeriodicite.ENTITY_NAME);    
		eo.setDateDeb(dateDeb);
		eo.setDateFin(dateFin);
		eo.setMapKey(mapKey);
		eo.setTlocCode(tlocCode);
    return eo;
  }

  public static NSArray<VDetailOccupantPeriodicite> fetchAllVDetailOccupantPeriodicites(EOEditingContext editingContext) {
    return _VDetailOccupantPeriodicite.fetchAllVDetailOccupantPeriodicites(editingContext, null);
  }

  public static NSArray<VDetailOccupantPeriodicite> fetchAllVDetailOccupantPeriodicites(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VDetailOccupantPeriodicite.fetchVDetailOccupantPeriodicites(editingContext, null, sortOrderings);
  }

  public static NSArray<VDetailOccupantPeriodicite> fetchVDetailOccupantPeriodicites(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VDetailOccupantPeriodicite.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VDetailOccupantPeriodicite> eoObjects = (NSArray<VDetailOccupantPeriodicite>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VDetailOccupantPeriodicite fetchVDetailOccupantPeriodicite(EOEditingContext editingContext, String keyName, Object value) {
    return _VDetailOccupantPeriodicite.fetchVDetailOccupantPeriodicite(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VDetailOccupantPeriodicite fetchVDetailOccupantPeriodicite(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VDetailOccupantPeriodicite> eoObjects = _VDetailOccupantPeriodicite.fetchVDetailOccupantPeriodicites(editingContext, qualifier, null);
    VDetailOccupantPeriodicite eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VDetailOccupantPeriodicite)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VDetailOccupantPeriodicite that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VDetailOccupantPeriodicite fetchRequiredVDetailOccupantPeriodicite(EOEditingContext editingContext, String keyName, Object value) {
    return _VDetailOccupantPeriodicite.fetchRequiredVDetailOccupantPeriodicite(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VDetailOccupantPeriodicite fetchRequiredVDetailOccupantPeriodicite(EOEditingContext editingContext, EOQualifier qualifier) {
    VDetailOccupantPeriodicite eoObject = _VDetailOccupantPeriodicite.fetchVDetailOccupantPeriodicite(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VDetailOccupantPeriodicite that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VDetailOccupantPeriodicite localInstanceIn(EOEditingContext editingContext, VDetailOccupantPeriodicite eo) {
    VDetailOccupantPeriodicite localInstance = (eo == null) ? null : (VDetailOccupantPeriodicite)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
