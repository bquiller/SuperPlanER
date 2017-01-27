// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ResaDate.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ResaDate extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ResaDate";

	// Attributes
	public static final String RESA_DEBUT_KEY = "resaDebut";
	public static final String RESA_FIN_KEY = "resaFin";
	public static final String RESA_POS_DEBUT_KEY = "resaPosDebut";
	public static final String RESA_POS_FIN_KEY = "resaPosFin";

	// Relationships

  private static Logger LOG = Logger.getLogger(_ResaDate.class);

  public ResaDate localInstanceIn(EOEditingContext editingContext) {
    ResaDate localInstance = (ResaDate)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp resaDebut() {
    return (NSTimestamp) storedValueForKey("resaDebut");
  }

  public void setResaDebut(NSTimestamp value) {
    if (_ResaDate.LOG.isDebugEnabled()) {
    	_ResaDate.LOG.debug( "updating resaDebut from " + resaDebut() + " to " + value);
    }
    takeStoredValueForKey(value, "resaDebut");
  }

  public NSTimestamp resaFin() {
    return (NSTimestamp) storedValueForKey("resaFin");
  }

  public void setResaFin(NSTimestamp value) {
    if (_ResaDate.LOG.isDebugEnabled()) {
    	_ResaDate.LOG.debug( "updating resaFin from " + resaFin() + " to " + value);
    }
    takeStoredValueForKey(value, "resaFin");
  }

  public Integer resaPosDebut() {
    return (Integer) storedValueForKey("resaPosDebut");
  }

  public void setResaPosDebut(Integer value) {
    if (_ResaDate.LOG.isDebugEnabled()) {
    	_ResaDate.LOG.debug( "updating resaPosDebut from " + resaPosDebut() + " to " + value);
    }
    takeStoredValueForKey(value, "resaPosDebut");
  }

  public Integer resaPosFin() {
    return (Integer) storedValueForKey("resaPosFin");
  }

  public void setResaPosFin(Integer value) {
    if (_ResaDate.LOG.isDebugEnabled()) {
    	_ResaDate.LOG.debug( "updating resaPosFin from " + resaPosFin() + " to " + value);
    }
    takeStoredValueForKey(value, "resaPosFin");
  }


  public static ResaDate createResaDate(EOEditingContext editingContext, NSTimestamp resaDebut
, NSTimestamp resaFin
) {
    ResaDate eo = (ResaDate) EOUtilities.createAndInsertInstance(editingContext, _ResaDate.ENTITY_NAME);    
		eo.setResaDebut(resaDebut);
		eo.setResaFin(resaFin);
    return eo;
  }

  public static NSArray<ResaDate> fetchAllResaDates(EOEditingContext editingContext) {
    return _ResaDate.fetchAllResaDates(editingContext, null);
  }

  public static NSArray<ResaDate> fetchAllResaDates(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ResaDate.fetchResaDates(editingContext, null, sortOrderings);
  }

  public static NSArray<ResaDate> fetchResaDates(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ResaDate.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ResaDate> eoObjects = (NSArray<ResaDate>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ResaDate fetchResaDate(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaDate.fetchResaDate(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaDate fetchResaDate(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ResaDate> eoObjects = _ResaDate.fetchResaDates(editingContext, qualifier, null);
    ResaDate eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ResaDate)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ResaDate that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaDate fetchRequiredResaDate(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaDate.fetchRequiredResaDate(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaDate fetchRequiredResaDate(EOEditingContext editingContext, EOQualifier qualifier) {
    ResaDate eoObject = _ResaDate.fetchResaDate(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ResaDate that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaDate localInstanceIn(EOEditingContext editingContext, ResaDate eo) {
    ResaDate localInstance = (eo == null) ? null : (ResaDate)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
