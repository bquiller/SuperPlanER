// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ResaObjetDroits.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ResaObjetDroits extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ResaObjetDroits";

	// Attributes
	public static final String LIBELLE_KEY = "libelle";

	// Relationships

  private static Logger LOG = Logger.getLogger(_ResaObjetDroits.class);

  public ResaObjetDroits localInstanceIn(EOEditingContext editingContext) {
    ResaObjetDroits localInstance = (ResaObjetDroits)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String libelle() {
    return (String) storedValueForKey("libelle");
  }

  public void setLibelle(String value) {
    if (_ResaObjetDroits.LOG.isDebugEnabled()) {
    	_ResaObjetDroits.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, "libelle");
  }


  public static ResaObjetDroits createResaObjetDroits(EOEditingContext editingContext, String libelle
) {
    ResaObjetDroits eo = (ResaObjetDroits) EOUtilities.createAndInsertInstance(editingContext, _ResaObjetDroits.ENTITY_NAME);    
		eo.setLibelle(libelle);
    return eo;
  }

  public static NSArray<ResaObjetDroits> fetchAllResaObjetDroitses(EOEditingContext editingContext) {
    return _ResaObjetDroits.fetchAllResaObjetDroitses(editingContext, null);
  }

  public static NSArray<ResaObjetDroits> fetchAllResaObjetDroitses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ResaObjetDroits.fetchResaObjetDroitses(editingContext, null, sortOrderings);
  }

  public static NSArray<ResaObjetDroits> fetchResaObjetDroitses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ResaObjetDroits.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ResaObjetDroits> eoObjects = (NSArray<ResaObjetDroits>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ResaObjetDroits fetchResaObjetDroits(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaObjetDroits.fetchResaObjetDroits(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaObjetDroits fetchResaObjetDroits(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ResaObjetDroits> eoObjects = _ResaObjetDroits.fetchResaObjetDroitses(editingContext, qualifier, null);
    ResaObjetDroits eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ResaObjetDroits)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ResaObjetDroits that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaObjetDroits fetchRequiredResaObjetDroits(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaObjetDroits.fetchRequiredResaObjetDroits(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaObjetDroits fetchRequiredResaObjetDroits(EOEditingContext editingContext, EOQualifier qualifier) {
    ResaObjetDroits eoObject = _ResaObjetDroits.fetchResaObjetDroits(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ResaObjetDroits that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaObjetDroits localInstanceIn(EOEditingContext editingContext, ResaObjetDroits eo) {
    ResaObjetDroits localInstance = (eo == null) ? null : (ResaObjetDroits)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
