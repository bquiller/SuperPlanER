package org.cocktail.superplaner.serveur.components;

import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolInscriptionEtudiant;
import org.cocktail.superplaner.serveur.DBHandler;
import org.cocktail.superplaner.serveur.components.controlers.PlanningCtrl;
import org.cocktail.superplaner.serveur.metier.MaquetteAp;
import org.cocktail.superplaner.serveur.metier.ScolGroupeObjet;
import org.cocktail.superplaner.serveur.metier.ScolInscriptionAp;
import org.cocktail.superplaner.serveur.metier.ScolInscriptionEtudiant;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.eocontrol.EOAndQualifier;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

import er.ajax.CktlAjaxModalDialog;

public class ChoixGroupes extends MyWOComponent {

	private PlanningCtrl planCtrl;
	private MaquetteAp groupeAp;
	private ScolGroupeObjet groupe;
	private boolean isChecked;

	public ChoixGroupes(WOContext context) {
		super(context);
		planCtrl = new PlanningCtrl(session.defaultEditingContext());
	}

	public NSArray grpsPossibles() {
		NSMutableArray<MaquetteAp> result = new NSMutableArray<MaquetteAp>();
		
		NSMutableArray<EOSortOrdering> order = new NSMutableArray<EOSortOrdering>();
		order.addObject(EOSortOrdering.sortOrderingWithKey(ScolInscriptionEtudiant.IDIPL_ANNEE_SUIVIE_KEY, EOSortOrdering.CompareAscending));
		
		NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
		EOQualifier qual1 = new EOKeyValueQualifier(EOScolInscriptionEtudiant.PERS_ID_KEY, EOQualifier.QualifierOperatorEqual, session.selectedPersonne().persId());
		qualifiers.add(qual1);
		EOQualifier qual2 = new EOKeyValueQualifier(EOScolInscriptionEtudiant.FANN_KEY_KEY, EOQualifier.QualifierOperatorEqual, 2012);
		qualifiers.add(qual2);
		EOQualifier qual = new EOAndQualifier(qualifiers);

		NSArray<ScolInscriptionEtudiant> inscriptions = ScolInscriptionEtudiant.fetchScolInscriptionEtudiants(session.defaultEditingContext(), qual, order);
		for (ScolInscriptionEtudiant insc : inscriptions) {
			//		ScolInscriptionEtudiant insc = ScolInscriptionEtudiant.fetchScolInscriptionEtudiant(session.defaultEditingContext(), EOScolInscriptionEtudiant.NO_INDIVIDU_KEY, session.applicationUser().getNoIndividu());
			NSArray<ScolInscriptionAp> aps = insc.scolInscriptionAP();
			result.addAll(planCtrl.requestGrps(DBHandler.globalIDsForObjects(session.defaultEditingContext(),aps)));
		}
		
		// EOSortOrdering.sortArrayUsingKeyOrderArray(result, new NSArray (EOSortOrdering.sortOrderingWithKey("groupeAp.vParcoursAp.semestre.msemOrdre", EOSortOrdering.CompareAscending))); 
		
		return result;
	}

	public MaquetteAp getGroupeAp() {
		return groupeAp;
	}

	public ScolGroupeObjet getGroupe() {
		return groupe;
	}
	public void setGroupeAp(MaquetteAp groupeAp) {
		this.groupeAp = groupeAp;
	}

	public void setGroupe(ScolGroupeObjet groupe) {
		this.groupe = groupe;
	}

	private String idCheckBoxChoixGroupe;

	/**
	 * @return the idCheckBoxChoixGroupe
	 */
	public String idCheckBoxChoixGroupe() {
		return idCheckBoxChoixGroupe;
	}

	/**
	 * @param idCheckBoxChoixGroupe the idCheckBoxChoixGroupe to set
	 */
	public void setIdCheckBoxChoixGroupe(String idCheckBoxChoixGroupe) {
		this.idCheckBoxChoixGroupe = idCheckBoxChoixGroupe;
	}

	/**
	 * @return the isChecked
	 */
	public boolean groupChecked() {
		return session.selectedGroups.contains(groupe);
	}

	public void setGroupChecked(boolean newGroupChecked) {
//		System.out.println("In setGroupChecked");
		if (newGroupChecked) {
			if (!session.selectedGroups.containsObject(groupe)) {
				session.selectedGroups.addObject(groupe);
			}
		}
		else
			if (session.selectedGroups.containsObject(groupe)) {
				session.selectedGroups.removeObject(groupe);
			}
	}

	public WOActionResults valider() {
		CktlAjaxModalDialog.close(context(), "ChoixGroupes");
		return null;
	}

	/**
	 * @return the script
	 */
	public String script() {
		String script = "function display(id, h) {" +
		"var state = document.getElementById(id).style.display;" + 
		"if (state == \"none\") {" +
		"document.getElementById(id).style.display = \"block\";" +
		"} else {" +
		"document.getElementById(id).style.display = \"none\";" +
		"}}";
		return script;
	}

}