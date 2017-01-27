// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ResaTypeObjet.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ResaTypeObjet extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ResaTypeObjet";

	// Attributes
	public static final String RTO_COMMENTAIRE_KEY = "rtoCommentaire";
	public static final String RTO_LIBELLE_KEY = "rtoLibelle";

	// Relationships
	public static final String RESA_FAMILLE_OBJET_KEY = "resaFamilleObjet";
	public static final String RESA_OBJETS_KEY = "resaObjets";

  private static Logger LOG = Logger.getLogger(_ResaTypeObjet.class);

  public ResaTypeObjet localInstanceIn(EOEditingContext editingContext) {
    ResaTypeObjet localInstance = (ResaTypeObjet)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String rtoCommentaire() {
    return (String) storedValueForKey("rtoCommentaire");
  }

  public void setRtoCommentaire(String value) {
    if (_ResaTypeObjet.LOG.isDebugEnabled()) {
    	_ResaTypeObjet.LOG.debug( "updating rtoCommentaire from " + rtoCommentaire() + " to " + value);
    }
    takeStoredValueForKey(value, "rtoCommentaire");
  }

  public String rtoLibelle() {
    return (String) storedValueForKey("rtoLibelle");
  }

  public void setRtoLibelle(String value) {
    if (_ResaTypeObjet.LOG.isDebugEnabled()) {
    	_ResaTypeObjet.LOG.debug( "updating rtoLibelle from " + rtoLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "rtoLibelle");
  }

  public org.cocktail.superplaner.serveur.metier.ResaFamilleObjet resaFamilleObjet() {
    return (org.cocktail.superplaner.serveur.metier.ResaFamilleObjet)storedValueForKey("resaFamilleObjet");
  }

  public void setResaFamilleObjetRelationship(org.cocktail.superplaner.serveur.metier.ResaFamilleObjet value) {
    if (_ResaTypeObjet.LOG.isDebugEnabled()) {
      _ResaTypeObjet.LOG.debug("updating resaFamilleObjet from " + resaFamilleObjet() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ResaFamilleObjet oldValue = resaFamilleObjet();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "resaFamilleObjet");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "resaFamilleObjet");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.ResaObjet> resaObjets() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ResaObjet>)storedValueForKey("resaObjets");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaObjet> resaObjets(EOQualifier qualifier) {
    return resaObjets(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaObjet> resaObjets(EOQualifier qualifier, boolean fetch) {
    return resaObjets(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaObjet> resaObjets(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ResaObjet> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ResaObjet.RESA_TYPE_OBJET_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ResaObjet.fetchResaObjets(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = resaObjets();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaObjet>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaObjet>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToResaObjetsRelationship(org.cocktail.superplaner.serveur.metier.ResaObjet object) {
    if (_ResaTypeObjet.LOG.isDebugEnabled()) {
      _ResaTypeObjet.LOG.debug("adding " + object + " to resaObjets relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "resaObjets");
  }

  public void removeFromResaObjetsRelationship(org.cocktail.superplaner.serveur.metier.ResaObjet object) {
    if (_ResaTypeObjet.LOG.isDebugEnabled()) {
      _ResaTypeObjet.LOG.debug("removing " + object + " from resaObjets relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaObjets");
  }

  public org.cocktail.superplaner.serveur.metier.ResaObjet createResaObjetsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ResaObjet");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "resaObjets");
    return (org.cocktail.superplaner.serveur.metier.ResaObjet) eo;
  }

  public void deleteResaObjetsRelationship(org.cocktail.superplaner.serveur.metier.ResaObjet object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaObjets");
    editingContext().deleteObject(object);
  }

  public void deleteAllResaObjetsRelationships() {
    Enumeration objects = resaObjets().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteResaObjetsRelationship((org.cocktail.superplaner.serveur.metier.ResaObjet)objects.nextElement());
    }
  }


  public static ResaTypeObjet createResaTypeObjet(EOEditingContext editingContext, String rtoLibelle
) {
    ResaTypeObjet eo = (ResaTypeObjet) EOUtilities.createAndInsertInstance(editingContext, _ResaTypeObjet.ENTITY_NAME);    
		eo.setRtoLibelle(rtoLibelle);
    return eo;
  }

  public static NSArray<ResaTypeObjet> fetchAllResaTypeObjets(EOEditingContext editingContext) {
    return _ResaTypeObjet.fetchAllResaTypeObjets(editingContext, null);
  }

  public static NSArray<ResaTypeObjet> fetchAllResaTypeObjets(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ResaTypeObjet.fetchResaTypeObjets(editingContext, null, sortOrderings);
  }

  public static NSArray<ResaTypeObjet> fetchResaTypeObjets(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ResaTypeObjet.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ResaTypeObjet> eoObjects = (NSArray<ResaTypeObjet>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ResaTypeObjet fetchResaTypeObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaTypeObjet.fetchResaTypeObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaTypeObjet fetchResaTypeObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ResaTypeObjet> eoObjects = _ResaTypeObjet.fetchResaTypeObjets(editingContext, qualifier, null);
    ResaTypeObjet eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ResaTypeObjet)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ResaTypeObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaTypeObjet fetchRequiredResaTypeObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaTypeObjet.fetchRequiredResaTypeObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaTypeObjet fetchRequiredResaTypeObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    ResaTypeObjet eoObject = _ResaTypeObjet.fetchResaTypeObjet(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ResaTypeObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaTypeObjet localInstanceIn(EOEditingContext editingContext, ResaTypeObjet eo) {
    ResaTypeObjet localInstance = (eo == null) ? null : (ResaTypeObjet)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
