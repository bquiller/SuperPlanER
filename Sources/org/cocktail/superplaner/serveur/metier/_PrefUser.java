// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to PrefUser.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _PrefUser extends  EOGenericRecord {
	public static final String ENTITY_NAME = "PrefUser";

	// Attributes
	public static final String ANNEE_CIVILE_KEY = "anneeCivile";
	public static final String COLOR_EC_KEY = "colorEc";
	public static final String COMMENT_SCOL_KEY = "commentScol";
	public static final String DEFAULT_PLANNING_KEY = "defaultPlanning";
	public static final String DIP_EDT_PERS_KEY = "dipEdtPers";
	public static final String DIP_EDT_SAL_KEY = "dipEdtSal";
	public static final String DISP_EXAM_KEY = "dispExam";
	public static final String DISP_PAR_COM_KEY = "dispParCom";
	public static final String HEURE_DEB_IMPRESS_KEY = "heureDebImpress";
	public static final String HEURE_FIN_IMPRESS_KEY = "heureFinImpress";
	public static final String PAS_MAIL_HORS_SEMAINE_KEY = "pasMailHorsSemaine";
	public static final String SELECTION_GROUPE_MULTIPLE_KEY = "selectionGroupeMultiple";
	public static final String SEND_MAIL_DEPOSITAIRES_KEY = "sendMailDepositaires";
	public static final String SEND_MAIL_OCCUPANTS_KEY = "sendMailOccupants";
	public static final String USE_RESP_AP_KEY = "useRespAp";
	public static final String USE_TOOLTIP_PLANNING_KEY = "useTooltipPlanning";

	// Relationships
	public static final String INDIVIDU_KEY = "individu";
	public static final String TYPE_RESSOURCE_KEY = "typeRessource";

  private static Logger LOG = Logger.getLogger(_PrefUser.class);

  public PrefUser localInstanceIn(EOEditingContext editingContext) {
    PrefUser localInstance = (PrefUser)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer anneeCivile() {
    return (Integer) storedValueForKey("anneeCivile");
  }

  public void setAnneeCivile(Integer value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating anneeCivile from " + anneeCivile() + " to " + value);
    }
    takeStoredValueForKey(value, "anneeCivile");
  }

  public String colorEc() {
    return (String) storedValueForKey("colorEc");
  }

  public void setColorEc(String value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating colorEc from " + colorEc() + " to " + value);
    }
    takeStoredValueForKey(value, "colorEc");
  }

  public Integer commentScol() {
    return (Integer) storedValueForKey("commentScol");
  }

  public void setCommentScol(Integer value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating commentScol from " + commentScol() + " to " + value);
    }
    takeStoredValueForKey(value, "commentScol");
  }

  public Integer defaultPlanning() {
    return (Integer) storedValueForKey("defaultPlanning");
  }

  public void setDefaultPlanning(Integer value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating defaultPlanning from " + defaultPlanning() + " to " + value);
    }
    takeStoredValueForKey(value, "defaultPlanning");
  }

  public Integer dipEdtPers() {
    return (Integer) storedValueForKey("dipEdtPers");
  }

  public void setDipEdtPers(Integer value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating dipEdtPers from " + dipEdtPers() + " to " + value);
    }
    takeStoredValueForKey(value, "dipEdtPers");
  }

  public Integer dipEdtSal() {
    return (Integer) storedValueForKey("dipEdtSal");
  }

  public void setDipEdtSal(Integer value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating dipEdtSal from " + dipEdtSal() + " to " + value);
    }
    takeStoredValueForKey(value, "dipEdtSal");
  }

  public Integer dispExam() {
    return (Integer) storedValueForKey("dispExam");
  }

  public void setDispExam(Integer value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating dispExam from " + dispExam() + " to " + value);
    }
    takeStoredValueForKey(value, "dispExam");
  }

  public Integer dispParCom() {
    return (Integer) storedValueForKey("dispParCom");
  }

  public void setDispParCom(Integer value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating dispParCom from " + dispParCom() + " to " + value);
    }
    takeStoredValueForKey(value, "dispParCom");
  }

  public Integer heureDebImpress() {
    return (Integer) storedValueForKey("heureDebImpress");
  }

  public void setHeureDebImpress(Integer value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating heureDebImpress from " + heureDebImpress() + " to " + value);
    }
    takeStoredValueForKey(value, "heureDebImpress");
  }

  public Integer heureFinImpress() {
    return (Integer) storedValueForKey("heureFinImpress");
  }

  public void setHeureFinImpress(Integer value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating heureFinImpress from " + heureFinImpress() + " to " + value);
    }
    takeStoredValueForKey(value, "heureFinImpress");
  }

  public Integer pasMailHorsSemaine() {
    return (Integer) storedValueForKey("pasMailHorsSemaine");
  }

  public void setPasMailHorsSemaine(Integer value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating pasMailHorsSemaine from " + pasMailHorsSemaine() + " to " + value);
    }
    takeStoredValueForKey(value, "pasMailHorsSemaine");
  }

  public String selectionGroupeMultiple() {
    return (String) storedValueForKey("selectionGroupeMultiple");
  }

  public void setSelectionGroupeMultiple(String value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating selectionGroupeMultiple from " + selectionGroupeMultiple() + " to " + value);
    }
    takeStoredValueForKey(value, "selectionGroupeMultiple");
  }

  public String sendMailDepositaires() {
    return (String) storedValueForKey("sendMailDepositaires");
  }

  public void setSendMailDepositaires(String value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating sendMailDepositaires from " + sendMailDepositaires() + " to " + value);
    }
    takeStoredValueForKey(value, "sendMailDepositaires");
  }

  public String sendMailOccupants() {
    return (String) storedValueForKey("sendMailOccupants");
  }

  public void setSendMailOccupants(String value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating sendMailOccupants from " + sendMailOccupants() + " to " + value);
    }
    takeStoredValueForKey(value, "sendMailOccupants");
  }

  public String useRespAp() {
    return (String) storedValueForKey("useRespAp");
  }

  public void setUseRespAp(String value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating useRespAp from " + useRespAp() + " to " + value);
    }
    takeStoredValueForKey(value, "useRespAp");
  }

  public String useTooltipPlanning() {
    return (String) storedValueForKey("useTooltipPlanning");
  }

  public void setUseTooltipPlanning(String value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
    	_PrefUser.LOG.debug( "updating useTooltipPlanning from " + useTooltipPlanning() + " to " + value);
    }
    takeStoredValueForKey(value, "useTooltipPlanning");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individu() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individu");
  }

  public void setIndividuRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
      _PrefUser.LOG.debug("updating individu from " + individu() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individu();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individu");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individu");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.TypeRessource typeRessource() {
    return (org.cocktail.superplaner.serveur.metier.TypeRessource)storedValueForKey("typeRessource");
  }

  public void setTypeRessourceRelationship(org.cocktail.superplaner.serveur.metier.TypeRessource value) {
    if (_PrefUser.LOG.isDebugEnabled()) {
      _PrefUser.LOG.debug("updating typeRessource from " + typeRessource() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.TypeRessource oldValue = typeRessource();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "typeRessource");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "typeRessource");
    }
  }
  

  public static PrefUser createPrefUser(EOEditingContext editingContext, String colorEc
, Integer commentScol
, Integer defaultPlanning
, Integer dipEdtPers
, Integer dipEdtSal
, Integer dispExam
, Integer dispParCom
, Integer heureDebImpress
, Integer heureFinImpress
, String selectionGroupeMultiple
, String sendMailDepositaires
, String sendMailOccupants
, String useTooltipPlanning
) {
    PrefUser eo = (PrefUser) EOUtilities.createAndInsertInstance(editingContext, _PrefUser.ENTITY_NAME);    
		eo.setColorEc(colorEc);
		eo.setCommentScol(commentScol);
		eo.setDefaultPlanning(defaultPlanning);
		eo.setDipEdtPers(dipEdtPers);
		eo.setDipEdtSal(dipEdtSal);
		eo.setDispExam(dispExam);
		eo.setDispParCom(dispParCom);
		eo.setHeureDebImpress(heureDebImpress);
		eo.setHeureFinImpress(heureFinImpress);
		eo.setSelectionGroupeMultiple(selectionGroupeMultiple);
		eo.setSendMailDepositaires(sendMailDepositaires);
		eo.setSendMailOccupants(sendMailOccupants);
		eo.setUseTooltipPlanning(useTooltipPlanning);
    return eo;
  }

  public static NSArray<PrefUser> fetchAllPrefUsers(EOEditingContext editingContext) {
    return _PrefUser.fetchAllPrefUsers(editingContext, null);
  }

  public static NSArray<PrefUser> fetchAllPrefUsers(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _PrefUser.fetchPrefUsers(editingContext, null, sortOrderings);
  }

  public static NSArray<PrefUser> fetchPrefUsers(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_PrefUser.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<PrefUser> eoObjects = (NSArray<PrefUser>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static PrefUser fetchPrefUser(EOEditingContext editingContext, String keyName, Object value) {
    return _PrefUser.fetchPrefUser(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static PrefUser fetchPrefUser(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<PrefUser> eoObjects = _PrefUser.fetchPrefUsers(editingContext, qualifier, null);
    PrefUser eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (PrefUser)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one PrefUser that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static PrefUser fetchRequiredPrefUser(EOEditingContext editingContext, String keyName, Object value) {
    return _PrefUser.fetchRequiredPrefUser(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static PrefUser fetchRequiredPrefUser(EOEditingContext editingContext, EOQualifier qualifier) {
    PrefUser eoObject = _PrefUser.fetchPrefUser(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no PrefUser that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static PrefUser localInstanceIn(EOEditingContext editingContext, PrefUser eo) {
    PrefUser localInstance = (eo == null) ? null : (PrefUser)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
