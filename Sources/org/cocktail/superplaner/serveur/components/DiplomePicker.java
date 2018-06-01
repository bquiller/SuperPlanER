package org.cocktail.superplaner.serveur.components;

import java.util.UUID;

import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationAnnee;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationDiplome;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationDomaine;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationGrade;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationSpecialisation;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;

import er.extensions.foundation.ERXStringUtilities;

/**
 * Composant permettant la saisie d'un diplome et ou spécialisation en 3 étapes.<br>
 * Choix du domaine puis choix du diplome et éventuellement choix de la
 * spécialisation.<br>
 * Les bindings possibles sont : selectedDomaine, selectedDiplome, selectedSpec.<br>
 * selectedYear : l'année universitaire delegate : sous classe de
 * DiplomePickerDefaultDelegate, si non renseigné, une instance de
 * DiplomePickerDefaultDelegate sera utilisée par défaut.<br>
 * editingContext : EOEditingContext a utiliser, si non renseigné, le
 * session().defaultEditingContext() sera utilisé.<br>
 * isSpecSelect : boolean indiquant si on descend jusqu'a la spécification, true
 * par défaut.
 * 
 * @author jlmatas
 * 
 */
public class DiplomePicker extends WOComponent {

	private static final long serialVersionUID = -4342169612132427326L;

	private static final String BND_SELECTED_DOMAINE = "selectedDomaine";
	private static final String BND_SELECTED_DIPLOME = "selectedDiplome";
	private static final String BND_SELECTED_SPEC = "selectedSpec";
	private static final String BND_SELECTED_YEAR = "selectedYear";
	private static final String BND_SELECTED_GRADE = "selectedGrade";
	private static final String BND_DELEGATE = "delegate";
	private static final String BND_IS_SPEC_SELECT = "isSpecSelect";
	private static final String BND_IS_GRADE_SELECT = "isGradeSelect";
	private static final String BND_EC = "editingContext";
	private EOScolFormationDomaine domaineOccur;
	private EOScolFormationDomaine selectedDomaine;
	private NSArray<EOScolFormationDomaine> lstDomaines;
	private NSArray<EOScolFormationDiplome> lstDiplomes;
	private NSArray<EOScolFormationDiplome> lstAllDiplomes;
	private NSArray<EOScolFormationGrade> lstGrades;
	private DiplomePickerDefaultDelegate delegate;
	private EOScolFormationDiplome selectedDiplome;
	private EOScolFormationSpecialisation selectedSpec;
	private EOScolFormationGrade selectedGrade;

	private String gradesId;

	public DiplomePicker(WOContext context) {
		super(context);
		domaineId = ERXStringUtilities.safeIdentifierName("domaine"
				+ UUID.randomUUID());
		diplomesId = ERXStringUtilities.safeIdentifierName("diplome"
				+ UUID.randomUUID());
		specId = ERXStringUtilities.safeIdentifierName("spec"
				+ UUID.randomUUID());
		gradesId = ERXStringUtilities.safeIdentifierName("grades"
				+ UUID.randomUUID());
	}

	/**
	 * @return the lstDomaines
	 */
	public NSArray<EOScolFormationDomaine> lstDomaines() {

		if (lstDomaines == null) {
			lstDomaines = getDelegate().lstDomaines();
			/*
			 * FinderScolFormationDomaine.fetchLicence1Domaines(
			 * editingContext(), selectedYear); //
			 */
		}

		return lstDomaines;
	}

	/**
	 * @param lstDomaines
	 *            the lstDomaines to set
	 */
	public void setLstDomaines(NSArray<EOScolFormationDomaine> lstDomaines) {
		this.lstDomaines = lstDomaines;
	}

	/**
	 * @return the domaineOccur
	 */
	public EOScolFormationDomaine domaineOccur() {
		return domaineOccur;
	}

	/**
	 * @param domaineOccur
	 *            the domaineOccur to set
	 */
	public void setDomaineOccur(EOScolFormationDomaine domaineOccur) {
		this.domaineOccur = domaineOccur;
	}

	/**
	 * @return the selectedDomaine
	 */
	public EOScolFormationDomaine selectedDomaine() {

		if ((hasBinding(BND_SELECTED_DOMAINE))) {
			setSelectedDomaine((EOScolFormationDomaine) valueForBinding(BND_SELECTED_DOMAINE));
		} else

		if (/* (selectedDomaine == null) && */(selectedDiplome() != null)) {
			setSelectedDomaine(selectedDiplome()
					.toFwkScolarite_ScolFormationDomaine());

		}

		return selectedDomaine;
	}

