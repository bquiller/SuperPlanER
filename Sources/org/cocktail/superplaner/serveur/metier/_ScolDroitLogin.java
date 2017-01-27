// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolDroitLogin.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolDroitLogin extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ScolDroitLogin";

	// Attributes
	public static final String DLOG_KEY_KEY = "dlogKey";
	public static final String DLOG_LOGIN_KEY = "dlogLogin";
	public static final String DLOG_NOM_KEY = "dlogNom";
	public static final String DLOG_PRENOM_KEY = "dlogPrenom";
	public static final String DLOG_VALIDE_KEY = "dlogValide";

	// Relationships

  private static Logger LOG = Logger.getLogger(_ScolDroitLogin.class);

  public ScolDroitLogin localInstanceIn(EOEditingContext editingContext) {
    ScolDroitLogin localInstance = (ScolDroitLogin)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer dlogKey() {
    return (Integer) storedValueForKey("dlogKey");
  }

  public void setDlogKey(Integer value) {
    if (_ScolDroitLogin.LOG.isDebugEnabled()) {
    	_ScolDroitLogin.LOG.debug( "updating dlogKey from " + dlogKey() + " to " + value);
    }
    takeStoredValueForKey(value, "dlogKey");
  }

  public String dlogLogin() {
    return (String) storedValueForKey("dlogLogin");
  }

  public void setDlogLogin(String value) {
    if (_ScolDroitLogin.LOG.isDebugEnabled()) {
    	_ScolDroitLogin.LOG.debug( "updating dlogLogin from " + dlogLogin() + " to " + value);
    }
    takeStoredValueForKey(value, "dlogLogin");
  }

  public String dlogNom() {
    return (String) storedValueForKey("dlogNom");
  }

  public void setDlogNom(String value) {
    if (_ScolDroitLogin.LOG.isDebugEnabled()) {
    	_ScolDroitLogin.LOG.debug( "updating dlogNom from " + dlogNom() + " to " + value);
    }
    takeStoredValueForKey(value, "dlogNom");
  }

  public String dlogPrenom() {
    return (String) storedValueForKey("dlogPrenom");
  }

  public void setDlogPrenom(String value) {
    if (_ScolDroitLogin.LOG.isDebugEnabled()) {
    	_ScolDroitLogin.LOG.debug( "updating dlogPrenom from " + dlogPrenom() + " to " + value);
    }
    takeStoredValueForKey(value, "dlogPrenom");
  }

  public String dlogValide() {
    return (String) storedValueForKey("dlogValide");
  }

  public void setDlogValide(String value) {
    if (_ScolDroitLogin.LOG.isDebugEnabled()) {
    	_ScolDroitLogin.LOG.debug( "updating dlogValide from " + dlogValide() + " to " + value);
    }
    takeStoredValueForKey(value, "dlogValide");
  }


  public static ScolDroitLogin createScolDroitLogin(EOEditingContext editingContext, Integer dlogKey
, String dlogLogin
, String dlogValide
) {
    ScolDroitLogin eo = (ScolDroitLogin) EOUtilities.createAndInsertInstance(editingContext, _ScolDroitLogin.ENTITY_NAME);    
		eo.setDlogKey(dlogKey);
		eo.setDlogLogin(dlogLogin);
		eo.setDlogValide(dlogValide);
    return eo;
  }

  public static NSArray<ScolDroitLogin> fetchAllScolDroitLogins(EOEditingContext editingContext) {
    return _ScolDroitLogin.fetchAllScolDroitLogins(editingContext, null);
  }

  public static NSArray<ScolDroitLogin> fetchAllScolDroitLogins(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolDroitLogin.fetchScolDroitLogins(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolDroitLogin> fetchScolDroitLogins(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolDroitLogin.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolDroitLogin> eoObjects = (NSArray<ScolDroitLogin>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolDroitLogin fetchScolDroitLogin(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolDroitLogin.fetchScolDroitLogin(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolDroitLogin fetchScolDroitLogin(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolDroitLogin> eoObjects = _ScolDroitLogin.fetchScolDroitLogins(editingContext, qualifier, null);
    ScolDroitLogin eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolDroitLogin)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ScolDroitLogin that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolDroitLogin fetchRequiredScolDroitLogin(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolDroitLogin.fetchRequiredScolDroitLogin(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolDroitLogin fetchRequiredScolDroitLogin(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolDroitLogin eoObject = _ScolDroitLogin.fetchScolDroitLogin(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ScolDroitLogin that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolDroitLogin localInstanceIn(EOEditingContext editingContext, ScolDroitLogin eo) {
    ScolDroitLogin localInstance = (eo == null) ? null : (ScolDroitLogin)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
