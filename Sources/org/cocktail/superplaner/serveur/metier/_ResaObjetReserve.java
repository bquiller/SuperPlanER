// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ResaObjetReserve.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ResaObjetReserve extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ResaObjetReserve";

	// Attributes
	public static final String DATE_DEB_KEY = "dateDeb";
	public static final String DATE_FIN_KEY = "dateFin";

	// Relationships
	public static final String RESA_OBJET_KEY = "resaObjet";
	public static final String STRUCTURE_ULR_KEY = "structureUlr";

  private static Logger LOG = Logger.getLogger(_ResaObjetReserve.class);

  public ResaObjetReserve localInstanceIn(EOEditingContext editingContext) {
    ResaObjetReserve localInstance = (ResaObjetReserve)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dateDeb() {
    return (NSTimestamp) storedValueForKey("dateDeb");
  }

  public void setDateDeb(NSTimestamp value) {
    if (_ResaObjetReserve.LOG.isDebugEnabled()) {
    	_ResaObjetReserve.LOG.debug( "updating dateDeb from " + dateDeb() + " to " + value);
    }
    takeStoredValueForKey(value, "dateDeb");
  }

  public NSTimestamp dateFin() {
    return (NSTimestamp) storedValueForKey("dateFin");
  }

  public void setDateFin(NSTimestamp value) {
    if (_ResaObjetReserve.LOG.isDebugEnabled()) {
    	_ResaObjetReserve.LOG.debug( "updating dateFin from " + dateFin() + " to " + value);
    }
    takeStoredValueForKey(value, "dateFin");
  }

  public org.cocktail.superplaner.serveur.metier.ResaObjet resaObjet() {
    return (org.cocktail.superplaner.serveur.metier.ResaObjet)storedValueForKey("resaObjet");
  }

  public void setResaObjetRelationship(org.cocktail.superplaner.serveur.metier.ResaObjet value) {
    if (_ResaObjetReserve.LOG.isDebugEnabled()) {
      _ResaObjetReserve.LOG.debug("updating resaObjet from " + resaObjet() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ResaObjet oldValue = resaObjet();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "resaObjet");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "resaObjet");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.StructureUlr structureUlr() {
    return (org.cocktail.superplaner.serveur.metier.StructureUlr)storedValueForKey("structureUlr");
  }

  public void setStructureUlrRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr value) {
    if (_ResaObjetReserve.LOG.isDebugEnabled()) {
      _ResaObjetReserve.LOG.debug("updating structureUlr from " + structureUlr() + " to " + value);
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
  

  public static ResaObjetReserve createResaObjetReserve(EOEditingContext editingContext, NSTimestamp dateDeb
) {
    ResaObjetReserve eo = (ResaObjetReserve) EOUtilities.createAndInsertInstance(editingContext, _ResaObjetReserve.ENTITY_NAME);    
		eo.setDateDeb(dateDeb);
    return eo;
  }

  public static NSArray<ResaObjetReserve> fetchAllResaObjetReserves(EOEditingContext editingContext) {
    return _ResaObjetReserve.fetchAllResaObjetReserves(editingContext, null);
  }

  public static NSArray<ResaObjetReserve> fetchAllResaObjetReserves(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ResaObjetReserve.fetchResaObjetReserves(editingContext, null, sortOrderings);
  }

  public static NSArray<ResaObjetReserve> fetchResaObjetReserves(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ResaObjetReserve.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ResaObjetReserve> eoObjects = (NSArray<ResaObjetReserve>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ResaObjetReserve fetchResaObjetReserve(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaObjetReserve.fetchResaObjetReserve(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaObjetReserve fetchResaObjetReserve(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ResaObjetReserve> eoObjects = _ResaObjetReserve.fetchResaObjetReserves(editingContext, qualifier, null);
    ResaObjetReserve eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ResaObjetReserve)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ResaObjetReserve that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaObjetReserve fetchRequiredResaObjetReserve(EOEditingContext editingContext, String keyName, Object value) {
    return _ResaObjetReserve.fetchRequiredResaObjetReserve(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ResaObjetReserve fetchRequiredResaObjetReserve(EOEditingContext editingContext, EOQualifier qualifier) {
    ResaObjetReserve eoObject = _ResaObjetReserve.fetchResaObjetReserve(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ResaObjetReserve that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ResaObjetReserve localInstanceIn(EOEditingContext editingContext, ResaObjetReserve eo) {
    ResaObjetReserve localInstance = (eo == null) ? null : (ResaObjetReserve)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
