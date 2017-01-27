// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolFormationGrade.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolFormationGrade extends  EOGenericRecord {
	public static final String ENTITY_NAME = "FormationGrade";

	// Attributes
	public static final String FGRA_ABREVIATION_KEY = "fgraAbreviation";
	public static final String FGRA_CODAGE_KEY = "fgraCodage";
	public static final String FGRA_LIBELLE_KEY = "fgraLibelle";
	public static final String FGRA_VALIDITE_KEY = "fgraValidite";

	// Relationships

  private static Logger LOG = Logger.getLogger(_ScolFormationGrade.class);

  public ScolFormationGrade localInstanceIn(EOEditingContext editingContext) {
    ScolFormationGrade localInstance = (ScolFormationGrade)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String fgraAbreviation() {
    return (String) storedValueForKey("fgraAbreviation");
  }

  public void setFgraAbreviation(String value) {
    if (_ScolFormationGrade.LOG.isDebugEnabled()) {
    	_ScolFormationGrade.LOG.debug( "updating fgraAbreviation from " + fgraAbreviation() + " to " + value);
    }
    takeStoredValueForKey(value, "fgraAbreviation");
  }

  public String fgraCodage() {
    return (String) storedValueForKey("fgraCodage");
  }

  public void setFgraCodage(String value) {
    if (_ScolFormationGrade.LOG.isDebugEnabled()) {
    	_ScolFormationGrade.LOG.debug( "updating fgraCodage from " + fgraCodage() + " to " + value);
    }
    takeStoredValueForKey(value, "fgraCodage");
  }

  public String fgraLibelle() {
    return (String) storedValueForKey("fgraLibelle");
  }

  public void setFgraLibelle(String value) {
    if (_ScolFormationGrade.LOG.isDebugEnabled()) {
    	_ScolFormationGrade.LOG.debug( "updating fgraLibelle from " + fgraLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "fgraLibelle");
  }

  public String fgraValidite() {
    return (String) storedValueForKey("fgraValidite");
  }

  public void setFgraValidite(String value) {
    if (_ScolFormationGrade.LOG.isDebugEnabled()) {
    	_ScolFormationGrade.LOG.debug( "updating fgraValidite from " + fgraValidite() + " to " + value);
    }
    takeStoredValueForKey(value, "fgraValidite");
  }


  public static ScolFormationGrade createFormationGrade(EOEditingContext editingContext, String fgraLibelle
, String fgraValidite
) {
    ScolFormationGrade eo = (ScolFormationGrade) EOUtilities.createAndInsertInstance(editingContext, _ScolFormationGrade.ENTITY_NAME);    
		eo.setFgraLibelle(fgraLibelle);
		eo.setFgraValidite(fgraValidite);
    return eo;
  }

  public static NSArray<ScolFormationGrade> fetchAllFormationGrades(EOEditingContext editingContext) {
    return _ScolFormationGrade.fetchAllFormationGrades(editingContext, null);
  }

  public static NSArray<ScolFormationGrade> fetchAllFormationGrades(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolFormationGrade.fetchFormationGrades(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolFormationGrade> fetchFormationGrades(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolFormationGrade.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolFormationGrade> eoObjects = (NSArray<ScolFormationGrade>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolFormationGrade fetchFormationGrade(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolFormationGrade.fetchFormationGrade(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolFormationGrade fetchFormationGrade(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolFormationGrade> eoObjects = _ScolFormationGrade.fetchFormationGrades(editingContext, qualifier, null);
    ScolFormationGrade eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolFormationGrade)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one FormationGrade that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolFormationGrade fetchRequiredFormationGrade(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolFormationGrade.fetchRequiredFormationGrade(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolFormationGrade fetchRequiredFormationGrade(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolFormationGrade eoObject = _ScolFormationGrade.fetchFormationGrade(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no FormationGrade that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolFormationGrade localInstanceIn(EOEditingContext editingContext, ScolFormationGrade eo) {
    ScolFormationGrade localInstance = (eo == null) ? null : (ScolFormationGrade)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
