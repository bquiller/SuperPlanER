//
// FixedCalendar.java
// EdtScol
//
// Created by fadour on Tue Oct 26 2004.
// Copyright (c) 2004 __MyCompanyName__. All rights reserved.
//

package org.cocktail.superplaner.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FixedCalendar extends GregorianCalendar {

	private static final long serialVersionUID = -9006677534037652226L;

	public FixedCalendar() {
		super();
		initFrCalendar();
	}

	private void initFrCalendar() {
		setFirstDayOfWeek(Calendar.MONDAY);
		setMinimalDaysInFirstWeek(4); // le premier Jeudi de Janvier...
	}

}
