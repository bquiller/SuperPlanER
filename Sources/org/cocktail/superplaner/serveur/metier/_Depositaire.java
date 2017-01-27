// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Depositaire.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Depositaire extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Depositaire";

	// Attributes

	// Relationships

  private static Logger LOG = Logger.getLogger(_Depositaire.class);

  public Depositaire localInstanceIn(EOEditingContext editingContext) {
    Depositaire localInstance = (Depositaire)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }


  public static Depositaire createDepositaire(EOEditingContext editingContext) {
    Depositaire eo = (Depositaire) EOUtilities.createAndInsertInstance(editingContext, _Depositaire.ENTITY_NAME);    
    return eo;
  }

  public static NSArray<Depositaire> fetchAllDepositaires(EOEditingContext editingContext) {
    return _Depositaire.fetchAllDepositaires(editingContext, null);
  }

  public static NSArray<Depositaire> fetchAllDepositaires(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Depositaire.fetchDepositaires(editingContext, null, sortOrderings);
  }

  public static NSArray<Depositaire> fetchDepositaires(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Depositaire.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Depositaire> eoObjects = (NSArray<Depositaire>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Depositaire fetchDepositaire(EOEditingContext editingContext, String keyName, Object value) {
    return _Depositaire.fetchDepositaire(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Depositaire fetchDepositaire(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Depositaire> eoObjects = _Depositaire.fetchDepositaires(editingContext, qualifier, null);
    Depositaire eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Depositaire)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Depositaire that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Depositaire fetchRequiredDepositaire(EOEditingContext editingContext, String keyName, Object value) {
    return _Depositaire.fetchRequiredDepositaire(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Depositaire fetchRequiredDepositaire(EOEditingContext editingContext, EOQualifier qualifier) {
    Depositaire eoObject = _Depositaire.fetchDepositaire(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Depositaire that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Depositaire localInstanceIn(EOEditingContext editingContext, Depositaire eo) {
    Depositaire localInstance = (eo == null) ? null : (Depositaire)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