	/**
	 * @param selectedDomaine
	 *            the selectedDomaine to set
	 */
	public void setSelectedDomaine(EOScolFormationDomaine selectedDomaine) {

		if (selectedDomaine == null) {
			setSelectedDiplome(null);
			setSelectedSpec(null);
		}
		this.selectedDomaine = selectedDomaine;
		setValueForBinding(selectedDomaine, BND_SELECTED_DOMAINE);
		domaineChange();
	}

	public EOEditingContext editingContext() {
		if (hasBinding(BND_EC))
			return (EOEditingContext) valueForBinding(BND_EC);
		return session().defaultEditingContext();
	}

	public void setEditingContext(EOEditingContext editingContext) {
		setValueForBinding(editingContext, BND_EC);
	}

	public WOActionResults domaineChangeAction() {
		domaineChange();
		setSelectedDiplome(null);
		setSelectedGrade(null);
		lstSpec = null;
		setSelectedSpec(null);
		return null;
	}

	private void domaineChange() {

		if (selectedDomaine != null) {
			lstGrades = getDelegate().lstGrades(selectedDomaine);

			if (isGrades()) {

			} else {
				lstDiplomes = getDelegate().lstDiplomes(selectedDomaine);
			}

		} else {
			lstDiplomes = null;
			// System.out.println("domainenull");
			lstGrades = null;
			selectedGrade = null;
		}

		if (isGrades()) {
			if (!((selectedGrade() != null) && (lstGrades()
					.contains(selectedGrade())))) {
				setSelectedGrade(null);
			}
		}

		if (!((selectedDiplome() != null) && (lstDiplomes()
				.contains(selectedDiplome())))) {
			if ((isGrades()) && (selectedDiplome() != null)
					&& (lstDiplomes() != null)) {
				setSelectedGrade(null);
			}
			setSelectedDiplome(null);
		}

		if (!((selectedSpec() != null) && (lstSpec().contains(selectedSpec())))) {
			lstSpec = null;
			setSelectedSpec(null);
		}

	}

	public WOActionResults gradeChangeAction() {
		gradeChange();
		setSelectedDiplome(null);
		lstSpec = null;
		setSelectedSpec(null);
		return null;
	}

	private void gradeChange() {
		if (selectedGrade != null) {
			lstDiplomes = getDelegate().lstDiplomes(selectedDomaine,
					selectedGrade);

		} else {
			lstDiplomes = null;

		}
		if (!((selectedGrade() != null) && (lstGrades()
				.contains(selectedGrade())))) {
			setSelectedGrade(null);
		}

		if (!((selectedSpec() != null) && (lstSpec().contains(selectedSpec())))) {
			lstSpec = null;
			setSelectedSpec(null);
		}
	}

	public NSArray<EOScolFormationGrade> lstGrades() {
		if ((lstGrades == null) && (selectedDomaine() != null))
			domaineChange();
		return lstGrades;
	}

	public NSArray<EOScolFormationDiplome> lstDiplomes() {
		if ((lstDiplomes == null) && (selectedGrade() != null))
			gradeChange();
		else if ((lstDiplomes == null) && (selectedDomaine() != null))
			domaineChange();
		return lstDiplomes;
	}

	public void setLstDiplomes(NSArray<EOScolFormationDiplome> lstDiplomes) {
		this.lstDiplomes = lstDiplomes;
	}

	public NSArray<EOScolFormationDiplome> getLstAllDiplomes() {
		if (lstAllDiplomes == null) {
			lstAllDiplomes = getDelegate().lstDiplomes();
			/*
			 * FinderScolFormationDiplome
			 * .fetchLicence1DiplomesForYear(editingContext(), selectedYear); //
			 */
		}
		return lstAllDiplomes;
	}

	private EOScolFormationDiplome diplomeOccur;

	/**
	 * @return the diplomeOccur
	 */
	public EOScolFormationDiplome diplomeOccur() {
		return diplomeOccur;
	}

	/**
	 * @param diplomeOccur
	 *            the diplomeOccur to set
	 */
	public void setDiplomeOccur(EOScolFormationDiplome diplomeOccur) {
		this.diplomeOccur = diplomeOccur;
	}

