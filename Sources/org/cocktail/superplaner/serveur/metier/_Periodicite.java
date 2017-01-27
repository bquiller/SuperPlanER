// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Periodicite.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Periodicite extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Periodicite";

	// Attributes
	public static final String DATE_DEB_KEY = "dateDeb";
	public static final String DATE_FIN_KEY = "dateFin";
	public static final String HCOMP_KEY = "hcomp";

	// Relationships
	public static final String OCCUPANTS_KEY = "occupants";
	public static final String RESA_EXAMENS_KEY = "resaExamens";
	public static final String RESA_SALLES_KEY = "resaSalles";
	public static final String RESERVATION_KEY = "reservation";
	public static final String RESERVATION_AP_KEY = "reservationAp";
	public static final String RESERVATION_OBJETS_KEY = "reservationObjets";
	public static final String RESERVATION_SEMESTRES_KEY = "reservationSemestres";
	public static final String SALLES_SOUHAITEES_KEY = "sallesSouhaitees";

  private static Logger LOG = Logger.getLogger(_Periodicite.class);

  public Periodicite localInstanceIn(EOEditingContext editingContext) {
    Periodicite localInstance = (Periodicite)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dateDeb() {
    return (NSTimestamp) storedValueForKey("dateDeb");
  }

  public void setDateDeb(NSTimestamp value) {
    if (_Periodicite.LOG.isDebugEnabled()) {
    	_Periodicite.LOG.debug( "updating dateDeb from " + dateDeb() + " to " + value);
    }
    takeStoredValueForKey(value, "dateDeb");
  }

  public NSTimestamp dateFin() {
    return (NSTimestamp) storedValueForKey("dateFin");
  }

  public void setDateFin(NSTimestamp value) {
    if (_Periodicite.LOG.isDebugEnabled()) {
    	_Periodicite.LOG.debug( "updating dateFin from " + dateFin() + " to " + value);
    }
    takeStoredValueForKey(value, "dateFin");
  }

  public Integer hcomp() {
    return (Integer) storedValueForKey("hcomp");
  }

  public void setHcomp(Integer value) {
    if (_Periodicite.LOG.isDebugEnabled()) {
    	_Periodicite.LOG.debug( "updating hcomp from " + hcomp() + " to " + value);
    }
    takeStoredValueForKey(value, "hcomp");
  }

  public org.cocktail.superplaner.serveur.metier.Reservation reservation() {
    return (org.cocktail.superplaner.serveur.metier.Reservation)storedValueForKey("reservation");
  }

  public void setReservationRelationship(org.cocktail.superplaner.serveur.metier.Reservation value) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("updating reservation from " + reservation() + " to " + value);
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
  
  public NSArray<org.cocktail.superplaner.serveur.metier.Occupant> occupants() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.Occupant>)storedValueForKey("occupants");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Occupant> occupants(EOQualifier qualifier) {
    return occupants(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Occupant> occupants(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.Occupant> results;
      results = occupants();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Occupant>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Occupant>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToOccupantsRelationship(org.cocktail.superplaner.serveur.metier.Occupant object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("adding " + object + " to occupants relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "occupants");
  }

  public void removeFromOccupantsRelationship(org.cocktail.superplaner.serveur.metier.Occupant object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("removing " + object + " from occupants relationship");
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

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen> resaExamens() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen>)storedValueForKey("resaExamens");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen> resaExamens(EOQualifier qualifier) {
    return resaExamens(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen> resaExamens(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen> results;
      results = resaExamens();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaExamen>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToResaExamensRelationship(org.cocktail.superplaner.serveur.metier.ResaExamen object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("adding " + object + " to resaExamens relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "resaExamens");
  }

  public void removeFromResaExamensRelationship(org.cocktail.superplaner.serveur.metier.ResaExamen object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("removing " + object + " from resaExamens relationship");
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
    return resaSalles(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles> resaSalles(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles> results;
      results = resaSalles();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaSalles>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToResaSallesRelationship(org.cocktail.superplaner.serveur.metier.ResaSalles object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("adding " + object + " to resaSalles relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "resaSalles");
  }

  public void removeFromResaSallesRelationship(org.cocktail.superplaner.serveur.metier.ResaSalles object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("removing " + object + " from resaSalles relationship");
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ReservationAp.PERIODICITES_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("adding " + object + " to reservationAp relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "reservationAp");
  }

  public void removeFromReservationApRelationship(org.cocktail.superplaner.serveur.metier.ReservationAp object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("removing " + object + " from reservationAp relationship");
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
    return reservationObjets(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet> reservationObjets(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet> results;
      results = reservationObjets();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationObjet>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToReservationObjetsRelationship(org.cocktail.superplaner.serveur.metier.ReservationObjet object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("adding " + object + " to reservationObjets relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "reservationObjets");
  }

  public void removeFromReservationObjetsRelationship(org.cocktail.superplaner.serveur.metier.ReservationObjet object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("removing " + object + " from reservationObjets relationship");
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

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre> reservationSemestres() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre>)storedValueForKey("reservationSemestres");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre> reservationSemestres(EOQualifier qualifier) {
    return reservationSemestres(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre> reservationSemestres(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre> results;
      results = reservationSemestres();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ReservationSemestre>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToReservationSemestresRelationship(org.cocktail.superplaner.serveur.metier.ReservationSemestre object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("adding " + object + " to reservationSemestres relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "reservationSemestres");
  }

  public void removeFromReservationSemestresRelationship(org.cocktail.superplaner.serveur.metier.ReservationSemestre object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("removing " + object + " from reservationSemestres relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "reservationSemestres");
  }

  public org.cocktail.superplaner.serveur.metier.ReservationSemestre createReservationSemestresRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ReservationSemestre");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "reservationSemestres");
    return (org.cocktail.superplaner.serveur.metier.ReservationSemestre) eo;
  }

  public void deleteReservationSemestresRelationship(org.cocktail.superplaner.serveur.metier.ReservationSemestre object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "reservationSemestres");
    editingContext().deleteObject(object);
  }

  public void deleteAllReservationSemestresRelationships() {
    Enumeration objects = reservationSemestres().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteReservationSemestresRelationship((org.cocktail.superplaner.serveur.metier.ReservationSemestre)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee> sallesSouhaitees() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee>)storedValueForKey("sallesSouhaitees");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee> sallesSouhaitees(EOQualifier qualifier) {
    return sallesSouhaitees(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee> sallesSouhaitees(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee> results;
      results = sallesSouhaitees();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.SalleSouhaitee>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToSallesSouhaiteesRelationship(org.cocktail.superplaner.serveur.metier.SalleSouhaitee object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("adding " + object + " to sallesSouhaitees relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "sallesSouhaitees");
  }

  public void removeFromSallesSouhaiteesRelationship(org.cocktail.superplaner.serveur.metier.SalleSouhaitee object) {
    if (_Periodicite.LOG.isDebugEnabled()) {
      _Periodicite.LOG.debug("removing " + object + " from sallesSouhaitees relationship");
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


  public static Periodicite createPeriodicite(EOEditingContext editingContext, NSTimestamp dateDeb
, NSTimestamp dateFin
, Integer hcomp
) {
    Periodicite eo = (Periodicite) EOUtilities.createAndInsertInstance(editingContext, _Periodicite.ENTITY_NAME);    
		eo.setDateDeb(dateDeb);
		eo.setDateFin(dateFin);
		eo.setHcomp(hcomp);
    return eo;
  }

  public static NSArray<Periodicite> fetchAllPeriodicites(EOEditingContext editingContext) {
    return _Periodicite.fetchAllPeriodicites(editingContext, null);
  }

  public static NSArray<Periodicite> fetchAllPeriodicites(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Periodicite.fetchPeriodicites(editingContext, null, sortOrderings);
  }

  public static NSArray<Periodicite> fetchPeriodicites(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Periodicite.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Periodicite> eoObjects = (NSArray<Periodicite>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Periodicite fetchPeriodicite(EOEditingContext editingContext, String keyName, Object value) {
    return _Periodicite.fetchPeriodicite(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Periodicite fetchPeriodicite(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Periodicite> eoObjects = _Periodicite.fetchPeriodicites(editingContext, qualifier, null);
    Periodicite eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Periodicite)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Periodicite that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Periodicite fetchRequiredPeriodicite(EOEditingContext editingContext, String keyName, Object value) {
    return _Periodicite.fetchRequiredPeriodicite(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Periodicite fetchRequiredPeriodicite(EOEditingContext editingContext, EOQualifier qualifier) {
    Periodicite eoObject = _Periodicite.fetchPeriodicite(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Periodicite that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Periodicite localInstanceIn(EOEditingContext editingContext, Periodicite eo) {
    Periodicite localInstance = (eo == null) ? null : (Periodicite)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
