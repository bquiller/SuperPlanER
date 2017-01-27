// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ResaObjet.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ResaObjet extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ResaObjet";

	// Attributes
	public static final String RO_ACCES_KEY = "roAcces";
	public static final String RO_LIBELLE1_KEY = "roLibelle1";
	public static final String RO_LIBELLE2_KEY = "roLibelle2";

	// Relationships
	public static final String RESA_OBJET_RESERVES_KEY = "resaObjetReserves";
	public static final String RESA_TYPE_OBJET_KEY = "resaTypeObjet";
	public static final String SALLE_KEY = "salle";

  private static Logger LOG = Logger.getLogger(_ResaObjet.class);

  public ResaObjet localInstanceIn(EOEditingContext editingContext) {
    ResaObjet localInstance = (ResaObjet)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String roAcces() {
    return (String) storedValueForKey("roAcces");
  }

  public void setRoAcces(String value) {
    if (_ResaObjet.LOG.isDebugEnabled()) {
    	_ResaObjet.LOG.debug( "updating roAcces from " + roAcces() + " to " + value);
    }
    takeStoredValueForKey(value, "roAcces");
  }

  public String roLibelle1() {
    return (String) storedValueForKey("roLibelle1");
  }

  public void setRoLibelle1(String value) {
    if (_ResaObjet.LOG.isDebugEnabled()) {
    	_ResaObjet.LOG.debug( "updating roLibelle1 from " + roLibelle1() + " to " + value);
    }
    takeStoredValueForKey(value, "roLibelle1");
  }

  public String roLibelle2() {
    return (String) storedValueForKey("roLibelle2");
  }

  public void setRoLibelle2(String value) {
    if (_ResaObjet.LOG.isDebugEnabled()) {
    	_ResaObjet.LOG.debug( "updating roLibelle2 from " + roLibelle2() + " to " + value);
    }
    takeStoredValueForKey(value, "roLibelle2");
  }

  public org.cocktail.superplaner.serveur.metier.ResaTypeObjet resaTypeObjet() {
    return (org.cocktail.superplaner.serveur.metier.ResaTypeObjet)storedValueForKey("resaTypeObjet");
  }

  public void setResaTypeObjetRelationship(org.cocktail.superplaner.serveur.metier.ResaTypeObjet value) {
    if (_ResaObjet.LOG.isDebugEnabled()) {
      _ResaObjet.LOG.debug("updating resaTypeObjet from " + resaTypeObjet() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ResaTypeObjet oldValue = resaTypeObjet();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "resaTypeObjet");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "resaTypeObjet");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.Salles salle() {
    return (org.cocktail.superplaner.serveur.metier.Salles)storedValueForKey("salle");
  }

  public void setSalleRelationship(org.cocktail.superplaner.serveur.metier.Salles value) {
    if (_ResaObjet.LOG.isDebugEnabled()) {
      _ResaObjet.LOG.debug("updating salle from " + salle() + " to " + value);
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
  
  public NSArray<org.cocktail.superplaner.serveur.metier.ResaObjetReserve> resaObjetReserves() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ResaObjetReserve>)storedValueForKey("resaObjetReserves");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaObjetReserve> resaObjetReserves(EOQualifier qualifier) {
    return resaObjetReserves(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaObjetReserve> resaObjetReserves(EOQualifier qualifier, boolean fetch) {
    return resaObjetReserves(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaObjetReserve> resaObjetReserves(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ResaObjetReserve> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ResaObjetReserve.RESA_OBJET_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ResaObjetReserve.fetchResaObjetReserves(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = resaObjetReserves();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaObjetReserve>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaObjetReserve>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToResaObjetReservesRelationship(org.cocktail.superplaner.serveur.metier.ResaObjetReserve object) {
    if (_ResaObjet.LOG.isDebugEnabled()) {
      _ResaObjet.LOG.debug("adding " + object + " to resaObjetReserves relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "resaObjetReserves");
  }

  public void removeFromResaObjetReservesRelationship(org.cocktail.superplaner.serveur.metier.ResaObjetReserve object) {
    if (_ResaObjet.LOG.isDebugEnabled()) {
      _ResaObjet.LOG.debug("removing " + object + " from resaObjetReserves relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaObjetReserves");
  }

  public org.cocktail.superplaner.serveur.metier.ResaObjetReserve createResaObjetReservesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ResaObjetReserve");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "resaObjetReserves");
    return (org.cocktail.superplaner.serveur.metier.ResaObjetReserve) eo;
  }

  public void deleteResaObjetReservesRelationship(org.cocktail.superplaner.serveur.metier.ResaObjetReserve object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaObjetReserves");
    editingContext().deleteObject(object);
  }

  public void deleteAllResaObjetReservesRelationships() {
    Enumeration objects = resaObjetReserves().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteResaObjetReservesRelationship((org.cocktail.superplaner.serveur.metier.ResaObjetReserve)objects.nextElement());
    }
  }


  public static ResaObjet createResaObjet(EOEditingContext editingContext, String roAcces
, String roLibelle1
) {
    ResaObjet eo = (ResaObjet) EOUtilities.createAndInsertInstance(editingContext, _ResaObjet.ENTITY_NAME);    
		eo.setRoAcces(roAcces);
		eo.setRoLibelle1(roLibelle1);
    return eo;
  }

  public static NSArray<ResaObjet> fetchAllResaObjets(EOEditingContext editingContext) {
    return _ResaObjet.fetchAllResaObjets(editingContext, null);
  }

  public static NSArray<ResaObjet> fetchAllResaObjets(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ResaObjet.fetchResaObjets(editingContext, null, sortOrderings);
  }

  public static NSArray<ResaObjet> fetchResaObjets(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ResaObjet.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ResaObjet> eoObjects = (NSArray<ResaObjet>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ResaObjet fetchResaObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaObjet.fetchResaObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaObjet fetchResaObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ResaObjet> eoObjects = _ResaObjet.fetchResaObjets(editingContext, qualifier, null);
    ResaObjet eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ResaObjet)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ResaObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaObjet fetchRequiredResaObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaObjet.fetchRequiredResaObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaObjet fetchRequiredResaObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    ResaObjet eoObject = _ResaObjet.fetchResaObjet(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ResaObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaObjet localInstanceIn(EOEditingContext editingContext, ResaObjet eo) {
    ResaObjet localInstance = (eo == null) ? null : (ResaObjet)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
