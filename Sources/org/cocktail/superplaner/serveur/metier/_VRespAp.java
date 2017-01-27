// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VRespAp.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VRespAp extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VRespAp";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";

	// Relationships
	public static final String AP_KEY = "ap";
	public static final String INDIVIDU_KEY = "individu";

  private static Logger LOG = Logger.getLogger(_VRespAp.class);

  public VRespAp localInstanceIn(EOEditingContext editingContext) {
    VRespAp localInstance = (VRespAp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_VRespAp.LOG.isDebugEnabled()) {
    	_VRespAp.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteAp ap() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("ap");
  }

  public void setApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_VRespAp.LOG.isDebugEnabled()) {
      _VRespAp.LOG.debug("updating ap from " + ap() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteAp oldValue = ap();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "ap");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "ap");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.IndividuUlr individu() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individu");
  }

  public void setIndividuRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_VRespAp.LOG.isDebugEnabled()) {
      _VRespAp.LOG.debug("updating individu from " + individu() + " to " + value);
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
  

  public static VRespAp createVRespAp(EOEditingContext editingContext, Integer fannKey
) {
    VRespAp eo = (VRespAp) EOUtilities.createAndInsertInstance(editingContext, _VRespAp.ENTITY_NAME);    
		eo.setFannKey(fannKey);
    return eo;
  }

  public static NSArray<VRespAp> fetchAllVRespAps(EOEditingContext editingContext) {
    return _VRespAp.fetchAllVRespAps(editingContext, null);
  }

  public static NSArray<VRespAp> fetchAllVRespAps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VRespAp.fetchVRespAps(editingContext, null, sortOrderings);
  }

  public static NSArray<VRespAp> fetchVRespAps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VRespAp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VRespAp> eoObjects = (NSArray<VRespAp>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VRespAp fetchVRespAp(EOEditingContext editingContext, String keyName, Object value) {
    return _VRespAp.fetchVRespAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VRespAp fetchVRespAp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VRespAp> eoObjects = _VRespAp.fetchVRespAps(editingContext, qualifier, null);
    VRespAp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VRespAp)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VRespAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VRespAp fetchRequiredVRespAp(EOEditingContext editingContext, String keyName, Object value) {
    return _VRespAp.fetchRequiredVRespAp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VRespAp fetchRequiredVRespAp(EOEditingContext editingContext, EOQualifier qualifier) {
    VRespAp eoObject = _VRespAp.fetchVRespAp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VRespAp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VRespAp localInstanceIn(EOEditingContext editingContext, VRespAp eo) {
    VRespAp localInstance = (eo == null) ? null : (VRespAp)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
