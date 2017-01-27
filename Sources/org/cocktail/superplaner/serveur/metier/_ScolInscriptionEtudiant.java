// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to ScolInscriptionEtudiant.java instead.
package org.cocktail.superplaner.serveur.metier;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _ScolInscriptionEtudiant extends  EOGenericRecord {
	public static final String ENTITY_NAME = "ScolInscriptionEtudiant";

	// Attributes
	public static final String ADR_CIVILITE_KEY = "adrCivilite";
	public static final String ADR_NOM_KEY = "adrNom";
	public static final String ADR_ORDRE_PARENT_KEY = "adrOrdreParent";
	public static final String ADR_ORDRE_SCOL_KEY = "adrOrdreScol";
	public static final String ADR_PRENOM_KEY = "adrPrenom";
	public static final String ADR_PRENOM2_KEY = "adrPrenom2";
	public static final String CPT_ORDRE_KEY = "cptOrdre";
	public static final String ETUD_CODE_INE_KEY = "etudCodeIne";
	public static final String ETUD_NOM_MARITAL_KEY = "etudNomMarital";
	public static final String ETUD_NUMERO_KEY = "etudNumero";
	public static final String FANN_KEY_KEY = "fannKey";
	public static final String FDIP_ABREVIATION_KEY = "fdipAbreviation";
	public static final String FDIP_CODE_KEY = "fdipCode";
	public static final String FDIP_MENTION_KEY = "fdipMention";
	public static final String FDIP_SPECIALITE_KEY = "fdipSpecialite";
	public static final String FDOM_CODE_KEY = "fdomCode";
	public static final String FGRA_CODE_KEY = "fgraCode";
	public static final String FSPN_KEY_KEY = "fspnKey";
	public static final String FSPN_LIBELLE_KEY = "fspnLibelle";
	public static final String HIST_NUMERO_KEY = "histNumero";
	public static final String IDIPL_ANNEE_SUIVIE_KEY = "idiplAnneeSuivie";
	public static final String IDIPL_DATE_DEMISSION_KEY = "idiplDateDemission";
	public static final String IDIPL_DATE_INSC_KEY = "idiplDateInsc";
	public static final String IDIPL_PASSAGE_CONDITIONNEL_KEY = "idiplPassageConditionnel";
	public static final String IDIPL_REDOUBLANT_KEY = "idiplRedoublant";
	public static final String IDIPL_TYPE_INSCRIPTION_KEY = "idiplTypeInscription";
	public static final String IETUD_BASE_KEY = "ietudBase";
	public static final String IETUD_ETAT_KEY = "ietudEtat";
	public static final String IETUD_KEY_KEY = "ietudKey";
	public static final String IETUD_MENTION1_KEY = "ietudMention1";
	public static final String IETUD_MENTION2_KEY = "ietudMention2";
	public static final String IETUD_MOYENNE1_KEY = "ietudMoyenne1";
	public static final String IETUD_MOYENNE2_KEY = "ietudMoyenne2";
	public static final String IETUD_PONDERATION_KEY = "ietudPonderation";
	public static final String IETUD_POURCENTAGE1_KEY = "ietudPourcentage1";
	public static final String IETUD_POURCENTAGE2_KEY = "ietudPourcentage2";
	public static final String IETUD_RANG_KEY = "ietudRang";
	public static final String MPAR_KEY_KEY = "mparKey";
	public static final String NO_INDIVIDU_KEY = "noIndividu";
	public static final String PERS_ID_KEY = "persId";
	public static final String RES_CODE_KEY = "resCode";

	// Relationships
	public static final String FORMATION_GRADE_KEY = "formationGrade";
	public static final String FORMATION_SPECIALISATION_KEY = "formationSpecialisation";
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String MAQUETTE_PARCOURS_KEY = "maquetteParcours";
	public static final String SCOL_INSCRIPTION_AP_KEY = "scolInscriptionAP";
	public static final String SCOL_INSCRIPTION_GRPS_KEY = "scolInscriptionGrps";

  private static Logger LOG = Logger.getLogger(_ScolInscriptionEtudiant.class);

  public ScolInscriptionEtudiant localInstanceIn(EOEditingContext editingContext) {
    ScolInscriptionEtudiant localInstance = (ScolInscriptionEtudiant)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String adrCivilite() {
    return (String) storedValueForKey("adrCivilite");
  }

  public void setAdrCivilite(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating adrCivilite from " + adrCivilite() + " to " + value);
    }
    takeStoredValueForKey(value, "adrCivilite");
  }

  public String adrNom() {
    return (String) storedValueForKey("adrNom");
  }

  public void setAdrNom(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating adrNom from " + adrNom() + " to " + value);
    }
    takeStoredValueForKey(value, "adrNom");
  }

  public Long adrOrdreParent() {
    return (Long) storedValueForKey("adrOrdreParent");
  }

  public void setAdrOrdreParent(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating adrOrdreParent from " + adrOrdreParent() + " to " + value);
    }
    takeStoredValueForKey(value, "adrOrdreParent");
  }

  public Long adrOrdreScol() {
    return (Long) storedValueForKey("adrOrdreScol");
  }

  public void setAdrOrdreScol(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating adrOrdreScol from " + adrOrdreScol() + " to " + value);
    }
    takeStoredValueForKey(value, "adrOrdreScol");
  }

  public String adrPrenom() {
    return (String) storedValueForKey("adrPrenom");
  }

  public void setAdrPrenom(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating adrPrenom from " + adrPrenom() + " to " + value);
    }
    takeStoredValueForKey(value, "adrPrenom");
  }

  public String adrPrenom2() {
    return (String) storedValueForKey("adrPrenom2");
  }

  public void setAdrPrenom2(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating adrPrenom2 from " + adrPrenom2() + " to " + value);
    }
    takeStoredValueForKey(value, "adrPrenom2");
  }

  public Long cptOrdre() {
    return (Long) storedValueForKey("cptOrdre");
  }

  public void setCptOrdre(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating cptOrdre from " + cptOrdre() + " to " + value);
    }
    takeStoredValueForKey(value, "cptOrdre");
  }

  public String etudCodeIne() {
    return (String) storedValueForKey("etudCodeIne");
  }

  public void setEtudCodeIne(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating etudCodeIne from " + etudCodeIne() + " to " + value);
    }
    takeStoredValueForKey(value, "etudCodeIne");
  }

  public String etudNomMarital() {
    return (String) storedValueForKey("etudNomMarital");
  }

  public void setEtudNomMarital(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating etudNomMarital from " + etudNomMarital() + " to " + value);
    }
    takeStoredValueForKey(value, "etudNomMarital");
  }

  public Long etudNumero() {
    return (Long) storedValueForKey("etudNumero");
  }

  public void setEtudNumero(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating etudNumero from " + etudNumero() + " to " + value);
    }
    takeStoredValueForKey(value, "etudNumero");
  }

  public Long fannKey() {
    return (Long) storedValueForKey("fannKey");
  }

  public void setFannKey(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating fannKey from " + fannKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fannKey");
  }

  public String fdipAbreviation() {
    return (String) storedValueForKey("fdipAbreviation");
  }

  public void setFdipAbreviation(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating fdipAbreviation from " + fdipAbreviation() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipAbreviation");
  }

  public String fdipCode() {
    return (String) storedValueForKey("fdipCode");
  }

  public void setFdipCode(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating fdipCode from " + fdipCode() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipCode");
  }

  public String fdipMention() {
    return (String) storedValueForKey("fdipMention");
  }

  public void setFdipMention(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating fdipMention from " + fdipMention() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipMention");
  }

  public String fdipSpecialite() {
    return (String) storedValueForKey("fdipSpecialite");
  }

  public void setFdipSpecialite(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating fdipSpecialite from " + fdipSpecialite() + " to " + value);
    }
    takeStoredValueForKey(value, "fdipSpecialite");
  }

  public String fdomCode() {
    return (String) storedValueForKey("fdomCode");
  }

  public void setFdomCode(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating fdomCode from " + fdomCode() + " to " + value);
    }
    takeStoredValueForKey(value, "fdomCode");
  }

  public String fgraCode() {
    return (String) storedValueForKey("fgraCode");
  }

  public void setFgraCode(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating fgraCode from " + fgraCode() + " to " + value);
    }
    takeStoredValueForKey(value, "fgraCode");
  }

  public Integer fspnKey() {
    return (Integer) storedValueForKey("fspnKey");
  }

  public void setFspnKey(Integer value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating fspnKey from " + fspnKey() + " to " + value);
    }
    takeStoredValueForKey(value, "fspnKey");
  }

  public String fspnLibelle() {
    return (String) storedValueForKey("fspnLibelle");
  }

  public void setFspnLibelle(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating fspnLibelle from " + fspnLibelle() + " to " + value);
    }
    takeStoredValueForKey(value, "fspnLibelle");
  }

  public Long histNumero() {
    return (Long) storedValueForKey("histNumero");
  }

  public void setHistNumero(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating histNumero from " + histNumero() + " to " + value);
    }
    takeStoredValueForKey(value, "histNumero");
  }

  public Long idiplAnneeSuivie() {
    return (Long) storedValueForKey("idiplAnneeSuivie");
  }

  public void setIdiplAnneeSuivie(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating idiplAnneeSuivie from " + idiplAnneeSuivie() + " to " + value);
    }
    takeStoredValueForKey(value, "idiplAnneeSuivie");
  }

  public NSTimestamp idiplDateDemission() {
    return (NSTimestamp) storedValueForKey("idiplDateDemission");
  }

  public void setIdiplDateDemission(NSTimestamp value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating idiplDateDemission from " + idiplDateDemission() + " to " + value);
    }
    takeStoredValueForKey(value, "idiplDateDemission");
  }

  public NSTimestamp idiplDateInsc() {
    return (NSTimestamp) storedValueForKey("idiplDateInsc");
  }

  public void setIdiplDateInsc(NSTimestamp value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating idiplDateInsc from " + idiplDateInsc() + " to " + value);
    }
    takeStoredValueForKey(value, "idiplDateInsc");
  }

  public String idiplPassageConditionnel() {
    return (String) storedValueForKey("idiplPassageConditionnel");
  }

  public void setIdiplPassageConditionnel(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating idiplPassageConditionnel from " + idiplPassageConditionnel() + " to " + value);
    }
    takeStoredValueForKey(value, "idiplPassageConditionnel");
  }

  public String idiplRedoublant() {
    return (String) storedValueForKey("idiplRedoublant");
  }

  public void setIdiplRedoublant(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating idiplRedoublant from " + idiplRedoublant() + " to " + value);
    }
    takeStoredValueForKey(value, "idiplRedoublant");
  }

  public Long idiplTypeInscription() {
    return (Long) storedValueForKey("idiplTypeInscription");
  }

  public void setIdiplTypeInscription(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating idiplTypeInscription from " + idiplTypeInscription() + " to " + value);
    }
    takeStoredValueForKey(value, "idiplTypeInscription");
  }

  public java.math.BigDecimal ietudBase() {
    return (java.math.BigDecimal) storedValueForKey("ietudBase");
  }

  public void setIetudBase(java.math.BigDecimal value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating ietudBase from " + ietudBase() + " to " + value);
    }
    takeStoredValueForKey(value, "ietudBase");
  }

  public Long ietudEtat() {
    return (Long) storedValueForKey("ietudEtat");
  }

  public void setIetudEtat(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating ietudEtat from " + ietudEtat() + " to " + value);
    }
    takeStoredValueForKey(value, "ietudEtat");
  }

  public Long ietudKey() {
    return (Long) storedValueForKey("ietudKey");
  }

  public void setIetudKey(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating ietudKey from " + ietudKey() + " to " + value);
    }
    takeStoredValueForKey(value, "ietudKey");
  }

  public String ietudMention1() {
    return (String) storedValueForKey("ietudMention1");
  }

  public void setIetudMention1(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating ietudMention1 from " + ietudMention1() + " to " + value);
    }
    takeStoredValueForKey(value, "ietudMention1");
  }

  public String ietudMention2() {
    return (String) storedValueForKey("ietudMention2");
  }

  public void setIetudMention2(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating ietudMention2 from " + ietudMention2() + " to " + value);
    }
    takeStoredValueForKey(value, "ietudMention2");
  }

  public java.math.BigDecimal ietudMoyenne1() {
    return (java.math.BigDecimal) storedValueForKey("ietudMoyenne1");
  }

  public void setIetudMoyenne1(java.math.BigDecimal value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating ietudMoyenne1 from " + ietudMoyenne1() + " to " + value);
    }
    takeStoredValueForKey(value, "ietudMoyenne1");
  }

  public java.math.BigDecimal ietudMoyenne2() {
    return (java.math.BigDecimal) storedValueForKey("ietudMoyenne2");
  }

  public void setIetudMoyenne2(java.math.BigDecimal value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating ietudMoyenne2 from " + ietudMoyenne2() + " to " + value);
    }
    takeStoredValueForKey(value, "ietudMoyenne2");
  }

  public java.math.BigDecimal ietudPonderation() {
    return (java.math.BigDecimal) storedValueForKey("ietudPonderation");
  }

  public void setIetudPonderation(java.math.BigDecimal value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating ietudPonderation from " + ietudPonderation() + " to " + value);
    }
    takeStoredValueForKey(value, "ietudPonderation");
  }

  public java.math.BigDecimal ietudPourcentage1() {
    return (java.math.BigDecimal) storedValueForKey("ietudPourcentage1");
  }

  public void setIetudPourcentage1(java.math.BigDecimal value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating ietudPourcentage1 from " + ietudPourcentage1() + " to " + value);
    }
    takeStoredValueForKey(value, "ietudPourcentage1");
  }

  public java.math.BigDecimal ietudPourcentage2() {
    return (java.math.BigDecimal) storedValueForKey("ietudPourcentage2");
  }

  public void setIetudPourcentage2(java.math.BigDecimal value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating ietudPourcentage2 from " + ietudPourcentage2() + " to " + value);
    }
    takeStoredValueForKey(value, "ietudPourcentage2");
  }

  public Long ietudRang() {
    return (Long) storedValueForKey("ietudRang");
  }

  public void setIetudRang(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating ietudRang from " + ietudRang() + " to " + value);
    }
    takeStoredValueForKey(value, "ietudRang");
  }

  public Integer mparKey() {
    return (Integer) storedValueForKey("mparKey");
  }

  public void setMparKey(Integer value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating mparKey from " + mparKey() + " to " + value);
    }
    takeStoredValueForKey(value, "mparKey");
  }

  public Integer noIndividu() {
    return (Integer) storedValueForKey("noIndividu");
  }

  public void setNoIndividu(Integer value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating noIndividu from " + noIndividu() + " to " + value);
    }
    takeStoredValueForKey(value, "noIndividu");
  }

  public Long persId() {
    return (Long) storedValueForKey("persId");
  }

  public void setPersId(Long value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating persId from " + persId() + " to " + value);
    }
    takeStoredValueForKey(value, "persId");
  }

  public String resCode() {
    return (String) storedValueForKey("resCode");
  }

  public void setResCode(String value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
    	_ScolInscriptionEtudiant.LOG.debug( "updating resCode from " + resCode() + " to " + value);
    }
    takeStoredValueForKey(value, "resCode");
  }

  public org.cocktail.superplaner.serveur.metier.ScolFormationGrade formationGrade() {
    return (org.cocktail.superplaner.serveur.metier.ScolFormationGrade)storedValueForKey("formationGrade");
  }

  public void setFormationGradeRelationship(org.cocktail.superplaner.serveur.metier.ScolFormationGrade value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
      _ScolInscriptionEtudiant.LOG.debug("updating formationGrade from " + formationGrade() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.ScolFormationGrade oldValue = formationGrade();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "formationGrade");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "formationGrade");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.FormationSpecialisation formationSpecialisation() {
    return (org.cocktail.superplaner.serveur.metier.FormationSpecialisation)storedValueForKey("formationSpecialisation");
  }

  public void setFormationSpecialisationRelationship(org.cocktail.superplaner.serveur.metier.FormationSpecialisation value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
      _ScolInscriptionEtudiant.LOG.debug("updating formationSpecialisation from " + formationSpecialisation() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.FormationSpecialisation oldValue = formationSpecialisation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "formationSpecialisation");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "formationSpecialisation");
    }
  }
  
  public org.cocktail.superplaner.serveur.metier.IndividuUlr individuUlr() {
    return (org.cocktail.superplaner.serveur.metier.IndividuUlr)storedValueForKey("individuUlr");
  }

  public void setIndividuUlrRelationship(org.cocktail.superplaner.serveur.metier.IndividuUlr value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
      _ScolInscriptionEtudiant.LOG.debug("updating individuUlr from " + individuUlr() + " to " + value);
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
  
  public org.cocktail.superplaner.serveur.metier.MaquetteParcours maquetteParcours() {
    return (org.cocktail.superplaner.serveur.metier.MaquetteParcours)storedValueForKey("maquetteParcours");
  }

  public void setMaquetteParcoursRelationship(org.cocktail.superplaner.serveur.metier.MaquetteParcours value) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
      _ScolInscriptionEtudiant.LOG.debug("updating maquetteParcours from " + maquetteParcours() + " to " + value);
    }
    if (value == null) {
    	org.cocktail.superplaner.serveur.metier.MaquetteParcours oldValue = maquetteParcours();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "maquetteParcours");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "maquetteParcours");
    }
  }
  
  public NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionAp> scolInscriptionAP() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionAp>)storedValueForKey("scolInscriptionAP");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionAp> scolInscriptionAP(EOQualifier qualifier) {
    return scolInscriptionAP(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionAp> scolInscriptionAP(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionAp> results;
      results = scolInscriptionAP();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionAp>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionAp>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToScolInscriptionAPRelationship(org.cocktail.superplaner.serveur.metier.ScolInscriptionAp object) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
      _ScolInscriptionEtudiant.LOG.debug("adding " + object + " to scolInscriptionAP relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "scolInscriptionAP");
  }

  public void removeFromScolInscriptionAPRelationship(org.cocktail.superplaner.serveur.metier.ScolInscriptionAp object) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
      _ScolInscriptionEtudiant.LOG.debug("removing " + object + " from scolInscriptionAP relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "scolInscriptionAP");
  }

  public org.cocktail.superplaner.serveur.metier.ScolInscriptionAp createScolInscriptionAPRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ScolInscriptionAp");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "scolInscriptionAP");
    return (org.cocktail.superplaner.serveur.metier.ScolInscriptionAp) eo;
  }

  public void deleteScolInscriptionAPRelationship(org.cocktail.superplaner.serveur.metier.ScolInscriptionAp object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "scolInscriptionAP");
    editingContext().deleteObject(object);
  }

  public void deleteAllScolInscriptionAPRelationships() {
    Enumeration objects = scolInscriptionAP().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteScolInscriptionAPRelationship((org.cocktail.superplaner.serveur.metier.ScolInscriptionAp)objects.nextElement());
    }
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp> scolInscriptionGrps() {
    return (NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp>)storedValueForKey("scolInscriptionGrps");
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp> scolInscriptionGrps(EOQualifier qualifier) {
    return scolInscriptionGrps(qualifier, null);
  }

  public NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp> scolInscriptionGrps(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp> results;
      results = scolInscriptionGrps();
      if (qualifier != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToScolInscriptionGrpsRelationship(org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp object) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
      _ScolInscriptionEtudiant.LOG.debug("adding " + object + " to scolInscriptionGrps relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "scolInscriptionGrps");
  }

  public void removeFromScolInscriptionGrpsRelationship(org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp object) {
    if (_ScolInscriptionEtudiant.LOG.isDebugEnabled()) {
      _ScolInscriptionEtudiant.LOG.debug("removing " + object + " from scolInscriptionGrps relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "scolInscriptionGrps");
  }

  public org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp createScolInscriptionGrpsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ScolInscriptionGrp");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "scolInscriptionGrps");
    return (org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp) eo;
  }

  public void deleteScolInscriptionGrpsRelationship(org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "scolInscriptionGrps");
    editingContext().deleteObject(object);
  }

  public void deleteAllScolInscriptionGrpsRelationships() {
    Enumeration objects = scolInscriptionGrps().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteScolInscriptionGrpsRelationship((org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp)objects.nextElement());
    }
  }


  public static ScolInscriptionEtudiant createScolInscriptionEtudiant(EOEditingContext editingContext, Long etudNumero
, Long fannKey
, Long histNumero
, String idiplPassageConditionnel
, String idiplRedoublant
, Long ietudEtat
, String ietudMention1
, String ietudMention2
, java.math.BigDecimal ietudPonderation
, java.math.BigDecimal ietudPourcentage1
, java.math.BigDecimal ietudPourcentage2
) {
    ScolInscriptionEtudiant eo = (ScolInscriptionEtudiant) EOUtilities.createAndInsertInstance(editingContext, _ScolInscriptionEtudiant.ENTITY_NAME);    
		eo.setEtudNumero(etudNumero);
		eo.setFannKey(fannKey);
		eo.setHistNumero(histNumero);
		eo.setIdiplPassageConditionnel(idiplPassageConditionnel);
		eo.setIdiplRedoublant(idiplRedoublant);
		eo.setIetudEtat(ietudEtat);
		eo.setIetudMention1(ietudMention1);
		eo.setIetudMention2(ietudMention2);
		eo.setIetudPonderation(ietudPonderation);
		eo.setIetudPourcentage1(ietudPourcentage1);
		eo.setIetudPourcentage2(ietudPourcentage2);
    return eo;
  }

  public static NSArray<ScolInscriptionEtudiant> fetchAllScolInscriptionEtudiants(EOEditingContext editingContext) {
    return _ScolInscriptionEtudiant.fetchAllScolInscriptionEtudiants(editingContext, null);
  }

  public static NSArray<ScolInscriptionEtudiant> fetchAllScolInscriptionEtudiants(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ScolInscriptionEtudiant.fetchScolInscriptionEtudiants(editingContext, null, sortOrderings);
  }

  public static NSArray<ScolInscriptionEtudiant> fetchScolInscriptionEtudiants(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_ScolInscriptionEtudiant.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ScolInscriptionEtudiant> eoObjects = (NSArray<ScolInscriptionEtudiant>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static ScolInscriptionEtudiant fetchScolInscriptionEtudiant(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolInscriptionEtudiant.fetchScolInscriptionEtudiant(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolInscriptionEtudiant fetchScolInscriptionEtudiant(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ScolInscriptionEtudiant> eoObjects = _ScolInscriptionEtudiant.fetchScolInscriptionEtudiants(editingContext, qualifier, null);
    ScolInscriptionEtudiant eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (ScolInscriptionEtudiant)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ScolInscriptionEtudiant that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolInscriptionEtudiant fetchRequiredScolInscriptionEtudiant(EOEditingContext editingContext, String keyName, Object value) {
    return _ScolInscriptionEtudiant.fetchRequiredScolInscriptionEtudiant(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ScolInscriptionEtudiant fetchRequiredScolInscriptionEtudiant(EOEditingContext editingContext, EOQualifier qualifier) {
    ScolInscriptionEtudiant eoObject = _ScolInscriptionEtudiant.fetchScolInscriptionEtudiant(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ScolInscriptionEtudiant that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ScolInscriptionEtudiant localInstanceIn(EOEditingContext editingContext, ScolInscriptionEtudiant eo) {
    ScolInscriptionEtudiant localInstance = (eo == null) ? null : (ScolInscriptionEtudiant)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
