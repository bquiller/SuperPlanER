// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to HoraireCode.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _HoraireCode extends  EOGenericRecord {
	public static final String ENTITY_NAME = "HoraireCode";

	// Attributes
	public static final String MHCO_ABREVIATION_KEY = "mhcoAbreviation";
	public static final String MHCO_CODE_KEY = "mhcoCode";
	public static final String MHCO_LIBELLE_KEY = "mhcoLibelle";
	public static final String MHCO_PRIORITE_KEY = "mhcoPriorite";
	public static final String MHCO_VALIDITE_KEY = "mhcoValidite";

	// Relationships
	public static final String SCOL_MAQUETTE_APS_KEY = "scolMaquetteAps";

  private static Logger LOG = Logger.getLogger(_HoraireCode.class);

  public HoraireCode localInstanceIn(EOEditingContext editingContext) {
    HoraireCode localInstance = (HoraireCode)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String mhcoAbreviation() {
    return (String) storedValueForKey("mhcoAbreviation");
  }

  public void setMhcoAbreviation(String value) {
    if (_HoraireCode.LOG.isDebugEnabled()) {
    	_HoraireCode.LOG.debug( "updating mhcoAbreviation from " + mhcoAbreviation() + " to " + value);
    }
    takeStoredValueForKey(value, "mhcoAbreviation");
  }

  public String mhcoCode() {
    return (String) storedValueForKey("mhcoCode");
  }

  public void setMhcoCode(String value) {
    if (_HoraireCode.LOG.isDebugEnabled()) {
    	_HoraireCode.LOG.debug( "updating mhcoCode from " + mhcoCode() + " to " + value);
    }
    takeStoredValueForKey(value, "mhcoCode");
  }

  public String mhcoLibelle() {
    return (String) storedValueForKey("mhcoLibelle");
  }

  public void setMhcoLibelle(String value) {
    if (_HoraireCode.LOG.isDebugEnabled()) {
    	_HoraireCode.LOG.debug( "updating mhcoLibelle from " + mhcoLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "mhcoLibelle");
  }

  public Integer mhcoPriorite() {
    return (Integer) storedValueForKey("mhcoPriorite");
  }

  public void setMhcoPriorite(Integer value) {
    if (_HoraireCode.LOG.isDebugEnabled()) {
    	_HoraireCode.LOG.debug( "updating mhcoPriorite from " + mhcoPriorite() + " to " + value);
    }
    takeStoredValueForKey(value, "mhcoPriorite");
  }

  public String mhcoValidite() {
    return (String) storedValueForKey("mhcoValidite");
  }

  public void setMhcoValidite(String value) {
    if (_HoraireCode.LOG.isDebugEnabled()) {
    	_HoraireCode.LOG.debug( "updating mhcoValidite from " + mhcoValidite() + " to " + value);
    }
    takeStoredValueForKey(value, "mhcoValidite");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteAp> scolMaquetteAps() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteAp>)storedValueForKey("scolMaquetteAps");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteAp> scolMaquetteAps(EOQualifier qualifier) {
    return scolMaquetteAps(qualifier, null, false);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteAp> scolMaquetteAps(EOQualifier qualifier, boolean fetch) {
    return scolMaquetteAps(qualifier, null, fetch);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.MaquetteAp> scolMaquetteAps(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<org.cocktail.superplaner.serveur.metier.MaquetteAp> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.superplaner.serveur.metier.MaquetteAp.HORAIRE_CODE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.superplaner.serveur.metier.MaquetteAp.fetchMaquetteAps(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = scolMaquetteAps();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteAp>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.MaquetteAp>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToScolMaquetteApsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp object) {
    if (_HoraireCode.LOG.isDebugEnabled()) {
      _HoraireCode.LOG.debug("adding " + object + " to scolMaquetteAps relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "scolMaquetteAps");
  }

  public void removeFromScolMaquetteApsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp object) {
    if (_HoraireCode.LOG.isDebugEnabled()) {
      _HoraireCode.LOG.debug("removing " + object + " from scolMaquetteAps relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "scolMaquetteAps");
  }

  public org.cocktail.superplaner.serveur.metier.MaquetteAp createScolMaquetteApsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("MaquetteAp");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "scolMaquetteAps");
    return (org.cocktail.superplaner.serveur.metier.MaquetteAp) eo;
  }

  public void deleteScolMaquetteApsRelationship(org.cocktail.superplaner.serveur.metier.MaquetteAp object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "scolMaquetteAps");
    editingContext().deleteObject(object);
  }

  public void deleteAllScolMaquetteApsRelationships() {
    Enumeration objects = scolMaquetteAps().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteScolMaquetteApsRelationship((org.cocktail.superplaner.serveur.metier.MaquetteAp)objects.nextElement());
    }
  }


  public static HoraireCode createHoraireCode(EOEditingContext editingContext, String mhcoCode
, String mhcoLibelle
, Integer mhcoPriorite
, String mhcoValidite
) {
    HoraireCode eo = (HoraireCode) EOUtilities.createAndInsertInstance(editingContext, _HoraireCode.ENTITY_NAME);    
		eo.setMhcoCode(mhcoCode);
		eo.setMhcoLibelle(mhcoLibelle);
		eo.setMhcoPriorite(mhcoPriorite);
		eo.setMhcoValidite(mhcoValidite);
    return eo;
  }

  public static NSArray<HoraireCode> fetchAllHoraireCodes(EOEditingContext editingContext) {
    return _HoraireCode.fetchAllHoraireCodes(editingContext, null);
  }

  public static NSArray<HoraireCode> fetchAllHoraireCodes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _HoraireCode.fetchHoraireCodes(editingContext, null, sortOrderings);
  }

  public static NSArray<HoraireCode> fetchHoraireCodes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_HoraireCode.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<HoraireCode> eoObjects = (NSArray<HoraireCode>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static HoraireCode fetchHoraireCode(EOEditingContext editingContext, String keyName, Object value) {
    return _HoraireCode.fetchHoraireCode(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static HoraireCode fetchHoraireCode(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<HoraireCode> eoObjects = _HoraireCode.fetchHoraireCodes(editingContext, qualifier, null);
    HoraireCode eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (HoraireCode)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one HoraireCode that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static HoraireCode fetchRequiredHoraireCode(EOEditingContext editingContext, String keyName, Object value) {
    return _HoraireCode.fetchRequiredHoraireCode(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static HoraireCode fetchRequiredHoraireCode(EOEditingContext editingContext, EOQualifier qualifier) {
    HoraireCode eoObject = _HoraireCode.fetchHoraireCode(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no HoraireCode that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static HoraireCode localInstanceIn(EOEditingContext editingContext, HoraireCode eo) {
    HoraireCode localInstance = (eo == null) ? null : (HoraireCode)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
