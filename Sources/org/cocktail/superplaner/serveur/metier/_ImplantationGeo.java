// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ImplantationGeo.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ImplantationGeo extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ImplantationGeo";

	// Attributes
	public static final String C_IMPLANTATION_KEY = "cImplantation";
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_DEB_VAL_KEY = "dDebVal";
	public static final String D_FIN_VAL_KEY = "dFinVal";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String LC_IMPLANTATION_GEO_KEY = "lcImplantationGeo";
	public static final String LL_IMPLANTATION_GEO_KEY = "llImplantationGeo";

	// Relationships

  private static Logger LOG = Logger.getLogger(_ImplantationGeo.class);

  public ImplantationGeo localInstanceIn(EOEditingContext editingContext) {
    ImplantationGeo localInstance = (ImplantationGeo)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cImplantation() {
    return (String) storedValueForKey("cImplantation");
  }

  public void setCImplantation(String value) {
    if (_ImplantationGeo.LOG.isDebugEnabled()) {
    	_ImplantationGeo.LOG.debug( "updating cImplantation from " + cImplantation() + " to " + value);
    }
    takeStoredValueForKey(value, "cImplantation");
  }

  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey("dCreation");
  }

  public void setDCreation(NSTimestamp value) {
    if (_ImplantationGeo.LOG.isDebugEnabled()) {
    	_ImplantationGeo.LOG.debug( "updating dCreation from " + dCreation() + " to " + value);
    }
    takeStoredValueForKey(value, "dCreation");
  }

  public NSTimestamp dDebVal() {
    return (NSTimestamp) storedValueForKey("dDebVal");
  }

  public void setDDebVal(NSTimestamp value) {
    if (_ImplantationGeo.LOG.isDebugEnabled()) {
    	_ImplantationGeo.LOG.debug( "updating dDebVal from " + dDebVal() + " to " + value);
    }
    takeStoredValueForKey(value, "dDebVal");
  }

  public NSTimestamp dFinVal() {
    return (NSTimestamp) storedValueForKey("dFinVal");
  }

  public void setDFinVal(NSTimestamp value) {
    if (_ImplantationGeo.LOG.isDebugEnabled()) {
    	_ImplantationGeo.LOG.debug( "updating dFinVal from " + dFinVal() + " to " + value);
    }
    takeStoredValueForKey(value, "dFinVal");
  }

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey("dModification");
  }

  public void setDModification(NSTimestamp value) {
    if (_ImplantationGeo.LOG.isDebugEnabled()) {
    	_ImplantationGeo.LOG.debug( "updating dModification from " + dModification() + " to " + value);
    }
    takeStoredValueForKey(value, "dModification");
  }

  public String lcImplantationGeo() {
    return (String) storedValueForKey("lcImplantationGeo");
  }

  public void setLcImplantationGeo(String value) {
    if (_ImplantationGeo.LOG.isDebugEnabled()) {
    	_ImplantationGeo.LOG.debug( "updating lcImplantationGeo from " + lcImplantationGeo() + " to " + value);
    }
    takeStoredValueForKey(value, "lcImplantationGeo");
  }

  public String llImplantationGeo() {
    return (String) storedValueForKey("llImplantationGeo");
  }

  public void setLlImplantationGeo(String value) {
    if (_ImplantationGeo.LOG.isDebugEnabled()) {
    	_ImplantationGeo.LOG.debug( "updating llImplantationGeo from " + llImplantationGeo() + " to " + value);
    }
    takeStoredValueForKey(value, "llImplantationGeo");
  }


  public static ImplantationGeo createImplantationGeo(EOEditingContext editingContext, String cImplantation
, NSTimestamp dCreation
, NSTimestamp dModification
) {
    ImplantationGeo eo = (ImplantationGeo) EOUtilities.createAndInsertInstance(editingContext, _ImplantationGeo.ENTITY_NAME);    
		eo.setCImplantation(cImplantation);
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
    return eo;
  }

  public static NSArray<ImplantationGeo> fetchAllImplantationGeos(EOEditingContext editingContext) {
    return _ImplantationGeo.fetchAllImplantationGeos(editingContext, null);
  }

  public static NSArray<ImplantationGeo> fetchAllImplantationGeos(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ImplantationGeo.fetchImplantationGeos(editingContext, null, sortOrderings);
  }

  public static NSArray<ImplantationGeo> fetchImplantationGeos(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ImplantationGeo.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ImplantationGeo> eoObjects = (NSArray<ImplantationGeo>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ImplantationGeo fetchImplantationGeo(EOEditingContext editingContext, String keyName, Object value) {
    return _ImplantationGeo.fetchImplantationGeo(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ImplantationGeo fetchImplantationGeo(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ImplantationGeo> eoObjects = _ImplantationGeo.fetchImplantationGeos(editingContext, qualifier, null);
    ImplantationGeo eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ImplantationGeo)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ImplantationGeo that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ImplantationGeo fetchRequiredImplantationGeo(EOEditingContext editingContext, String keyName, Object value) {
    return _ImplantationGeo.fetchRequiredImplantationGeo(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ImplantationGeo fetchRequiredImplantationGeo(EOEditingContext editingContext, EOQualifier qualifier) {
    ImplantationGeo eoObject = _ImplantationGeo.fetchImplantationGeo(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ImplantationGeo that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ImplantationGeo localInstanceIn(EOEditingContext editingContext, ImplantationGeo eo) {
    ImplantationGeo localInstance = (eo == null) ? null : (ImplantationGeo)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
