// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolDroitDiplome.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolDroitDiplome extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ScolDroitDiplome";

	// Attributes
	public static final String DDIP_BILAN_KEY = "ddipBilan";
	public static final String DDIP_EDT_KEY = "ddipEdt";
	public static final String DDIP_EXAMENS_KEY = "ddipExamens";
	public static final String DDIP_GROUPES_KEY = "ddipGroupes";
	public static final String DDIP_IPEDAGOGIQUES_KEY = "ddipIpedagogiques";
	public static final String DDIP_MAQUETTES_KEY = "ddipMaquettes";
	public static final String DDIP_STATISTIQUES_KEY = "ddipStatistiques";
	public static final String DLOG_KEY_KEY = "dlogKey";
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String FHAB_KEY_KEY = "fhabKey";

	// Relationships
	public static final String HABILITATION_KEY = "habilitation";

  private static Logger LOG = Logger.getLogger(_ScolDroitDiplome.class);

  public ScolDroitDiplome localInstanceIn(EOEditingContext editingContext) {
    ScolDroitDiplome localInstance = (ScolDroitDiplome)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String ddipBilan() {
    return (String) storedValueForKey("ddipBilan");
  }

  public void setDdipBilan(String value) {
    if (_ScolDroitDiplome.LOG.isDebugEnabled()) {
    	_ScolDroitDiplome.LOG.debug( "updating ddipBilan from " + ddipBilan() + " to " + value);
    }
    takeStoredValueForKey(value, "ddipBilan");
  }

  public String ddipEdt() {
    return (String) storedValueForKey("ddipEdt");
  }

  public void setDdipEdt(String value) {
    if (_ScolDroitDiplome.LOG.isDebugEnabled()) {
    	_ScolDroitDiplome.LOG.debug( "updating ddipEdt from " + ddipEdt() + " to " + value);
    }
    takeStoredValueForKey(value, "ddipEdt");
  }

  public String ddipExamens() {
    return (String) storedValueForKey("ddipExamens");
  }

  public void setDdipExamens(String value) {
    if (_ScolDroitDiplome.LOG.isDebugEnabled()) {
    	_ScolDroitDiplome.LOG.debug( "updating ddipExamens from " + ddipExamens() + " to " + value);
    }
    takeStoredValueForKey(value, "ddipExamens");
  }

  public String ddipGroupes() {
    return (String) storedValueForKey("ddipGroupes");
  }

  public void setDdipGroupes(String value) {
    if (_ScolDroitDiplome.LOG.isDebugEnabled()) {
    	_ScolDroitDiplome.LOG.debug( "updating ddipGroupes from " + ddipGroupes() + " to " + value);
    }
    takeStoredValueForKey(value, "ddipGroupes");
  }

  public String ddipIpedagogiques() {
    return (String) storedValueForKey("ddipIpedagogiques");
  }

  public void setDdipIpedagogiques(String value) {
    if (_ScolDroitDiplome.LOG.isDebugEnabled()) {
    	_ScolDroitDiplome.LOG.debug( "updating ddipIpedagogiques from " + ddipIpedagogiques() + " to " + value);
    }
    takeStoredValueForKey(value, "ddipIpedagogiques");
  }

  public String ddipMaquettes() {
    return (String) storedValueForKey("ddipMaquettes");
  }

  public void setDdipMaquettes(String value) {
    if (_ScolDroitDiplome.LOG.isDebugEnabled()) {
    	_ScolDroitDiplome.LOG.debug( "updating ddipMaquettes from " + ddipMaquettes() + " to " + value);
    }
    takeStoredValueForKey(value, "ddipMaquettes");
  }

  public String ddipStatistiques() {
    return (String) storedValueForKey("ddipStatistiques");
  }

  public void setDdipStatistiques(String value) {
    if (_ScolDroitDiplome.LOG.isDebugEnabled()) {
    	_ScolDroitDiplome.LOG.debug( "updating ddipStatistiques from " + ddipStatistiques() + " to " + value);
    }
    takeStoredValueForKey(value, "ddipStatistiques");
  }

  public Integer dlogKey() {
    return (Integer) storedValueForKey("dlogKey");
  }

  public void setDlogKey(Integer value) {
    if (_ScolDroitDiplome.LOG.isDebugEnabled()) {
    	_ScolDroitDiplome.LOG.debug( "updating dlogKey from " + dlogKey() + " to " + value);
    }
    takeStoredValueForKey(value, "dlogKey");
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_ScolDroitDiplome.LOG.isDebugEnabled()) {
    	_ScolDroitDiplome.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public Integer fhabKey() {
    return (Integer) storedValueForKey("fhabKey");
  }

  public void setFhabKey(Integer value) {
    if (_ScolDroitDiplome.LOG.isDebugEnabled()) {
    	_ScolDroitDiplome.LOG.debug( "updating fhabKey from " + fhabKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fhabKey");
  }

  public org.cocktail.superplaner.serveur.metier.FormationHabilitation habilitation() {
    return (org.cocktail.superplaner.serveur.metier.FormationHabilitation)storedValueForKey("habilitation");
  }

  public void setHabilitationRelationship(org.cocktail.superplaner.serveur.metier.FormationHabilitation value) {
    if (_ScolDroitDiplome.LOG.isDebugEnabled()) {
      _ScolDroitDiplome.LOG.debug("updating habilitation from " + habilitation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationHabilitation oldValue = habilitation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "habilitation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "habilitation");
    }
  }
  

  public static ScolDroitDiplome createScolDroitDiplome(EOEditingContext editingContext, String ddipBilan
, String ddipEdt
, String ddipExamens
, String ddipGroupes
, String ddipIpedagogiques
, String ddipMaquettes
, String ddipStatistiques
, Integer dlogKey
, Integer fannKey
, Integer fhabKey
) {
    ScolDroitDiplome eo = (ScolDroitDiplome) EOUtilities.createAndInsertInstance(editingContext, _ScolDroitDiplome.ENTITY_NAME);    
		eo.setDdipBilan(ddipBilan);
		eo.setDdipEdt(ddipEdt);
		eo.setDdipExamens(ddipExamens);
		eo.setDdipGroupes(ddipGroupes);
		eo.setDdipIpedagogiques(ddipIpedagogiques);
		eo.setDdipMaquettes(ddipMaquettes);
		eo.setDdipStatistiques(ddipStatistiques);
		eo.setDlogKey(dlogKey);
		eo.setFannKey(fannKey);
		eo.setFhabKey(fhabKey);
    return eo;
  }

  public static NSArray<ScolDroitDiplome> fetchAllScolDroitDiplomes(EOEditingContext editingContext) {
    return _ScolDroitDiplome.fetchAllScolDroitDiplomes(editingContext, null);
  }

  public static NSArray<ScolDroitDiplome> fetchAllScolDroitDiplomes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolDroitDiplome.fetchScolDroitDiplomes(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolDroitDiplome> fetchScolDroitDiplomes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolDroitDiplome.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolDroitDiplome> eoObjects = (NSArray<ScolDroitDiplome>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolDroitDiplome fetchScolDroitDiplome(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolDroitDiplome.fetchScolDroitDiplome(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolDroitDiplome fetchScolDroitDiplome(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolDroitDiplome> eoObjects = _ScolDroitDiplome.fetchScolDroitDiplomes(editingContext, qualifier, null);
    ScolDroitDiplome eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolDroitDiplome)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ScolDroitDiplome that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolDroitDiplome fetchRequiredScolDroitDiplome(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolDroitDiplome.fetchRequiredScolDroitDiplome(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolDroitDiplome fetchRequiredScolDroitDiplome(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolDroitDiplome eoObject = _ScolDroitDiplome.fetchScolDroitDiplome(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ScolDroitDiplome that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolDroitDiplome localInstanceIn(EOEditingContext editingContext, ScolDroitDiplome eo) {
    ScolDroitDiplome localInstance = (eo == null) ? null : (ScolDroitDiplome)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
