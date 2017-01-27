package org.cocktail.superplaner.utils;

import com.webobjects.foundation.NSTimestamp;

public class Utilities {
	
	
	
	/** retourne le nombre de minutes separant deux dates */
	public static int minutesSeparatingDates(NSTimestamp date1, NSTimestamp date2) {
		if (date1 != null && date2 != null) {
			return (int) ((date2.getTime() - date1.getTime()) / (1000 * 60));
		}
		else {
			return -1;
		}
	}
}
