// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Personne.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Personne extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Personne";

	// Attributes
	public static final String PERS_ID_KEY = "persId";
	public static final String PERS_LC_KEY = "persLc";
	public static final String PERS_LIBELLE_KEY = "persLibelle";
	public static final String PERS_NOMPTR_KEY = "persNomptr";
	public static final String PERS_ORDRE_KEY = "persOrdre";
	public static final String PERS_TYPE_KEY = "persType";

	// Relationships
	public static final String TO_INDIVIDU_KEY = "toIndividu";

  private static Logger LOG = Logger.getLogger(_Personne.class);

  public Personne localInstanceIn(EOEditingContext editingContext) {
    Personne localInstance = (Personne)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer persId() {
    return (Integer) storedValueForKey("persId");
  }

  public void setPersId(Integer value) {
    if (_Personne.LOG.isDebugEnabled()) {
    	_Personne.LOG.debug( "updating persId from " + persId() + " to " + value);
    }
    takeStoredValueForKey(value, "persId");
  }

  public String persLc() {
    return (String) storedValueForKey("persLc");
  }

  public void setPersLc(String value) {
    if (_Personne.LOG.isDebugEnabled()) {
    	_Personne.LOG.debug( "updating persLc from " + persLc() + " to " + value);
    }
    takeStoredValueForKey(value, "persLc");
  }

  public String persLibelle() {
    return (String) storedValueForKey("persLibelle");
  }

  public void setPersLibelle(String value) {
    if (_Personne.LOG.isDebugEnabled()) {
    	_Personne.LOG.debug( "updating persLibelle from " + persLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "persLibelle");
  }

  public String persNomptr() {
    return (String) storedValueForKey("persNomptr");
  }

  public void setPersNomptr(String value) {
    if (_Personne.LOG.isDebugEnabled()) {
    	_Personne.LOG.debug( "updating persNomptr from " + persNomptr() + " to " + value);
    }
    takeStoredValueForKey(value, "persNomptr");
  }

  public Integer persOrdre() {
    return (Integer) storedValueForKey("persOrdre");
  }

  public void setPersOrdre(Integer value) {
    if (_Personne.LOG.isDebugEnabled()) {
    	_Personne.LOG.debug( "updating persOrdre from " + persOrdre() + " to " + value);
    }
    takeStoredValueForKey(value, "persOrdre");
  }

  public String persType() {
    return (String) storedValueForKey("persType");
  }

  public void setPersType(String value) {
    if (_Personne.LOG.isDebugEnabled()) {
    	_Personne.LOG.debug( "updating persType from " + persType() + " to " + value);
    }
    takeStoredValueForKey(value, "persType");
  }

  public org.cocktail.superplaner.serveur.metier.IndividuUlr toIndividu() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("toIndividu");
  }

  public void setToIndividuRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_Personne.LOG.isDebugEnabled()) {
      _Personne.LOG.debug("updating toIndividu from " + toIndividu() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.IndividuUlr oldValue = toIndividu();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "toIndividu");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "toIndividu");
    }
  }
  

  public static Personne createPersonne(EOEditingContext editingContext, Integer persId
, String persLc
, String persNomptr
) {
    Personne eo = (Personne) EOUtilities.createAndInsertInstance(editingContext, _Personne.ENTITY_NAME);    
		eo.setPersId(persId);
		eo.setPersLc(persLc);
		eo.setPersNomptr(persNomptr);
    return eo;
  }

  public static NSArray<Personne> fetchAllPersonnes(EOEditingContext editingContext) {
    return _Personne.fetchAllPersonnes(editingContext, null);
  }

  public static NSArray<Personne> fetchAllPersonnes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Personne.fetchPersonnes(editingContext, null, sortOrderings);
  }

  public static NSArray<Personne> fetchPersonnes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Personne.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Personne> eoObjects = (NSArray<Personne>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Personne fetchPersonne(EOEditingContext editingContext, String keyName, Object value) {
    return _Personne.fetchPersonne(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Personne fetchPersonne(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Personne> eoObjects = _Personne.fetchPersonnes(editingContext, qualifier, null);
    Personne eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Personne)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Personne that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Personne fetchRequiredPersonne(EOEditingContext editingContext, String keyName, Object value) {
    return _Personne.fetchRequiredPersonne(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Personne fetchRequiredPersonne(EOEditingContext editingContext, EOQualifier qualifier) {
    Personne eoObject = _Personne.fetchPersonne(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Personne that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Personne localInstanceIn(EOEditingContext editingContext, Personne eo) {
    Personne localInstance = (eo == null) ? null : (Personne)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
