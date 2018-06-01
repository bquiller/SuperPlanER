package org.cocktail.superplaner.serveur.components;

import java.util.Iterator;

import org.cocktail.scolaritefwk.serveur.finder.Finder;
import org.cocktail.scolaritefwk.serveur.finder.FinderScolFormationDiplome;
import org.cocktail.scolaritefwk.serveur.finder.FinderScolFormationDomaine;
import org.cocktail.scolaritefwk.serveur.finder.FinderScolFormationGrade;
import org.cocktail.scolaritefwk.serveur.finder.FinderScolMaquetteEc;
import org.cocktail.scolaritefwk.serveur.finder.FinderScolMaquetteParcours;
import org.cocktail.scolaritefwk.serveur.finder.FinderScolMaquetteSemestre;
import org.cocktail.scolaritefwk.serveur.finder.FinderScolMaquetteUe;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationAnnee;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationDiplome;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationDisciplinaire;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationDiscipline;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationDomaine;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationGrade;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationSpecialisation;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolGroupeGrp;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteAp;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteEc;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteParcours;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionAp;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionEc;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionSem;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionUe;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteSemestre;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteUe;

import com.webobjects.eocontrol.EOAndQualifier;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOGenericRecord;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

import er.extensions.eof.ERXQ;

/**
 * Item du tree view des enseignements.
 * 
 * @author jlmatas
 * 
 */
public class EnsTreeItem {

	/**
	 * Object metier de l'item
	 */
	protected EOGenericRecord eoObject;

	protected Object itemObject;

	/**
	 * Objet metier parent de l'item
	 */
	protected EnsTreeItem parent;

	protected EnseignementsTreeDelegate treeDelegate;

	protected EOScolFormationAnnee selectedYear;

	protected NSArray<EnsTreeItem> childs;

	public static final String SEMtoUE = ERXQ
			.keyPath(
					EOScolMaquetteSemestre.TO_FWK_SCOLARITE__SCOL_MAQUETTE_REPARTITION_UES_KEY,
					EOScolMaquetteRepartitionUe.TO_FWK_SCOLARITE__SCOL_MAQUETTE_UE_KEY);

	public static final String UEtoEC = ERXQ
			.keyPath(
					EOScolMaquetteUe.TO_FWK_SCOLARITE__SCOL_MAQUETTE_REPARTITION_ECS_KEY,
					EOScolMaquetteRepartitionEc.TO_FWK_SCOLARITE__SCOL_MAQUETTE_EC_KEY);

	public static final String ECtoAP = ERXQ
			.keyPath(
					EOScolMaquetteEc.TO_FWK_SCOLARITE__SCOL_MAQUETTE_REPARTITION_APS_KEY,
					EOScolMaquetteRepartitionAp.TO_FWK_SCOLARITE__SCOL_MAQUETTE_AP_KEY);
	public static final String UEtoAP = ERXQ.keyPath(UEtoEC, ECtoAP);

	public static final String PARCtoUE = ERXQ
			.keyPath(
					EOScolMaquetteParcours.TO_FWK_SCOLARITE__SCOL_MAQUETTE_REPARTITION_SEMS_KEY,
					EOScolMaquetteRepartitionSem.TO_FWK_SCOLARITE__SCOL_MAQUETTE_SEMESTRE_KEY,
					SEMtoUE);

	public static final String SPECtoUE = ERXQ
			.keyPath(
					EOScolFormationSpecialisation.TO_FWK_SCOLARITE__SCOL_MAQUETTE_PARCOURSS_KEY,
					PARCtoUE);
	public static final String DISCtoUE = ERXQ
			.keyPath(
					EOScolFormationDiscipline.TO_FWK_SCOLARITE__SCOL_FORMATION_DISCIPLINAIRES_KEY,
					EOScolFormationDisciplinaire.TO_FWK_SCOLARITE__SCOL_FORMATION_DIPLOME_KEY,
					EOScolFormationDiplome.TO_FWK_SCOLARITE__SCOL_FORMATION_SPECIALISATIONS_KEY,
					SPECtoUE);

	public static final String DIPLtoUE = ERXQ
			.keyPath(
					EOScolFormationDiplome.TO_FWK_SCOLARITE__SCOL_FORMATION_SPECIALISATIONS_KEY,
					SPECtoUE);

