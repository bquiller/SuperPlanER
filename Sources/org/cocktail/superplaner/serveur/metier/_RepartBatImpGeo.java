// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to RepartBatImpGeo.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _RepartBatImpGeo extends  EOGenericRecord {
	public static final String ENTITY_NAME = "RepartBatImpGeo";

	// Attributes
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";

	// Relationships
	public static final String IMPLANTATION_GEO_KEY = "implantationGeo";
	public static final String LOCAL_KEY = "local";

  private static Logger LOG = Logger.getLogger(_RepartBatImpGeo.class);

  public RepartBatImpGeo localInstanceIn(EOEditingContext editingContext) {
    RepartBatImpGeo localInstance = (RepartBatImpGeo)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey("dCreation");
  }

  public void setDCreation(NSTimestamp value) {
    if (_RepartBatImpGeo.LOG.isDebugEnabled()) {
    	_RepartBatImpGeo.LOG.debug( "updating dCreation from " + dCreation() + " to " + value);
    }
    takeStoredValueForKey(value, "dCreation");
  }

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey("dModification");
  }

  public void setDModification(NSTimestamp value) {
    if (_RepartBatImpGeo.LOG.isDebugEnabled()) {
    	_RepartBatImpGeo.LOG.debug( "updating dModification from " + dModification() + " to " + value);
    }
    takeStoredValueForKey(value, "dModification");
  }

  public org.cocktail.superplaner.serveur.metier.ImplantationGeo implantationGeo() {
    return (org.cocktail.superplaner.serveur.metier.ImplantationGeo)storedValueForKey("implantationGeo");
  }

  public void setImplantationGeoRelationship(org.cocktail.superplaner.serveur.metier.ImplantationGeo value) {
    if (_RepartBatImpGeo.LOG.isDebugEnabled()) {
      _RepartBatImpGeo.LOG.debug("updating implantationGeo from " + implantationGeo() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ImplantationGeo oldValue = implantationGeo();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "implantationGeo");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "implantationGeo");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.Local local() {
    return (org.cocktail.superplaner.serveur.metier.Local)storedValueForKey("local");
  }

  public void setLocalRelationship(org.cocktail.superplaner.serveur.metier.Local value) {
    if (_RepartBatImpGeo.LOG.isDebugEnabled()) {
      _RepartBatImpGeo.LOG.debug("updating local from " + local() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Local oldValue = local();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "local");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "local");
    }
  }
  

  public static RepartBatImpGeo createRepartBatImpGeo(EOEditingContext editingContext) {
    RepartBatImpGeo eo = (RepartBatImpGeo) EOUtilities.createAndInsertInstance(editingContext, _RepartBatImpGeo.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<RepartBatImpGeo> fetchAllRepartBatImpGeos(EOEditingContext editingContext) {
    return _RepartBatImpGeo.fetchAllRepartBatImpGeos(editingContext, null);
  }

  public static NSArray<RepartBatImpGeo> fetchAllRepartBatImpGeos(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _RepartBatImpGeo.fetchRepartBatImpGeos(editingContext, null, sortOrderings);
  }

  public static NSArray<RepartBatImpGeo> fetchRepartBatImpGeos(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_RepartBatImpGeo.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<RepartBatImpGeo> eoObjects = (NSArray<RepartBatImpGeo>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static RepartBatImpGeo fetchRepartBatImpGeo(EOEditingContext editingContext, String keyName, Object value) {
    return _RepartBatImpGeo.fetchRepartBatImpGeo(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RepartBatImpGeo fetchRepartBatImpGeo(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<RepartBatImpGeo> eoObjects = _RepartBatImpGeo.fetchRepartBatImpGeos(editingContext, qualifier, null);
    RepartBatImpGeo eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (RepartBatImpGeo)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one RepartBatImpGeo that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RepartBatImpGeo fetchRequiredRepartBatImpGeo(EOEditingContext editingContext, String keyName, Object value) {
    return _RepartBatImpGeo.fetchRequiredRepartBatImpGeo(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RepartBatImpGeo fetchRequiredRepartBatImpGeo(EOEditingContext editingContext, EOQualifier qualifier) {
    RepartBatImpGeo eoObject = _RepartBatImpGeo.fetchRepartBatImpGeo(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no RepartBatImpGeo that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RepartBatImpGeo localInstanceIn(EOEditingContext editingContext, RepartBatImpGeo eo) {
    RepartBatImpGeo localInstance = (eo == null) ? null : (RepartBatImpGeo)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
