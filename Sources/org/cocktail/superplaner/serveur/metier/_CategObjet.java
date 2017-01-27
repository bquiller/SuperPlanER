// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to CategObjet.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _CategObjet extends  EOGenericRecord {
	public static final String ENTITY_NAME = "CategObjet";

	// Attributes
	public static final String COB_LIBELLE_KEY = "cobLibelle";

	// Relationships
	public static final String TYPE_OBJET_MAJS_KEY = "typeObjetMajs";
	public static final String TYPE_OBJETS_KEY = "typeObjets";

  private static Logger LOG = Logger.getLogger(_CategObjet.class);

  public CategObjet localInstanceIn(EOEditingContext editingContext) {
    CategObjet localInstance = (CategObjet)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cobLibelle() {
    return (String) storedValueForKey("cobLibelle");
  }

  public void setCobLibelle(String value) {
    if (_CategObjet.LOG.isDebugEnabled()) {
    	_CategObjet.LOG.debug( "updating cobLibelle from " + cobLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "cobLibelle");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.TypeObjetMaj> typeObjetMajs() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.TypeObjetMaj>)storedValueForKey("typeObjetMajs");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.TypeObjetMaj> typeObjetMajs(EOQualifier qualifier) {
    return typeObjetMajs(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.TypeObjetMaj> typeObjetMajs(EOQualifier qualifier, boolean fetch) {
    return typeObjetMajs(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.TypeObjetMaj> typeObjetMajs(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.TypeObjetMaj> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.TypeObjetMaj.CATEG_OBJET_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.TypeObjetMaj.fetchTypeObjetMajs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = typeObjetMajs();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.TypeObjetMaj>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.TypeObjetMaj>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToTypeObjetMajsRelationship(org.cocktail.superplaner.serveur.metier.TypeObjetMaj object) {
    if (_CategObjet.LOG.isDebugEnabled()) {
      _CategObjet.LOG.debug("adding " + object + " to typeObjetMajs relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "typeObjetMajs");
  }

  public void removeFromTypeObjetMajsRelationship(org.cocktail.superplaner.serveur.metier.TypeObjetMaj object) {
    if (_CategObjet.LOG.isDebugEnabled()) {
      _CategObjet.LOG.debug("removing " + object + " from typeObjetMajs relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "typeObjetMajs");
  }

  public org.cocktail.superplaner.serveur.metier.TypeObjetMaj createTypeObjetMajsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("TypeObjetMaj");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "typeObjetMajs");
    return (org.cocktail.superplaner.serveur.metier.TypeObjetMaj) eo;
  }

  public void deleteTypeObjetMajsRelationship(org.cocktail.superplaner.serveur.metier.TypeObjetMaj object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "typeObjetMajs");
    editingContext().deleteObject(object);
  }

  public void deleteAllTypeObjetMajsRelationships() {
    Enumeration objects = typeObjetMajs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteTypeObjetMajsRelationship((org.cocktail.superplaner.serveur.metier.TypeObjetMaj)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.TypeObjet> typeObjets() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.TypeObjet>)storedValueForKey("typeObjets");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.TypeObjet> typeObjets(EOQualifier qualifier) {
    return typeObjets(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.TypeObjet> typeObjets(EOQualifier qualifier, boolean fetch) {
    return typeObjets(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.TypeObjet> typeObjets(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.TypeObjet> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.TypeObjet.CATEG_OBJET_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.TypeObjet.fetchTypeObjets(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = typeObjets();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.TypeObjet>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.TypeObjet>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToTypeObjetsRelationship(org.cocktail.superplaner.serveur.metier.TypeObjet object) {
    if (_CategObjet.LOG.isDebugEnabled()) {
      _CategObjet.LOG.debug("adding " + object + " to typeObjets relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "typeObjets");
  }

  public void removeFromTypeObjetsRelationship(org.cocktail.superplaner.serveur.metier.TypeObjet object) {
    if (_CategObjet.LOG.isDebugEnabled()) {
      _CategObjet.LOG.debug("removing " + object + " from typeObjets relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "typeObjets");
  }

  public org.cocktail.superplaner.serveur.metier.TypeObjet createTypeObjetsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("TypeObjet");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "typeObjets");
    return (org.cocktail.superplaner.serveur.metier.TypeObjet) eo;
  }

  public void deleteTypeObjetsRelationship(org.cocktail.superplaner.serveur.metier.TypeObjet object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "typeObjets");
    editingContext().deleteObject(object);
  }

  public void deleteAllTypeObjetsRelationships() {
    Enumeration objects = typeObjets().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteTypeObjetsRelationship((org.cocktail.superplaner.serveur.metier.TypeObjet)objects.nextElement());
    }
  }


  public static CategObjet createCategObjet(EOEditingContext editingContext, String cobLibelle
) {
    CategObjet eo = (CategObjet) EOUtilities.createAndInsertInstance(editingContext, _CategObjet.ENTITY_NAME);    
		eo.setCobLibelle(cobLibelle);
    return eo;
  }

  public static NSArray<CategObjet> fetchAllCategObjets(EOEditingContext editingContext) {
    return _CategObjet.fetchAllCategObjets(editingContext, null);
  }

  public static NSArray<CategObjet> fetchAllCategObjets(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _CategObjet.fetchCategObjets(editingContext, null, sortOrderings);
  }

  public static NSArray<CategObjet> fetchCategObjets(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_CategObjet.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<CategObjet> eoObjects = (NSArray<CategObjet>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static CategObjet fetchCategObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _CategObjet.fetchCategObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static CategObjet fetchCategObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<CategObjet> eoObjects = _CategObjet.fetchCategObjets(editingContext, qualifier, null);
    CategObjet eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (CategObjet)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one CategObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static CategObjet fetchRequiredCategObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _CategObjet.fetchRequiredCategObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static CategObjet fetchRequiredCategObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    CategObjet eoObject = _CategObjet.fetchCategObjet(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no CategObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static CategObjet localInstanceIn(EOEditingContext editingContext, CategObjet eo) {
    CategObjet localInstance = (eo == null) ? null : (CategObjet)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
