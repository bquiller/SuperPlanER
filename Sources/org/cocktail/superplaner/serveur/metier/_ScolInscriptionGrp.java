// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolInscriptionGrp.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolInscriptionGrp extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ScolInscriptionGrp";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String GGRP_KEY_KEY = "ggrpKey";
	public static final String IDIPL_NUMERO_KEY = "idiplNumero";
	public static final String IGGRP_TEMOIN_SELECTION_KEY = "iggrpTemoinSelection";

	// Relationships
	public static final String SCOL_GROUPE_GRP_KEY = "scolGroupeGrp";

  private static Logger LOG = Logger.getLogger(_ScolInscriptionGrp.class);

  public ScolInscriptionGrp localInstanceIn(EOEditingContext editingContext) {
    ScolInscriptionGrp localInstance = (ScolInscriptionGrp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Long fannKey() {
    return (Long) storedValueForKey("fannKey");
  }

  public void setFannKey(Long value) {
    if (_ScolInscriptionGrp.LOG.isDebugEnabled()) {
    	_ScolInscriptionGrp.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public Integer ggrpKey() {
    return (Integer) storedValueForKey("ggrpKey");
  }

  public void setGgrpKey(Integer value) {
    if (_ScolInscriptionGrp.LOG.isDebugEnabled()) {
    	_ScolInscriptionGrp.LOG.debug( "updating ggrpKey from " + ggrpKey() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpKey");
  }

  public Long idiplNumero() {
    return (Long) storedValueForKey("idiplNumero");
  }

  public void setIdiplNumero(Long value) {
    if (_ScolInscriptionGrp.LOG.isDebugEnabled()) {
    	_ScolInscriptionGrp.LOG.debug( "updating idiplNumero from " + idiplNumero() + " to " + value);
    }
    takeStoredValueForKey(value, "idiplNumero");
  }

  public String iggrpTemoinSelection() {
    return (String) storedValueForKey("iggrpTemoinSelection");
  }

  public void setIggrpTemoinSelection(String value) {
    if (_ScolInscriptionGrp.LOG.isDebugEnabled()) {
    	_ScolInscriptionGrp.LOG.debug( "updating iggrpTemoinSelection from " + iggrpTemoinSelection() + " to " + value);
    }
    takeStoredValueForKey(value, "iggrpTemoinSelection");
  }

  public org.cocktail.superplaner.serveur.metier.ScolGroupeGrp scolGroupeGrp() {
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeGrp)storedValueForKey("scolGroupeGrp");
  }

  public void setScolGroupeGrpRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeGrp value) {
    if (_ScolInscriptionGrp.LOG.isDebugEnabled()) {
      _ScolInscriptionGrp.LOG.debug("updating scolGroupeGrp from " + scolGroupeGrp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ScolGroupeGrp oldValue = scolGroupeGrp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "scolGroupeGrp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "scolGroupeGrp");
    }
  }
  

  public static ScolInscriptionGrp createScolInscriptionGrp(EOEditingContext editingContext, Long fannKey
, Integer ggrpKey
, Long idiplNumero
, String iggrpTemoinSelection
, org.cocktail.superplaner.serveur.metier.ScolGroupeGrp scolGroupeGrp) {
    ScolInscriptionGrp eo = (ScolInscriptionGrp) EOUtilities.createAndInsertInstance(editingContext, _ScolInscriptionGrp.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setGgrpKey(ggrpKey);
		eo.setIdiplNumero(idiplNumero);
		eo.setIggrpTemoinSelection(iggrpTemoinSelection);
    eo.setScolGroupeGrpRelationship(scolGroupeGrp);
    return eo;
  }

  public static NSArray<ScolInscriptionGrp> fetchAllScolInscriptionGrps(EOEditingContext editingContext) {
    return _ScolInscriptionGrp.fetchAllScolInscriptionGrps(editingContext, null);
  }

  public static NSArray<ScolInscriptionGrp> fetchAllScolInscriptionGrps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolInscriptionGrp.fetchScolInscriptionGrps(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolInscriptionGrp> fetchScolInscriptionGrps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolInscriptionGrp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolInscriptionGrp> eoObjects = (NSArray<ScolInscriptionGrp>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolInscriptionGrp fetchScolInscriptionGrp(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolInscriptionGrp.fetchScolInscriptionGrp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolInscriptionGrp fetchScolInscriptionGrp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolInscriptionGrp> eoObjects = _ScolInscriptionGrp.fetchScolInscriptionGrps(editingContext, qualifier, null);
    ScolInscriptionGrp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolInscriptionGrp)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ScolInscriptionGrp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolInscriptionGrp fetchRequiredScolInscriptionGrp(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolInscriptionGrp.fetchRequiredScolInscriptionGrp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolInscriptionGrp fetchRequiredScolInscriptionGrp(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolInscriptionGrp eoObject = _ScolInscriptionGrp.fetchScolInscriptionGrp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ScolInscriptionGrp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolInscriptionGrp localInstanceIn(EOEditingContext editingContext, ScolInscriptionGrp eo) {
    ScolInscriptionGrp localInstance = (eo == null) ? null : (ScolInscriptionGrp)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