	/**
	 * @return the selectedDiplome
	 */
	public EOScolFormationDiplome selectedDiplome() {

		if ((hasBinding(BND_SELECTED_DIPLOME))) {
			if ((valueForBinding(BND_SELECTED_DIPLOME) != null)
					&& (!valueForBinding(BND_SELECTED_DIPLOME).equals(
							selectedDiplome)))
				lstSpec = null;
			selectedDiplome = ((EOScolFormationDiplome) valueForBinding(BND_SELECTED_DIPLOME));
		} else if (/* (selectedDiplome == null) && */(selectedSpec() != null))
			selectedDiplome = selectedSpec()
					.toFwkScolarite_ScolFormationDiplome();

		return selectedDiplome;
	}

	/**
	 * @param selectedDiplome
	 *            the selectedDiplome to set
	 */
	public void setSelectedDiplome(EOScolFormationDiplome selectedDiplome) {

		if (selectedDiplome == null) {
			setSelectedSpec(null);
		} else {
			if (!(selectedDiplome.toFwkScolarite_ScolFormationDomaine()
					.equals(selectedDomaine)))
				setSelectedDomaine(selectedDiplome
						.toFwkScolarite_ScolFormationDomaine());
		}

		this.selectedDiplome = selectedDiplome;
		setValueForBinding(selectedDiplome, BND_SELECTED_DIPLOME);
	}

	private NSArray<EOScolFormationSpecialisation> lstSpec;

	/**
	 * @return the lstSpec
	 */
	public NSArray<EOScolFormationSpecialisation> lstSpec() {
		if ((lstSpec == null) && (selectedDiplome() != null))
			diplomeChange();
		return lstSpec;
	}

	/**
	 * @param lstSpec
	 *            the lstSpec to set
	 */
	public void setLstSpec(NSArray<EOScolFormationSpecialisation> lstSpec) {
		this.lstSpec = lstSpec;
	}

	private EOScolFormationSpecialisation specOccur;

	/**
	 * @return the specOccur
	 */
	public EOScolFormationSpecialisation specOccur() {
		return specOccur;
	}

	/**
	 * @param specOccur
	 *            the specOccur to set
	 */
	public void setSpecOccur(EOScolFormationSpecialisation specOccur) {
		this.specOccur = specOccur;
	}

	/**
	 * @return the selectedSpec
	 */
	public EOScolFormationSpecialisation selectedSpec() {
		if ((hasBinding(BND_SELECTED_SPEC)))
			selectedSpec = ((EOScolFormationSpecialisation) valueForBinding(BND_SELECTED_SPEC));

		return selectedSpec;
	}

	/**
	 * @param selectedSpec
	 *            the selectedSpec to set
	 */
	public void setSelectedSpec(EOScolFormationSpecialisation selectedSpec) {

		this.selectedSpec = selectedSpec;
		setValueForBinding(selectedSpec, BND_SELECTED_SPEC);

	}

	public WOActionResults diplomeChange() {
		if (selectedDiplome() != null)
			lstSpec = getDelegate().lstSpecForDipl(selectedDiplome());
		/*
		 * FinderScolFormationDiplome.getSpecialisationForDiplomes(
		 * editingContext(), selectedDiplome); //
		 */
		else {
			lstSpec = null;
		}

		if (!((selectedSpec() != null) && (lstSpec().contains(selectedSpec())))) {
			setSelectedSpec(null);
		}

		return null;
	}

	public boolean isDomaineSelected() {
		return selectedDomaine() != null;
	}

	public boolean isDiplomeSelected() {
		return selectedDiplome() != null;
	}

	public EOScolFormationAnnee getSelectedYear() {
		return (EOScolFormationAnnee) valueForBinding(BND_SELECTED_YEAR);
	}

	public void setSelectedYear(EOScolFormationAnnee selectedYear) {
		setValueForBinding(selectedYear, BND_SELECTED_YEAR);
	}

	private String domaineId;

	/**
	 * @return the domaineId
	 */
	public String domaineId() {
		return domaineId;
	}

	/**
	 * @param domaineId
	 *            the domaineId to set
	 */
	public void setDomaineId(String domaineId) {
		this.domaineId = domaineId;
	}

	private String diplomesId;

	/**
	 * @return the diplomesId
	 */
	public String diplomesId() {
		return diplomesId;
	}

