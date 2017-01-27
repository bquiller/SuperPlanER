// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to EdtGedexport.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _EdtGedexport extends  EOGenericRecord {
	public static final String ENTITY_NAME = "EdtGedexport";

	// Attributes
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String DOC_ID_KEY = "docId";
	public static final String MOT_CLEF_KEY = "motClef";
	public static final String NO_INDIVIDU_KEY = "noIndividu";

	// Relationships

  private static Logger LOG = Logger.getLogger(_EdtGedexport.class);

  public EdtGedexport localInstanceIn(EOEditingContext editingContext) {
    EdtGedexport localInstance = (EdtGedexport)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey("dCreation");
  }

  public void setDCreation(NSTimestamp value) {
    if (_EdtGedexport.LOG.isDebugEnabled()) {
    	_EdtGedexport.LOG.debug( "updating dCreation from " + dCreation() + " to " + value);
    }
    takeStoredValueForKey(value, "dCreation");
  }

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey("dModification");
  }

  public void setDModification(NSTimestamp value) {
    if (_EdtGedexport.LOG.isDebugEnabled()) {
    	_EdtGedexport.LOG.debug( "updating dModification from " + dModification() + " to " + value);
    }
    takeStoredValueForKey(value, "dModification");
  }

  public Integer docId() {
    return (Integer) storedValueForKey("docId");
  }

  public void setDocId(Integer value) {
    if (_EdtGedexport.LOG.isDebugEnabled()) {
    	_EdtGedexport.LOG.debug( "updating docId from " + docId() + " to " + value);
    }
    takeStoredValueForKey(value, "docId");
  }

  public String motClef() {
    return (String) storedValueForKey("motClef");
  }

  public void setMotClef(String value) {
    if (_EdtGedexport.LOG.isDebugEnabled()) {
    	_EdtGedexport.LOG.debug( "updating motClef from " + motClef() + " to " + value);
    }
    takeStoredValueForKey(value, "motClef");
  }

  public Integer noIndividu() {
    return (Integer) storedValueForKey("noIndividu");
  }

  public void setNoIndividu(Integer value) {
    if (_EdtGedexport.LOG.isDebugEnabled()) {
    	_EdtGedexport.LOG.debug( "updating noIndividu from " + noIndividu() + " to " + value);
    }
    takeStoredValueForKey(value, "noIndividu");
  }


  public static EdtGedexport createEdtGedexport(EOEditingContext editingContext, NSTimestamp dCreation
, NSTimestamp dModification
, Integer docId
, String motClef
, Integer noIndividu
) {
    EdtGedexport eo = (EdtGedexport) EOUtilities.createAndInsertInstance(editingContext, _EdtGedexport.ENTITY_NAME);    
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
		eo.setDocId(docId);
		eo.setMotClef(motClef);
		eo.setNoIndividu(noIndividu);
    return eo;
  }

  public static NSArray<EdtGedexport> fetchAllEdtGedexports(EOEditingContext editingContext) {
    return _EdtGedexport.fetchAllEdtGedexports(editingContext, null);
  }

  public static NSArray<EdtGedexport> fetchAllEdtGedexports(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EdtGedexport.fetchEdtGedexports(editingContext, null, sortOrderings);
  }

  public static NSArray<EdtGedexport> fetchEdtGedexports(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_EdtGedexport.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EdtGedexport> eoObjects = (NSArray<EdtGedexport>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static EdtGedexport fetchEdtGedexport(EOEditingContext editingContext, String keyName, Object value) {
    return _EdtGedexport.fetchEdtGedexport(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EdtGedexport fetchEdtGedexport(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EdtGedexport> eoObjects = _EdtGedexport.fetchEdtGedexports(editingContext, qualifier, null);
    EdtGedexport eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (EdtGedexport)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EdtGedexport that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EdtGedexport fetchRequiredEdtGedexport(EOEditingContext editingContext, String keyName, Object value) {
    return _EdtGedexport.fetchRequiredEdtGedexport(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EdtGedexport fetchRequiredEdtGedexport(EOEditingContext editingContext, EOQualifier qualifier) {
    EdtGedexport eoObject = _EdtGedexport.fetchEdtGedexport(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EdtGedexport that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EdtGedexport localInstanceIn(EOEditingContext editingContext, EdtGedexport eo) {
    EdtGedexport localInstance = (eo == null) ? null : (EdtGedexport)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
