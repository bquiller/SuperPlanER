// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Reservation.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Reservation extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Reservation";

	// Attributes
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String RESA_COMMENTAIRE_KEY = "resaCommentaire";
	public static final String TLOC_CODE_KEY = "tlocCode";

	// Relationships
	public static final String INDIVIDU_AGENT_KEY = "individuAgent";
	public static final String OCCUPANTS_KEY = "occupants";
	public static final String PERIODICITES_KEY = "periodicites";
	public static final String RESA_EXAMENS_KEY = "resaExamens";
	public static final String RESA_SALLES_KEY = "resaSalles";
	public static final String RESERVATION_AP_KEY = "reservationAp";
	public static final String RESERVATION_OBJETS_KEY = "reservationObjets";
	public static final String RESERVATIONS_SEMESTRES_KEY = "reservationsSemestres";
	public static final String SALLES_SOUHAITEES_KEY = "sallesSouhaitees";
	public static final String TYPE_LOCATION_KEY = "typeLocation";

  private static Logger LOG = Logger.getLogger(_Reservation.class);

  public Reservation localInstanceIn(EOEditingContext editingContext) {
    Reservation localInstance = (Reservation)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey("dCreation");
  }

  public void setDCreation(NSTimestamp value) {
    if (_Reservation.LOG.isDebugEnabled()) {
    	_Reservation.LOG.debug( "updating dCreation from " + dCreation() + " to " + value);
    }
    takeStoredValueForKey(value, "dCreation");
  }

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey("dModification");
  }

  public void setDModification(NSTimestamp value) {
    if (_Reservation.LOG.isDebugEnabled()) {
    	_Reservation.LOG.debug( "updating dModification from " + dModification() + " to " + value);
    }
    takeStoredValueForKey(value, "dModification");
  }

  public String resaCommentaire() {
    return (String) storedValueForKey("resaCommentaire");
  }

  public void setResaCommentaire(String value) {
    if (_Reservation.LOG.isDebugEnabled()) {
    	_Reservation.LOG.debug( "updating resaCommentaire from " + resaCommentaire() + " to " + value);
    }
    takeStoredValueForKey(value, "resaCommentaire");
  }

  public String tlocCode() {
    return (String) storedValueForKey("tlocCode");
  }

  public void setTlocCode(String value) {
    if (_Reservation.LOG.isDebugEnabled()) {
    	_Reservation.LOG.debug( "updating tlocCode from " + tlocCode() + " to " + value);
    }
    takeStoredValueForKey(value, "tlocCode");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuAgent() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuAgent");
  }

  public void setIndividuAgentRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("updating individuAgent from " + individuAgent() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individuAgent();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individuAgent");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individuAgent");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.TypeLocation typeLocation() {
    return (org.cocktail.superplaner.serveur.metier.TypeLocation)storedValueForKey("typeLocation");
  }

  public void setTypeLocationRelationship(org.cocktail.superplaner.serveur.metier.TypeLocation value) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("updating typeLocation from " + typeLocation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.TypeLocation oldValue = typeLocation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "typeLocation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "typeLocation");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.Occupant> occupants() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.Occupant>)storedValueForKey("occupants");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Occupant> occupants(EOQualifier qualifier) {
    return occupants(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Occupant> occupants(EOQualifier qualifier, boolean fetch) {
    return occupants(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Occupant> occupants(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.Occupant> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.Occupant.RESERVATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.Occupant.fetchOccupants(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = occupants();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Occupant>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Occupant>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToOccupantsRelationship(org.cocktail.superplaner.serveur.metier.Occupant object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("adding " + object + " to occupants relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "occupants");
  }

  public void removeFromOccupantsRelationship(org.cocktail.superplaner.serveur.metier.Occupant object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("removing " + object + " from occupants relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "occupants");
  }

  public org.cocktail.superplaner.serveur.metier.Occupant createOccupantsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Occupant");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "occupants");
    return (org.cocktail.superplaner.serveur.metier.Occupant) eo;
  }

  public void deleteOccupantsRelationship(org.cocktail.superplaner.serveur.metier.Occupant object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "occupants");
    editingContext().deleteObject(object);
  }

  public void deleteAllOccupantsRelationships() {
    Enumeration objects = occupants().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteOccupantsRelationship((org.cocktail.superplaner.serveur.metier.Occupant)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Periodicite> periodicites() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.Periodicite>)storedValueForKey("periodicites");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Periodicite> periodicites(EOQualifier qualifier) {
    return periodicites(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Periodicite> periodicites(EOQualifier qualifier, boolean fetch) {
    return periodicites(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Periodicite> periodicites(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.Periodicite> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.Periodicite.RESERVATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.Periodicite.fetchPeriodicites(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = periodicites();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Periodicite>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Periodicite>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToPeriodicitesRelationship(org.cocktail.superplaner.serveur.metier.Periodicite object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("adding " + object + " to periodicites relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "periodicites");
  }

  public void removeFromPeriodicitesRelationship(org.cocktail.superplaner.serveur.metier.Periodicite object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("removing " + object + " from periodicites relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "periodicites");
  }

  public org.cocktail.superplaner.serveur.metier.Periodicite createPeriodicitesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Periodicite");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "periodicites");
    return (org.cocktail.superplaner.serveur.metier.Periodicite) eo;
  }

  public void deletePeriodicitesRelationship(org.cocktail.superplaner.serveur.metier.Periodicite object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "periodicites");
    editingContext().deleteObject(object);
  }

  public void deleteAllPeriodicitesRelationships() {
    Enumeration objects = periodicites().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePeriodicitesRelationship((org.cocktail.superplaner.serveur.metier.Periodicite)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen> resaExamens() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen>)storedValueForKey("resaExamens");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen> resaExamens(EOQualifier qualifier) {
    return resaExamens(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen> resaExamens(EOQualifier qualifier, boolean fetch) {
    return resaExamens(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen> resaExamens(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ResaExamen.RESERVATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ResaExamen.fetchResaExamens(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = resaExamens();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToResaExamensRelationship(org.cocktail.superplaner.serveur.metier.ResaExamen object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("adding " + object + " to resaExamens relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "resaExamens");
  }

  public void removeFromResaExamensRelationship(org.cocktail.superplaner.serveur.metier.ResaExamen object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("removing " + object + " from resaExamens relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaExamens");
  }

  public org.cocktail.superplaner.serveur.metier.ResaExamen createResaExamensRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ResaExamen");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "resaExamens");
    return (org.cocktail.superplaner.serveur.metier.ResaExamen) eo;
  }

  public void deleteResaExamensRelationship(org.cocktail.superplaner.serveur.metier.ResaExamen object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaExamens");
    editingContext().deleteObject(object);
  }

  public void deleteAllResaExamensRelationships() {
    Enumeration objects = resaExamens().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteResaExamensRelationship((org.cocktail.superplaner.serveur.metier.ResaExamen)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles> resaSalles() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles>)storedValueForKey("resaSalles");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles> resaSalles(EOQualifier qualifier) {
    return resaSalles(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles> resaSalles(EOQualifier qualifier, boolean fetch) {
    return resaSalles(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles> resaSalles(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ResaSalles.RESERVATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ResaSalles.fetchResaSalleses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = resaSalles();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToResaSallesRelationship(org.cocktail.superplaner.serveur.metier.ResaSalles object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("adding " + object + " to resaSalles relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "resaSalles");
  }

  public void removeFromResaSallesRelationship(org.cocktail.superplaner.serveur.metier.ResaSalles object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("removing " + object + " from resaSalles relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaSalles");
  }

  public org.cocktail.superplaner.serveur.metier.ResaSalles createResaSallesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ResaSalles");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "resaSalles");
    return (org.cocktail.superplaner.serveur.metier.ResaSalles) eo;
  }

  public void deleteResaSallesRelationship(org.cocktail.superplaner.serveur.metier.ResaSalles object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaSalles");
    editingContext().deleteObject(object);
  }

  public void deleteAllResaSallesRelationships() {
    Enumeration objects = resaSalles().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteResaSallesRelationship((org.cocktail.superplaner.serveur.metier.ResaSalles)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp> reservationAp() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp>)storedValueForKey("reservationAp");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp> reservationAp(EOQualifier qualifier) {
    return reservationAp(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp> reservationAp(EOQualifier qualifier, boolean fetch) {
    return reservationAp(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp> reservationAp(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ReservationAp.RESERVATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ReservationAp.fetchReservationAps(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = reservationAp();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationAp>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToReservationApRelationship(org.cocktail.superplaner.serveur.metier.ReservationAp object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("adding " + object + " to reservationAp relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "reservationAp");
  }

  public void removeFromReservationApRelationship(org.cocktail.superplaner.serveur.metier.ReservationAp object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("removing " + object + " from reservationAp relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "reservationAp");
  }

  public org.cocktail.superplaner.serveur.metier.ReservationAp createReservationApRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ReservationAp");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "reservationAp");
    return (org.cocktail.superplaner.serveur.metier.ReservationAp) eo;
  }

  public void deleteReservationApRelationship(org.cocktail.superplaner.serveur.metier.ReservationAp object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "reservationAp");
    editingContext().deleteObject(object);
  }

  public void deleteAllReservationApRelationships() {
    Enumeration objects = reservationAp().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteReservationApRelationship((org.cocktail.superplaner.serveur.metier.ReservationAp)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet> reservationObjets() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet>)storedValueForKey("reservationObjets");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet> reservationObjets(EOQualifier qualifier) {
    return reservationObjets(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet> reservationObjets(EOQualifier qualifier, boolean fetch) {
    return reservationObjets(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet> reservationObjets(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ReservationObjet.RESERVATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ReservationObjet.fetchReservationObjets(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = reservationObjets();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToReservationObjetsRelationship(org.cocktail.superplaner.serveur.metier.ReservationObjet object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("adding " + object + " to reservationObjets relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "reservationObjets");
  }

  public void removeFromReservationObjetsRelationship(org.cocktail.superplaner.serveur.metier.ReservationObjet object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("removing " + object + " from reservationObjets relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "reservationObjets");
  }

  public org.cocktail.superplaner.serveur.metier.ReservationObjet createReservationObjetsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ReservationObjet");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "reservationObjets");
    return (org.cocktail.superplaner.serveur.metier.ReservationObjet) eo;
  }

  public void deleteReservationObjetsRelationship(org.cocktail.superplaner.serveur.metier.ReservationObjet object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "reservationObjets");
    editingContext().deleteObject(object);
  }

  public void deleteAllReservationObjetsRelationships() {
    Enumeration objects = reservationObjets().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteReservationObjetsRelationship((org.cocktail.superplaner.serveur.metier.ReservationObjet)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre> reservationsSemestres() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre>)storedValueForKey("reservationsSemestres");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre> reservationsSemestres(EOQualifier qualifier) {
    return reservationsSemestres(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre> reservationsSemestres(EOQualifier qualifier, boolean fetch) {
    return reservationsSemestres(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre> reservationsSemestres(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ReservationSemestre.RESERVATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ReservationSemestre.fetchReservationSemestres(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = reservationsSemestres();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToReservationsSemestresRelationship(org.cocktail.superplaner.serveur.metier.ReservationSemestre object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("adding " + object + " to reservationsSemestres relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "reservationsSemestres");
  }

  public void removeFromReservationsSemestresRelationship(org.cocktail.superplaner.serveur.metier.ReservationSemestre object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("removing " + object + " from reservationsSemestres relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "reservationsSemestres");
  }

  public org.cocktail.superplaner.serveur.metier.ReservationSemestre createReservationsSemestresRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ReservationSemestre");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "reservationsSemestres");
    return (org.cocktail.superplaner.serveur.metier.ReservationSemestre) eo;
  }

  public void deleteReservationsSemestresRelationship(org.cocktail.superplaner.serveur.metier.ReservationSemestre object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "reservationsSemestres");
    editingContext().deleteObject(object);
  }

  public void deleteAllReservationsSemestresRelationships() {
    Enumeration objects = reservationsSemestres().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteReservationsSemestresRelationship((org.cocktail.superplaner.serveur.metier.ReservationSemestre)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee> sallesSouhaitees() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee>)storedValueForKey("sallesSouhaitees");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee> sallesSouhaitees(EOQualifier qualifier) {
    return sallesSouhaitees(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee> sallesSouhaitees(EOQualifier qualifier, boolean fetch) {
    return sallesSouhaitees(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee> sallesSouhaitees(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.SalleSouhaitee.RESERVATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.SalleSouhaitee.fetchSalleSouhaitees(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = sallesSouhaitees();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToSallesSouhaiteesRelationship(org.cocktail.superplaner.serveur.metier.SalleSouhaitee object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("adding " + object + " to sallesSouhaitees relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "sallesSouhaitees");
  }

  public void removeFromSallesSouhaiteesRelationship(org.cocktail.superplaner.serveur.metier.SalleSouhaitee object) {
    if (_Reservation.LOG.isDebugEnabled()) {
      _Reservation.LOG.debug("removing " + object + " from sallesSouhaitees relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "sallesSouhaitees");
  }

  public org.cocktail.superplaner.serveur.metier.SalleSouhaitee createSallesSouhaiteesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("SalleSouhaitee");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "sallesSouhaitees");
    return (org.cocktail.superplaner.serveur.metier.SalleSouhaitee) eo;
  }

  public void deleteSallesSouhaiteesRelationship(org.cocktail.superplaner.serveur.metier.SalleSouhaitee object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "sallesSouhaitees");
    editingContext().deleteObject(object);
  }

  public void deleteAllSallesSouhaiteesRelationships() {
    Enumeration objects = sallesSouhaitees().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteSallesSouhaiteesRelationship((org.cocktail.superplaner.serveur.metier.SalleSouhaitee)objects.nextElement());
    }
  }


  public static Reservation createReservation(EOEditingContext editingContext, NSTimestamp dCreation
, NSTimestamp dModification
, String tlocCode
) {
    Reservation eo = (Reservation) EOUtilities.createAndInsertInstance(editingContext, _Reservation.ENTITY_NAME);    
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
		eo.setTlocCode(tlocCode);
    return eo;
  }

  public static NSArray<Reservation> fetchAllReservations(EOEditingContext editingContext) {
    return _Reservation.fetchAllReservations(editingContext, null);
  }

  public static NSArray<Reservation> fetchAllReservations(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Reservation.fetchReservations(editingContext, null, sortOrderings);
  }

  public static NSArray<Reservation> fetchReservations(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Reservation.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Reservation> eoObjects = (NSArray<Reservation>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Reservation fetchReservation(EOEditingContext editingContext, String keyName, Object value) {
    return _Reservation.fetchReservation(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Reservation fetchReservation(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Reservation> eoObjects = _Reservation.fetchReservations(editingContext, qualifier, null);
    Reservation eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Reservation)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Reservation that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Reservation fetchRequiredReservation(EOEditingContext editingContext, String keyName, Object value) {
    return _Reservation.fetchRequiredReservation(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Reservation fetchRequiredReservation(EOEditingContext editingContext, EOQualifier qualifier) {
    Reservation eoObject = _Reservation.fetchReservation(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Reservation that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Reservation localInstanceIn(EOEditingContext editingContext, Reservation eo) {
    Reservation localInstance = (eo == null) ? null : (Reservation)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
