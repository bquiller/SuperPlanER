// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to PhotosEmployesGrhum.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _PhotosEmployesGrhum extends  EOGenericRecord {
	public static final String ENTITY_NAME = "PhotoEmploye";

	// Attributes
	public static final String IMAGE_KEY = "image";

	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";

  private static Logger LOG = Logger.getLogger(_PhotosEmployesGrhum.class);

  public PhotosEmployesGrhum localInstanceIn(EOEditingContext editingContext) {
    PhotosEmployesGrhum localInstance = (PhotosEmployesGrhum)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSData image() {
    return (NSData) storedValueForKey("image");
  }

  public void setImage(NSData value) {
    if (_PhotosEmployesGrhum.LOG.isDebugEnabled()) {
    	_PhotosEmployesGrhum.LOG.debug( "updating image from " + image() + " to " + value);
    }
    takeStoredValueForKey(value, "image");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_PhotosEmployesGrhum.LOG.isDebugEnabled()) {
      _PhotosEmployesGrhum.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = individuUlr();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "individuUlr");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "individuUlr");
    }
  }
  

  public static PhotosEmployesGrhum createPhotoEmploye(EOEditingContext editingContext) {
    PhotosEmployesGrhum eo = (PhotosEmployesGrhum) EOUtilities.createAndInsertInstance(editingContext, _PhotosEmployesGrhum.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<PhotosEmployesGrhum> fetchAllPhotoEmployes(EOEditingContext editingContext) {
    return _PhotosEmployesGrhum.fetchAllPhotoEmployes(editingContext, null);
  }

  public static NSArray<PhotosEmployesGrhum> fetchAllPhotoEmployes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _PhotosEmployesGrhum.fetchPhotoEmployes(editingContext, null, sortOrderings);
  }

  public static NSArray<PhotosEmployesGrhum> fetchPhotoEmployes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_PhotosEmployesGrhum.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<PhotosEmployesGrhum> eoObjects = (NSArray<PhotosEmployesGrhum>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static PhotosEmployesGrhum fetchPhotoEmploye(EOEditingContext editingContext, String keyName, Object value) {
    return _PhotosEmployesGrhum.fetchPhotoEmploye(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static PhotosEmployesGrhum fetchPhotoEmploye(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<PhotosEmployesGrhum> eoObjects = _PhotosEmployesGrhum.fetchPhotoEmployes(editingContext, qualifier, null);
    PhotosEmployesGrhum eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (PhotosEmployesGrhum)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one PhotoEmploye that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static PhotosEmployesGrhum fetchRequiredPhotoEmploye(EOEditingContext editingContext, String keyName, Object value) {
    return _PhotosEmployesGrhum.fetchRequiredPhotoEmploye(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static PhotosEmployesGrhum fetchRequiredPhotoEmploye(EOEditingContext editingContext, EOQualifier qualifier) {
    PhotosEmployesGrhum eoObject = _PhotosEmployesGrhum.fetchPhotoEmploye(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no PhotoEmploye that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static PhotosEmployesGrhum localInstanceIn(EOEditingContext editingContext, PhotosEmployesGrhum eo) {
    PhotosEmployesGrhum localInstance = (eo == null) ? null : (PhotosEmployesGrhum)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
