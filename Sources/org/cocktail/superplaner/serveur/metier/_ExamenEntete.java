// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ExamenEntete.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ExamenEntete extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ExamenEntete";

	// Attributes
	public static final String EELT_CODE_KEY = "eeltCode";
	public static final String EENT_COEFFICIENT_KEY = "eentCoefficient";
	public static final String EENT_DATE_DEBUT_KEY = "eentDateDebut";
	public static final String EENT_DATE_FIN_KEY = "eentDateFin";
	public static final String EENT_DUREE_KEY = "eentDuree";
	public static final String EENT_EPREUVE_KEY = "eentEpreuve";
	public static final String EENT_LIBELLE_KEY = "eentLibelle";
	public static final String EENT_NOTE_BASE_KEY = "eentNoteBase";
	public static final String EENT_QCM_KEY = "eentQcm";
	public static final String EENT_SEMESTRE_KEY = "eentSemestre";
	public static final String EENT_SESSION_KEY = "eentSession";
	public static final String EENT_TRAITE_KEY = "eentTraite";
	public static final String EENT_VALIDITE_KEY = "eentValidite";
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String PERS_ID_KEY = "persId";

	// Relationships
	public static final String EC_KEY = "ec";

  private static Logger LOG = Logger.getLogger(_ExamenEntete.class);

  public ExamenEntete localInstanceIn(EOEditingContext editingContext) {
    ExamenEntete localInstance = (ExamenEntete)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String eeltCode() {
    return (String) storedValueForKey("eeltCode");
  }

  public void setEeltCode(String value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eeltCode from " + eeltCode() + " to " + value);
    }
    takeStoredValueForKey(value, "eeltCode");
  }

  public java.math.BigDecimal eentCoefficient() {
    return (java.math.BigDecimal) storedValueForKey("eentCoefficient");
  }

  public void setEentCoefficient(java.math.BigDecimal value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentCoefficient from " + eentCoefficient() + " to " + value);
    }
    takeStoredValueForKey(value, "eentCoefficient");
  }

  public NSTimestamp eentDateDebut() {
    return (NSTimestamp) storedValueForKey("eentDateDebut");
  }

  public void setEentDateDebut(NSTimestamp value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentDateDebut from " + eentDateDebut() + " to " + value);
    }
    takeStoredValueForKey(value, "eentDateDebut");
  }

  public NSTimestamp eentDateFin() {
    return (NSTimestamp) storedValueForKey("eentDateFin");
  }

  public void setEentDateFin(NSTimestamp value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentDateFin from " + eentDateFin() + " to " + value);
    }
    takeStoredValueForKey(value, "eentDateFin");
  }

  public NSTimestamp eentDuree() {
    return (NSTimestamp) storedValueForKey("eentDuree");
  }

  public void setEentDuree(NSTimestamp value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentDuree from " + eentDuree() + " to " + value);
    }
    takeStoredValueForKey(value, "eentDuree");
  }

  public Integer eentEpreuve() {
    return (Integer) storedValueForKey("eentEpreuve");
  }

  public void setEentEpreuve(Integer value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentEpreuve from " + eentEpreuve() + " to " + value);
    }
    takeStoredValueForKey(value, "eentEpreuve");
  }

  public String eentLibelle() {
    return (String) storedValueForKey("eentLibelle");
  }

  public void setEentLibelle(String value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentLibelle from " + eentLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "eentLibelle");
  }

  public java.math.BigDecimal eentNoteBase() {
    return (java.math.BigDecimal) storedValueForKey("eentNoteBase");
  }

  public void setEentNoteBase(java.math.BigDecimal value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentNoteBase from " + eentNoteBase() + " to " + value);
    }
    takeStoredValueForKey(value, "eentNoteBase");
  }

  public String eentQcm() {
    return (String) storedValueForKey("eentQcm");
  }

  public void setEentQcm(String value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentQcm from " + eentQcm() + " to " + value);
    }
    takeStoredValueForKey(value, "eentQcm");
  }

  public Integer eentSemestre() {
    return (Integer) storedValueForKey("eentSemestre");
  }

  public void setEentSemestre(Integer value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentSemestre from " + eentSemestre() + " to " + value);
    }
    takeStoredValueForKey(value, "eentSemestre");
  }

  public Integer eentSession() {
    return (Integer) storedValueForKey("eentSession");
  }

  public void setEentSession(Integer value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentSession from " + eentSession() + " to " + value);
    }
    takeStoredValueForKey(value, "eentSession");
  }

  public Integer eentTraite() {
    return (Integer) storedValueForKey("eentTraite");
  }

  public void setEentTraite(Integer value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentTraite from " + eentTraite() + " to " + value);
    }
    takeStoredValueForKey(value, "eentTraite");
  }

  public String eentValidite() {
    return (String) storedValueForKey("eentValidite");
  }

  public void setEentValidite(String value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating eentValidite from " + eentValidite() + " to " + value);
    }
    takeStoredValueForKey(value, "eentValidite");
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public Integer persId() {
    return (Integer) storedValueForKey("persId");
  }

  public void setPersId(Integer value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
    	_ExamenEntete.LOG.debug( "updating persId from " + persId() + " to " + value);
    }
    takeStoredValueForKey(value, "persId");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteEc ec() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteEc)storedValueForKey("ec");
  }

  public void setEcRelationship(org.cocktail.superplaner.serveur.metier.MaquetteEc value) {
    if (_ExamenEntete.LOG.isDebugEnabled()) {
      _ExamenEntete.LOG.debug("updating ec from " + ec() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteEc oldValue = ec();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "ec");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "ec");
    }
  }
  

  public static ExamenEntete createExamenEntete(EOEditingContext editingContext, String eeltCode
, java.math.BigDecimal eentCoefficient
, Integer eentEpreuve
, java.math.BigDecimal eentNoteBase
, String eentQcm
, Integer eentSemestre
, Integer eentSession
, Integer eentTraite
, String eentValidite
, Integer fannKey
) {
    ExamenEntete eo = (ExamenEntete) EOUtilities.createAndInsertInstance(editingContext, _ExamenEntete.ENTITY_NAME);    
		eo.setEeltCode(eeltCode);
		eo.setEentCoefficient(eentCoefficient);
		eo.setEentEpreuve(eentEpreuve);
		eo.setEentNoteBase(eentNoteBase);
		eo.setEentQcm(eentQcm);
		eo.setEentSemestre(eentSemestre);
		eo.setEentSession(eentSession);
		eo.setEentTraite(eentTraite);
		eo.setEentValidite(eentValidite);
		eo.setFannKey(fannKey);
    return eo;
  }

  public static NSArray<ExamenEntete> fetchAllExamenEntetes(EOEditingContext editingContext) {
    return _ExamenEntete.fetchAllExamenEntetes(editingContext, null);
  }

  public static NSArray<ExamenEntete> fetchAllExamenEntetes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ExamenEntete.fetchExamenEntetes(editingContext, null, sortOrderings);
  }

  public static NSArray<ExamenEntete> fetchExamenEntetes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ExamenEntete.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ExamenEntete> eoObjects = (NSArray<ExamenEntete>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ExamenEntete fetchExamenEntete(EOEditingContext editingContext, String keyName, Object value) {
    return _ExamenEntete.fetchExamenEntete(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ExamenEntete fetchExamenEntete(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ExamenEntete> eoObjects = _ExamenEntete.fetchExamenEntetes(editingContext, qualifier, null);
    ExamenEntete eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ExamenEntete)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ExamenEntete that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ExamenEntete fetchRequiredExamenEntete(EOEditingContext editingContext, String keyName, Object value) {
    return _ExamenEntete.fetchRequiredExamenEntete(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ExamenEntete fetchRequiredExamenEntete(EOEditingContext editingContext, EOQualifier qualifier) {
    ExamenEntete eoObject = _ExamenEntete.fetchExamenEntete(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ExamenEntete that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ExamenEntete localInstanceIn(EOEditingContext editingContext, ExamenEntete eo) {
    ExamenEntete localInstance = (eo == null) ? null : (ExamenEntete)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