	public EnsTreeItem(EnseignementsTreeDelegate delegate,
			EOGenericRecord eoObject, EnsTreeItem parent,
			EOScolFormationAnnee selectedYear) {
		super();
		this.treeDelegate = delegate;
		this.eoObject = eoObject;
		this.parent = parent;
		this.selectedYear = selectedYear;
	}

	public EnsTreeItem(EnseignementsTreeDelegate delegate,
			EOGenericRecord eoObject, Object itemObject, EnsTreeItem parent,
			EOScolFormationAnnee selectedYear) {
		super();
		this.treeDelegate = delegate;
		this.eoObject = eoObject;
		this.parent = parent;
		this.selectedYear = selectedYear;
		this.itemObject = itemObject;
	}

	public EnseignementsTreeDelegate treeDelegate() {
		return this.treeDelegate;
	}

	public void setTreeDelegate(EnseignementsTreeDelegate delegate) {
		this.treeDelegate = delegate;
	}

	public NSArray<EnsTreeItem> getChilds(EOEditingContext ec) {
		return getChilds(ec, null, false, false, false);
	}

	@SuppressWarnings("unchecked")
	public NSArray<EnsTreeItem> getChilds(EOEditingContext ec,
			String libelleSearch, boolean UELibSearch, boolean ECLibSearch,
			boolean APLibSearch) {
		NSArray<EnsTreeItem> retour = null;
		if (this.eoObject instanceof EOScolFormationDomaine) {
			if (libelleSearch != null) {

				EOQualifier qual = getQualifier(
						UELibSearch,
						ECLibSearch,
						APLibSearch,
						libelleSearch,
						ERXQ.keyPath(
								EOScolFormationGrade.TO_FWK_SCOLARITE__SCOL_FORMATION_DIPLOMES_KEY,
								DIPLtoUE)
								+ ".",
						ERXQ.keyPath(
								EOScolFormationGrade.TO_FWK_SCOLARITE__SCOL_FORMATION_DIPLOMES_KEY,
								DIPLtoUE, UEtoEC)
								+ ".",
						ERXQ.keyPath(
								EOScolFormationGrade.TO_FWK_SCOLARITE__SCOL_FORMATION_DIPLOMES_KEY,
								DIPLtoUE, UEtoAP)
								+ ".");

				retour = buildEnsTreeItemArray(
						FinderScolFormationGrade.getGradesForDomaineAndYear(ec,
								(EOScolFormationDomaine) this.eoObject,
								selectedYear, qual), this);
			} else {
				retour = buildEnsTreeItemArray(
						FinderScolFormationGrade.getGradesForDomaineAndYear(ec,
								(EOScolFormationDomaine) this.eoObject,
								selectedYear), this);
			}

			return retour;
		}

		/*
		 * return buildEnsTreeItemArray(FinderScolFormationDomaine
		 * .getDisciplinesForDomaineAndYear(ec, (EOScolFormationDomaine)
		 * this.eoObject, selectedYear), this);
		 */
		if (this.eoObject instanceof EOScolFormationGrade) {
			if (libelleSearch != null) {

				EOQualifier qual = getQualifier(UELibSearch, ECLibSearch,
						APLibSearch, libelleSearch, DISCtoUE + ".",
						ERXQ.keyPath(DISCtoUE, UEtoEC) + ".",
						ERXQ.keyPath(DISCtoUE, UEtoAP) + ".");

				return buildEnsTreeItemArray(
						FinderScolFormationDomaine.getDisciplinesForDomaineGradeAndYear(
								ec, (EOScolFormationDomaine) this.getParent()
										.getEoObject(),
								(EOScolFormationGrade) this.getEoObject(),
								selectedYear, qual), this);
			} else {
				return buildEnsTreeItemArray(
						FinderScolFormationDomaine.getDisciplinesForDomaineGradeAndYear(
								ec, (EOScolFormationDomaine) this.getParent()
										.getEoObject(),
								(EOScolFormationGrade) this.getEoObject(),
								selectedYear), this);
			}
		}

		if (this.eoObject instanceof EOScolFormationDiscipline) {
			// buildEnsTreeItemArray(FinderScolFormationDiscipline.getDiplomesForDisciplineAndYear(ec,(EOScolFormationDiscipline)
			// this.eoObject,getSelectedYear()), this);

			if (libelleSearch != null) {

				EOQualifier qual = getQualifier(UELibSearch, ECLibSearch,
						APLibSearch, libelleSearch, DIPLtoUE + ".",
						ERXQ.keyPath(DIPLtoUE, UEtoEC) + ".",
						ERXQ.keyPath(DIPLtoUE, UEtoAP) + ".");

				return buildEnsTreeItemArray(
						FinderScolFormationDiplome
								.getDiplomesForDisciplineGradeAndYear(
										ec,
										(EOScolFormationDiscipline) this.eoObject,
										(EOScolFormationGrade) this.getParent()
												.getEoObject(),
										getSelectedYear(), qual), this);
			} else {
				return buildEnsTreeItemArray(
						FinderScolFormationDiplome.getDiplomesForDisciplineGradeAndYear(
								ec, (EOScolFormationDiscipline) this.eoObject,
								(EOScolFormationGrade) this.getParent()
										.getEoObject(), getSelectedYear()),
						this);
			}
		}

		if (this.eoObject instanceof EOScolFormationDiplome) {
			if (libelleSearch != null) {

				EOQualifier qual = getQualifier(UELibSearch, ECLibSearch,
						APLibSearch, libelleSearch, SPECtoUE + ".",
						ERXQ.keyPath(SPECtoUE, UEtoEC) + ".",
						ERXQ.keyPath(SPECtoUE, UEtoAP) + ".");

				EOQualifier qualDipl = EOQualifier
						.qualifierWithQualifierFormat(
								EOScolFormationSpecialisation.TO_FWK_SCOLARITE__SCOL_FORMATION_DIPLOME_KEY
										+ " = %@ ",
								new NSArray<EOScolFormationDiplome>(
										new EOScolFormationDiplome[] { (EOScolFormationDiplome) this.eoObject }));

				EOFetchSpecification fetchSpec = new EOFetchSpecification(
						EOScolFormationSpecialisation.ENTITY_NAME,
						new EOAndQualifier(new NSArray<EOQualifier>(
								new EOQualifier[] { qualDipl, qual })), null);
				fetchSpec.setUsesDistinct(true);
				fetchSpec.setIsDeep(true);
				return buildEnsTreeItemArray(
						ec.objectsWithFetchSpecification(fetchSpec), this);
			} else {
				return buildEnsTreeItemArray(
						((EOScolFormationDiplome) this.eoObject)
								.toFwkScolarite_ScolFormationSpecialisations(),
						this);
			}
		}

		if (this.eoObject instanceof EOScolFormationSpecialisation) {
			NSArray<EOScolMaquetteParcours> tmp = null;
			if (libelleSearch != null) {
				EOQualifier qual = getQualifier(UELibSearch, ECLibSearch,
						APLibSearch, libelleSearch, PARCtoUE + ".",
						ERXQ.keyPath(PARCtoUE, UEtoEC) + ".",
						ERXQ.keyPath(PARCtoUE, UEtoAP) + ".");

				EOQualifier qualDipl = EOQualifier
						.qualifierWithQualifierFormat(
								EOScolMaquetteParcours.TO_FWK_SCOLARITE__SCOL_FORMATION_SPECIALISATION_KEY
										+ " = %@ ",
								new NSArray<EOScolFormationSpecialisation>(
										new EOScolFormationSpecialisation[] { (EOScolFormationSpecialisation) this.eoObject }));

				EOFetchSpecification fetchSpec = new EOFetchSpecification(
						EOScolMaquetteParcours.ENTITY_NAME, new EOAndQualifier(
								new NSArray<EOQualifier>(new EOQualifier[] {
										qualDipl, qual })), null);
				fetchSpec.setUsesDistinct(true);
				fetchSpec.setIsDeep(true);

				tmp = ec.objectsWithFetchSpecification(fetchSpec);

			} else {
				tmp = ((EOScolFormationSpecialisation) this.eoObject)
						.toFwkScolarite_ScolMaquetteParcourss();
			}
			if (tmp.count() > 1)// si il y a plusieurs parcours on retourne les
				// parcours
				return buildEnsTreeItemArray(tmp, this);
			else {
				// sinon on retourne directement les semestres du parcours
				// unique
				if (libelleSearch != null) {

					EOQualifier qual = getQualifier(UELibSearch, ECLibSearch,
							APLibSearch, libelleSearch, SEMtoUE + ".",
							ERXQ.keyPath(SEMtoUE, UEtoEC) + ".",
							ERXQ.keyPath(SEMtoUE, UEtoAP) + ".");

					return buildEnsTreeItemArray(
							FinderScolMaquetteParcours.getSemestresForParcoursAndYear(
									ec,
									(EOScolMaquetteParcours) tmp.lastObject(),
									getSelectedYear(), qual), this);
				} else {
					return buildEnsTreeItemArray(
							FinderScolMaquetteParcours.getSemestresForParcoursAndYear(
									ec,
									(EOScolMaquetteParcours) tmp.lastObject(),
									getSelectedYear()), this);
				}
			}
		}

		if (this.eoObject instanceof EOScolMaquetteParcours) {
			if (libelleSearch != null) {

				EOQualifier qual = getQualifier(UELibSearch, ECLibSearch,
						APLibSearch, libelleSearch, SEMtoUE + ".",
						ERXQ.keyPath(SEMtoUE, UEtoEC) + ".",
						ERXQ.keyPath(SEMtoUE, UEtoAP) + ".");

				return buildEnsTreeItemArray(
						FinderScolMaquetteParcours.getSemestresForParcoursAndYear(
								ec, (EOScolMaquetteParcours) this.eoObject,
								getSelectedYear(), qual), this);
			} else {
				return buildEnsTreeItemArray(
						FinderScolMaquetteParcours.getSemestresForParcoursAndYear(
								ec, (EOScolMaquetteParcours) this.eoObject,
								getSelectedYear()), this);
			}
		}

		if (this.eoObject instanceof EOScolMaquetteSemestre) {
			if (libelleSearch != null) {

				EOQualifier qual = getQualifier(UELibSearch, ECLibSearch,
						APLibSearch, libelleSearch, "", UEtoEC + ".", UEtoAP
								+ ".");
				return buildEnsTreeItemArray(
						FinderScolMaquetteSemestre.getUeForSemestreAndYear(ec,
								(EOScolMaquetteSemestre) this.eoObject,
								getSelectedYear(), qual), this);
			} else {
				return buildEnsTreeItemArray(
						FinderScolMaquetteSemestre.getUeForSemestreAndYear(ec,
								(EOScolMaquetteSemestre) this.eoObject,
								getSelectedYear()), this);
			}
		}

		if (this.eoObject instanceof EOScolMaquetteUe) {
			if (libelleSearch != null) {

				EOQualifier qual = getQualifier(false, ECLibSearch,
						APLibSearch, libelleSearch, "", "", ECtoAP + ".");

				return buildEnsTreeItemArray(
						FinderScolMaquetteUe.getEcForUeAndYear(ec,
								(EOScolMaquetteUe) this.eoObject,
								getSelectedYear(), qual), this);
			} else {
				return buildEnsTreeItemArray(
						FinderScolMaquetteUe.getEcForUeAndYear(ec,
								(EOScolMaquetteUe) this.eoObject,
								getSelectedYear()), this);
			}
		}

		if (this.eoObject instanceof EOScolMaquetteEc)
			if ((libelleSearch != null) && (APLibSearch)) {
				EOQualifier qual = getQualifier(false, false, APLibSearch,
						libelleSearch, "", "", "");
				return buildEnsTreeItemArray(
						FinderScolMaquetteEc.getApForEcAndYear(ec,
								(EOScolMaquetteEc) this.eoObject,
								getSelectedYear(), qual), this);
			} else {
				return buildEnsTreeItemArray(
						FinderScolMaquetteEc.getApForEcAndYear(ec,
								(EOScolMaquetteEc) this.eoObject,
								getSelectedYear()), this);
			}

		if (this.eoObject instanceof EOScolMaquetteAp) {

			return buildEnsTreeItemArray(FinderScolMaquetteAp.getGroupeForAp(
					ec, (EOScolMaquetteAp) this.eoObject), this);
		}

		return null;
	}

