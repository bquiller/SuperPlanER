// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to DepositaireSalles.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _DepositaireSalles extends  EOGenericRecord {
	public static final String ENTITY_NAME = "DepositaireSalles";

	// Attributes
	public static final String C_STRUCTURE_KEY = "cStructure";

	// Relationships
	public static final String SALLE_KEY = "salle";
	public static final String STRUCTURE_ULR_KEY = "structureUlr";

  private static Logger LOG = Logger.getLogger(_DepositaireSalles.class);

  public DepositaireSalles localInstanceIn(EOEditingContext editingContext) {
    DepositaireSalles localInstance = (DepositaireSalles)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cStructure() {
    return (String) storedValueForKey("cStructure");
  }

  public void setCStructure(String value) {
    if (_DepositaireSalles.LOG.isDebugEnabled()) {
    	_DepositaireSalles.LOG.debug( "updating cStructure from " + cStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "cStructure");
  }

  public org.cocktail.superplaner.serveur.metier.Salles salle() {
    return (org.cocktail.superplaner.serveur.metier.Salles)storedValueForKey("salle");
  }

  public void setSalleRelationship(org.cocktail.superplaner.serveur.metier.Salles value) {
    if (_DepositaireSalles.LOG.isDebugEnabled()) {
      _DepositaireSalles.LOG.debug("updating salle from " + salle() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.StructureUlr structureUlr() {
    return (org.cocktail.superplaner.serveur.metier.StructureUlr)storedValueForKey("structureUlr");
  }

  public void setStructureUlrRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr value) {
    if (_DepositaireSalles.LOG.isDebugEnabled()) {
      _DepositaireSalles.LOG.debug("updating structureUlr from " + structureUlr() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.StructureUlr oldValue = structureUlr();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "structureUlr");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "structureUlr");
    }
  }
  

  public static DepositaireSalles createDepositaireSalles(EOEditingContext editingContext, String cStructure
) {
    DepositaireSalles eo = (DepositaireSalles) EOUtilities.createAndInsertInstance(editingContext, _DepositaireSalles.ENTITY_NAME);    
		eo.setCStructure(cStructure);
    return eo;
  }

  public static NSArray<DepositaireSalles> fetchAllDepositaireSalleses(EOEditingContext editingContext) {
    return _DepositaireSalles.fetchAllDepositaireSalleses(editingContext, null);
  }

  public static NSArray<DepositaireSalles> fetchAllDepositaireSalleses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _DepositaireSalles.fetchDepositaireSalleses(editingContext, null, sortOrderings);
  }

  public static NSArray<DepositaireSalles> fetchDepositaireSalleses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_DepositaireSalles.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<DepositaireSalles> eoObjects = (NSArray<DepositaireSalles>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static DepositaireSalles fetchDepositaireSalles(EOEditingContext editingContext, String keyName, Object value) {
    return _DepositaireSalles.fetchDepositaireSalles(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static DepositaireSalles fetchDepositaireSalles(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<DepositaireSalles> eoObjects = _DepositaireSalles.fetchDepositaireSalleses(editingContext, qualifier, null);
    DepositaireSalles eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (DepositaireSalles)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one DepositaireSalles that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static DepositaireSalles fetchRequiredDepositaireSalles(EOEditingContext editingContext, String keyName, Object value) {
    return _DepositaireSalles.fetchRequiredDepositaireSalles(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static DepositaireSalles fetchRequiredDepositaireSalles(EOEditingContext editingContext, EOQualifier qualifier) {
    DepositaireSalles eoObject = _DepositaireSalles.fetchDepositaireSalles(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no DepositaireSalles that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static DepositaireSalles localInstanceIn(EOEditingContext editingContext, DepositaireSalles eo) {
    DepositaireSalles localInstance = (eo == null) ? null : (DepositaireSalles)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
