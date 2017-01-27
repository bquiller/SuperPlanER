// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ResaObjetDepositaire.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ResaObjetDepositaire extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ResaObjetDepositaire";

	// Attributes
	public static final String DATE_DEB_KEY = "dateDeb";
	public static final String DATE_FIN_KEY = "dateFin";

	// Relationships
	public static final String REPART_STRUCTURES_KEY = "repartStructures";
	public static final String RESA_OBJET_KEY = "resaObjet";
	public static final String STRUCTURE_ULR_KEY = "structureUlr";

  private static Logger LOG = Logger.getLogger(_ResaObjetDepositaire.class);

  public ResaObjetDepositaire localInstanceIn(EOEditingContext editingContext) {
    ResaObjetDepositaire localInstance = (ResaObjetDepositaire)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dateDeb() {
    return (NSTimestamp) storedValueForKey("dateDeb");
  }

  public void setDateDeb(NSTimestamp value) {
    if (_ResaObjetDepositaire.LOG.isDebugEnabled()) {
    	_ResaObjetDepositaire.LOG.debug( "updating dateDeb from " + dateDeb() + " to " + value);
    }
    takeStoredValueForKey(value, "dateDeb");
  }

  public NSTimestamp dateFin() {
    return (NSTimestamp) storedValueForKey("dateFin");
  }

  public void setDateFin(NSTimestamp value) {
    if (_ResaObjetDepositaire.LOG.isDebugEnabled()) {
    	_ResaObjetDepositaire.LOG.debug( "updating dateFin from " + dateFin() + " to " + value);
    }
    takeStoredValueForKey(value, "dateFin");
  }

  public org.cocktail.superplaner.serveur.metier.ResaObjet resaObjet() {
    return (org.cocktail.superplaner.serveur.metier.ResaObjet)storedValueForKey("resaObjet");
  }

  public void setResaObjetRelationship(org.cocktail.superplaner.serveur.metier.ResaObjet value) {
    if (_ResaObjetDepositaire.LOG.isDebugEnabled()) {
      _ResaObjetDepositaire.LOG.debug("updating resaObjet from " + resaObjet() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ResaObjet oldValue = resaObjet();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "resaObjet");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "resaObjet");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.StructureUlr structureUlr() {
    return (org.cocktail.superplaner.serveur.metier.StructureUlr)storedValueForKey("structureUlr");
  }

  public void setStructureUlrRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr value) {
    if (_ResaObjetDepositaire.LOG.isDebugEnabled()) {
      _ResaObjetDepositaire.LOG.debug("updating structureUlr from " + structureUlr() + " to " + value);
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
  
  public NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> repartStructures() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure>)storedValueForKey("repartStructures");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> repartStructures(EOQualifier qualifier) {
    return repartStructures(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> repartStructures(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> results;
      results = repartStructures();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRepartStructuresRelationship(org.cocktail.superplaner.serveur.metier.RepartStructure object) {
    if (_ResaObjetDepositaire.LOG.isDebugEnabled()) {
      _ResaObjetDepositaire.LOG.debug("adding " + object + " to repartStructures relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartStructures");
  }

  public void removeFromRepartStructuresRelationship(org.cocktail.superplaner.serveur.metier.RepartStructure object) {
    if (_ResaObjetDepositaire.LOG.isDebugEnabled()) {
      _ResaObjetDepositaire.LOG.debug("removing " + object + " from repartStructures relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartStructures");
  }

  public org.cocktail.superplaner.serveur.metier.RepartStructure createRepartStructuresRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartStructure");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "repartStructures");
    return (org.cocktail.superplaner.serveur.metier.RepartStructure) eo;
  }

  public void deleteRepartStructuresRelationship(org.cocktail.superplaner.serveur.metier.RepartStructure object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartStructures");
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartStructuresRelationships() {
    Enumeration objects = repartStructures().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartStructuresRelationship((org.cocktail.superplaner.serveur.metier.RepartStructure)objects.nextElement());
    }
  }


  public static ResaObjetDepositaire createResaObjetDepositaire(EOEditingContext editingContext, NSTimestamp dateDeb
) {
    ResaObjetDepositaire eo = (ResaObjetDepositaire) EOUtilities.createAndInsertInstance(editingContext, _ResaObjetDepositaire.ENTITY_NAME);    
		eo.setDateDeb(dateDeb);
    return eo;
  }

  public static NSArray<ResaObjetDepositaire> fetchAllResaObjetDepositaires(EOEditingContext editingContext) {
    return _ResaObjetDepositaire.fetchAllResaObjetDepositaires(editingContext, null);
  }

  public static NSArray<ResaObjetDepositaire> fetchAllResaObjetDepositaires(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ResaObjetDepositaire.fetchResaObjetDepositaires(editingContext, null, sortOrderings);
  }

  public static NSArray<ResaObjetDepositaire> fetchResaObjetDepositaires(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ResaObjetDepositaire.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ResaObjetDepositaire> eoObjects = (NSArray<ResaObjetDepositaire>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ResaObjetDepositaire fetchResaObjetDepositaire(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaObjetDepositaire.fetchResaObjetDepositaire(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaObjetDepositaire fetchResaObjetDepositaire(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ResaObjetDepositaire> eoObjects = _ResaObjetDepositaire.fetchResaObjetDepositaires(editingContext, qualifier, null);
    ResaObjetDepositaire eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ResaObjetDepositaire)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ResaObjetDepositaire that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaObjetDepositaire fetchRequiredResaObjetDepositaire(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaObjetDepositaire.fetchRequiredResaObjetDepositaire(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaObjetDepositaire fetchRequiredResaObjetDepositaire(EOEditingContext editingContext, EOQualifier qualifier) {
    ResaObjetDepositaire eoObject = _ResaObjetDepositaire.fetchResaObjetDepositaire(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ResaObjetDepositaire that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaObjetDepositaire localInstanceIn(EOEditingContext editingContext, ResaObjetDepositaire eo) {
    ResaObjetDepositaire localInstance = (eo == null) ? null : (ResaObjetDepositaire)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
