// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolTransfertGrp.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolTransfertGrp extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ScolTransfertGrp";

	// Attributes

	// Relationships
	public static final String NEW_GRP_KEY = "newGrp";
	public static final String OLD_GRP_KEY = "oldGrp";

  private static Logger LOG = Logger.getLogger(_ScolTransfertGrp.class);

  public ScolTransfertGrp localInstanceIn(EOEditingContext editingContext) {
    ScolTransfertGrp localInstance = (ScolTransfertGrp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public org.cocktail.superplaner.serveur.metier.ScolGroupeGrp newGrp() {
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeGrp)storedValueForKey("newGrp");
  }

  public void setNewGrpRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeGrp value) {
    if (_ScolTransfertGrp.LOG.isDebugEnabled()) {
      _ScolTransfertGrp.LOG.debug("updating newGrp from " + newGrp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ScolGroupeGrp oldValue = newGrp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "newGrp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "newGrp");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.ScolGroupeGrp oldGrp() {
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeGrp)storedValueForKey("oldGrp");
  }

  public void setOldGrpRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeGrp value) {
    if (_ScolTransfertGrp.LOG.isDebugEnabled()) {
      _ScolTransfertGrp.LOG.debug("updating oldGrp from " + oldGrp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ScolGroupeGrp oldValue = oldGrp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "oldGrp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "oldGrp");
    }
  }
  

  public static ScolTransfertGrp createScolTransfertGrp(EOEditingContext editingContext, org.cocktail.superplaner.serveur.metier.ScolGroupeGrp newGrp, org.cocktail.superplaner.serveur.metier.ScolGroupeGrp oldGrp) {
    ScolTransfertGrp eo = (ScolTransfertGrp) EOUtilities.createAndInsertInstance(editingContext, _ScolTransfertGrp.ENTITY_NAME);    
    eo.setNewGrpRelationship(newGrp);
    eo.setOldGrpRelationship(oldGrp);
    return eo;
  }

  public static NSArray<ScolTransfertGrp> fetchAllScolTransfertGrps(EOEditingContext editingContext) {
    return _ScolTransfertGrp.fetchAllScolTransfertGrps(editingContext, null);
  }

  public static NSArray<ScolTransfertGrp> fetchAllScolTransfertGrps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolTransfertGrp.fetchScolTransfertGrps(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolTransfertGrp> fetchScolTransfertGrps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolTransfertGrp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolTransfertGrp> eoObjects = (NSArray<ScolTransfertGrp>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolTransfertGrp fetchScolTransfertGrp(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolTransfertGrp.fetchScolTransfertGrp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolTransfertGrp fetchScolTransfertGrp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolTransfertGrp> eoObjects = _ScolTransfertGrp.fetchScolTransfertGrps(editingContext, qualifier, null);
    ScolTransfertGrp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolTransfertGrp)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ScolTransfertGrp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolTransfertGrp fetchRequiredScolTransfertGrp(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolTransfertGrp.fetchRequiredScolTransfertGrp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolTransfertGrp fetchRequiredScolTransfertGrp(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolTransfertGrp eoObject = _ScolTransfertGrp.fetchScolTransfertGrp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ScolTransfertGrp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolTransfertGrp localInstanceIn(EOEditingContext editingContext, ScolTransfertGrp eo) {
    ScolTransfertGrp localInstance = (eo == null) ? null : (ScolTransfertGrp)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