	public static EOQualifier getQualifier(boolean UELibSearch,
			boolean ECLibSearch, boolean APLibSearch, String libelleSearch,
			String prefixToUE, String prefixToEC, String prefixToAP) {
		String str = "";
		libelleSearch = libelleSearch.trim().replaceAll(" ", "")
				.replaceAll(",", "*");
		NSMutableArray<String> keysQual = new NSMutableArray<String>();
		if (UELibSearch) {
			str = "(" + prefixToUE + EOScolMaquetteUe.MUE_LIBELLE_KEY
					+ " caseInsensitiveLike %s OR " + prefixToUE
					+ EOScolMaquetteUe.MUE_CODE_KEY
					+ " caseInsensitiveLike %s )";
			keysQual.addObjectsFromArray(new NSArray<String>(new String[] {
					"*" + libelleSearch + "*", "*" + libelleSearch + "*" }));
		}
		if (ECLibSearch) {
			if (!"".equals(str))
				str += " OR ";
			str += "(" + prefixToEC + EOScolMaquetteEc.MEC_LIBELLE_KEY
					+ " caseInsensitiveLike %s OR " + prefixToEC
					+ EOScolMaquetteEc.MEC_CODE_KEY
					+ " caseInsensitiveLike %s OR " + prefixToEC
					+ EOScolMaquetteEc.MEC_LIBELLE_COURT_KEY
					+ " caseInsensitiveLike %s )";

			keysQual.addObjectsFromArray(new NSArray<String>(new String[] {
					"*" + libelleSearch + "*", "*" + libelleSearch + "*",
					"*" + libelleSearch + "*" }));
		}
		if (APLibSearch) {
			if (!"".equals(str))
				str += " OR ";
			str += "(" + prefixToAP + EOScolMaquetteAp.MAP_LIBELLE_KEY
					+ " caseInsensitiveLike %s )";

			keysQual.addObjectsFromArray(new NSArray<String>(new String[] { "*"
					+ libelleSearch + "*" }));

		}

		EOQualifier qual = EOQualifier.qualifierWithQualifierFormat(str,
				keysQual);

		//System.out.println(qual);
		return qual;
	}

