// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VLotSalleIndividu.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VLotSalleIndividu extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VLotSalleIndividu";

	// Attributes

	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String LOT_SALLE_KEY = "lotSalle";
	public static final String SALLE_KEY = "salle";

  private static Logger LOG = Logger.getLogger(_VLotSalleIndividu.class);

  public VLotSalleIndividu localInstanceIn(EOEditingContext editingContext) {
    VLotSalleIndividu localInstance = (VLotSalleIndividu)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_VLotSalleIndividu.LOG.isDebugEnabled()) {
      _VLotSalleIndividu.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
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
    if (_VLotSalleIndividu.LOG.isDebugEnabled()) {
      _VLotSalleIndividu.LOG.debug("updating lotSalle from " + lotSalle() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.Salles salle() {
    return (org.cocktail.superplaner.serveur.metier.Salles)storedValueForKey("salle");
  }

  public void setSalleRelationship(org.cocktail.superplaner.serveur.metier.Salles value) {
    if (_VLotSalleIndividu.LOG.isDebugEnabled()) {
      _VLotSalleIndividu.LOG.debug("updating salle from " + salle() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Salles oldValue = salle();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "salle");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "salle");
    }
  }
  

  public static VLotSalleIndividu createVLotSalleIndividu(EOEditingContext editingContext, org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr, org.cocktail.superplaner.serveur.metier.LotSalle lotSalle, org.cocktail.superplaner.serveur.metier.Salles salle) {
    VLotSalleIndividu eo = (VLotSalleIndividu) EOUtilities.createAndInsertInstance(editingContext, _VLotSalleIndividu.ENTITY_NAME);    
    eo.setIndividuUlrRelationship(individuUlr);
    eo.setLotSalleRelationship(lotSalle);
    eo.setSalleRelationship(salle);
    return eo;
  }

  public static NSArray<VLotSalleIndividu> fetchAllVLotSalleIndividus(EOEditingContext editingContext) {
    return _VLotSalleIndividu.fetchAllVLotSalleIndividus(editingContext, null);
  }

  public static NSArray<VLotSalleIndividu> fetchAllVLotSalleIndividus(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VLotSalleIndividu.fetchVLotSalleIndividus(editingContext, null, sortOrderings);
  }

  public static NSArray<VLotSalleIndividu> fetchVLotSalleIndividus(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VLotSalleIndividu.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VLotSalleIndividu> eoObjects = (NSArray<VLotSalleIndividu>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VLotSalleIndividu fetchVLotSalleIndividu(EOEditingContext editingContext, String keyName, Object value) {
    return _VLotSalleIndividu.fetchVLotSalleIndividu(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VLotSalleIndividu fetchVLotSalleIndividu(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VLotSalleIndividu> eoObjects = _VLotSalleIndividu.fetchVLotSalleIndividus(editingContext, qualifier, null);
    VLotSalleIndividu eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VLotSalleIndividu)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VLotSalleIndividu that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VLotSalleIndividu fetchRequiredVLotSalleIndividu(EOEditingContext editingContext, String keyName, Object value) {
    return _VLotSalleIndividu.fetchRequiredVLotSalleIndividu(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VLotSalleIndividu fetchRequiredVLotSalleIndividu(EOEditingContext editingContext, EOQualifier qualifier) {
    VLotSalleIndividu eoObject = _VLotSalleIndividu.fetchVLotSalleIndividu(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VLotSalleIndividu that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VLotSalleIndividu localInstanceIn(EOEditingContext editingContext, VLotSalleIndividu eo) {
    VLotSalleIndividu localInstance = (eo == null) ? null : (VLotSalleIndividu)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
