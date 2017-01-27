// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to StructureUlr.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _StructureUlr extends  EOGenericRecord {
	public static final String ENTITY_NAME = "StructureUlr";

	// Attributes
	public static final String C_STRUCTURE_KEY = "cStructure";
	public static final String C_STRUCTURE_PERE_KEY = "cStructurePere";
	public static final String C_TYPE_STRUCTURE_KEY = "cTypeStructure";
	public static final String GRP_ACCES_KEY = "grpAcces";
	public static final String GRP_ALIAS_KEY = "grpAlias";
	public static final String GRP_MOTS_CLEFS_KEY = "grpMotsClefs";
	public static final String GRP_RESPONSABILITE_KEY = "grpResponsabilite";
	public static final String LC_STRUCTURE_KEY = "lcStructure";
	public static final String LIBELLE_KEY = "libelle";
	public static final String LIBELLE_LONG_KEY = "libelleLong";
	public static final String LL_STRUCTURE_KEY = "llStructure";
	public static final String PERS_ID_KEY = "persId";
	public static final String TEM_VALIDE_KEY = "temValide";

	// Relationships
	public static final String FILS_KEY = "fils";
	public static final String PERE_KEY = "pere";
	public static final String REPART_STRUCTURES_KEY = "repartStructures";
	public static final String REPART_TYPE_GROUPE_KEY = "repartTypeGroupe";
	public static final String RESPONSABLE_KEY = "responsable";
	public static final String SECRETARIATS_KEY = "secretariats";
	public static final String STRUCTURE_ULR_KEY = "structureUlr";

  private static Logger LOG = Logger.getLogger(_StructureUlr.class);

  public StructureUlr localInstanceIn(EOEditingContext editingContext) {
    StructureUlr localInstance = (StructureUlr)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cStructure() {
    return (String) storedValueForKey("cStructure");
  }

  public void setCStructure(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating cStructure from " + cStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "cStructure");
  }

  public String cStructurePere() {
    return (String) storedValueForKey("cStructurePere");
  }

  public void setCStructurePere(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating cStructurePere from " + cStructurePere() + " to " + value);
    }
    takeStoredValueForKey(value, "cStructurePere");
  }

  public String cTypeStructure() {
    return (String) storedValueForKey("cTypeStructure");
  }

  public void setCTypeStructure(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating cTypeStructure from " + cTypeStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "cTypeStructure");
  }

  public String grpAcces() {
    return (String) storedValueForKey("grpAcces");
  }

  public void setGrpAcces(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating grpAcces from " + grpAcces() + " to " + value);
    }
    takeStoredValueForKey(value, "grpAcces");
  }

  public String grpAlias() {
    return (String) storedValueForKey("grpAlias");
  }

  public void setGrpAlias(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating grpAlias from " + grpAlias() + " to " + value);
    }
    takeStoredValueForKey(value, "grpAlias");
  }

  public String grpMotsClefs() {
    return (String) storedValueForKey("grpMotsClefs");
  }

  public void setGrpMotsClefs(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating grpMotsClefs from " + grpMotsClefs() + " to " + value);
    }
    takeStoredValueForKey(value, "grpMotsClefs");
  }

  public String grpResponsabilite() {
    return (String) storedValueForKey("grpResponsabilite");
  }

  public void setGrpResponsabilite(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating grpResponsabilite from " + grpResponsabilite() + " to " + value);
    }
    takeStoredValueForKey(value, "grpResponsabilite");
  }

  public String lcStructure() {
    return (String) storedValueForKey("lcStructure");
  }

  public void setLcStructure(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating lcStructure from " + lcStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "lcStructure");
  }

  public String libelle() {
    return (String) storedValueForKey("libelle");
  }

  public void setLibelle(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, "libelle");
  }

  public String libelleLong() {
    return (String) storedValueForKey("libelleLong");
  }

  public void setLibelleLong(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating libelleLong from " + libelleLong() + " to " + value);
    }
    takeStoredValueForKey(value, "libelleLong");
  }

  public String llStructure() {
    return (String) storedValueForKey("llStructure");
  }

  public void setLlStructure(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating llStructure from " + llStructure() + " to " + value);
    }
    takeStoredValueForKey(value, "llStructure");
  }

  public Integer persId() {
    return (Integer) storedValueForKey("persId");
  }

  public void setPersId(Integer value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating persId from " + persId() + " to " + value);
    }
    takeStoredValueForKey(value, "persId");
  }

  public String temValide() {
    return (String) storedValueForKey("temValide");
  }

  public void setTemValide(String value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
    	_StructureUlr.LOG.debug( "updating temValide from " + temValide() + " to " + value);
    }
    takeStoredValueForKey(value, "temValide");
  }

  public org.cocktail.superplaner.serveur.metier.StructureUlr pere() {
    return (org.cocktail.superplaner.serveur.metier.StructureUlr)storedValueForKey("pere");
  }

  public void setPereRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
      _StructureUlr.LOG.debug("updating pere from " + pere() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.StructureUlr oldValue = pere();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "pere");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "pere");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.IndividuUlr responsable() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("responsable");
  }

  public void setResponsableRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
      _StructureUlr.LOG.debug("updating responsable from " + responsable() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = responsable();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "responsable");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "responsable");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.StructureUlr structureUlr() {
    return (org.cocktail.superplaner.serveur.metier.StructureUlr)storedValueForKey("structureUlr");
  }

  public void setStructureUlrRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr value) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
      _StructureUlr.LOG.debug("updating structureUlr from " + structureUlr() + " to " + value);
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
  
  public NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr> fils() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr>)storedValueForKey("fils");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr> fils(EOQualifier qualifier) {
    return fils(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr> fils(EOQualifier qualifier, boolean fetch) {
    return fils(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr> fils(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.StructureUlr.STRUCTURE_ULR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
      results = fils();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.StructureUlr>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToFilsRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr object) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
      _StructureUlr.LOG.debug("adding " + object + " to fils relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "fils");
  }

  public void removeFromFilsRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr object) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
      _StructureUlr.LOG.debug("removing " + object + " from fils relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "fils");
  }

  public org.cocktail.superplaner.serveur.metier.StructureUlr createFilsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("StructureUlr");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "fils");
    return (org.cocktail.superplaner.serveur.metier.StructureUlr) eo;
  }

  public void deleteFilsRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "fils");
    editingContext().deleteObject(object);
  }

  public void deleteAllFilsRelationships() {
    Enumeration objects = fils().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteFilsRelationship((org.cocktail.superplaner.serveur.metier.StructureUlr)objects.nextElement());
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.RepartStructure.STRUCTURE_ULR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
    if (_StructureUlr.LOG.isDebugEnabled()) {
      _StructureUlr.LOG.debug("adding " + object + " to repartStructures relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartStructures");
  }

  public void removeFromRepartStructuresRelationship(org.cocktail.superplaner.serveur.metier.RepartStructure object) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
      _StructureUlr.LOG.debug("removing " + object + " from repartStructures relationship");
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

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartTypeGroupe> repartTypeGroupe() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.RepartTypeGroupe>)storedValueForKey("repartTypeGroupe");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartTypeGroupe> repartTypeGroupe(EOQualifier qualifier) {
    return repartTypeGroupe(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.RepartTypeGroupe> repartTypeGroupe(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.RepartTypeGroupe> results;
      results = repartTypeGroupe();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartTypeGroupe>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.RepartTypeGroupe>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRepartTypeGroupeRelationship(org.cocktail.superplaner.serveur.metier.RepartTypeGroupe object) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
      _StructureUlr.LOG.debug("adding " + object + " to repartTypeGroupe relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "repartTypeGroupe");
  }

  public void removeFromRepartTypeGroupeRelationship(org.cocktail.superplaner.serveur.metier.RepartTypeGroupe object) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
      _StructureUlr.LOG.debug("removing " + object + " from repartTypeGroupe relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartTypeGroupe");
  }

  public org.cocktail.superplaner.serveur.metier.RepartTypeGroupe createRepartTypeGroupeRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartTypeGroupe");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "repartTypeGroupe");
    return (org.cocktail.superplaner.serveur.metier.RepartTypeGroupe) eo;
  }

  public void deleteRepartTypeGroupeRelationship(org.cocktail.superplaner.serveur.metier.RepartTypeGroupe object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "repartTypeGroupe");
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartTypeGroupeRelationships() {
    Enumeration objects = repartTypeGroupe().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartTypeGroupeRelationship((org.cocktail.superplaner.serveur.metier.RepartTypeGroupe)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Secretariat> secretariats() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.Secretariat>)storedValueForKey("secretariats");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Secretariat> secretariats(EOQualifier qualifier) {
    return secretariats(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Secretariat> secretariats(EOQualifier qualifier, boolean fetch) {
    return secretariats(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.Secretariat> secretariats(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.Secretariat> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.Secretariat.STRUCTURE_ULR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
      results = secretariats();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Secretariat>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.Secretariat>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToSecretariatsRelationship(org.cocktail.superplaner.serveur.metier.Secretariat object) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
      _StructureUlr.LOG.debug("adding " + object + " to secretariats relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "secretariats");
  }

  public void removeFromSecretariatsRelationship(org.cocktail.superplaner.serveur.metier.Secretariat object) {
    if (_StructureUlr.LOG.isDebugEnabled()) {
      _StructureUlr.LOG.debug("removing " + object + " from secretariats relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "secretariats");
  }

  public org.cocktail.superplaner.serveur.metier.Secretariat createSecretariatsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Secretariat");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "secretariats");
    return (org.cocktail.superplaner.serveur.metier.Secretariat) eo;
  }

  public void deleteSecretariatsRelationship(org.cocktail.superplaner.serveur.metier.Secretariat object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "secretariats");
    editingContext().deleteObject(object);
  }

  public void deleteAllSecretariatsRelationships() {
    Enumeration objects = secretariats().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteSecretariatsRelationship((org.cocktail.superplaner.serveur.metier.Secretariat)objects.nextElement());
    }
  }


  public static StructureUlr createStructureUlr(EOEditingContext editingContext, String cStructure
, String cStructurePere
, String cTypeStructure
, Integer persId
, String temValide
) {
    StructureUlr eo = (StructureUlr) EOUtilities.createAndInsertInstance(editingContext, _StructureUlr.ENTITY_NAME);    
		eo.setCStructure(cStructure);
		eo.setCStructurePere(cStructurePere);
		eo.setCTypeStructure(cTypeStructure);
		eo.setPersId(persId);
		eo.setTemValide(temValide);
    return eo;
  }

  public static NSArray<StructureUlr> fetchAllStructureUlrs(EOEditingContext editingContext) {
    return _StructureUlr.fetchAllStructureUlrs(editingContext, null);
  }

  public static NSArray<StructureUlr> fetchAllStructureUlrs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _StructureUlr.fetchStructureUlrs(editingContext, null, sortOrderings);
  }

  public static NSArray<StructureUlr> fetchStructureUlrs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_StructureUlr.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<StructureUlr> eoObjects = (NSArray<StructureUlr>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static StructureUlr fetchStructureUlr(EOEditingContext editingContext, String keyName, Object value) {
    return _StructureUlr.fetchStructureUlr(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static StructureUlr fetchStructureUlr(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<StructureUlr> eoObjects = _StructureUlr.fetchStructureUlrs(editingContext, qualifier, null);
    StructureUlr eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (StructureUlr)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one StructureUlr that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static StructureUlr fetchRequiredStructureUlr(EOEditingContext editingContext, String keyName, Object value) {
    return _StructureUlr.fetchRequiredStructureUlr(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static StructureUlr fetchRequiredStructureUlr(EOEditingContext editingContext, EOQualifier qualifier) {
    StructureUlr eoObject = _StructureUlr.fetchStructureUlr(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no StructureUlr that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static StructureUlr localInstanceIn(EOEditingContext editingContext, StructureUlr eo) {
    StructureUlr localInstance = (eo == null) ? null : (StructureUlr)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
