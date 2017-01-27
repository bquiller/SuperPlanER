// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Prises.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Prises extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Prises";

	// Attributes
	public static final String PRI_ORDRE_KEY = "priOrdre";
	public static final String PRI_TYPE_KEY = "priType";

	// Relationships

  private static Logger LOG = Logger.getLogger(_Prises.class);

  public Prises localInstanceIn(EOEditingContext editingContext) {
    Prises localInstance = (Prises)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer priOrdre() {
    return (Integer) storedValueForKey("priOrdre");
  }

  public void setPriOrdre(Integer value) {
    if (_Prises.LOG.isDebugEnabled()) {
    	_Prises.LOG.debug( "updating priOrdre from " + priOrdre() + " to " + value);
    }
    takeStoredValueForKey(value, "priOrdre");
  }

  public String priType() {
    return (String) storedValueForKey("priType");
  }

  public void setPriType(String value) {
    if (_Prises.LOG.isDebugEnabled()) {
    	_Prises.LOG.debug( "updating priType from " + priType() + " to " + value);
    }
    takeStoredValueForKey(value, "priType");
  }


  public static Prises createPrises(EOEditingContext editingContext) {
    Prises eo = (Prises) EOUtilities.createAndInsertInstance(editingContext, _Prises.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<Prises> fetchAllPriseses(EOEditingContext editingContext) {
    return _Prises.fetchAllPriseses(editingContext, null);
  }

  public static NSArray<Prises> fetchAllPriseses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Prises.fetchPriseses(editingContext, null, sortOrderings);
  }

  public static NSArray<Prises> fetchPriseses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Prises.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Prises> eoObjects = (NSArray<Prises>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Prises fetchPrises(EOEditingContext editingContext, String keyName, Object value) {
    return _Prises.fetchPrises(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Prises fetchPrises(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Prises> eoObjects = _Prises.fetchPriseses(editingContext, qualifier, null);
    Prises eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Prises)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Prises that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Prises fetchRequiredPrises(EOEditingContext editingContext, String keyName, Object value) {
    return _Prises.fetchRequiredPrises(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Prises fetchRequiredPrises(EOEditingContext editingContext, EOQualifier qualifier) {
    Prises eoObject = _Prises.fetchPrises(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Prises that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Prises localInstanceIn(EOEditingContext editingContext, Prises eo) {
    Prises localInstance = (eo == null) ? null : (Prises)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
