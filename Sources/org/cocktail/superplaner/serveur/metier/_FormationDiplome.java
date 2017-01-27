// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to FormationDiplome.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _FormationDiplome extends  EOGenericRecord {
	public static final String ENTITY_NAME = "FormationDiplome";

	// Attributes
	public static final String COMP_CODE_KEY = "compCode";
	public static final String ETAB_CODE_KEY = "etabCode";
	public static final String FDIP_ABREVIATION_KEY = "fdipAbreviation";
	public static final String FDIP_ARRIVEE_KEY = "fdipArrivee";
	public static final String FDIP_CYCLE_KEY = "fdipCycle";
	public static final String FDIP_DEPART_KEY = "fdipDepart";
	public static final String FDIP_LIBELLE_KEY = "fdipLibelle";
	public static final String FDIP_MENTION_KEY = "fdipMention";
	public static final String FDIP_MODELE_KEY = "fdipModele";
	public static final String FDIP_SPECIALITE_KEY = "fdipSpecialite";
	public static final String FDIP_TYPE_DROIT_KEY = "fdipTypeDroit";
	public static final String FDOM_CODE_KEY = "fdomCode";
	public static final String FGRA_CODE_KEY = "fgraCode";
	public static final String FVOC_CODE_KEY = "fvocCode";
	public static final String SREMO_CODE_KEY = "sremoCode";

	// Relationships

  private static Logger LOG = Logger.getLogger(_FormationDiplome.class);

  public FormationDiplome localInstanceIn(EOEditingContext editingContext) {
    FormationDiplome localInstance = (FormationDiplome)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String compCode() {
    return (String) storedValueForKey("compCode");
  }

  public void setCompCode(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating compCode from " + compCode() + " to " + value);
    }
    takeStoredValueForKey(value, "compCode");
  }

  public String etabCode() {
    return (String) storedValueForKey("etabCode");
  }

  public void setEtabCode(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating etabCode from " + etabCode() + " to " + value);
    }
    takeStoredValueForKey(value, "etabCode");
  }

  public String fdipAbreviation() {
    return (String) storedValueForKey("fdipAbreviation");
  }

  public void setFdipAbreviation(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fdipAbreviation from " + fdipAbreviation() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipAbreviation");
  }

  public Integer fdipArrivee() {
    return (Integer) storedValueForKey("fdipArrivee");
  }

  public void setFdipArrivee(Integer value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fdipArrivee from " + fdipArrivee() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipArrivee");
  }

  public Integer fdipCycle() {
    return (Integer) storedValueForKey("fdipCycle");
  }

  public void setFdipCycle(Integer value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fdipCycle from " + fdipCycle() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipCycle");
  }

  public Integer fdipDepart() {
    return (Integer) storedValueForKey("fdipDepart");
  }

  public void setFdipDepart(Integer value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fdipDepart from " + fdipDepart() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipDepart");
  }

  public String fdipLibelle() {
    return (String) storedValueForKey("fdipLibelle");
  }

  public void setFdipLibelle(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fdipLibelle from " + fdipLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipLibelle");
  }

  public String fdipMention() {
    return (String) storedValueForKey("fdipMention");
  }

  public void setFdipMention(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fdipMention from " + fdipMention() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipMention");
  }

  public String fdipModele() {
    return (String) storedValueForKey("fdipModele");
  }

  public void setFdipModele(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fdipModele from " + fdipModele() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipModele");
  }

  public String fdipSpecialite() {
    return (String) storedValueForKey("fdipSpecialite");
  }

  public void setFdipSpecialite(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fdipSpecialite from " + fdipSpecialite() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipSpecialite");
  }

  public String fdipTypeDroit() {
    return (String) storedValueForKey("fdipTypeDroit");
  }

  public void setFdipTypeDroit(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fdipTypeDroit from " + fdipTypeDroit() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipTypeDroit");
  }

  public String fdomCode() {
    return (String) storedValueForKey("fdomCode");
  }

  public void setFdomCode(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fdomCode from " + fdomCode() + " to " + value);
    }
    takeStoredValueForKey(value, "fdomCode");
  }

  public String fgraCode() {
    return (String) storedValueForKey("fgraCode");
  }

  public void setFgraCode(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fgraCode from " + fgraCode() + " to " + value);
    }
    takeStoredValueForKey(value, "fgraCode");
  }

  public String fvocCode() {
    return (String) storedValueForKey("fvocCode");
  }

  public void setFvocCode(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating fvocCode from " + fvocCode() + " to " + value);
    }
    takeStoredValueForKey(value, "fvocCode");
  }

  public String sremoCode() {
    return (String) storedValueForKey("sremoCode");
  }

  public void setSremoCode(String value) {
    if (_FormationDiplome.LOG.isDebugEnabled()) {
    	_FormationDiplome.LOG.debug( "updating sremoCode from " + sremoCode() + " to " + value);
    }
    takeStoredValueForKey(value, "sremoCode");
  }


  public static FormationDiplome createFormationDiplome(EOEditingContext editingContext, String compCode
, String etabCode
, Integer fdipArrivee
, Integer fdipCycle
, Integer fdipDepart
, String fdipLibelle
, String fdipMention
, String fdipTypeDroit
, String fdomCode
, String fgraCode
, String fvocCode
) {
    FormationDiplome eo = (FormationDiplome) EOUtilities.createAndInsertInstance(editingContext, _FormationDiplome.ENTITY_NAME);    
		eo.setCompCode(compCode);
		eo.setEtabCode(etabCode);
		eo.setFdipArrivee(fdipArrivee);
		eo.setFdipCycle(fdipCycle);
		eo.setFdipDepart(fdipDepart);
		eo.setFdipLibelle(fdipLibelle);
		eo.setFdipMention(fdipMention);
		eo.setFdipTypeDroit(fdipTypeDroit);
		eo.setFdomCode(fdomCode);
		eo.setFgraCode(fgraCode);
		eo.setFvocCode(fvocCode);
    return eo;
  }

  public static NSArray<FormationDiplome> fetchAllFormationDiplomes(EOEditingContext editingContext) {
    return _FormationDiplome.fetchAllFormationDiplomes(editingContext, null);
  }

  public static NSArray<FormationDiplome> fetchAllFormationDiplomes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _FormationDiplome.fetchFormationDiplomes(editingContext, null, sortOrderings);
  }

  public static NSArray<FormationDiplome> fetchFormationDiplomes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_FormationDiplome.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<FormationDiplome> eoObjects = (NSArray<FormationDiplome>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static FormationDiplome fetchFormationDiplome(EOEditingContext editingContext, String keyName, Object value) {
    return _FormationDiplome.fetchFormationDiplome(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static FormationDiplome fetchFormationDiplome(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<FormationDiplome> eoObjects = _FormationDiplome.fetchFormationDiplomes(editingContext, qualifier, null);
    FormationDiplome eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (FormationDiplome)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one FormationDiplome that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static FormationDiplome fetchRequiredFormationDiplome(EOEditingContext editingContext, String keyName, Object value) {
    return _FormationDiplome.fetchRequiredFormationDiplome(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static FormationDiplome fetchRequiredFormationDiplome(EOEditingContext editingContext, EOQualifier qualifier) {
    FormationDiplome eoObject = _FormationDiplome.fetchFormationDiplome(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no FormationDiplome that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static FormationDiplome localInstanceIn(EOEditingContext editingContext, FormationDiplome eo) {
    FormationDiplome localInstance = (eo == null) ? null : (FormationDiplome)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
