package org.cocktail.superplaner.serveur.components;

import org.cocktail.fwkcktlajaxwebext.serveur.component.tableview.column.CktlAjaxTableViewColumn;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationAnnee;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationDiplome;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationDiscipline;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationDomaine;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationGrade;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationSpecialisation;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolGroupeGrp;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteAp;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteEc;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteParcours;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionSem;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteSemestre;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteUe;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOGenericRecord;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;

import er.ajax.AjaxTreeModel;

/**
 * Class controleur du treeView de parcours des enseignements
 * 
 * @author jlmatas
 * 
 */
public class EnseignementsTreeDelegate implements AjaxTreeModel.Delegate,
		ISearchMaquetteCtrl {

	private EOEditingContext ec;
	private EOScolFormationAnnee selectedYear;
	private EOScolFormationDomaine selectedDomaine;
	private AjaxTreeModel treeModel;
	private EnsTreeItem treeItem;

	private EnsTreeItem rootTree;

	private String libelleSearch;
	private boolean UELibSearch = true;
	private boolean ECLibSearch = true;
	private boolean APLibSearch = false;

	private EOQualifier diplomeFilterQualifier;

	// public static final String

	public EnseignementsTreeDelegate() {
		super();
	}

	public EnseignementsTreeDelegate(EOEditingContext ec,
			EOScolFormationAnnee selectedYear) {
		super();
		this.ec = ec;
		this.selectedYear = selectedYear;
		// this.selectedDomaine = selectedDomaine;
	}

	public String getLibelleArbre() {
		return treeItem.getLibelle();
	}

	public NSArray<EnsTreeItem> childrenTreeNodes(Object node) {
		return ((EnsTreeItem) node).getChilds(libelleSearch, isUELibSearch(),
				isECLibSearch(), isAPLibSearch());
	}

	public boolean isLeaf(Object node) {
		return ((node instanceof EnsTreeItem) && (((EnsTreeItem) node)
				.getEoObject() instanceof EOScolMaquetteAp));

	}

	public Object parentTreeNode(Object node) {
		if (node == null) {
			return null;
		}
		return ((EnsTreeItem) node).getParent();
	}

	/**
	 * @return the selectedDomaine
	 */
	public EOScolFormationDomaine selectedDomaine() {
		return selectedDomaine;
	}

	/**
	 * @param selectedDomaine
	 *            the selectedDomaine to set
	 */
	public void setSelectedDomaine(EOScolFormationDomaine selectedDomaine) {
		this.selectedDomaine = selectedDomaine;
		if ((this.rootTree != null) && (selectedDomaine != null)
				&& (!selectedDomaine.equals(this.rootTree.getEoObject())))
			this.rootTree = null;
	}

	public EOScolFormationAnnee getSelectedYear() {
		return selectedYear;
	}

	public void setSelectedYear(EOScolFormationAnnee selectedYear) {
		this.selectedYear = selectedYear;
	}

	/**
	 * Recherche le noeud correspondand à l'objet dans l'arbre et realise un
	 * expand sur les branches parent correspondantes.
	 * 
	 * @param matchNode
	 *            : noeud cherché
	 * 
	 */
	public void selectObjectInTree(EnsTreeItem matchNode) {

		getTreeModel().setExpanded(matchNode, true);

	}

	public AjaxTreeModel getTreeModel() {
		if (treeModel == null)
			treeModel = new AjaxTreeModel();
		return treeModel;
	}

	public void setTreeModel(AjaxTreeModel treeModel) {
		this.treeModel = treeModel;
	}

	public EnsTreeItem treeItem() {
		return treeItem;
	}

	public void setTreeItem(EnsTreeItem treeItem) {
		this.treeItem = treeItem;
	}

	public EnsTreeItem getRootTree() {
		if (this.rootTree == null)
			setRootTree(new EnsTreeItem(this, this.selectedDomaine(), null,
					this.getSelectedYear()));
		return this.rootTree;
	}

	public void setRootTree(EnsTreeItem rootTree) {
		this.rootTree = rootTree;
	}

	public EOEditingContext getEc() {
		return ec;
	}

	public void setEc(EOEditingContext ec) {
		this.ec = ec;
	}

	public boolean isLink() {
		return false;
	}

	public String getLibelleSearch() {
		return libelleSearch;
	}

	public void setLibelleSearch(String libelle) {
		this.libelleSearch = libelle;
	}

	public boolean isUELibSearch() {
		return UELibSearch;
	}

	public void setUELibSearch(Boolean uELibSearch) {
		if (uELibSearch == null)
			this.UELibSearch = false;
		else
			this.UELibSearch = uELibSearch;
	}

	public boolean isECLibSearch() {
		return ECLibSearch;
	}

	public void setECLibSearch(Boolean eCLibSearch) {
		if (eCLibSearch == null)
			this.ECLibSearch = false;
		else
			this.ECLibSearch = eCLibSearch;
	}

	public boolean isAPLibSearch() {
		return APLibSearch;
	}

	public void setAPLibSearch(Boolean aPLibSearch) {
		if (aPLibSearch == null)
			this.APLibSearch = false;
		else
			this.APLibSearch = aPLibSearch;
	}

	public EOQualifier getDiplomeFilterQualifier() {
		return diplomeFilterQualifier;
	}

	public void setDiplomeFilterQualifier(EOQualifier diplomeFilterQualifier) {
		this.diplomeFilterQualifier = diplomeFilterQualifier;
	}

	public NSArray<EOGenericRecord> getLstObjFromSearch() {
		return null;
	}

	public String getLibelle(Object eoObject) {
		if (eoObject instanceof EOScolFormationDomaine)
			return ((EOScolFormationDomaine) eoObject).fdomLibelle();
		if (eoObject instanceof EOScolFormationGrade)
			return ((EOScolFormationGrade) eoObject).fgraLibelle();
		if (eoObject instanceof EOScolFormationDiscipline)
			return ((EOScolFormationDiscipline) eoObject).fdscLibelle();
		if (eoObject instanceof EOScolFormationDiplome) {
			EOScolFormationDiplome dipl = (EOScolFormationDiplome) eoObject;
			return dipl.fdipAbreviation() != null ? dipl.fdipAbreviation()
					: dipl.fdipLibelle();
		}
		if (eoObject instanceof EOScolFormationSpecialisation) {
			EOScolFormationSpecialisation spec = (EOScolFormationSpecialisation) eoObject;
			return spec.fspnAbreviation() != null ? spec.fspnAbreviation()
					: spec.fspnLibelle();
		}
		if (eoObject instanceof EOScolMaquetteParcours) {
			EOScolFormationSpecialisation spec = ((EOScolMaquetteParcours) eoObject)
					.toFwkScolarite_ScolFormationSpecialisation();
			return ((EOScolMaquetteParcours) eoObject).mparLibelle()
			+ (spec.fspnAbreviation() != null ? " de " + spec.fspnAbreviation()
					: (spec.fspnLibelle() != null ? " de " + spec.fspnLibelle() : ""));
		}
		if (eoObject instanceof EOScolMaquetteSemestre) {
			EOScolFormationSpecialisation spec = ((EOScolMaquetteRepartitionSem) ((EOScolMaquetteSemestre) eoObject)
					.toFwkScolarite_ScolMaquetteRepartitionSems().lastObject())
					.toFwkScolarite_ScolMaquetteParcours()
					.toFwkScolarite_ScolFormationSpecialisation();
			return "Semestre "
					+ ((EOScolMaquetteSemestre) eoObject).msemOrdre()
					+ (spec.fspnAbreviation() != null ? " de " + spec.fspnAbreviation()
							: (spec.fspnLibelle() != null ? " de " + spec.fspnLibelle() : ""));
		}
		if (eoObject instanceof EOScolMaquetteUe)
			return "UE:" + ((EOScolMaquetteUe) eoObject).mueLibelle() + "-("
					+ ((EOScolMaquetteUe) eoObject).mueCode() + ")";
		if (eoObject instanceof EOScolMaquetteEc)
			return "EC:" + ((EOScolMaquetteEc) eoObject).mecLibelle() + "-("
					+ ((EOScolMaquetteEc) eoObject).mecCode() + ")";
		if (eoObject instanceof EOScolMaquetteAp)
			return ((EOScolMaquetteAp) eoObject).mapLibelle() + " ("
					+ ((EOScolMaquetteAp) eoObject).mapValeur()
					+ " heure(s) avec "
					+ ((EOScolMaquetteAp) eoObject).mapGroupeReel()
					+ " groupe(s)";
		if (eoObject instanceof EOScolGroupeGrp)
			return "Groupe:" + ((EOScolGroupeGrp) eoObject).ggrpLibelle()
					+ "-(" + ((EOScolGroupeGrp) eoObject).ggrpCode() + ")";
		return null;
	}

	public NSArray<CktlAjaxTableViewColumn> getColonnes() {
		return null;
	}

	public String getLibSearchField() {
		return "Libellé contient";
	}

	private boolean treeShowed = false;

	/**
	 * @return the treeShowed
	 */
	public boolean treeShowed() {
		return treeShowed;
	}

	/**
	 * @param treeShowed
	 *            the treeShowed to set
	 */
	public void setTreeShowed(boolean treeShowed) {
		this.treeShowed = treeShowed;
	}

	private EOGenericRecord localSelectedObj;

	public void setLocalSelectedObj(EOGenericRecord localSelectedObj) {
		this.localSelectedObj = localSelectedObj;
	}

	public EOGenericRecord getLocalSelectedObj() {
		return localSelectedObj;
	}

	private String modeSearch;

	public String getModeSearch() {
		return modeSearch;
	}

	public void setModeSearch(String modeSearch) {
		this.modeSearch = modeSearch;

	}

}
