// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Mission.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Mission extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Mission";

	// Attributes
	public static final String MIS_DEBUT_KEY = "misDebut";
	public static final String MIS_ETAT_KEY = "misEtat";
	public static final String MIS_FIN_KEY = "misFin";
	public static final String MIS_MOTIF_KEY = "misMotif";

	// Relationships
	public static final String FOURNIS_KEY = "fournis";

  private static Logger LOG = Logger.getLogger(_Mission.class);

  public Mission localInstanceIn(EOEditingContext editingContext) {
    Mission localInstance = (Mission)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp misDebut() {
    return (NSTimestamp) storedValueForKey("misDebut");
  }

  public void setMisDebut(NSTimestamp value) {
    if (_Mission.LOG.isDebugEnabled()) {
    	_Mission.LOG.debug( "updating misDebut from " + misDebut() + " to " + value);
    }
    takeStoredValueForKey(value, "misDebut");
  }

  public String misEtat() {
    return (String) storedValueForKey("misEtat");
  }

  public void setMisEtat(String value) {
    if (_Mission.LOG.isDebugEnabled()) {
    	_Mission.LOG.debug( "updating misEtat from " + misEtat() + " to " + value);
    }
    takeStoredValueForKey(value, "misEtat");
  }

  public NSTimestamp misFin() {
    return (NSTimestamp) storedValueForKey("misFin");
  }

  public void setMisFin(NSTimestamp value) {
    if (_Mission.LOG.isDebugEnabled()) {
    	_Mission.LOG.debug( "updating misFin from " + misFin() + " to " + value);
    }
    takeStoredValueForKey(value, "misFin");
  }

  public String misMotif() {
    return (String) storedValueForKey("misMotif");
  }

  public void setMisMotif(String value) {
    if (_Mission.LOG.isDebugEnabled()) {
    	_Mission.LOG.debug( "updating misMotif from " + misMotif() + " to " + value);
    }
    takeStoredValueForKey(value, "misMotif");
  }

  public org.cocktail.superplaner.serveur.metier.FournisUlr fournis() {
    return (org.cocktail.superplaner.serveur.metier.FournisUlr)storedValueForKey("fournis");
  }

  public void setFournisRelationship(org.cocktail.superplaner.serveur.metier.FournisUlr value) {
    if (_Mission.LOG.isDebugEnabled()) {
      _Mission.LOG.debug("updating fournis from " + fournis() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FournisUlr oldValue = fournis();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "fournis");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "fournis");
    }
  }
  

  public static Mission createMission(EOEditingContext editingContext, NSTimestamp misDebut
, String misEtat
, NSTimestamp misFin
, String misMotif
) {
    Mission eo = (Mission) EOUtilities.createAndInsertInstance(editingContext, _Mission.ENTITY_NAME);    
		eo.setMisDebut(misDebut);
		eo.setMisEtat(misEtat);
		eo.setMisFin(misFin);
		eo.setMisMotif(misMotif);
    return eo;
  }

  public static NSArray<Mission> fetchAllMissions(EOEditingContext editingContext) {
    return _Mission.fetchAllMissions(editingContext, null);
  }

  public static NSArray<Mission> fetchAllMissions(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Mission.fetchMissions(editingContext, null, sortOrderings);
  }

  public static NSArray<Mission> fetchMissions(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Mission.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Mission> eoObjects = (NSArray<Mission>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Mission fetchMission(EOEditingContext editingContext, String keyName, Object value) {
    return _Mission.fetchMission(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Mission fetchMission(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Mission> eoObjects = _Mission.fetchMissions(editingContext, qualifier, null);
    Mission eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Mission)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Mission that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Mission fetchRequiredMission(EOEditingContext editingContext, String keyName, Object value) {
    return _Mission.fetchRequiredMission(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Mission fetchRequiredMission(EOEditingContext editingContext, EOQualifier qualifier) {
    Mission eoObject = _Mission.fetchMission(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Mission that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Mission localInstanceIn(EOEditingContext editingContext, Mission eo) {
    Mission localInstance = (eo == null) ? null : (Mission)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
