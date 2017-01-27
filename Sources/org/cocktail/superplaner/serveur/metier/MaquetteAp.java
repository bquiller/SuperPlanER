/*
 * Copyright Cocktail, 2001-2008
 * 
 * This software is governed by the CeCILL license under French law and abiding by the rules of distribution of free software. You can use,
 * modify and/or redistribute the software under the terms of the CeCILL license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info".
 * 
 * As a counterpart to the access to the source code and rights to copy, modify and redistribute granted by the license, users are provided
 * only with a limited warranty and the software's author, the holder of the economic rights, and the successive licensors have only limited
 * liability.
 * 
 * In this respect, the user's attention is drawn to the risks associated with loading, using, modifying and/or developing or reproducing
 * the software by the user in light of its specific status of free software, that may mean that it is complicated to manipulate, and that
 * also therefore means that it is reserved for developers and experienced professionals having in-depth computer knowledge. Users are
 * therefore encouraged to load and test the software's suitability as regards their requirements in conditions enabling the security of
 * their systems and/or data to be ensured and, more generally, to use and operate it in the same conditions as regards security.
 * 
 * The fact that you are presently reading this means that you have had knowledge of the CeCILL license and that you accept its terms.
 */

package org.cocktail.superplaner.serveur.metier;

import java.math.BigDecimal;
import java.util.Enumeration;

import org.cocktail.superplaner.serveur.IMaquetteAp;
import org.cocktail.superplaner.utils.Utilities;

import com.webobjects.foundation.NSValidation;

public class MaquetteAp extends _MaquetteAp implements IMaquetteAp {

	public static final String TOTAL_RESERVE = "totalReserve";

	public MaquetteAp() {
		super();
	}

	public String toString() {
		return mapLibelle();
	}

	public String colorCode() {
		return null;
	}

	public BigDecimal totalReserve() {
		int total = 0;
		if (reservationAps() != null) {
			Enumeration<ReservationAp> enumReservationAp = reservationAps().objectEnumerator();
			while (enumReservationAp.hasMoreElements()) {
				ReservationAp resaAp = enumReservationAp.nextElement();
				if (resaAp.periodicites() != null) {
					Enumeration<Periodicite> enumPeriodicite = resaAp.periodicites().objectEnumerator();
					while (enumPeriodicite.hasMoreElements()) {
						Periodicite periodicite = enumPeriodicite.nextElement();
						total += Utilities.minutesSeparatingDates(periodicite.dateDeb(), periodicite.dateFin());
					}
				}
			}
		}
		return new BigDecimal(total / 60);
	}

	public void validateForInsert() throws NSValidation.ValidationException {
		this.validateObjectMetier();
		validateBeforeTransactionSave();
		super.validateForInsert();
	}

	public void validateForUpdate() throws NSValidation.ValidationException {
		this.validateObjectMetier();
		validateBeforeTransactionSave();
		super.validateForUpdate();
	}

	public void validateForDelete() throws NSValidation.ValidationException {
		super.validateForDelete();
	}

	/**
	 * Apparemment cette methode n'est pas appelée.
	 * 
	 * @see com.webobjects.eocontrol.EOValidation#validateForUpdate()
	 */
	public void validateForSave() throws NSValidation.ValidationException {
		validateObjectMetier();
		validateBeforeTransactionSave();
		super.validateForSave();

	}

	/**
	 * Peut etre appele à partir des factories.
	 * 
	 * @throws NSValidation.ValidationException
	 */
	public void validateObjectMetier() throws NSValidation.ValidationException {

	}

	/**
	 * A appeler par les validateforsave, forinsert, forupdate.
	 * 
	 */
	private final void validateBeforeTransactionSave() throws NSValidation.ValidationException {

	}

}
