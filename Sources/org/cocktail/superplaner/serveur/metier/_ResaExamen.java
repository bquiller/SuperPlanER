// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ResaExamen.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ResaExamen extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ResaExamen";

	// Attributes
	public static final String GGRP_KEY_KEY = "ggrpKey";

	// Relationships
	public static final String EXAMEN_ENTETE_KEY = "examenEntete";
	public static final String RESERVATION_KEY = "reservation";
	public static final String SCOL_GROUPE_GRP_KEY = "scolGroupeGrp";

  private static Logger LOG = Logger.getLogger(_ResaExamen.class);

  public ResaExamen localInstanceIn(EOEditingContext editingContext) {
    ResaExamen localInstance = (ResaExamen)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer ggrpKey() {
    return (Integer) storedValueForKey("ggrpKey");
  }

  public void setGgrpKey(Integer value) {
    if (_ResaExamen.LOG.isDebugEnabled()) {
    	_ResaExamen.LOG.debug( "updating ggrpKey from " + ggrpKey() + " to " + value);
    }
    takeStoredValueForKey(value, "ggrpKey");
  }

  public org.cocktail.superplaner.serveur.metier.ExamenEntete examenEntete() {
    return (org.cocktail.superplaner.serveur.metier.ExamenEntete)storedValueForKey("examenEntete");
  }

  public void setExamenEnteteRelationship(org.cocktail.superplaner.serveur.metier.ExamenEntete value) {
    if (_ResaExamen.LOG.isDebugEnabled()) {
      _ResaExamen.LOG.debug("updating examenEntete from " + examenEntete() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ExamenEntete oldValue = examenEntete();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "examenEntete");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "examenEntete");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.Reservation reservation() {
    return (org.cocktail.superplaner.serveur.metier.Reservation)storedValueForKey("reservation");
  }

  public void setReservationRelationship(org.cocktail.superplaner.serveur.metier.Reservation value) {
    if (_ResaExamen.LOG.isDebugEnabled()) {
      _ResaExamen.LOG.debug("updating reservation from " + reservation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Reservation oldValue = reservation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "reservation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "reservation");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.ScolGroupeGrp scolGroupeGrp() {
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeGrp)storedValueForKey("scolGroupeGrp");
  }

  public void setScolGroupeGrpRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeGrp value) {
    if (_ResaExamen.LOG.isDebugEnabled()) {
      _ResaExamen.LOG.debug("updating scolGroupeGrp from " + scolGroupeGrp() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ScolGroupeGrp oldValue = scolGroupeGrp();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "scolGroupeGrp");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "scolGroupeGrp");
    }
  }
  

  public static ResaExamen createResaExamen(EOEditingContext editingContext) {
    ResaExamen eo = (ResaExamen) EOUtilities.createAndInsertInstance(editingContext, _ResaExamen.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<ResaExamen> fetchAllResaExamens(EOEditingContext editingContext) {
    return _ResaExamen.fetchAllResaExamens(editingContext, null);
  }

  public static NSArray<ResaExamen> fetchAllResaExamens(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ResaExamen.fetchResaExamens(editingContext, null, sortOrderings);
  }

  public static NSArray<ResaExamen> fetchResaExamens(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ResaExamen.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ResaExamen> eoObjects = (NSArray<ResaExamen>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ResaExamen fetchResaExamen(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaExamen.fetchResaExamen(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaExamen fetchResaExamen(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ResaExamen> eoObjects = _ResaExamen.fetchResaExamens(editingContext, qualifier, null);
    ResaExamen eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ResaExamen)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ResaExamen that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaExamen fetchRequiredResaExamen(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaExamen.fetchRequiredResaExamen(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaExamen fetchRequiredResaExamen(EOEditingContext editingContext, EOQualifier qualifier) {
    ResaExamen eoObject = _ResaExamen.fetchResaExamen(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ResaExamen that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaExamen localInstanceIn(EOEditingContext editingContext, ResaExamen eo) {
    ResaExamen localInstance = (eo == null) ? null : (ResaExamen)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
