// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Secretariat.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Secretariat extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Secretariat";

	// Attributes
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";

	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String STRUCTURE_ULR_KEY = "structureUlr";

  private static Logger LOG = Logger.getLogger(_Secretariat.class);

  public Secretariat localInstanceIn(EOEditingContext editingContext) {
    Secretariat localInstance = (Secretariat)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey("dCreation");
  }

  public void setDCreation(NSTimestamp value) {
    if (_Secretariat.LOG.isDebugEnabled()) {
    	_Secretariat.LOG.debug( "updating dCreation from " + dCreation() + " to " + value);
    }
    takeStoredValueForKey(value, "dCreation");
  }

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey("dModification");
  }

  public void setDModification(NSTimestamp value) {
    if (_Secretariat.LOG.isDebugEnabled()) {
    	_Secretariat.LOG.debug( "updating dModification from " + dModification() + " to " + value);
    }
    takeStoredValueForKey(value, "dModification");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_Secretariat.LOG.isDebugEnabled()) {
      _Secretariat.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.StructureUlr structureUlr() {
    return (org.cocktail.superplaner.serveur.metier.StructureUlr)storedValueForKey("structureUlr");
  }

  public void setStructureUlrRelationship(org.cocktail.superplaner.serveur.metier.StructureUlr value) {
    if (_Secretariat.LOG.isDebugEnabled()) {
      _Secretariat.LOG.debug("updating structureUlr from " + structureUlr() + " to " + value);
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
  

  public static Secretariat createSecretariat(EOEditingContext editingContext, NSTimestamp dCreation
, NSTimestamp dModification
) {
    Secretariat eo = (Secretariat) EOUtilities.createAndInsertInstance(editingContext, _Secretariat.ENTITY_NAME);    
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
    return eo;
  }

  public static NSArray<Secretariat> fetchAllSecretariats(EOEditingContext editingContext) {
    return _Secretariat.fetchAllSecretariats(editingContext, null);
  }

  public static NSArray<Secretariat> fetchAllSecretariats(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Secretariat.fetchSecretariats(editingContext, null, sortOrderings);
  }

  public static NSArray<Secretariat> fetchSecretariats(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Secretariat.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Secretariat> eoObjects = (NSArray<Secretariat>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Secretariat fetchSecretariat(EOEditingContext editingContext, String keyName, Object value) {
    return _Secretariat.fetchSecretariat(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Secretariat fetchSecretariat(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Secretariat> eoObjects = _Secretariat.fetchSecretariats(editingContext, qualifier, null);
    Secretariat eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Secretariat)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Secretariat that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Secretariat fetchRequiredSecretariat(EOEditingContext editingContext, String keyName, Object value) {
    return _Secretariat.fetchRequiredSecretariat(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Secretariat fetchRequiredSecretariat(EOEditingContext editingContext, EOQualifier qualifier) {
    Secretariat eoObject = _Secretariat.fetchSecretariat(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Secretariat that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Secretariat localInstanceIn(EOEditingContext editingContext, Secretariat eo) {
    Secretariat localInstance = (eo == null) ? null : (Secretariat)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
