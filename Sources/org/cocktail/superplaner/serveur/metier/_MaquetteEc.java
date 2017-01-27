// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to MaquetteEc.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _MaquetteEc extends  EOGenericRecord {
	public static final String ENTITY_NAME = "MaquetteEc";

	// Attributes
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String FDSC_CODE_KEY = "fdscCode";
	public static final String MEC_BASE_KEY = "mecBase";
	public static final String MEC_CODE_KEY = "mecCode";
	public static final String MEC_HORAIRE_ETU_KEY = "mecHoraireEtu";
	public static final String MEC_LIBELLE_KEY = "mecLibelle";
	public static final String MEC_LIBELLE_COURT_KEY = "mecLibelleCourt";
	public static final String MEC_POINTS_KEY = "mecPoints";
	public static final String MEC_SESSION1_KEY = "mecSession1";
	public static final String MEC_SESSION2_KEY = "mecSession2";

	// Relationships
	public static final String EXAMEN_ENTETES_KEY = "examenEntetes";
	public static final String FORMATION_ANNEE_KEY = "formationAnnee";
	public static final String MAQUETTE_REPARTITION_APS_KEY = "maquetteRepartitionAps";
	public static final String MAQUETTE_RESPONSABLE_ECS_KEY = "maquetteResponsableEcs";
	public static final String RESA_COULEUR_EC_KEY = "resaCouleurEc";
	public static final String V_PARCOURS_EC_KEY = "vParcoursEc";

  private static Logger LOG = Logger.getLogger(_MaquetteEc.class);

  public MaquetteEc localInstanceIn(EOEditingContext editingContext) {
    MaquetteEc localInstance = (MaquetteEc)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer fannKey() {
    return (Integer) storedValueForKey("fannKey");
  }

  public void setFannKey(Integer value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
    	_MaquetteEc.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public String fdscCode() {
    return (String) storedValueForKey("fdscCode");
  }

  public void setFdscCode(String value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
    	_MaquetteEc.LOG.debug( "updating fdscCode from " + fdscCode() + " to " + value);
    }
    takeStoredValueForKey(value, "fdscCode");
  }

  public java.math.BigDecimal mecBase() {
    return (java.math.BigDecimal) storedValueForKey("mecBase");
  }

  public void setMecBase(java.math.BigDecimal value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
    	_MaquetteEc.LOG.debug( "updating mecBase from " + mecBase() + " to " + value);
    }
    takeStoredValueForKey(value, "mecBase");
  }

  public String mecCode() {
    return (String) storedValueForKey("mecCode");
  }

  public void setMecCode(String value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
    	_MaquetteEc.LOG.debug( "updating mecCode from " + mecCode() + " to " + value);
    }
    takeStoredValueForKey(value, "mecCode");
  }

  public java.math.BigDecimal mecHoraireEtu() {
    return (java.math.BigDecimal) storedValueForKey("mecHoraireEtu");
  }

  public void setMecHoraireEtu(java.math.BigDecimal value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
    	_MaquetteEc.LOG.debug( "updating mecHoraireEtu from " + mecHoraireEtu() + " to " + value);
    }
    takeStoredValueForKey(value, "mecHoraireEtu");
  }

  public String mecLibelle() {
    return (String) storedValueForKey("mecLibelle");
  }

  public void setMecLibelle(String value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
    	_MaquetteEc.LOG.debug( "updating mecLibelle from " + mecLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "mecLibelle");
  }

  public String mecLibelleCourt() {
    return (String) storedValueForKey("mecLibelleCourt");
  }

  public void setMecLibelleCourt(String value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
    	_MaquetteEc.LOG.debug( "updating mecLibelleCourt from " + mecLibelleCourt() + " to " + value);
    }
    takeStoredValueForKey(value, "mecLibelleCourt");
  }

  public Integer mecPoints() {
    return (Integer) storedValueForKey("mecPoints");
  }

  public void setMecPoints(Integer value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
    	_MaquetteEc.LOG.debug( "updating mecPoints from " + mecPoints() + " to " + value);
    }
    takeStoredValueForKey(value, "mecPoints");
  }

  public String mecSession1() {
    return (String) storedValueForKey("mecSession1");
  }

  public void setMecSession1(String value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
    	_MaquetteEc.LOG.debug( "updating mecSession1 from " + mecSession1() + " to " + value);
    }
    takeStoredValueForKey(value, "mecSession1");
  }

  public String mecSession2() {
    return (String) storedValueForKey("mecSession2");
  }

  public void setMecSession2(String value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
    	_MaquetteEc.LOG.debug( "updating mecSession2 from " + mecSession2() + " to " + value);
    }
    takeStoredValueForKey(value, "mecSession2");
  }

  public org.cocktail.superplaner.serveur.metier.FormationAnnee formationAnnee() {
    return (org.cocktail.superplaner.serveur.metier.FormationAnnee)storedValueForKey("formationAnnee");
  }

  public void setFormationAnneeRelationship(org.cocktail.superplaner.serveur.metier.FormationAnnee value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
      _MaquetteEc.LOG.debug("updating formationAnnee from " + formationAnnee() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.VParcoursEc vParcoursEc() {
    return (org.cocktail.superplaner.serveur.metier.VParcoursEc)storedValueForKey("vParcoursEc");
  }

  public void setVParcoursEcRelationship(org.cocktail.superplaner.serveur.metier.VParcoursEc value) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
      _MaquetteEc.LOG.debug("updating vParcoursEc from " + vParcoursEc() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.VParcoursEc oldValue = vParcoursEc();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "vParcoursEc");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "vParcoursEc");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete> examenEntetes() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete>)storedValueForKey("examenEntetes");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete> examenEntetes(EOQualifier qualifier) {
    return examenEntetes(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete> examenEntetes(EOQualifier qualifier, boolean fetch) {
    return examenEntetes(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete> examenEntetes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ExamenEntete.EC_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ExamenEntete.fetchExamenEntetes(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = examenEntetes();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ExamenEntete>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToExamenEntetesRelationship(org.cocktail.superplaner.serveur.metier.ExamenEntete object) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
      _MaquetteEc.LOG.debug("adding " + object + " to examenEntetes relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "examenEntetes");
  }

  public void removeFromExamenEntetesRelationship(org.cocktail.superplaner.serveur.metier.ExamenEntete object) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
      _MaquetteEc.LOG.debug("removing " + object + " from examenEntetes relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "examenEntetes");
  }

  public org.cocktail.superplaner.serveur.metier.ExamenEntete createExamenEntetesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ExamenEntete");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "examenEntetes");
    return (org.cocktail.superplaner.serveur.metier.ExamenEntete) eo;
  }

  public void deleteExamenEntetesRelationship(org.cocktail.superplaner.serveur.metier.ExamenEntete object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "examenEntetes");
    editingContext().deleteObject(object);
  }

  public void deleteAllExamenEntetesRelationships() {
    Enumeration objects = examenEntetes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteExamenEntetesRelationship((org.cocktail.superplaner.serveur.metier.ExamenEntete)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp> maquetteRepartitionAps() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp>)storedValueForKey("maquetteRepartitionAps");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp> maquetteRepartitionAps(EOQualifier qualifier) {
    return maquetteRepartitionAps(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp> maquetteRepartitionAps(EOQualifier qualifier, boolean fetch) {
    return maquetteRepartitionAps(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp> maquetteRepartitionAps(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp.MAQUETTE_EC_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp.fetchMaquetteRepartitionAps(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = maquetteRepartitionAps();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToMaquetteRepartitionApsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp object) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
      _MaquetteEc.LOG.debug("adding " + object + " to maquetteRepartitionAps relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "maquetteRepartitionAps");
  }

  public void removeFromMaquetteRepartitionApsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp object) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
      _MaquetteEc.LOG.debug("removing " + object + " from maquetteRepartitionAps relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "maquetteRepartitionAps");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp createMaquetteRepartitionApsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("MaquetteRepartitionAp");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "maquetteRepartitionAps");
    return (org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp) eo;
  }

  public void deleteMaquetteRepartitionApsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "maquetteRepartitionAps");
    editingContext().deleteObject(object);
  }

  public void deleteAllMaquetteRepartitionApsRelationships() {
    Enumeration objects = maquetteRepartitionAps().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteMaquetteRepartitionApsRelationship((org.cocktail.superplaner.serveur.metier.MaquetteRepartitionAp)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc> maquetteResponsableEcs() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc>)storedValueForKey("maquetteResponsableEcs");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc> maquetteResponsableEcs(EOQualifier qualifier) {
    return maquetteResponsableEcs(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc> maquetteResponsableEcs(EOQualifier qualifier, boolean fetch) {
    return maquetteResponsableEcs(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc> maquetteResponsableEcs(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc.MAQUETTE_EC_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc.fetchMaquetteResponsableEcs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = maquetteResponsableEcs();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToMaquetteResponsableEcsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc object) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
      _MaquetteEc.LOG.debug("adding " + object + " to maquetteResponsableEcs relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "maquetteResponsableEcs");
  }

  public void removeFromMaquetteResponsableEcsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc object) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
      _MaquetteEc.LOG.debug("removing " + object + " from maquetteResponsableEcs relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "maquetteResponsableEcs");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc createMaquetteResponsableEcsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("MaquetteResponsableEc");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "maquetteResponsableEcs");
    return (org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc) eo;
  }

  public void deleteMaquetteResponsableEcsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "maquetteResponsableEcs");
    editingContext().deleteObject(object);
  }

  public void deleteAllMaquetteResponsableEcsRelationships() {
    Enumeration objects = maquetteResponsableEcs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteMaquetteResponsableEcsRelationship((org.cocktail.superplaner.serveur.metier.MaquetteResponsableEc)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc> resaCouleurEc() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc>)storedValueForKey("resaCouleurEc");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc> resaCouleurEc(EOQualifier qualifier) {
    return resaCouleurEc(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc> resaCouleurEc(EOQualifier qualifier, boolean fetch) {
    return resaCouleurEc(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc> resaCouleurEc(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.ResaCouleurEc.MAQUETTE_EC_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.ResaCouleurEc.fetchResaCouleurEcs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = resaCouleurEc();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ResaCouleurEc>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToResaCouleurEcRelationship(org.cocktail.superplaner.serveur.metier.ResaCouleurEc object) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
      _MaquetteEc.LOG.debug("adding " + object + " to resaCouleurEc relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "resaCouleurEc");
  }

  public void removeFromResaCouleurEcRelationship(org.cocktail.superplaner.serveur.metier.ResaCouleurEc object) {
    if (_MaquetteEc.LOG.isDebugEnabled()) {
      _MaquetteEc.LOG.debug("removing " + object + " from resaCouleurEc relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaCouleurEc");
  }

  public org.cocktail.superplaner.serveur.metier.ResaCouleurEc createResaCouleurEcRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ResaCouleurEc");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "resaCouleurEc");
    return (org.cocktail.superplaner.serveur.metier.ResaCouleurEc) eo;
  }

  public void deleteResaCouleurEcRelationship(org.cocktail.superplaner.serveur.metier.ResaCouleurEc object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "resaCouleurEc");
    editingContext().deleteObject(object);
  }

  public void deleteAllResaCouleurEcRelationships() {
    Enumeration objects = resaCouleurEc().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteResaCouleurEcRelationship((org.cocktail.superplaner.serveur.metier.ResaCouleurEc)objects.nextElement());
    }
  }


  public static MaquetteEc createMaquetteEc(EOEditingContext editingContext, Integer fannKey
, String fdscCode
, java.math.BigDecimal mecBase
, String mecCode
, java.math.BigDecimal mecHoraireEtu
, Integer mecPoints
) {
    MaquetteEc eo = (MaquetteEc) EOUtilities.createAndInsertInstance(editingContext, _MaquetteEc.ENTITY_NAME);    
		eo.setFannKey(fannKey);
		eo.setFdscCode(fdscCode);
		eo.setMecBase(mecBase);
		eo.setMecCode(mecCode);
		eo.setMecHoraireEtu(mecHoraireEtu);
		eo.setMecPoints(mecPoints);
    return eo;
  }

  public static NSArray<MaquetteEc> fetchAllMaquetteEcs(EOEditingContext editingContext) {
    return _MaquetteEc.fetchAllMaquetteEcs(editingContext, null);
  }

  public static NSArray<MaquetteEc> fetchAllMaquetteEcs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _MaquetteEc.fetchMaquetteEcs(editingContext, null, sortOrderings);
  }

  public static NSArray<MaquetteEc> fetchMaquetteEcs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_MaquetteEc.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<MaquetteEc> eoObjects = (NSArray<MaquetteEc>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static MaquetteEc fetchMaquetteEc(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteEc.fetchMaquetteEc(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteEc fetchMaquetteEc(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<MaquetteEc> eoObjects = _MaquetteEc.fetchMaquetteEcs(editingContext, qualifier, null);
    MaquetteEc eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (MaquetteEc)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one MaquetteEc that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteEc fetchRequiredMaquetteEc(EOEditingContext editingContext, String keyName, Object value) {
    return _MaquetteEc.fetchRequiredMaquetteEc(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static MaquetteEc fetchRequiredMaquetteEc(EOEditingContext editingContext, EOQualifier qualifier) {
    MaquetteEc eoObject = _MaquetteEc.fetchMaquetteEc(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no MaquetteEc that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static MaquetteEc localInstanceIn(EOEditingContext editingContext, MaquetteEc eo) {
    MaquetteEc localInstance = (eo == null) ? null : (MaquetteEc)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
