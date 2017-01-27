package org.cocktail.superplaner.serveur.components;

import java.util.UUID;

import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolFormationAnnee;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteSemestre;
import org.cocktail.scolaritemodulesfwk.serveur.components.DiplomePicker;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;

import er.extensions.foundation.ERXStringUtilities;

public class DiplomePickerWithSemestre extends DiplomePicker {

	private static final long serialVersionUID = 1L;
	private EOScolMaquetteSemestre selectedSemestre;
	private EOScolMaquetteSemestre SemestreItem;
	private NSArray<EOScolMaquetteSemestre> lstSemestre;

	private EOScolFormationAnnee annee;
	
	private String SemestreId;
	public static final String BINDING_selectedSemestre = "selectedSemestre";

	public DiplomePickerWithSemestre(WOContext context) {
		super(context);		
		SemestreId = ERXStringUtilities.safeIdentifierName("grades"
				+ UUID.randomUUID());
	}
	

	public WOActionResults specChange() {
		 if (getDelegate().selectedSpec() != null)
			lstSemestre =  getDelegate().lstHabForSpec(selectedSpec());

		// if (getDelegate().selectedDiplome() != null)
		//	 lstSemestre =  lstSpecHabForDip(getDelegate().selectedDiplome());
		/*
		 * FinderScolFormationDiplome.getSpecialisationForDiplomes(
		 * editingContext(), selectedDiplome); //
		 */
		else {
			lstSemestre = null;
		}
//		 System.out.println(" ----------> " + lstSemestre.count());

		for (EOScolMaquetteSemestre eoScolFormationSemestre : lstSemestre) {
			System.out.println("Semestre : " + eoScolFormationSemestre.toString());
		}

		return null;
	}

	public String getSemestreId() {
		return SemestreId;
	}


	public void setSemestreId(String SemestreId) {
		this.SemestreId = SemestreId;
	}

	public EOScolMaquetteSemestre selectedSemestre() {
		selectedSemestre = (EOScolMaquetteSemestre) valueForBinding(BINDING_selectedSemestre);
		return selectedSemestre;
	}

	public void setSelectedSemestre(EOScolMaquetteSemestre Semestre) {
		selectedSemestre = Semestre;
		setValueForBinding(Semestre, BINDING_selectedSemestre);
	}
	
	public NSArray<EOScolMaquetteSemestre> lstSemestre() {
		if ((lstSemestre == null) && (selectedSpec() != null))
			specChange();
		return lstSemestre;
	}

	public EOScolMaquetteSemestre getSemestreItem() {
		return SemestreItem;
	}

	public void setSemestreItem(EOScolMaquetteSemestre SemestreItem) {
		this.SemestreItem = SemestreItem;
	}

	public boolean isSpecSelected() {
		System.out.println("selectedSpec : " + getDelegate().selectedSpec());
		return getDelegate().selectedSpec() != null;
	}

	public boolean isHabSelected() {
		return selectedSemestre != null;
	}

	public WOActionResults SemestreChange() {
		return null;
	}
}
