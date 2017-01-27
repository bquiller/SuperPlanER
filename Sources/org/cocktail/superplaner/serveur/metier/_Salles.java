// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Salles.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Salles extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Salles";

	// Attributes
	public static final String C_LOCAL_KEY = "cLocal";
	public static final String SAL_CAPACITE_KEY = "salCapacite";
	public static final String SAL_DESCRIPTIF_KEY = "salDescriptif";
	public static final String SAL_ECRAN_KEY = "salEcran";
	public static final String SAL_ETAGE_KEY = "salEtage";
	public static final String SAL_INSONORISEE_KEY = "salInsonorisee";
	public static final String SAL_NB_ARMOIRES_KEY = "salNbArmoires";
	public static final String SAL_NB_BUREAUX_KEY = "salNbBureaux";
	public static final String SAL_NB_CHAISES_KEY = "salNbChaises";
	public static final String SAL_NB_FENETRES_KEY = "salNbFenetres";
	public static final String SAL_NB_PLACES_EXAM_LIB_KEY = "salNbPlacesExamLib";
	public static final String SAL_NB_TABLES_KEY = "salNbTables";
	public static final String SAL_NO_POSTE_KEY = "salNoPoste";
	public static final String SAL_OBSCUR_KEY = "salObscur";
	public static final String SAL_PORTE_KEY = "salPorte";
	public static final String SAL_RESERVABLE_KEY = "salReservable";
	public static final String SAL_RETRO_KEY = "salRetro";
	public static final String SAL_SUPERFICIE_KEY = "salSuperficie";
	public static final String SAL_TABLEAU_KEY = "salTableau";
	public static final String SAL_TABLEAU_BLANC_KEY = "salTableauBlanc";
	public static final String SAL_TABLEAU_PAPIER_KEY = "salTableauPapier";
	public static final String SAL_TELEVISION_KEY = "salTelevision";

	// Relationships
	public static final String AFFECTATIONS_SALLE_KEY = "affectationsSalle";
	public static final String DEPOSITAIRES_KEY = "depositaires";
	public static final String LOCAL_KEY = "local";
	public static final String PRISESS_KEY = "prisess";
	public static final String REPART_LOT_SALLES_KEY = "repartLotSalles";
	public static final String REPARTS_BAT_IMP_GEO_KEY = "repartsBatImpGeo";
	public static final String TYPE_SALLE_KEY = "typeSalle";

  private static Logger LOG = Logger.getLogger(_Salles.class);

  public Salles localInstanceIn(EOEditingContext editingContext) {
    Salles localInstance = (Salles)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cLocal() {
    return (String) storedValueForKey("cLocal");
  }

  public void setCLocal(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating cLocal from " + cLocal() + " to " + value);
    }
    takeStoredValueForKey(value, "cLocal");
  }

  public Integer salCapacite() {
    return (Integer) storedValueForKey("salCapacite");
  }

  public void setSalCapacite(Integer value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salCapacite from " + salCapacite() + " to " + value);
    }
    takeStoredValueForKey(value, "salCapacite");
  }

  public String salDescriptif() {
    return (String) storedValueForKey("salDescriptif");
  }

  public void setSalDescriptif(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salDescriptif from " + salDescriptif() + " to " + value);
    }
    takeStoredValueForKey(value, "salDescriptif");
  }

  public String salEcran() {
    return (String) storedValueForKey("salEcran");
  }

  public void setSalEcran(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salEcran from " + salEcran() + " to " + value);
    }
    takeStoredValueForKey(value, "salEcran");
  }

  public String salEtage() {
    return (String) storedValueForKey("salEtage");
  }

  public void setSalEtage(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salEtage from " + salEtage() + " to " + value);
    }
    takeStoredValueForKey(value, "salEtage");
  }

  public String salInsonorisee() {
    return (String) storedValueForKey("salInsonorisee");
  }

  public void setSalInsonorisee(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salInsonorisee from " + salInsonorisee() + " to " + value);
    }
    takeStoredValueForKey(value, "salInsonorisee");
  }

  public Integer salNbArmoires() {
    return (Integer) storedValueForKey("salNbArmoires");
  }

  public void setSalNbArmoires(Integer value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salNbArmoires from " + salNbArmoires() + " to " + value);
    }
    takeStoredValueForKey(value, "salNbArmoires");
  }

  public Integer salNbBureaux() {
    return (Integer) storedValueForKey("salNbBureaux");
  }

  public void setSalNbBureaux(Integer value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salNbBureaux from " + salNbBureaux() + " to " + value);
    }
    takeStoredValueForKey(value, "salNbBureaux");
  }

  public Integer salNbChaises() {
    return (Integer) storedValueForKey("salNbChaises");
  }

  public void setSalNbChaises(Integer value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salNbChaises from " + salNbChaises() + " to " + value);
    }
    takeStoredValueForKey(value, "salNbChaises");
  }

  public Integer salNbFenetres() {
    return (Integer) storedValueForKey("salNbFenetres");
  }

  public void setSalNbFenetres(Integer value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salNbFenetres from " + salNbFenetres() + " to " + value);
    }
    takeStoredValueForKey(value, "salNbFenetres");
  }

  public Integer salNbPlacesExamLib() {
    return (Integer) storedValueForKey("salNbPlacesExamLib");
  }

  public void setSalNbPlacesExamLib(Integer value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salNbPlacesExamLib from " + salNbPlacesExamLib() + " to " + value);
    }
    takeStoredValueForKey(value, "salNbPlacesExamLib");
  }

  public Integer salNbTables() {
    return (Integer) storedValueForKey("salNbTables");
  }

  public void setSalNbTables(Integer value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salNbTables from " + salNbTables() + " to " + value);
    }
    takeStoredValueForKey(value, "salNbTables");
  }

  public String salNoPoste() {
    return (String) storedValueForKey("salNoPoste");
  }

  public void setSalNoPoste(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salNoPoste from " + salNoPoste() + " to " + value);
    }
    takeStoredValueForKey(value, "salNoPoste");
  }

  public String salObscur() {
    return (String) storedValueForKey("salObscur");
  }

  public void setSalObscur(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salObscur from " + salObscur() + " to " + value);
    }
    takeStoredValueForKey(value, "salObscur");
  }

  public String salPorte() {
    return (String) storedValueForKey("salPorte");
  }

  public void setSalPorte(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salPorte from " + salPorte() + " to " + value);
    }
    takeStoredValueForKey(value, "salPorte");
  }

  public String salReservable() {
    return (String) storedValueForKey("salReservable");
  }

  public void setSalReservable(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salReservable from " + salReservable() + " to " + value);
    }
    takeStoredValueForKey(value, "salReservable");
  }

  public String salRetro() {
    return (String) storedValueForKey("salRetro");
  }

  public void setSalRetro(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salRetro from " + salRetro() + " to " + value);
    }
    takeStoredValueForKey(value, "salRetro");
  }

  public java.math.BigDecimal salSuperficie() {
    return (java.math.BigDecimal) storedValueForKey("salSuperficie");
  }

  public void setSalSuperficie(java.math.BigDecimal value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salSuperficie from " + salSuperficie() + " to " + value);
    }
    takeStoredValueForKey(value, "salSuperficie");
  }

  public String salTableau() {
    return (String) storedValueForKey("salTableau");
  }

  public void setSalTableau(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salTableau from " + salTableau() + " to " + value);
    }
    takeStoredValueForKey(value, "salTableau");
  }

  public String salTableauBlanc() {
    return (String) storedValueForKey("salTableauBlanc");
  }

  public void setSalTableauBlanc(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salTableauBlanc from " + salTableauBlanc() + " to " + value);
    }
    takeStoredValueForKey(value, "salTableauBlanc");
  }

  public String salTableauPapier() {
    return (String) storedValueForKey("salTableauPapier");
  }

  public void setSalTableauPapier(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salTableauPapier from " + salTableauPapier() + " to " + value);
    }
    takeStoredValueForKey(value, "salTableauPapier");
  }

  public String salTelevision() {
    return (String) storedValueForKey("salTelevision");
  }

  public void setSalTelevision(String value) {
    if (_Salles.LOG.isDebugEnabled()) {
    	_Salles.LOG.debug( "updating salTelevision from " + salTelevision() + " to " + value);
    }
    takeStoredValueForKey(value, "salTelevision");
  }

  public org.cocktail.superplaner.serveur.metier.Local local() {
    return (org.cocktail.superplaner.serveur.metier.Local)storedValueForKey("local");
  }

  public void setLocalRelationship(org.cocktail.superplaner.serveur.metier.Local value) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("updating local from " + local() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Local oldValue = local();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "local");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "local");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.TypeSalle typeSalle() {
    return (org.cocktail.superplaner.serveur.metier.TypeSalle)storedValueForKey("typeSalle");
  }

  public void setTypeSalleRelationship(org.cocktail.superplaner.serveur.metier.TypeSalle value) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("updating typeSalle from " + typeSalle() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.TypeSalle oldValue = typeSalle();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "typeSalle");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "typeSalle");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.AffectationSalle> affectationsSalle() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.AffectationSalle>)storedValueForKey("affectationsSalle");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.AffectationSalle> affectationsSalle(EOQualifier qualifier) {
    return affectationsSalle(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.AffectationSalle> affectationsSalle(EOQualifier qualifier, boolean fetch) {
    return affectationsSalle(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.AffectationSalle> affectationsSalle(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.AffectationSalle> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.AffectationSalle.SALLE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.AffectationSalle.fetchAffectationSalles(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = affectationsSalle();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.AffectationSalle>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.AffectationSalle>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToAffectationsSalleRelationship(org.cocktail.superplaner.serveur.metier.AffectationSalle object) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("adding " + object + " to affectationsSalle relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "affectationsSalle");
  }

  public void removeFromAffectationsSalleRelationship(org.cocktail.superplaner.serveur.metier.AffectationSalle object) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("removing " + object + " from affectationsSalle relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "affectationsSalle");
  }

  public org.cocktail.superplaner.serveur.metier.AffectationSalle createAffectationsSalleRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("AffectationSalle");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "affectationsSalle");
    return (org.cocktail.superplaner.serveur.metier.AffectationSalle) eo;
  }

  public void deleteAffectationsSalleRelationship(org.cocktail.superplaner.serveur.metier.AffectationSalle object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "affectationsSalle");
    editingContext().deleteObject(object);
  }

  public void deleteAllAffectationsSalleRelationships() {
    Enumeration objects = affectationsSalle().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteAffectationsSalleRelationship((org.cocktail.superplaner.serveur.metier.AffectationSalle)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.DepositaireSalles> depositaires() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.DepositaireSalles>)storedValueForKey("depositaires");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.DepositaireSalles> depositaires(EOQualifier qualifier) {
    return depositaires(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.DepositaireSalles> depositaires(EOQualifier qualifier, boolean fetch) {
    return depositaires(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.DepositaireSalles> depositaires(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.DepositaireSalles> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.DepositaireSalles.SALLE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.DepositaireSalles.fetchDepositaireSalleses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = depositaires();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.DepositaireSalles>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.DepositaireSalles>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToDepositairesRelationship(org.cocktail.superplaner.serveur.metier.DepositaireSalles object) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("adding " + object + " to depositaires relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "depositaires");
  }

  public void removeFromDepositairesRelationship(org.cocktail.superplaner.serveur.metier.DepositaireSalles object) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("removing " + object + " from depositaires relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "depositaires");
  }

  public org.cocktail.superplaner.serveur.metier.DepositaireSalles createDepositairesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("DepositaireSalles");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "depositaires");
    return (org.cocktail.superplaner.serveur.metier.DepositaireSalles) eo;
  }

  public void deleteDepositairesRelationship(org.cocktail.superplaner.serveur.metier.DepositaireSalles object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "depositaires");
    editingContext().deleteObject(object);
  }

  public void deleteAllDepositairesRelationships() {
    Enumeration objects = depositaires().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteDepositairesRelationship((org.cocktail.superplaner.serveur.metier.DepositaireSalles)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Prises> prisess() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.Prises>)storedValueForKey("prisess");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Prises> prisess(EOQualifier qualifier) {
    return prisess(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Prises> prisess(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.Prises> results;
      results = prisess();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Prises>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Prises>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToPrisessRelationship(org.cocktail.superplaner.serveur.metier.Prises object) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("adding " + object + " to prisess relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "prisess");
  }

  public void removeFromPrisessRelationship(org.cocktail.superplaner.serveur.metier.Prises object) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("removing " + object + " from prisess relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "prisess");
  }

  public org.cocktail.superplaner.serveur.metier.Prises createPrisessRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Prises");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "prisess");
    return (org.cocktail.superplaner.serveur.metier.Prises) eo;
  }

  public void deletePrisessRelationship(org.cocktail.superplaner.serveur.metier.Prises object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "prisess");
    editingContext().deleteObject(object);
  }

  public void deleteAllPrisessRelationships() {
    Enumeration objects = prisess().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePrisessRelationship((org.cocktail.superplaner.serveur.metier.Prises)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle> repartLotSalles() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle>)storedValueForKey("repartLotSalles");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle> repartLotSalles(EOQualifier qualifier) {
    return repartLotSalles(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle> repartLotSalles(EOQualifier qualifier, boolean fetch) {
    return repartLotSalles(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle> repartLotSalles(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.RepartLotSalle.SALLE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.RepartLotSalle.fetchRepartLotSalles(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartLotSalles();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotSalle>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartLotSallesRelationship(org.cocktail.superplaner.serveur.metier.RepartLotSalle object) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("adding " + object + " to repartLotSalles relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartLotSalles");
  }

  public void removeFromRepartLotSallesRelationship(org.cocktail.superplaner.serveur.metier.RepartLotSalle object) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("removing " + object + " from repartLotSalles relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartLotSalles");
  }

  public org.cocktail.superplaner.serveur.metier.RepartLotSalle createRepartLotSallesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartLotSalle");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "repartLotSalles");
    return (org.cocktail.superplaner.serveur.metier.RepartLotSalle) eo;
  }

  public void deleteRepartLotSallesRelationship(org.cocktail.superplaner.serveur.metier.RepartLotSalle object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartLotSalles");
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartLotSallesRelationships() {
    Enumeration objects = repartLotSalles().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartLotSallesRelationship((org.cocktail.superplaner.serveur.metier.RepartLotSalle)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo> repartsBatImpGeo() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo>)storedValueForKey("repartsBatImpGeo");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo> repartsBatImpGeo(EOQualifier qualifier) {
    return repartsBatImpGeo(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo> repartsBatImpGeo(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo> results;
      results = repartsBatImpGeo();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartBatImpGeo>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRepartsBatImpGeoRelationship(org.cocktail.superplaner.serveur.metier.RepartBatImpGeo object) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("adding " + object + " to repartsBatImpGeo relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartsBatImpGeo");
  }

  public void removeFromRepartsBatImpGeoRelationship(org.cocktail.superplaner.serveur.metier.RepartBatImpGeo object) {
    if (_Salles.LOG.isDebugEnabled()) {
      _Salles.LOG.debug("removing " + object + " from repartsBatImpGeo relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartsBatImpGeo");
  }

  public org.cocktail.superplaner.serveur.metier.RepartBatImpGeo createRepartsBatImpGeoRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartBatImpGeo");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "repartsBatImpGeo");
    return (org.cocktail.superplaner.serveur.metier.RepartBatImpGeo) eo;
  }

  public void deleteRepartsBatImpGeoRelationship(org.cocktail.superplaner.serveur.metier.RepartBatImpGeo object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartsBatImpGeo");
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartsBatImpGeoRelationships() {
    Enumeration objects = repartsBatImpGeo().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartsBatImpGeoRelationship((org.cocktail.superplaner.serveur.metier.RepartBatImpGeo)objects.nextElement());
    }
  }


  public static Salles createSalles(EOEditingContext editingContext, String salEtage
, String salPorte
) {
    Salles eo = (Salles) EOUtilities.createAndInsertInstance(editingContext, _Salles.ENTITY_NAME);    
		eo.setSalEtage(salEtage);
		eo.setSalPorte(salPorte);
    return eo;
  }

  public static NSArray<Salles> fetchAllSalleses(EOEditingContext editingContext) {
    return _Salles.fetchAllSalleses(editingContext, null);
  }

  public static NSArray<Salles> fetchAllSalleses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Salles.fetchSalleses(editingContext, null, sortOrderings);
  }

  public static NSArray<Salles> fetchSalleses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Salles.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Salles> eoObjects = (NSArray<Salles>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Salles fetchSalles(EOEditingContext editingContext, String keyName, Object value) {
    return _Salles.fetchSalles(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Salles fetchSalles(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Salles> eoObjects = _Salles.fetchSalleses(editingContext, qualifier, null);
    Salles eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Salles)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Salles that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Salles fetchRequiredSalles(EOEditingContext editingContext, String keyName, Object value) {
    return _Salles.fetchRequiredSalles(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Salles fetchRequiredSalles(EOEditingContext editingContext, EOQualifier qualifier) {
    Salles eoObject = _Salles.fetchSalles(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Salles that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Salles localInstanceIn(EOEditingContext editingContext, Salles eo) {
    Salles localInstance = (eo == null) ? null : (Salles)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
