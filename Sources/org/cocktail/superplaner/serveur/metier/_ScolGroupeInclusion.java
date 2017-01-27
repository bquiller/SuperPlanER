// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolGroupeInclusion.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolGroupeInclusion extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ScolGroupeInclusion";

	// Attributes

	// Relationships
	public static final String GROUPE_FILS_KEY = "groupeFils";
	public static final String GROUPE_PERE_KEY = "groupePere";

  private static Logger LOG = Logger.getLogger(_ScolGroupeInclusion.class);

  public ScolGroupeInclusion localInstanceIn(EOEditingContext editingContext) {
    ScolGroupeInclusion localInstance = (ScolGroupeInclusion)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public org.cocktail.superplaner.serveur.metier.ScolGroupeGrp groupeFils() {
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeGrp)storedValueForKey("groupeFils");
  }

  public void setGroupeFilsRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeGrp value) {
    if (_ScolGroupeInclusion.LOG.isDebugEnabled()) {
      _ScolGroupeInclusion.LOG.debug("updating groupeFils from " + groupeFils() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ScolGroupeGrp oldValue = groupeFils();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "groupeFils");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "groupeFils");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.ScolGroupeGrp groupePere() {
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeGrp)storedValueForKey("groupePere");
  }

  public void setGroupePereRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeGrp value) {
    if (_ScolGroupeInclusion.LOG.isDebugEnabled()) {
      _ScolGroupeInclusion.LOG.debug("updating groupePere from " + groupePere() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ScolGroupeGrp oldValue = groupePere();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "groupePere");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "groupePere");
    }
  }
  

  public static ScolGroupeInclusion createScolGroupeInclusion(EOEditingContext editingContext) {
    ScolGroupeInclusion eo = (ScolGroupeInclusion) EOUtilities.createAndInsertInstance(editingContext, _ScolGroupeInclusion.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<ScolGroupeInclusion> fetchAllScolGroupeInclusions(EOEditingContext editingContext) {
    return _ScolGroupeInclusion.fetchAllScolGroupeInclusions(editingContext, null);
  }

  public static NSArray<ScolGroupeInclusion> fetchAllScolGroupeInclusions(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolGroupeInclusion.fetchScolGroupeInclusions(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolGroupeInclusion> fetchScolGroupeInclusions(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolGroupeInclusion.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolGroupeInclusion> eoObjects = (NSArray<ScolGroupeInclusion>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolGroupeInclusion fetchScolGroupeInclusion(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolGroupeInclusion.fetchScolGroupeInclusion(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolGroupeInclusion fetchScolGroupeInclusion(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolGroupeInclusion> eoObjects = _ScolGroupeInclusion.fetchScolGroupeInclusions(editingContext, qualifier, null);
    ScolGroupeInclusion eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolGroupeInclusion)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ScolGroupeInclusion that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolGroupeInclusion fetchRequiredScolGroupeInclusion(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolGroupeInclusion.fetchRequiredScolGroupeInclusion(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolGroupeInclusion fetchRequiredScolGroupeInclusion(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolGroupeInclusion eoObject = _ScolGroupeInclusion.fetchScolGroupeInclusion(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ScolGroupeInclusion that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolGroupeInclusion localInstanceIn(EOEditingContext editingContext, ScolGroupeInclusion eo) {
    ScolGroupeInclusion localInstance = (eo == null) ? null : (ScolGroupeInclusion)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