	public String getLibelle() {
		return treeDelegate().getLibelle(
				(this.itemObject != null ? this.itemObject : this.eoObject));
	}

	public EOGenericRecord getEoObject() {
		return eoObject;
	}

	public void setEoObject(EOGenericRecord eoObject) {
		this.eoObject = eoObject;
	}

	public EnsTreeItem getParent() {
		return parent;
	}

	public void setParent(EnsTreeItem parent) {
		this.parent = parent;
	}

	public EOScolFormationAnnee getSelectedYear() {
		return selectedYear;
	}

	public void setSelectedYear(EOScolFormationAnnee selectedYear) {
		this.selectedYear = selectedYear;
	}

	public static <T extends Object> NSArray<EnsTreeItem> buildEnsTreeItemArray(
			NSArray<T> lst, EnsTreeItem parent) {

		if (lst == null)
			return null;

		NSMutableArray<EnsTreeItem> retour = new NSMutableArray<EnsTreeItem>();
		Iterator<T> it = lst.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof EOGenericRecord) {
				EOGenericRecord eoObj = (EOGenericRecord) obj;
				retour.add(new EnsTreeItem(parent.treeDelegate(), eoObj,
						parent, (parent != null) ? parent.selectedYear : null));
			} else {
				retour.add(new EnsTreeItem(parent.treeDelegate(), null, obj,
						parent, (parent != null) ? parent.selectedYear : null));
			}
		}

		return retour;
	}

	public NSArray<EnsTreeItem> getChilds() {
		if (this.childs == null) {
			EOEditingContext ec = (this.eoObject != null ? this.eoObject
					.editingContext() : new EOEditingContext());
			setChilds(getChilds(ec));
		}
		return childs;
	}

	public boolean isNotChilds() {
		return this.childs == null;
	}

	public NSArray<EnsTreeItem> getChilds(String Libelle, boolean UELibSearch,
			boolean ECLibSearch, boolean APLibSearch) {
		if (this.childs == null) {
			EOEditingContext ec = (this.eoObject != null ? this.eoObject
					.editingContext() : new EOEditingContext());
			setChilds(getChilds(ec, Libelle, UELibSearch, ECLibSearch,
					APLibSearch));
		}
		return childs;
	}

	public void setChilds(NSArray<EnsTreeItem> childs) {
		this.childs = childs;
	}

	public Object getItemObject() {
		return itemObject;
	}

	public void setItemObject(Object itemObject) {
		this.itemObject = itemObject;
	}

}
