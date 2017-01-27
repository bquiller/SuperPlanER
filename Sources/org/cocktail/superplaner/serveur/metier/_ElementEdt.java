// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ElementEdt.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ElementEdt extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ElementEdt";

	// Attributes
	public static final String ELEM_TYPE_KEY = "elemType";

	// Relationships
	public static final String AP_KEY = "ap";
	public static final String ELEMENT_TYPE_EDT_KEY = "elementTypeEdt";
	public static final String GROUPE_KEY = "groupe";
	public static final String INDIVIDU_KEY = "individu";
	public static final String SALLE_KEY = "salle";

  private static Logger LOG = Logger.getLogger(_ElementEdt.class);

  public ElementEdt localInstanceIn(EOEditingContext editingContext) {
    ElementEdt localInstance = (ElementEdt)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String elemType() {
    return (String) storedValueForKey("elemType");
  }

  public void setElemType(String value) {
    if (_ElementEdt.LOG.isDebugEnabled()) {
    	_ElementEdt.LOG.debug( "updating elemType from " + elemType() + " to " + value);
    }
    takeStoredValueForKey(value, "elemType");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteAp ap() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp)storedValueForKey("ap");
  }

  public void setApRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp value) {
    if (_ElementEdt.LOG.isDebugEnabled()) {
      _ElementEdt.LOG.debug("updating ap from " + ap() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.ElementTypeEdt elementTypeEdt() {
    return (org.cocktail.superplaner.serveur.metier.ElementTypeEdt)storedValueForKey("elementTypeEdt");
  }

  public void setElementTypeEdtRelationship(org.cocktail.superplaner.serveur.metier.ElementTypeEdt value) {
    if (_ElementEdt.LOG.isDebugEnabled()) {
      _ElementEdt.LOG.debug("updating elementTypeEdt from " + elementTypeEdt() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ElementTypeEdt oldValue = elementTypeEdt();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "elementTypeEdt");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "elementTypeEdt");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.ScolGroupeGrp groupe() {
    return (org.cocktail.superplaner.serveur.metier.ScolGroupeGrp)storedValueForKey("groupe");
  }

  public void setGroupeRelationship(org.cocktail.superplaner.serveur.metier.ScolGroupeGrp value) {
    if (_ElementEdt.LOG.isDebugEnabled()) {
      _ElementEdt.LOG.debug("updating groupe from " + groupe() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ScolGroupeGrp oldValue = groupe();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "groupe");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "groupe");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.IndividuUlr individu() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individu");
  }

  public void setIndividuRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_ElementEdt.LOG.isDebugEnabled()) {
      _ElementEdt.LOG.debug("updating individu from " + individu() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.Salles salle() {
    return (org.cocktail.superplaner.serveur.metier.Salles)storedValueForKey("salle");
  }

  public void setSalleRelationship(org.cocktail.superplaner.serveur.metier.Salles value) {
    if (_ElementEdt.LOG.isDebugEnabled()) {
      _ElementEdt.LOG.debug("updating salle from " + salle() + " to " + value);
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
  

  public static ElementEdt createElementEdt(EOEditingContext editingContext, String elemType
) {
    ElementEdt eo = (ElementEdt) EOUtilities.createAndInsertInstance(editingContext, _ElementEdt.ENTITY_NAME);    
		eo.setElemType(elemType);
    return eo;
  }

  public static NSArray<ElementEdt> fetchAllElementEdts(EOEditingContext editingContext) {
    return _ElementEdt.fetchAllElementEdts(editingContext, null);
  }

  public static NSArray<ElementEdt> fetchAllElementEdts(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ElementEdt.fetchElementEdts(editingContext, null, sortOrderings);
  }

  public static NSArray<ElementEdt> fetchElementEdts(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ElementEdt.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ElementEdt> eoObjects = (NSArray<ElementEdt>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ElementEdt fetchElementEdt(EOEditingContext editingContext, String keyName, Object value) {
    return _ElementEdt.fetchElementEdt(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ElementEdt fetchElementEdt(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ElementEdt> eoObjects = _ElementEdt.fetchElementEdts(editingContext, qualifier, null);
    ElementEdt eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ElementEdt)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ElementEdt that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ElementEdt fetchRequiredElementEdt(EOEditingContext editingContext, String keyName, Object value) {
    return _ElementEdt.fetchRequiredElementEdt(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ElementEdt fetchRequiredElementEdt(EOEditingContext editingContext, EOQualifier qualifier) {
    ElementEdt eoObject = _ElementEdt.fetchElementEdt(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ElementEdt that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ElementEdt localInstanceIn(EOEditingContext editingContext, ElementEdt eo) {
    ElementEdt localInstance = (eo == null) ? null : (ElementEdt)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
