// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to VTreeObjet.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _VTreeObjet extends  EOGenericRecord {
	public static final String ENTITY_NAME = "VTreeObjet";

	// Attributes
	public static final String C_IMPLANTATION_KEY = "cImplantation";
	public static final String CLE_KEY = "cle";
	public static final String CLE_PARENT_KEY = "cleParent";
	public static final String C_LOCAL_KEY = "cLocal";
	public static final String LIBELLE_KEY = "libelle";
	public static final String NIVEAU_KEY = "niveau";

	// Relationships
	public static final String RESA_FAMILLE_OBJET_KEY = "resaFamilleObjet";
	public static final String RESA_OBJET_KEY = "resaObjet";
	public static final String RESA_TYPE_OBJET_KEY = "resaTypeObjet";

  private static Logger LOG = Logger.getLogger(_VTreeObjet.class);

  public VTreeObjet localInstanceIn(EOEditingContext editingContext) {
    VTreeObjet localInstance = (VTreeObjet)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cImplantation() {
    return (String) storedValueForKey("cImplantation");
  }

  public void setCImplantation(String value) {
    if (_VTreeObjet.LOG.isDebugEnabled()) {
    	_VTreeObjet.LOG.debug( "updating cImplantation from " + cImplantation() + " to " + value);
    }
    takeStoredValueForKey(value, "cImplantation");
  }

  public Integer cle() {
    return (Integer) storedValueForKey("cle");
  }

  public void setCle(Integer value) {
    if (_VTreeObjet.LOG.isDebugEnabled()) {
    	_VTreeObjet.LOG.debug( "updating cle from " + cle() + " to " + value);
    }
    takeStoredValueForKey(value, "cle");
  }

  public Integer cleParent() {
    return (Integer) storedValueForKey("cleParent");
  }

  public void setCleParent(Integer value) {
    if (_VTreeObjet.LOG.isDebugEnabled()) {
    	_VTreeObjet.LOG.debug( "updating cleParent from " + cleParent() + " to " + value);
    }
    takeStoredValueForKey(value, "cleParent");
  }

  public String cLocal() {
    return (String) storedValueForKey("cLocal");
  }

  public void setCLocal(String value) {
    if (_VTreeObjet.LOG.isDebugEnabled()) {
    	_VTreeObjet.LOG.debug( "updating cLocal from " + cLocal() + " to " + value);
    }
    takeStoredValueForKey(value, "cLocal");
  }

  public String libelle() {
    return (String) storedValueForKey("libelle");
  }

  public void setLibelle(String value) {
    if (_VTreeObjet.LOG.isDebugEnabled()) {
    	_VTreeObjet.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, "libelle");
  }

  public Integer niveau() {
    return (Integer) storedValueForKey("niveau");
  }

  public void setNiveau(Integer value) {
    if (_VTreeObjet.LOG.isDebugEnabled()) {
    	_VTreeObjet.LOG.debug( "updating niveau from " + niveau() + " to " + value);
    }
    takeStoredValueForKey(value, "niveau");
  }

  public org.cocktail.superplaner.serveur.metier.ResaFamilleObjet resaFamilleObjet() {
    return (org.cocktail.superplaner.serveur.metier.ResaFamilleObjet)storedValueForKey("resaFamilleObjet");
  }

  public void setResaFamilleObjetRelationship(org.cocktail.superplaner.serveur.metier.ResaFamilleObjet value) {
    if (_VTreeObjet.LOG.isDebugEnabled()) {
      _VTreeObjet.LOG.debug("updating resaFamilleObjet from " + resaFamilleObjet() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ResaFamilleObjet oldValue = resaFamilleObjet();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "resaFamilleObjet");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "resaFamilleObjet");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.ResaObjet resaObjet() {
    return (org.cocktail.superplaner.serveur.metier.ResaObjet)storedValueForKey("resaObjet");
  }

  public void setResaObjetRelationship(org.cocktail.superplaner.serveur.metier.ResaObjet value) {
    if (_VTreeObjet.LOG.isDebugEnabled()) {
      _VTreeObjet.LOG.debug("updating resaObjet from " + resaObjet() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.ResaTypeObjet resaTypeObjet() {
    return (org.cocktail.superplaner.serveur.metier.ResaTypeObjet)storedValueForKey("resaTypeObjet");
  }

  public void setResaTypeObjetRelationship(org.cocktail.superplaner.serveur.metier.ResaTypeObjet value) {
    if (_VTreeObjet.LOG.isDebugEnabled()) {
      _VTreeObjet.LOG.debug("updating resaTypeObjet from " + resaTypeObjet() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ResaTypeObjet oldValue = resaTypeObjet();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "resaTypeObjet");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "resaTypeObjet");
    }
  }
  

  public static VTreeObjet createVTreeObjet(EOEditingContext editingContext, String cImplantation
, Integer cle
, String cLocal
, Integer niveau
) {
    VTreeObjet eo = (VTreeObjet) EOUtilities.createAndInsertInstance(editingContext, _VTreeObjet.ENTITY_NAME);    
		eo.setCImplantation(cImplantation);
		eo.setCle(cle);
		eo.setCLocal(cLocal);
		eo.setNiveau(niveau);
    return eo;
  }

  public static NSArray<VTreeObjet> fetchAllVTreeObjets(EOEditingContext editingContext) {
    return _VTreeObjet.fetchAllVTreeObjets(editingContext, null);
  }

  public static NSArray<VTreeObjet> fetchAllVTreeObjets(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VTreeObjet.fetchVTreeObjets(editingContext, null, sortOrderings);
  }

  public static NSArray<VTreeObjet> fetchVTreeObjets(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_VTreeObjet.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VTreeObjet> eoObjects = (NSArray<VTreeObjet>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static VTreeObjet fetchVTreeObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _VTreeObjet.fetchVTreeObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VTreeObjet fetchVTreeObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VTreeObjet> eoObjects = _VTreeObjet.fetchVTreeObjets(editingContext, qualifier, null);
    VTreeObjet eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (VTreeObjet)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VTreeObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VTreeObjet fetchRequiredVTreeObjet(EOEditingContext editingContext, String keyName, Object value) {
    return _VTreeObjet.fetchRequiredVTreeObjet(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VTreeObjet fetchRequiredVTreeObjet(EOEditingContext editingContext, EOQualifier qualifier) {
    VTreeObjet eoObject = _VTreeObjet.fetchVTreeObjet(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VTreeObjet that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VTreeObjet localInstanceIn(EOEditingContext editingContext, VTreeObjet eo) {
    VTreeObjet localInstance = (eo == null) ? null : (VTreeObjet)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
