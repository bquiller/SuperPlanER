package org.cocktail.superplaner.serveur.components;

import org.cocktail.fwkcktlpersonne.common.metier.IPersonne;
import org.cocktail.fwkgspotguiajax.serveur.components.SallesTreeDelegate;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationAnnee;
import org.cocktail.scolaritemodulesfwk.serveur.components.DiplomePickerDefaultDelegate;
import org.cocktail.scolaritemodulesfwk.serveur.components.EnseignementsTreeDelegate;
import org.cocktail.superplaner.serveur.DBHandler;
import org.cocktail.superplaner.serveur.components.controlers.PlanningCtrl;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOResponse;
import com.webobjects.eocontrol.EOGenericRecord;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;

import er.ajax.CktlAjaxUtils;

public class Inspecteur extends MyWOComponent {

	private static final long serialVersionUID = 1L;
	private IPersonne personne;
	private EOGenericRecord salle;
	private SallesTreeDelegate treeDelegate;

	private EOGenericRecord enseignement;

	private EnseignementsTreeDelegate enseignementsDelegate;
//	private PlanningCtrl planCtrl;
	private DiplomePickerDefaultDelegate delegate;
	private EOScolFormationAnnee annee;


	public Inspecteur(WOContext context) {
		super(context);
		EOQualifier qual = EOQualifier.qualifierWithQualifierFormat(EOScolFormationAnnee.FANN_COURANTE_KEY + " = %@"
				, new NSArray(new Object[] { "O" }));

		annee = (EOScolFormationAnnee) DBHandler.fetchData(session().defaultEditingContext(), EOScolFormationAnnee.ENTITY_NAME, qual).get(0);
//		planCtrl = new PlanningCtrl(session.defaultEditingContext());
		delegate = new DiplomePickerDefaultDelegate(session().defaultEditingContext(), annee);
	}

	@Override
	public void appendToResponse(WOResponse response, WOContext context) {

		super.appendToResponse(response, context);

		CktlAjaxUtils.addStylesheetResourceInHead(context, response, "FwkCktlThemes.framework", "themes/default.css");
		CktlAjaxUtils.addStylesheetResourceInHead(context, response, "FwkCktlThemes.framework", "themes/alert.css");
		CktlAjaxUtils.addStylesheetResourceInHead(context, response, "FwkCktlThemes.framework", "themes/lighting.css");

		CktlAjaxUtils.addStylesheetResourceInHead(context, response, "FwkCktlThemes.framework", "css/CktlCommon.css");
		// TODO Choisir une css de couleur si necessaire
		// CktlAjaxUtils.addStylesheetResourceInHead(context, response, "FwkCktlThemes.framework", "css/CktlCommonBleu.css");
		CktlAjaxUtils.addStylesheetResourceInHead(context, response, "app", "styles/superplaner.css");

		CktlAjaxUtils.addScriptResourceInHead(context, response, "prototype.js");
		CktlAjaxUtils.addScriptResourceInHead(context, response, "FwkCktlThemes.framework", "scripts/window.js");
		CktlAjaxUtils.addScriptResourceInHead(context, response, "app", "scripts/strings.js");
		CktlAjaxUtils.addScriptResourceInHead(context, response, "app", "scripts/formatteurs.js");
		CktlAjaxUtils.addScriptResourceInHead(context, response, "app", "scripts/superplaner.js");

		session.removeObjectForKey("MessageErreur");
	}

	/**
	 * @return the salle
	 */
	public EOGenericRecord salle() {
		return salle;
	}

	/**
	 * @return the personne
	 */
	public IPersonne personne() {
		return personne;
	}

	/**
	 * @param salle the salle to set
	 */
	public void setSalle(EOGenericRecord salle) {
		this.salle = salle;
	}

	/**
	 * @param personne the personne to set
	 */
	public void setPersonne(IPersonne personne) {
		this.personne = personne;
	}

	public SallesTreeDelegate getTreeDelegate() {

		if ((treeDelegate != null)
				&& (treeDelegate instanceof SallesTreeDelegate)) {

		} else {
			treeDelegate = new SallesTreeDelegate(session()
					.defaultEditingContext());

		}

		return treeDelegate;
	}

	public void setTreeDelegate(SallesTreeDelegate treeDelegate) {
		this.treeDelegate = treeDelegate;
	}

	/**
	 * @return the enseignementsDelegate
	 */
	public EnseignementsTreeDelegate enseignementsDelegate() {
		return enseignementsDelegate;
	}

	/**
	 * @param enseignementsDelegate the enseignementsDelegate to set
	 */
	public void setEnseignementsDelegate(
			EnseignementsTreeDelegate enseignementsDelegate) {
		this.enseignementsDelegate = enseignementsDelegate;
	}

	/**
	 * @return the enseignement
	 */
	public EOGenericRecord enseignement() {
		return enseignement;
	}

	/**
	 * @param enseignement the enseignement to set
	 */
	public void setEnseignement(EOGenericRecord enseignement) {
		this.enseignement = enseignement;
	}


	/**
	 * @return the annee
	 */
	public EOScolFormationAnnee annee() {
		return annee;
	}
	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(EOScolFormationAnnee annee) {
		this.annee = annee;
	}

	public DiplomePickerDefaultDelegate getDelegate() {
		return delegate;
	}

	public void setDelegate(DiplomePickerDefaultDelegate delegate) {
		this.delegate = delegate;
	}


}