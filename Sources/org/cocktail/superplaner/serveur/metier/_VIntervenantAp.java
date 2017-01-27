// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VIntervenantAp.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VIntervenantAp extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VIntervenantAp";

	// Attributes
	public static final String MAP_KEY_KEY = "mapKey";
	public static final String NO_INDIVIDU_KEY = "noIndividu";

	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String MAQUETTE_AP_KEY = "maquetteAp";

  private static Logger LOG = Logger.getLogger(_VIntervenantAp.class);

  public VIntervenantAp localInstanceIn(EOEditingContext editingContext) {
    VIntervenantAp localInstance = (VIntervenantAp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer mapKey() {
    return (Integer) storedValueForKey("mapKey");
  }

  public void setMapKey(Integer value) {
    if (_VIntervenantAp.LOG.isDebugEnabled()) {
    	_VIntervenantAp.LOG.debug( "updating mapKey from " + mapKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mapKey");
  }

  public Integer noIndividu() {
    return (Integer) storedValueForKey("noIndividu");
  }

  public void setNoIndividu(Integer value) {
    if (_VIntervenantAp.LOG.isDebugEnabled()) {
    	_VIntervenantAp.LOG.debug( "updating noIndividu from " + noIndividu() + " to " + value);
    }
    takeStoredValueForKey(value, "noIndividu");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_VIntervenantAp.LOG.isDebugEnabled()) {
      _VIntervenantAp.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individuUlr();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individuUlr");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individuUlr");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteAp maquetteAp() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("maquetteAp");
  }

  public void setMaquetteApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_VIntervenantAp.LOG.isDebugEnabled()) {
      _VIntervenantAp.LOG.debug("updating maquetteAp from " + maquetteAp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteAp oldValue = maquetteAp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteAp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteAp");
    }
  }
  

  public static VIntervenantAp createVIntervenantAp(EOEditingContext editingContext, Integer mapKey
, Integer noIndividu
) {
    VIntervenantAp eo = (VIntervenantAp) EOUtilities.createAndInsertInstance(editingContext, _VIntervenantAp.ENTITY_NAME);    
		eo.setMapKey(mapKey);
		eo.setNoIndividu(noIndividu);
    return eo;
  }

  public static NSArray<VIntervenantAp> fetchAllVIntervenantAps(EOEditingContext editingContext) {
    return _VIntervenantAp.fetchAllVIntervenantAps(editingContext, null);
  }

  public static NSArray<VIntervenantAp> fetchAllVIntervenantAps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VIntervenantAp.fetchVIntervenantAps(editingContext, null, sortOrderings);
  }

  public static NSArray<VIntervenantAp> fetchVIntervenantAps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VIntervenantAp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VIntervenantAp> eoObjects = (NSArray<VIntervenantAp>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VIntervenantAp fetchVIntervenantAp(EOEditingContext editingContext, String keyName, Object value) {
    return _VIntervenantAp.fetchVIntervenantAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VIntervenantAp fetchVIntervenantAp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VIntervenantAp> eoObjects = _VIntervenantAp.fetchVIntervenantAps(editingContext, qualifier, null);
    VIntervenantAp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VIntervenantAp)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VIntervenantAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VIntervenantAp fetchRequiredVIntervenantAp(EOEditingContext editingContext, String keyName, Object value) {
    return _VIntervenantAp.fetchRequiredVIntervenantAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VIntervenantAp fetchRequiredVIntervenantAp(EOEditingContext editingContext, EOQualifier qualifier) {
    VIntervenantAp eoObject = _VIntervenantAp.fetchVIntervenantAp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VIntervenantAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VIntervenantAp localInstanceIn(EOEditingContext editingContext, VIntervenantAp eo) {
    VIntervenantAp localInstance = (eo == null) ? null : (VIntervenantAp)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
