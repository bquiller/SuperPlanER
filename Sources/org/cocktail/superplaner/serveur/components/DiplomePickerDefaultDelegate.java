package org.cocktail.superplaner.serveur.components;

import org.cocktail.scolaritefwk.serveur.finder.FinderScolFormationDiplome;
import org.cocktail.scolaritefwk.serveur.finder.FinderScolFormationDomaine;
import org.cocktail.scolaritefwk.serveur.finder.FinderScolFormationGrade;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationAnnee;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationDiplome;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationDomaine;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationGrade;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteParcours;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionSem;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteSemestre;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationSpecialisation;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

/**
 * Delegué par défaut du composent DiplomePicker.<br>
 * Surcharger cette class pour ne pas avoir les listes retournées par défaut.<br>
 * Lors de l'utilisation d'un DiplomePicker, si aucun délégué n'est donné, une
 * instance de DiplomePickerDefaultDelegate sera utilisée.
 * 
 * @author jlmatas
 * 
 */
public class DiplomePickerDefaultDelegate {
	private EOEditingContext ec;
	private EOScolFormationAnnee year;

	public DiplomePickerDefaultDelegate(EOEditingContext ec,
			EOScolFormationAnnee year) {
		super();
		this.ec = ec;
		this.year = year;
	}

	/**
	 * @return the lstDomaines
	 */
	public NSArray<EOScolFormationDomaine> lstDomaines() {		
		@SuppressWarnings("unchecked")
		NSArray<EOScolFormationDomaine> tmp = FinderScolFormationDomaine
		.getScolFormationDomainesValidesFiltre(ec, "*");
		NSMutableArray<EOScolFormationDomaine> retour = new NSMutableArray<EOScolFormationDomaine>();
		NSArray<EOScolFormationDiplome> dipl = null;

		for (EOScolFormationDomaine domOccur : tmp) {

			dipl = FinderScolFormationDiplome.getDiplomesForDomaineAndYear(ec,
					domOccur, year);
			if ((dipl != null) && (dipl.size() > 0))
				retour.addObject(domOccur);
		}		
		return retour;
	}

	/**
	 * retourne la liste des grades pour le domaine selected
	 * 
	 * @param selectedDomaine
	 * @return
	 */
	public NSArray<EOScolFormationGrade> lstGrades(
			EOScolFormationDomaine selectedDomaine) {
		return FinderScolFormationGrade.getGradesForDomaineAndYear(ec,
				selectedDomaine, year);
	}

	/**
	 * 
	 * @return liste diplomes pour le domaine selected
	 */
	public NSArray<EOScolFormationDiplome> lstDiplomes(
			EOScolFormationDomaine selectedDomaine) {
		return FinderScolFormationDiplome.getDiplomesForDomaineAndYear(ec,
				selectedDomaine, year);

	}

	/**
	 * 
	 * @return liste diplomes pour le domaine selected
	 */
	public NSArray<EOScolFormationDiplome> lstDiplomes(
			EOScolFormationDomaine selectedDomaine,
			EOScolFormationGrade selectedGrade) {
		return FinderScolFormationDiplome.getDiplomesForDomaineGradeAndYear(ec,
				selectedDomaine, selectedGrade, year);

	}

	/**
	 * 
	 * @return liste diplomes
	 */
	@SuppressWarnings("unchecked")
	public NSArray<EOScolFormationDiplome> lstDiplomes() {
		EOQualifier qual = EOQualifier
				.qualifierWithQualifierFormat(
						EOScolFormationDiplome.TO_FWK_SCOLARITE__SCOL_FORMATION_SPECIALISATIONS_KEY
						+ "."
						+ EOScolFormationSpecialisation.TO_FWK_SCOLARITE__SCOL_FORMATION_HABILITATIONS_KEY
						+ "."
						+ EOScolMaquetteSemestre.TO_FWK_SCOLARITE__SCOL_FORMATION_ANNEE_KEY
						+ " = %@ ", new NSArray<Object>(
								new Object[] { year }));

		NSArray<EOSortOrdering> sort = new NSArray<EOSortOrdering>(
				new EOSortOrdering[] { new EOSortOrdering(
						EOScolFormationDiplome.FDIP_LIBELLE_KEY,
						EOSortOrdering.CompareCaseInsensitiveAscending) });
		return EOScolFormationDiplome.fetchAll(ec, qual, sort);
	}

	@SuppressWarnings("unchecked")
	public NSArray<EOScolFormationSpecialisation> lstSpecForDipl(
			EOScolFormationDiplome diplome) {
		return diplome.toFwkScolarite_ScolFormationSpecialisations();
	}

	@SuppressWarnings("unchecked")
	public NSArray<EOScolMaquetteSemestre> lstHabForSpec(
			EOScolFormationSpecialisation specialite) {
		EOQualifier qual = EOQualifier
				.qualifierWithQualifierFormat(
						EOScolMaquetteSemestre.TO_FWK_SCOLARITE__SCOL_MAQUETTE_REPARTITION_SEMS_KEY 
						+ "."
						+ EOScolMaquetteRepartitionSem.TO_FWK_SCOLARITE__SCOL_MAQUETTE_PARCOURS_KEY
						+ "."
						+ EOScolMaquetteParcours.FSPN_KEY_KEY + " = %@ AND "
						+ EOScolMaquetteSemestre.FANN_KEY_KEY + " = %@", 
						new NSArray<Object>(
								new Object[] { specialite.fspnKey(), year.fannKey() }));

		System.out.println(qual.toString());

		NSArray<EOSortOrdering> sort = new NSArray<EOSortOrdering>(
				new EOSortOrdering[] { new EOSortOrdering(
						EOScolMaquetteSemestre.MSEM_ORDRE_KEY,
						EOSortOrdering.CompareCaseInsensitiveAscending) });
		return EOScolMaquetteSemestre.fetchAll(ec, qual, sort);

		//		return specialite.toFwkScolarite_ScolFormationHabilitations();
	}

	public EOEditingContext getEc() {
		return ec;
	}

	public void setEc(EOEditingContext ec) {
		this.ec = ec;
	}

	public EOScolFormationAnnee getYear() {
		return year;
	}

	public void setYear(EOScolFormationAnnee year) {
		this.year = year;
	}

	private EOScolFormationDiplome selectedDiplome;

	/**
	 * @return the selectedDiplome
	 */
	public EOScolFormationDiplome selectedDiplome() {
		return selectedDiplome;
	}

	/**
	 * @param selectedDiplome
	 *            the selectedDiplome to set
	 */
	public void setSelectedDiplome(EOScolFormationDiplome selectedDiplome) {
		this.selectedDiplome = selectedDiplome;
	}

	private EOScolFormationDomaine selectedDomaine;

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
	}

	private EOScolFormationSpecialisation selectedSpec;

	/**
	 * @return the selectedSpec
	 */
	public EOScolFormationSpecialisation selectedSpec() {
		return selectedSpec;
	}

	/**
	 * @param selectedSpec
	 *            the selectedSpec to set
	 */
	public void setSelectedSpec(EOScolFormationSpecialisation selectedSpec) {
		this.selectedSpec = selectedSpec;
	}

	private EOScolFormationGrade selectedGrade;

	/**
	 * @return the selectedGrade
	 */
	public EOScolFormationGrade selectedGrade() {
		return selectedGrade;
	}

	/**
	 * @param selectedGrade
	 *            the selectedGrade to set
	 */
	public void setSelectedGrade(EOScolFormationGrade selectedGrade) {
		this.selectedGrade = selectedGrade;
	}

}
