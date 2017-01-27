// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to IndividuUlr.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _IndividuUlr extends  EOGenericRecord {
	public static final String ENTITY_NAME = "IndividuUlr";

	// Attributes
	public static final String C_CIVILITE_KEY = "cCivilite";
	public static final String IND_AGENDA_KEY = "indAgenda";
	public static final String IND_PHOTO_KEY = "indPhoto";
	public static final String IND_QUALITE_KEY = "indQualite";
	public static final String NO_INDIVIDU_KEY = "noIndividu";
	public static final String NOM_USUEL_KEY = "nomUsuel";
	public static final String PERS_ID_KEY = "persId";
	public static final String PRENOM_KEY = "prenom";
	public static final String TEM_VALIDE_KEY = "temValide";

	// Relationships
	public static final String PERSONNE_KEY = "personne";
	public static final String REPART_LOT_INDIVIDUS_KEY = "repartLotIndividus";
	public static final String REPART_STRUCTURES_KEY = "repartStructures";
	public static final String TO_SECRETARIAT_KEY = "toSecretariat";
	public static final String TO_STRUCTURE_ULR_KEY = "toStructureUlr";

  private static Logger LOG = Logger.getLogger(_IndividuUlr.class);

  public IndividuUlr localInstanceIn(EOEditingContext editingContext) {
    IndividuUlr localInstance = (IndividuUlr)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cCivilite() {
    return (String) storedValueForKey("cCivilite");
  }

  public void setCCivilite(String value) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
    	_IndividuUlr.LOG.debug( "updating cCivilite from " + cCivilite() + " to " + value);
    }
    takeStoredValueForKey(value, "cCivilite");
  }

  public String indAgenda() {
    return (String) storedValueForKey("indAgenda");
  }

  public void setIndAgenda(String value) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
    	_IndividuUlr.LOG.debug( "updating indAgenda from " + indAgenda() + " to " + value);
    }
    takeStoredValueForKey(value, "indAgenda");
  }

  public String indPhoto() {
    return (String) storedValueForKey("indPhoto");
  }

  public void setIndPhoto(String value) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
    	_IndividuUlr.LOG.debug( "updating indPhoto from " + indPhoto() + " to " + value);
    }
    takeStoredValueForKey(value, "indPhoto");
  }

  public String indQualite() {
    return (String) storedValueForKey("indQualite");
  }

  public void setIndQualite(String value) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
    	_IndividuUlr.LOG.debug( "updating indQualite from " + indQualite() + " to " + value);
    }
    takeStoredValueForKey(value, "indQualite");
  }

  public Integer noIndividu() {
    return (Integer) storedValueForKey("noIndividu");
  }

  public void setNoIndividu(Integer value) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
    	_IndividuUlr.LOG.debug( "updating noIndividu from " + noIndividu() + " to " + value);
    }
    takeStoredValueForKey(value, "noIndividu");
  }

  public String nomUsuel() {
    return (String) storedValueForKey("nomUsuel");
  }

  public void setNomUsuel(String value) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
    	_IndividuUlr.LOG.debug( "updating nomUsuel from " + nomUsuel() + " to " + value);
    }
    takeStoredValueForKey(value, "nomUsuel");
  }

  public Integer persId() {
    return (Integer) storedValueForKey("persId");
  }

  public void setPersId(Integer value) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
    	_IndividuUlr.LOG.debug( "updating persId from " + persId() + " to " + value);
    }
    takeStoredValueForKey(value, "persId");
  }

  public String prenom() {
    return (String) storedValueForKey("prenom");
  }

  public void setPrenom(String value) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
    	_IndividuUlr.LOG.debug( "updating prenom from " + prenom() + " to " + value);
    }
    takeStoredValueForKey(value, "prenom");
  }

  public String temValide() {
    return (String) storedValueForKey("temValide");
  }

  public void setTemValide(String value) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
    	_IndividuUlr.LOG.debug( "updating temValide from " + temValide() + " to " + value);
    }
    takeStoredValueForKey(value, "temValide");
  }

  public org.cocktail.superplaner.serveur.metier.Personne personne() {
    return (org.cocktail.superplaner.serveur.metier.Personne)storedValueForKey("personne");
  }

  public void setPersonneRelationship(org.cocktail.superplaner.serveur.metier.Personne value) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
      _IndividuUlr.LOG.debug("updating personne from " + personne() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.Personne oldValue = personne();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "personne");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "personne");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu> repartLotIndividus() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu>)storedValueForKey("repartLotIndividus");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu> repartLotIndividus(EOQualifier qualifier) {
    return repartLotIndividus(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu> repartLotIndividus(EOQualifier qualifier, boolean fetch) {
    return repartLotIndividus(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu> repartLotIndividus(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.RepartLotIndividu.INDIVIDU_ULR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.RepartLotIndividu.fetchRepartLotIndividus(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartLotIndividus();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartLotIndividu>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartLotIndividusRelationship(org.cocktail.superplaner.serveur.metier.RepartLotIndividu object) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
      _IndividuUlr.LOG.debug("adding " + object + " to repartLotIndividus relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartLotIndividus");
  }

  public void removeFromRepartLotIndividusRelationship(org.cocktail.superplaner.serveur.metier.RepartLotIndividu object) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
      _IndividuUlr.LOG.debug("removing " + object + " from repartLotIndividus relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartLotIndividus");
  }

  public org.cocktail.superplaner.serveur.metier.RepartLotIndividu createRepartLotIndividusRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartLotIndividu");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "repartLotIndividus");
    return (org.cocktail.superplaner.serveur.metier.RepartLotIndividu) eo;
  }

  public void deleteRepartLotIndividusRelationship(org.cocktail.superplaner.serveur.metier.RepartLotIndividu object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartLotIndividus");
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartLotIndividusRelationships() {
    Enumeration objects = repartLotIndividus().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartLotIndividusRelationship((org.cocktail.superplaner.serveur.metier.RepartLotIndividu)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> repartStructures() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure>)storedValueForKey("repartStructures");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> repartStructures(EOQualifier qualifier) {
    return repartStructures(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> repartStructures(EOQualifier qualifier, boolean fetch) {
    return repartStructures(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> repartStructures(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.RepartStructure.INDIVIDU_ULR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.RepartStructure.fetchRepartStructures(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartStructures();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartStructure>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartStructuresRelationship(org.cocktail.superplaner.serveur.metier.RepartStructure object) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
      _IndividuUlr.LOG.debug("adding " + object + " to repartStructures relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartStructures");
  }

  public void removeFromRepartStructuresRelationship(org.cocktail.superplaner.serveur.metier.RepartStructure object) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
      _IndividuUlr.LOG.debug("removing " + object + " from repartStructures relationship");
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

  public NSArray<org.cocktail.superplaner.serveur.metier.Secretariat> toSecretariat() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.Secretariat>)storedValueForKey("toSecretariat");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Secretariat> toSecretariat(EOQualifier qualifier) {
    return toSecretariat(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Secretariat> toSecretariat(EOQualifier qualifier, boolean fetch) {
    return toSecretariat(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Secretariat> toSecretariat(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.Secretariat> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.Secretariat.INDIVIDU_ULR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.Secretariat.fetchSecretariats(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = toSecretariat();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Secretariat>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Secretariat>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToToSecretariatRelationship(org.cocktail.superplaner.serveur.metier.Secretariat object) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
      _IndividuUlr.LOG.debug("adding " + object + " to toSecretariat relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "toSecretariat");
  }

  public void removeFromToSecretariatRelationship(org.cocktail.superplaner.serveur.metier.Secretariat object) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
      _IndividuUlr.LOG.debug("removing " + object + " from toSecretariat relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "toSecretariat");
  }

  public org.cocktail.superplaner.serveur.metier.Secretariat createToSecretariatRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Secretariat");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "toSecretariat");
    return (org.cocktail.superplaner.serveur.metier.Secretariat) eo;
  }

  public void deleteToSecretariatRelationship(org.cocktail.superplaner.serveur.metier.Secretariat object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "toSecretariat");
    editingContext().deleteObject(object);
  }

  public void deleteAllToSecretariatRelationships() {
    Enumeration objects = toSecretariat().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteToSecretariatRelationship((org.cocktail.superplaner.serveur.metier.Secretariat)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr> toStructureUlr() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr>)storedValueForKey("toStructureUlr");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr> toStructureUlr(EOQualifier qualifier) {
    return toStructureUlr(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr> toStructureUlr(EOQualifier qualifier, boolean fetch) {
    return toStructureUlr(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr> toStructureUlr(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.StructureUlr.RESPONSABLE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.StructureUlr.fetchStructureUlrs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = toStructureUlr();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToToStructureUlrRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr object) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
      _IndividuUlr.LOG.debug("adding " + object + " to toStructureUlr relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "toStructureUlr");
  }

  public void removeFromToStructureUlrRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr object) {
    if (_IndividuUlr.LOG.isDebugEnabled()) {
      _IndividuUlr.LOG.debug("removing " + object + " from toStructureUlr relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "toStructureUlr");
  }

  public org.cocktail.superplaner.serveur.metier.StructureUlr createToStructureUlrRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("StructureUlr");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "toStructureUlr");
    return (org.cocktail.superplaner.serveur.metier.StructureUlr) eo;
  }

  public void deleteToStructureUlrRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "toStructureUlr");
    editingContext().deleteObject(object);
  }

  public void deleteAllToStructureUlrRelationships() {
    Enumeration objects = toStructureUlr().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteToStructureUlrRelationship((org.cocktail.superplaner.serveur.metier.StructureUlr)objects.nextElement());
    }
  }


  public static IndividuUlr createIndividuUlr(EOEditingContext editingContext, String cCivilite
, Integer noIndividu
, String nomUsuel
, Integer persId
, String prenom
, String temValide
) {
    IndividuUlr eo = (IndividuUlr) EOUtilities.createAndInsertInstance(editingContext, _IndividuUlr.ENTITY_NAME);    
		eo.setCCivilite(cCivilite);
		eo.setNoIndividu(noIndividu);
		eo.setNomUsuel(nomUsuel);
		eo.setPersId(persId);
		eo.setPrenom(prenom);
		eo.setTemValide(temValide);
    return eo;
  }

  public static NSArray<IndividuUlr> fetchAllIndividuUlrs(EOEditingContext editingContext) {
    return _IndividuUlr.fetchAllIndividuUlrs(editingContext, null);
  }

  public static NSArray<IndividuUlr> fetchAllIndividuUlrs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _IndividuUlr.fetchIndividuUlrs(editingContext, null, sortOrderings);
  }

  public static NSArray<IndividuUlr> fetchIndividuUlrs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_IndividuUlr.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<IndividuUlr> eoObjects = (NSArray<IndividuUlr>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static IndividuUlr fetchIndividuUlr(EOEditingContext editingContext, String keyName, Object value) {
    return _IndividuUlr.fetchIndividuUlr(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static IndividuUlr fetchIndividuUlr(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<IndividuUlr> eoObjects = _IndividuUlr.fetchIndividuUlrs(editingContext, qualifier, null);
    IndividuUlr eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (IndividuUlr)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one IndividuUlr that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static IndividuUlr fetchRequiredIndividuUlr(EOEditingContext editingContext, String keyName, Object value) {
    return _IndividuUlr.fetchRequiredIndividuUlr(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static IndividuUlr fetchRequiredIndividuUlr(EOEditingContext editingContext, EOQualifier qualifier) {
    IndividuUlr eoObject = _IndividuUlr.fetchIndividuUlr(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no IndividuUlr that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static IndividuUlr localInstanceIn(EOEditingContext editingContext, IndividuUlr eo) {
    IndividuUlr localInstance = (eo == null) ? null : (IndividuUlr)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
