// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to RepartLotIndividu.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _RepartLotIndividu extends  EOGenericRecord {
	public static final String ENTITY_NAME = "RepartLotIndividu";

	// Attributes

	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String LOT_SALLE_KEY = "lotSalle";

  private static Logger LOG = Logger.getLogger(_RepartLotIndividu.class);

  public RepartLotIndividu localInstanceIn(EOEditingContext editingContext) {
    RepartLotIndividu localInstance = (RepartLotIndividu)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_RepartLotIndividu.LOG.isDebugEnabled()) {
      _RepartLotIndividu.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.LotSalle lotSalle() {
    return (org.cocktail.superplaner.serveur.metier.LotSalle)storedValueForKey("lotSalle");
  }

  public void setLotSalleRelationship(org.cocktail.superplaner.serveur.metier.LotSalle value) {
    if (_RepartLotIndividu.LOG.isDebugEnabled()) {
      _RepartLotIndividu.LOG.debug("updating lotSalle from " + lotSalle() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.LotSalle oldValue = lotSalle();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "lotSalle");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "lotSalle");
    }
  }
  

  public static RepartLotIndividu createRepartLotIndividu(EOEditingContext editingContext, org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr, org.cocktail.superplaner.serveur.metier.LotSalle lotSalle) {
    RepartLotIndividu eo = (RepartLotIndividu) EOUtilities.createAndInsertInstance(editingContext, _RepartLotIndividu.ENTITY_NAME);    
    eo.setIndividuUlrRelationship(individuUlr);
    eo.setLotSalleRelationship(lotSalle);
    return eo;
  }

  public static NSArray<RepartLotIndividu> fetchAllRepartLotIndividus(EOEditingContext editingContext) {
    return _RepartLotIndividu.fetchAllRepartLotIndividus(editingContext, null);
  }

  public static NSArray<RepartLotIndividu> fetchAllRepartLotIndividus(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _RepartLotIndividu.fetchRepartLotIndividus(editingContext, null, sortOrderings);
  }

  public static NSArray<RepartLotIndividu> fetchRepartLotIndividus(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_RepartLotIndividu.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<RepartLotIndividu> eoObjects = (NSArray<RepartLotIndividu>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static RepartLotIndividu fetchRepartLotIndividu(EOEditingContext editingContext, String keyName, Object value) {
    return _RepartLotIndividu.fetchRepartLotIndividu(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RepartLotIndividu fetchRepartLotIndividu(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<RepartLotIndividu> eoObjects = _RepartLotIndividu.fetchRepartLotIndividus(editingContext, qualifier, null);
    RepartLotIndividu eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (RepartLotIndividu)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one RepartLotIndividu that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RepartLotIndividu fetchRequiredRepartLotIndividu(EOEditingContext editingContext, String keyName, Object value) {
    return _RepartLotIndividu.fetchRequiredRepartLotIndividu(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static RepartLotIndividu fetchRequiredRepartLotIndividu(EOEditingContext editingContext, EOQualifier qualifier) {
    RepartLotIndividu eoObject = _RepartLotIndividu.fetchRepartLotIndividu(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no RepartLotIndividu that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static RepartLotIndividu localInstanceIn(EOEditingContext editingContext, RepartLotIndividu eo) {
    RepartLotIndividu localInstance = (eo == null) ? null : (RepartLotIndividu)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
