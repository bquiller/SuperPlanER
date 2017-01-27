// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ResaCouleurEc.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ResaCouleurEc extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ResaCouleurEc";

	// Attributes
	public static final String COLOR_CODE_KEY = "colorCode";

	// Relationships
	public static final String FORMATION_ANNEE_KEY = "formationAnnee";
	public static final String MAQUETTE_EC_KEY = "maquetteEc";

  private static Logger LOG = Logger.getLogger(_ResaCouleurEc.class);

  public ResaCouleurEc localInstanceIn(EOEditingContext editingContext) {
    ResaCouleurEc localInstance = (ResaCouleurEc)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String colorCode() {
    return (String) storedValueForKey("colorCode");
  }

  public void setColorCode(String value) {
    if (_ResaCouleurEc.LOG.isDebugEnabled()) {
    	_ResaCouleurEc.LOG.debug( "updating colorCode from " + colorCode() + " to " + value);
    }
    takeStoredValueForKey(value, "colorCode");
  }

  public org.cocktail.superplaner.serveur.metier.FormationAnnee formationAnnee() {
    return (org.cocktail.superplaner.serveur.metier.FormationAnnee)storedValueForKey("formationAnnee");
  }

  public void setFormationAnneeRelationship(org.cocktail.superplaner.serveur.metier.FormationAnnee value) {
    if (_ResaCouleurEc.LOG.isDebugEnabled()) {
      _ResaCouleurEc.LOG.debug("updating formationAnnee from " + formationAnnee() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationAnnee oldValue = formationAnnee();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "formationAnnee");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "formationAnnee");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.MaquetteEc maquetteEc() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteEc)storedValueForKey("maquetteEc");
  }

  public void setMaquetteEcRelationship(org.cocktail.superplaner.serveur.metier.MaquetteEc value) {
    if (_ResaCouleurEc.LOG.isDebugEnabled()) {
      _ResaCouleurEc.LOG.debug("updating maquetteEc from " + maquetteEc() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteEc oldValue = maquetteEc();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteEc");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteEc");
    }
  }
  

  public static ResaCouleurEc createResaCouleurEc(EOEditingContext editingContext, String colorCode
) {
    ResaCouleurEc eo = (ResaCouleurEc) EOUtilities.createAndInsertInstance(editingContext, _ResaCouleurEc.ENTITY_NAME);    
		eo.setColorCode(colorCode);
    return eo;
  }

  public static NSArray<ResaCouleurEc> fetchAllResaCouleurEcs(EOEditingContext editingContext) {
    return _ResaCouleurEc.fetchAllResaCouleurEcs(editingContext, null);
  }

  public static NSArray<ResaCouleurEc> fetchAllResaCouleurEcs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ResaCouleurEc.fetchResaCouleurEcs(editingContext, null, sortOrderings);
  }

  public static NSArray<ResaCouleurEc> fetchResaCouleurEcs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ResaCouleurEc.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ResaCouleurEc> eoObjects = (NSArray<ResaCouleurEc>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ResaCouleurEc fetchResaCouleurEc(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaCouleurEc.fetchResaCouleurEc(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaCouleurEc fetchResaCouleurEc(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ResaCouleurEc> eoObjects = _ResaCouleurEc.fetchResaCouleurEcs(editingContext, qualifier, null);
    ResaCouleurEc eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ResaCouleurEc)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ResaCouleurEc that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaCouleurEc fetchRequiredResaCouleurEc(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaCouleurEc.fetchRequiredResaCouleurEc(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaCouleurEc fetchRequiredResaCouleurEc(EOEditingContext editingContext, EOQualifier qualifier) {
    ResaCouleurEc eoObject = _ResaCouleurEc.fetchResaCouleurEc(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ResaCouleurEc that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaCouleurEc localInstanceIn(EOEditingContext editingContext, ResaCouleurEc eo) {
    ResaCouleurEc localInstance = (eo == null) ? null : (ResaCouleurEc)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
