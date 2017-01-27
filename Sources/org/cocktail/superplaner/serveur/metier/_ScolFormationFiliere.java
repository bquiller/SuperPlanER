// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolFormationFiliere.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolFormationFiliere extends  EOGenericRecord {
	public static final String ENTITY_NAME = "FormationFiliere";

	// Attributes
	public static final String FFIL_ABREVIATION_KEY = "ffilAbreviation";
	public static final String FFIL_LIBELLE_KEY = "ffilLibelle";
	public static final String FFIL_VALIDITE_KEY = "ffilValidite";

	// Relationships

  private static Logger LOG = Logger.getLogger(_ScolFormationFiliere.class);

  public ScolFormationFiliere localInstanceIn(EOEditingContext editingContext) {
    ScolFormationFiliere localInstance = (ScolFormationFiliere)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String ffilAbreviation() {
    return (String) storedValueForKey("ffilAbreviation");
  }

  public void setFfilAbreviation(String value) {
    if (_ScolFormationFiliere.LOG.isDebugEnabled()) {
    	_ScolFormationFiliere.LOG.debug( "updating ffilAbreviation from " + ffilAbreviation() + " to " + value);
    }
    takeStoredValueForKey(value, "ffilAbreviation");
  }

  public String ffilLibelle() {
    return (String) storedValueForKey("ffilLibelle");
  }

  public void setFfilLibelle(String value) {
    if (_ScolFormationFiliere.LOG.isDebugEnabled()) {
    	_ScolFormationFiliere.LOG.debug( "updating ffilLibelle from " + ffilLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "ffilLibelle");
  }

  public String ffilValidite() {
    return (String) storedValueForKey("ffilValidite");
  }

  public void setFfilValidite(String value) {
    if (_ScolFormationFiliere.LOG.isDebugEnabled()) {
    	_ScolFormationFiliere.LOG.debug( "updating ffilValidite from " + ffilValidite() + " to " + value);
    }
    takeStoredValueForKey(value, "ffilValidite");
  }


  public static ScolFormationFiliere createFormationFiliere(EOEditingContext editingContext, String ffilLibelle
, String ffilValidite
) {
    ScolFormationFiliere eo = (ScolFormationFiliere) EOUtilities.createAndInsertInstance(editingContext, _ScolFormationFiliere.ENTITY_NAME);    
		eo.setFfilLibelle(ffilLibelle);
		eo.setFfilValidite(ffilValidite);
    return eo;
  }

  public static NSArray<ScolFormationFiliere> fetchAllFormationFilieres(EOEditingContext editingContext) {
    return _ScolFormationFiliere.fetchAllFormationFilieres(editingContext, null);
  }

  public static NSArray<ScolFormationFiliere> fetchAllFormationFilieres(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolFormationFiliere.fetchFormationFilieres(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolFormationFiliere> fetchFormationFilieres(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolFormationFiliere.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolFormationFiliere> eoObjects = (NSArray<ScolFormationFiliere>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolFormationFiliere fetchFormationFiliere(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolFormationFiliere.fetchFormationFiliere(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolFormationFiliere fetchFormationFiliere(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolFormationFiliere> eoObjects = _ScolFormationFiliere.fetchFormationFilieres(editingContext, qualifier, null);
    ScolFormationFiliere eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolFormationFiliere)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one FormationFiliere that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolFormationFiliere fetchRequiredFormationFiliere(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolFormationFiliere.fetchRequiredFormationFiliere(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolFormationFiliere fetchRequiredFormationFiliere(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolFormationFiliere eoObject = _ScolFormationFiliere.fetchFormationFiliere(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no FormationFiliere that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolFormationFiliere localInstanceIn(EOEditingContext editingContext, ScolFormationFiliere eo) {
    ScolFormationFiliere localInstance = (eo == null) ? null : (ScolFormationFiliere)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
