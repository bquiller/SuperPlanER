// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to MaquetteSemestre.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _MaquetteSemestre extends  EOGenericRecord {
	public static final String ENTITY_NAME = "MaquetteSemestre";

	// Attributes
	public static final String MSEM_BONIFIABLE_KEY = "msemBonifiable";
	public static final String MSEM_DATE_DEBUT_KEY = "msemDateDebut";
	public static final String MSEM_DATE_FIN_KEY = "msemDateFin";
	public static final String MSEM_HORAIRE_ETU_KEY = "msemHoraireEtu";
	public static final String MSEM_KEY_KEY = "msemKey";
	public static final String MSEM_NOTE_BASE_KEY = "msemNoteBase";
	public static final String MSEM_NOTE_ELIMINATION_KEY = "msemNoteElimination";
	public static final String MSEM_NOTE_OBTENTION_KEY = "msemNoteObtention";
	public static final String MSEM_ORDRE_KEY = "msemOrdre";
	public static final String MSEM_SEMAINE_SESSION1_KEY = "msemSemaineSession1";
	public static final String MSEM_SEMAINE_SESSION2_KEY = "msemSemaineSession2";

	// Relationships
	public static final String REPARTITION_UES_KEY = "repartitionUes";
	public static final String SCOL_FORMATION_ANNEE_KEY = "scolFormationAnnee";

  private static Logger LOG = Logger.getLogger(_MaquetteSemestre.class);

  public MaquetteSemestre localInstanceIn(EOEditingContext editingContext) {
    MaquetteSemestre localInstance = (MaquetteSemestre)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer msemBonifiable() {
    return (Integer) storedValueForKey("msemBonifiable");
  }

  public void setMsemBonifiable(Integer value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
    	_MaquetteSemestre.LOG.debug( "updating msemBonifiable from " + msemBonifiable() + " to " + value);
    }
    takeStoredValueForKey(value, "msemBonifiable");
  }

  public NSTimestamp msemDateDebut() {
    return (NSTimestamp) storedValueForKey("msemDateDebut");
  }

  public void setMsemDateDebut(NSTimestamp value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
    	_MaquetteSemestre.LOG.debug( "updating msemDateDebut from " + msemDateDebut() + " to " + value);
    }
    takeStoredValueForKey(value, "msemDateDebut");
  }

  public NSTimestamp msemDateFin() {
    return (NSTimestamp) storedValueForKey("msemDateFin");
  }

  public void setMsemDateFin(NSTimestamp value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
    	_MaquetteSemestre.LOG.debug( "updating msemDateFin from " + msemDateFin() + " to " + value);
    }
    takeStoredValueForKey(value, "msemDateFin");
  }

  public java.math.BigDecimal msemHoraireEtu() {
    return (java.math.BigDecimal) storedValueForKey("msemHoraireEtu");
  }

  public void setMsemHoraireEtu(java.math.BigDecimal value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
    	_MaquetteSemestre.LOG.debug( "updating msemHoraireEtu from " + msemHoraireEtu() + " to " + value);
    }
    takeStoredValueForKey(value, "msemHoraireEtu");
  }

  public Integer msemKey() {
    return (Integer) storedValueForKey("msemKey");
  }

  public void setMsemKey(Integer value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
    	_MaquetteSemestre.LOG.debug( "updating msemKey from " + msemKey() + " to " + value);
    }
    takeStoredValueForKey(value, "msemKey");
  }

  public java.math.BigDecimal msemNoteBase() {
    return (java.math.BigDecimal) storedValueForKey("msemNoteBase");
  }

  public void setMsemNoteBase(java.math.BigDecimal value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
    	_MaquetteSemestre.LOG.debug( "updating msemNoteBase from " + msemNoteBase() + " to " + value);
    }
    takeStoredValueForKey(value, "msemNoteBase");
  }

  public java.math.BigDecimal msemNoteElimination() {
    return (java.math.BigDecimal) storedValueForKey("msemNoteElimination");
  }

  public void setMsemNoteElimination(java.math.BigDecimal value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
    	_MaquetteSemestre.LOG.debug( "updating msemNoteElimination from " + msemNoteElimination() + " to " + value);
    }
    takeStoredValueForKey(value, "msemNoteElimination");
  }

  public java.math.BigDecimal msemNoteObtention() {
    return (java.math.BigDecimal) storedValueForKey("msemNoteObtention");
  }

  public void setMsemNoteObtention(java.math.BigDecimal value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
    	_MaquetteSemestre.LOG.debug( "updating msemNoteObtention from " + msemNoteObtention() + " to " + value);
    }
    takeStoredValueForKey(value, "msemNoteObtention");
  }

  public Integer msemOrdre() {
    return (Integer) storedValueForKey("msemOrdre");
  }

  public void setMsemOrdre(Integer value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
    	_MaquetteSemestre.LOG.debug( "updating msemOrdre from " + msemOrdre() + " to " + value);
    }
    takeStoredValueForKey(value, "msemOrdre");
  }

  public Integer msemSemaineSession1() {
    return (Integer) storedValueForKey("msemSemaineSession1");
  }

  public void setMsemSemaineSession1(Integer value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
    	_MaquetteSemestre.LOG.debug( "updating msemSemaineSession1 from " + msemSemaineSession1() + " to " + value);
    }
    takeStoredValueForKey(value, "msemSemaineSession1");
  }

  public Integer msemSemaineSession2() {
    return (Integer) storedValueForKey("msemSemaineSession2");
  }

  public void setMsemSemaineSession2(Integer value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
    	_MaquetteSemestre.LOG.debug( "updating msemSemaineSession2 from " + msemSemaineSession2() + " to " + value);
    }
    takeStoredValueForKey(value, "msemSemaineSession2");
  }

  public org.cocktail.superplaner.serveur.metier.FormationAnnee scolFormationAnnee() {
    return (org.cocktail.superplaner.serveur.metier.FormationAnnee)storedValueForKey("scolFormationAnnee");
  }

  public void setScolFormationAnneeRelationship(org.cocktail.superplaner.serveur.metier.FormationAnnee value) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
      _MaquetteSemestre.LOG.debug("updating scolFormationAnnee from " + scolFormationAnnee() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationAnnee oldValue = scolFormationAnnee();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "scolFormationAnnee");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "scolFormationAnnee");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe> repartitionUes() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe>)storedValueForKey("repartitionUes");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe> repartitionUes(EOQualifier qualifier) {
    return repartitionUes(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe> repartitionUes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe> results;
      results = repartitionUes();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRepartitionUesRelationship(org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe object) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
      _MaquetteSemestre.LOG.debug("adding " + object + " to repartitionUes relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartitionUes");
  }

  public void removeFromRepartitionUesRelationship(org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe object) {
    if (_MaquetteSemestre.LOG.isDebugEnabled()) {
      _MaquetteSemestre.LOG.debug("removing " + object + " from repartitionUes relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartitionUes");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe createRepartitionUesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("MaquetteRepartitionUe");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "repartitionUes");
    return (org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe) eo;
  }

  public void deleteRepartitionUesRelationship(org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartitionUes");
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartitionUesRelationships() {
    Enumeration objects = repartitionUes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartitionUesRelationship((org.cocktail.superplaner.serveur.metier.MaquetteRepartitionUe)objects.nextElement());
    }
  }


  public static MaquetteSemestre createMaquetteSemestre(EOEditingContext editingContext, Integer msemBonifiable
, java.math.BigDecimal msemHoraireEtu
, Integer msemKey
, java.math.BigDecimal msemNoteBase
, java.math.BigDecimal msemNoteObtention
, Integer msemOrdre
) {
    MaquetteSemestre eo = (MaquetteSemestre) EOUtilities.createAndInsertInstance(editingContext, _MaquetteSemestre.ENTITY_NAME);    
		eo.setMsemBonifiable(msemBonifiable);
		eo.setMsemHoraireEtu(msemHoraireEtu);
		eo.setMsemKey(msemKey);
		eo.setMsemNoteBase(msemNoteBase);
		eo.setMsemNoteObtention(msemNoteObtention);
		eo.setMsemOrdre(msemOrdre);
    return eo;
  }

  public static NSArray<MaquetteSemestre> fetchAllMaquetteSemestres(EOEditingContext editingContext) {
    return _MaquetteSemestre.fetchAllMaquetteSemestres(editingContext, null);
  }

  public static NSArray<MaquetteSemestre> fetchAllMaquetteSemestres(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _MaquetteSemestre.fetchMaquetteSemestres(editingContext, null, sortOrderings);
  }

  public static NSArray<MaquetteSemestre> fetchMaquetteSemestres(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_MaquetteSemestre.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<MaquetteSemestre> eoObjects = (NSArray<MaquetteSemestre>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static MaquetteSemestre fetchMaquetteSemestre(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteSemestre.fetchMaquetteSemestre(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteSemestre fetchMaquetteSemestre(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<MaquetteSemestre> eoObjects = _MaquetteSemestre.fetchMaquetteSemestres(editingContext, qualifier, null);
    MaquetteSemestre eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (MaquetteSemestre)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one MaquetteSemestre that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteSemestre fetchRequiredMaquetteSemestre(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteSemestre.fetchRequiredMaquetteSemestre(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteSemestre fetchRequiredMaquetteSemestre(EOEditingContext editingContext, EOQualifier qualifier) {
    MaquetteSemestre eoObject = _MaquetteSemestre.fetchMaquetteSemestre(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no MaquetteSemestre that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteSemestre localInstanceIn(EOEditingContext editingContext, MaquetteSemestre eo) {
    MaquetteSemestre localInstance = (eo == null) ? null : (MaquetteSemestre)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