	/**
	 * @param diplomesId
	 *            the diplomesId to set
	 */
	public void setDiplomesId(String diplomesId) {
		this.diplomesId = diplomesId;
	}

	private String specId;

	/**
	 * @return the specId
	 */
	public String specId() {
		return specId;
	}

	/**
	 * @param specId
	 *            the specId to set
	 */
	public void setSpecId(String specId) {
		this.specId = specId;
	}

	/**
	 * @return the isSpecSelect permet de choisir ou non la specialisation
	 */
	public boolean isSpecSelect() {
		if (hasBinding(BND_IS_SPEC_SELECT))
			return (Boolean) valueForBinding(BND_IS_SPEC_SELECT);
		return lstSpec != null && !lstSpec.isEmpty();
	}

	/**
	 * @return the isGradeSelect permet de choisir ou non le grade
	 */
	public boolean isGradeSelect() {
		if (hasBinding(BND_IS_GRADE_SELECT))
			return (Boolean) valueForBinding(BND_IS_GRADE_SELECT);
		return false;
	}

	/**
	 * @param isSpecSelect
	 *            the isSpecSelect to set
	 */
	public void setGradeSelect(boolean isGradeSelect) {
		setValueForBinding(isGradeSelect, BND_IS_GRADE_SELECT);
	}

	/**
	 * @param isSpecSelect
	 *            the isSpecSelect to set
	 */
	public void setSpecSelect(boolean isSpecSelect) {
		setValueForBinding(isSpecSelect, BND_IS_SPEC_SELECT);
	}

	public DiplomePickerDefaultDelegate getDelegate() {

		if ((hasBinding(BND_DELEGATE))
				&& (valueForBinding(BND_DELEGATE) != null))
			delegate = (DiplomePickerDefaultDelegate) valueForBinding(BND_DELEGATE);
		if (delegate == null) {
			delegate = new DiplomePickerDefaultDelegate(editingContext(),
					getSelectedYear());

		}

		return delegate;
	}

	public void setDelegate(DiplomePickerDefaultDelegate delegate) {
		this.delegate = delegate;
		setValueForBinding(delegate, BND_DELEGATE);
	}

	@Override
	public boolean synchronizesVariablesWithBindings() {
		return false;
	}

	public String getGradesId() {
		return gradesId;
	}

	public void setGradesId(String gradesId) {
		this.gradesId = gradesId;
	}

	public boolean isGrades() {
		return (isGradeSelect() && (lstGrades != null) && (lstGrades.size() > 0));
	}

	public EOScolFormationGrade selectedGrade() {
		if ((hasBinding(BND_SELECTED_GRADE))) {
			if ((valueForBinding(BND_SELECTED_GRADE) != null)
					&& (!valueForBinding(BND_SELECTED_GRADE).equals(
							selectedGrade)))
				lstDiplomes = null;
			selectedGrade = ((EOScolFormationGrade) valueForBinding(BND_SELECTED_GRADE));
		} else if ((selectedDiplome != null))
			selectedGrade = selectedDiplome.toFwkScolarite_ScolFormationGrade();
		return selectedGrade;
	}

	public void setSelectedGrade(EOScolFormationGrade selectedGrade) {
		if (selectedGrade == null) {
			setSelectedDiplome(null);
		}

		this.selectedGrade = selectedGrade;
		setValueForBinding(selectedGrade, BND_SELECTED_GRADE);

	}

	private EOScolFormationGrade gradeOccur;

	/**
	 * @return the gradeOccur
	 */
	public EOScolFormationGrade gradeOccur() {
		return gradeOccur;
	}

	/**
	 * @param gradeOccur
	 *            the gradeOccur to set
	 */
	public void setGradeOccur(EOScolFormationGrade gradeOccur) {
		this.gradeOccur = gradeOccur;
	}

	public boolean isDiplome() {
		return ((lstDiplomes != null) && (lstDiplomes.size() > 0));
	}

	public String libDiplome() {
		return diplomeOccur.fdipAbreviation() != null ? diplomeOccur
				.fdipAbreviation() : diplomeOccur.fdipLibelle();
	}

	public String libSpec() {
		if (specOccur.fspnAbreviation() != null) return specOccur.fspnAbreviation();
		else if (specOccur.fspnLibelle() != null) return specOccur.fspnLibelle();
		else return selectedDiplome.fdipAbreviation() != null ? selectedDiplome
				.fdipAbreviation() : selectedDiplome.fdipLibelle();
	}

}