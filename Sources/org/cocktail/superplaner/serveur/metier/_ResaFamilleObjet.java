// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ResaFamilleObjet.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ResaFamilleObjet extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ResaFamilleObjet";

	// Attributes
	public static final String RFO_COMMENTAIRE_KEY = "rfoCommentaire";
	public static final String RFO_LIBELLE_KEY = "rfoLibelle";

	// Relationships
	public static final String RESA_TYPES_OBJET_KEY = "resaTypesObjet";

  private static Logger LOG = Logger.getLogger(_ResaFamilleObjet.class);

  public ResaFamilleObjet localInstanceIn(EOEditingContext editingContext) {
    ResaFamilleObjet localInstance = (ResaFamilleObjet)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String rfoCommentaire() {
    return (String) storedValueForKey("rfoCommentaire");
  }

  public void setRfoCommentaire(String value) {
    if (_ResaFamilleObjet.LOG.isDebugEnabled()) {
    	_ResaFamilleObjet.LOG.debug( "updating rfoCommentaire from " + rfoCommentaire() + " to " + value);
    }
    takeStoredValueForKey(value, "rfoCommentaire");
  }

  public String rfoLibelle() {
    return (String) storedValueForKey("rfoLibelle");
  }

  public void setRfoLibelle(String value) {
    if (_ResaFamilleObjet.LOG.isDebugEnabled()) {
    	_ResaFamilleObjet.LOG.debug( "updating rfoLibelle from " + rfoLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "rfoLibelle");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaTypeObjet> resaTypesObjet() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ResaTypeObjet>)storedValueForKey("resaTypesObjet");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaTypeObjet> resaTypesObjet(EOQualifier qualifier) {
    return resaTypesObjet(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaTypeObjet> resaTypesObjet(EOQualifier qualifier, boolean fetch) {
    return resaTypesObjet(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaTypeObjet> resaTypesObjet(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ResaTypeObjet> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ResaTypeObjet.RESA_FAMILLE_OBJET_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ResaTypeObjet.fetchResaTypeObjets(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = resaTypesObjet();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaTypeObjet>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaTypeObjet>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToResaTypesObjetRelationship(org.cocktail.superplaner.serveur.metier.ResaTypeObjet object) {
    if (_ResaFamilleObjet.LOG.isDebugEnabled()) {
      _ResaFamilleObjet.LOG.debug("adding " + object + " to resaTypesObjet relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "resaTypesObjet");
  }

  public void removeFromResaTypesObjetRelationship(org.cocktail.superplaner.serveur.metier.ResaTypeObjet object) {
    if (_ResaFamilleObjet.LOG.isDebugEnabled()) {
      _ResaFamilleObjet.LOG.debug("removing " + object + " from resaTypesObjet relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaTypesObjet");
  }

  public org.cocktail.superplaner.serveur.metier.ResaTypeObjet createResaTypesObjetRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ResaTypeObjet");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "resaTypesObjet");
    return (org.cocktail.superplaner.serveur.metier.ResaTypeObjet) eo;
  }

  public void deleteResaTypesObjetRelationship(org.cocktail.superplaner.serveur.metier.ResaTypeObjet object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaTypesObjet");
    editingContext().deleteObject(object);
  }

  public void deleteAllResaTypesObjetRelationships() {
    Enumeration objects = resaTypesObjet().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteResaTypesObjetRelationship((org.cocktail.superplaner.serveur.metier.ResaTypeObjet)objects.nextElement());
    }
  }


  public static ResaFamilleObjet createResaFamilleObjet(EOEditingContext editingContext, String rfoLibelle
) {
    ResaFamilleObjet eo = (ResaFamilleObjet) EOUtilities.createAndInsertInstance(editingContext, _ResaFamilleObjet.ENTITY_NAME);    
		eo.setRfoLibelle(rfoLibelle);
    return eo;
  }

  public static NSArray<ResaFamilleObjet> fetchAllResaFamilleObjets(EOEditingContext editingContext) {
    return _ResaFamilleObjet.fetchAllResaFamilleObjets(editingContext, null);
  }

  public static NSArray<ResaFamilleObjet> fetchAllResaFamilleObjets(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ResaFamilleObjet.fetchResaFamilleObjets(editingContext, null, sortOrderings);
  }

  public static NSArray<ResaFamilleObjet> fetchResaFamilleObjets(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ResaFamilleObjet.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ResaFamilleObjet> eoObjects = (NSArray<ResaFamilleObjet>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ResaFamilleObjet fetchResaFamilleObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaFamilleObjet.fetchResaFamilleObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaFamilleObjet fetchResaFamilleObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ResaFamilleObjet> eoObjects = _ResaFamilleObjet.fetchResaFamilleObjets(editingContext, qualifier, null);
    ResaFamilleObjet eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ResaFamilleObjet)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ResaFamilleObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaFamilleObjet fetchRequiredResaFamilleObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaFamilleObjet.fetchRequiredResaFamilleObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaFamilleObjet fetchRequiredResaFamilleObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    ResaFamilleObjet eoObject = _ResaFamilleObjet.fetchResaFamilleObjet(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ResaFamilleObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaFamilleObjet localInstanceIn(EOEditingContext editingContext, ResaFamilleObjet eo) {
    ResaFamilleObjet localInstance = (eo == null) ? null : (ResaFamilleObjet)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
