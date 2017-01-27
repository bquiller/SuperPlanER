// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to MaquetteRepartitionEc.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _MaquetteRepartitionEc extends  EOGenericRecord {
	public static final String ENTITY_NAME = "MaquetteRepartitionEc";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String MEC_KEY_KEY = "mecKey";
	public static final String MREC_BONIFIABLE_KEY = "mrecBonifiable";
	public static final String MREC_COEFFICIENT_KEY = "mrecCoefficient";
	public static final String MREC_COMPTABILISABLE_KEY = "mrecComptabilisable";
	public static final String MREC_NIVEAU_KEY = "mrecNiveau";
	public static final String MREC_NOTE_BASE_KEY = "mrecNoteBase";
	public static final String MREC_NOTE_ELIMINATION_KEY = "mrecNoteElimination";
	public static final String MREC_NOTE_OBTENTION_KEY = "mrecNoteObtention";
	public static final String MREC_ORDRE_KEY = "mrecOrdre";
	public static final String MTEC_CODE_KEY = "mtecCode";
	public static final String MUE_KEY_KEY = "mueKey";

	// Relationships
	public static final String MAQUETTE_EC_KEY = "maquetteEc";

  private static Logger LOG = Logger.getLogger(_MaquetteRepartitionEc.class);

  public MaquetteRepartitionEc localInstanceIn(EOEditingContext editingContext) {
    MaquetteRepartitionEc localInstance = (MaquetteRepartitionEc)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public Integer mecKey() {
    return (Integer) storedValueForKey("mecKey");
  }

  public void setMecKey(Integer value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating mecKey from " + mecKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mecKey");
  }

  public Integer mrecBonifiable() {
    return (Integer) storedValueForKey("mrecBonifiable");
  }

  public void setMrecBonifiable(Integer value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating mrecBonifiable from " + mrecBonifiable() + " to " + value);
    }
    takeStoredValueForKey(value, "mrecBonifiable");
  }

  public java.math.BigDecimal mrecCoefficient() {
    return (java.math.BigDecimal) storedValueForKey("mrecCoefficient");
  }

  public void setMrecCoefficient(java.math.BigDecimal value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating mrecCoefficient from " + mrecCoefficient() + " to " + value);
    }
    takeStoredValueForKey(value, "mrecCoefficient");
  }

  public Integer mrecComptabilisable() {
    return (Integer) storedValueForKey("mrecComptabilisable");
  }

  public void setMrecComptabilisable(Integer value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating mrecComptabilisable from " + mrecComptabilisable() + " to " + value);
    }
    takeStoredValueForKey(value, "mrecComptabilisable");
  }

  public String mrecNiveau() {
    return (String) storedValueForKey("mrecNiveau");
  }

  public void setMrecNiveau(String value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating mrecNiveau from " + mrecNiveau() + " to " + value);
    }
    takeStoredValueForKey(value, "mrecNiveau");
  }

  public java.math.BigDecimal mrecNoteBase() {
    return (java.math.BigDecimal) storedValueForKey("mrecNoteBase");
  }

  public void setMrecNoteBase(java.math.BigDecimal value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating mrecNoteBase from " + mrecNoteBase() + " to " + value);
    }
    takeStoredValueForKey(value, "mrecNoteBase");
  }

  public java.math.BigDecimal mrecNoteElimination() {
    return (java.math.BigDecimal) storedValueForKey("mrecNoteElimination");
  }

  public void setMrecNoteElimination(java.math.BigDecimal value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating mrecNoteElimination from " + mrecNoteElimination() + " to " + value);
    }
    takeStoredValueForKey(value, "mrecNoteElimination");
  }

  public java.math.BigDecimal mrecNoteObtention() {
    return (java.math.BigDecimal) storedValueForKey("mrecNoteObtention");
  }

  public void setMrecNoteObtention(java.math.BigDecimal value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating mrecNoteObtention from " + mrecNoteObtention() + " to " + value);
    }
    takeStoredValueForKey(value, "mrecNoteObtention");
  }

  public Integer mrecOrdre() {
    return (Integer) storedValueForKey("mrecOrdre");
  }

  public void setMrecOrdre(Integer value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating mrecOrdre from " + mrecOrdre() + " to " + value);
    }
    takeStoredValueForKey(value, "mrecOrdre");
  }

  public String mtecCode() {
    return (String) storedValueForKey("mtecCode");
  }

  public void setMtecCode(String value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating mtecCode from " + mtecCode() + " to " + value);
    }
    takeStoredValueForKey(value, "mtecCode");
  }

  public Integer mueKey() {
    return (Integer) storedValueForKey("mueKey");
  }

  public void setMueKey(Integer value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionEc.LOG.debug( "updating mueKey from " + mueKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mueKey");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteEc maquetteEc() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteEc)storedValueForKey("maquetteEc");
  }

  public void setMaquetteEcRelationship(org.cocktail.superplaner.serveur.metier.MaquetteEc value) {
    if (_MaquetteRepartitionEc.LOG.isDebugEnabled()) {
      _MaquetteRepartitionEc.LOG.debug("updating maquetteEc from " + maquetteEc() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteEc oldValue = maquetteEc();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteEc");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteEc");
    }
  }
  

  public static MaquetteRepartitionEc createMaquetteRepartitionEc(EOEditingContext editingContext, Integer fannKey
, Integer mecKey
, Integer mrecBonifiable
, java.math.BigDecimal mrecCoefficient
, Integer mrecComptabilisable
, java.math.BigDecimal mrecNoteBase
, java.math.BigDecimal mrecNoteObtention
, Integer mrecOrdre
, String mtecCode
, Integer mueKey
) {
    MaquetteRepartitionEc eo = (MaquetteRepartitionEc) EOUtilities.createAndInsertInstance(editingContext, _MaquetteRepartitionEc.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setMecKey(mecKey);
		eo.setMrecBonifiable(mrecBonifiable);
		eo.setMrecCoefficient(mrecCoefficient);
		eo.setMrecComptabilisable(mrecComptabilisable);
		eo.setMrecNoteBase(mrecNoteBase);
		eo.setMrecNoteObtention(mrecNoteObtention);
		eo.setMrecOrdre(mrecOrdre);
		eo.setMtecCode(mtecCode);
		eo.setMueKey(mueKey);
    return eo;
  }

  public static NSArray<MaquetteRepartitionEc> fetchAllMaquetteRepartitionEcs(EOEditingContext editingContext) {
    return _MaquetteRepartitionEc.fetchAllMaquetteRepartitionEcs(editingContext, null);
  }

  public static NSArray<MaquetteRepartitionEc> fetchAllMaquetteRepartitionEcs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _MaquetteRepartitionEc.fetchMaquetteRepartitionEcs(editingContext, null, sortOrderings);
  }

  public static NSArray<MaquetteRepartitionEc> fetchMaquetteRepartitionEcs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_MaquetteRepartitionEc.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<MaquetteRepartitionEc> eoObjects = (NSArray<MaquetteRepartitionEc>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static MaquetteRepartitionEc fetchMaquetteRepartitionEc(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteRepartitionEc.fetchMaquetteRepartitionEc(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteRepartitionEc fetchMaquetteRepartitionEc(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<MaquetteRepartitionEc> eoObjects = _MaquetteRepartitionEc.fetchMaquetteRepartitionEcs(editingContext, qualifier, null);
    MaquetteRepartitionEc eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (MaquetteRepartitionEc)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one MaquetteRepartitionEc that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteRepartitionEc fetchRequiredMaquetteRepartitionEc(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteRepartitionEc.fetchRequiredMaquetteRepartitionEc(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteRepartitionEc fetchRequiredMaquetteRepartitionEc(EOEditingContext editingContext, EOQualifier qualifier) {
    MaquetteRepartitionEc eoObject = _MaquetteRepartitionEc.fetchMaquetteRepartitionEc(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no MaquetteRepartitionEc that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteRepartitionEc localInstanceIn(EOEditingContext editingContext, MaquetteRepartitionEc eo) {
    MaquetteRepartitionEc localInstance = (eo == null) ? null : (MaquetteRepartitionEc)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
