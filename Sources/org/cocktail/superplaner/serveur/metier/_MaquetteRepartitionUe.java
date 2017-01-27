// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to MaquetteRepartitionUe.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _MaquetteRepartitionUe extends  EOGenericRecord {
	public static final String ENTITY_NAME = "MaquetteRepartitionUe";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String MRUE_BONIFIABLE_KEY = "mrueBonifiable";
	public static final String MRUE_COEFFICIENT_KEY = "mrueCoefficient";
	public static final String MRUE_COMPTABILISABLE_KEY = "mrueComptabilisable";
	public static final String MRUE_NOTE_BASE_KEY = "mrueNoteBase";
	public static final String MRUE_NOTE_ELIMINATION_KEY = "mrueNoteElimination";
	public static final String MRUE_NOTE_OBTENTION_KEY = "mrueNoteObtention";
	public static final String MRUE_ORDRE_KEY = "mrueOrdre";
	public static final String MSEM_KEY_KEY = "msemKey";
	public static final String MUE_KEY_KEY = "mueKey";

	// Relationships
	public static final String MAQUETTE_UE_KEY = "maquetteUe";

  private static Logger LOG = Logger.getLogger(_MaquetteRepartitionUe.class);

  public MaquetteRepartitionUe localInstanceIn(EOEditingContext editingContext) {
    MaquetteRepartitionUe localInstance = (MaquetteRepartitionUe)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_MaquetteRepartitionUe.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionUe.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public Integer mrueBonifiable() {
    return (Integer) storedValueForKey("mrueBonifiable");
  }

  public void setMrueBonifiable(Integer value) {
    if (_MaquetteRepartitionUe.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionUe.LOG.debug( "updating mrueBonifiable from " + mrueBonifiable() + " to " + value);
    }
    takeStoredValueForKey(value, "mrueBonifiable");
  }

  public java.math.BigDecimal mrueCoefficient() {
    return (java.math.BigDecimal) storedValueForKey("mrueCoefficient");
  }

  public void setMrueCoefficient(java.math.BigDecimal value) {
    if (_MaquetteRepartitionUe.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionUe.LOG.debug( "updating mrueCoefficient from " + mrueCoefficient() + " to " + value);
    }
    takeStoredValueForKey(value, "mrueCoefficient");
  }

  public Integer mrueComptabilisable() {
    return (Integer) storedValueForKey("mrueComptabilisable");
  }

  public void setMrueComptabilisable(Integer value) {
    if (_MaquetteRepartitionUe.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionUe.LOG.debug( "updating mrueComptabilisable from " + mrueComptabilisable() + " to " + value);
    }
    takeStoredValueForKey(value, "mrueComptabilisable");
  }

  public java.math.BigDecimal mrueNoteBase() {
    return (java.math.BigDecimal) storedValueForKey("mrueNoteBase");
  }

  public void setMrueNoteBase(java.math.BigDecimal value) {
    if (_MaquetteRepartitionUe.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionUe.LOG.debug( "updating mrueNoteBase from " + mrueNoteBase() + " to " + value);
    }
    takeStoredValueForKey(value, "mrueNoteBase");
  }

  public java.math.BigDecimal mrueNoteElimination() {
    return (java.math.BigDecimal) storedValueForKey("mrueNoteElimination");
  }

  public void setMrueNoteElimination(java.math.BigDecimal value) {
    if (_MaquetteRepartitionUe.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionUe.LOG.debug( "updating mrueNoteElimination from " + mrueNoteElimination() + " to " + value);
    }
    takeStoredValueForKey(value, "mrueNoteElimination");
  }

  public java.math.BigDecimal mrueNoteObtention() {
    return (java.math.BigDecimal) storedValueForKey("mrueNoteObtention");
  }

  public void setMrueNoteObtention(java.math.BigDecimal value) {
    if (_MaquetteRepartitionUe.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionUe.LOG.debug( "updating mrueNoteObtention from " + mrueNoteObtention() + " to " + value);
    }
    takeStoredValueForKey(value, "mrueNoteObtention");
  }

  public Integer mrueOrdre() {
    return (Integer) storedValueForKey("mrueOrdre");
  }

  public void setMrueOrdre(Integer value) {
    if (_MaquetteRepartitionUe.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionUe.LOG.debug( "updating mrueOrdre from " + mrueOrdre() + " to " + value);
    }
    takeStoredValueForKey(value, "mrueOrdre");
  }

  public Integer msemKey() {
    return (Integer) storedValueForKey("msemKey");
  }

  public void setMsemKey(Integer value) {
    if (_MaquetteRepartitionUe.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionUe.LOG.debug( "updating msemKey from " + msemKey() + " to " + value);
    }
    takeStoredValueForKey(value, "msemKey");
  }

  public Integer mueKey() {
    return (Integer) storedValueForKey("mueKey");
  }

  public void setMueKey(Integer value) {
    if (_MaquetteRepartitionUe.LOG.isDebugEnabled()) {
    	_MaquetteRepartitionUe.LOG.debug( "updating mueKey from " + mueKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mueKey");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteUe maquetteUe() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteUe)storedValueForKey("maquetteUe");
  }

  public void setMaquetteUeRelationship(org.cocktail.superplaner.serveur.metier.MaquetteUe value) {
    if (_MaquetteRepartitionUe.LOG.isDebugEnabled()) {
      _MaquetteRepartitionUe.LOG.debug("updating maquetteUe from " + maquetteUe() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteUe oldValue = maquetteUe();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteUe");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteUe");
    }
  }
  

  public static MaquetteRepartitionUe createMaquetteRepartitionUe(EOEditingContext editingContext, Integer fannKey
, Integer mrueBonifiable
, java.math.BigDecimal mrueCoefficient
, Integer mrueComptabilisable
, java.math.BigDecimal mrueNoteBase
, java.math.BigDecimal mrueNoteObtention
, Integer mrueOrdre
, Integer msemKey
, Integer mueKey
) {
    MaquetteRepartitionUe eo = (MaquetteRepartitionUe) EOUtilities.createAndInsertInstance(editingContext, _MaquetteRepartitionUe.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setMrueBonifiable(mrueBonifiable);
		eo.setMrueCoefficient(mrueCoefficient);
		eo.setMrueComptabilisable(mrueComptabilisable);
		eo.setMrueNoteBase(mrueNoteBase);
		eo.setMrueNoteObtention(mrueNoteObtention);
		eo.setMrueOrdre(mrueOrdre);
		eo.setMsemKey(msemKey);
		eo.setMueKey(mueKey);
    return eo;
  }

  public static NSArray<MaquetteRepartitionUe> fetchAllMaquetteRepartitionUes(EOEditingContext editingContext) {
    return _MaquetteRepartitionUe.fetchAllMaquetteRepartitionUes(editingContext, null);
  }

  public static NSArray<MaquetteRepartitionUe> fetchAllMaquetteRepartitionUes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _MaquetteRepartitionUe.fetchMaquetteRepartitionUes(editingContext, null, sortOrderings);
  }

  public static NSArray<MaquetteRepartitionUe> fetchMaquetteRepartitionUes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_MaquetteRepartitionUe.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<MaquetteRepartitionUe> eoObjects = (NSArray<MaquetteRepartitionUe>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static MaquetteRepartitionUe fetchMaquetteRepartitionUe(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteRepartitionUe.fetchMaquetteRepartitionUe(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteRepartitionUe fetchMaquetteRepartitionUe(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<MaquetteRepartitionUe> eoObjects = _MaquetteRepartitionUe.fetchMaquetteRepartitionUes(editingContext, qualifier, null);
    MaquetteRepartitionUe eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (MaquetteRepartitionUe)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one MaquetteRepartitionUe that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteRepartitionUe fetchRequiredMaquetteRepartitionUe(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteRepartitionUe.fetchRequiredMaquetteRepartitionUe(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteRepartitionUe fetchRequiredMaquetteRepartitionUe(EOEditingContext editingContext, EOQualifier qualifier) {
    MaquetteRepartitionUe eoObject = _MaquetteRepartitionUe.fetchMaquetteRepartitionUe(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no MaquetteRepartitionUe that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteRepartitionUe localInstanceIn(EOEditingContext editingContext, MaquetteRepartitionUe eo) {
    MaquetteRepartitionUe localInstance = (eo == null) ? null : (MaquetteRepartitionUe)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
