package org.cocktail.superplaner.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSTimestamp;


public class FCalendarHandler {
	
	
	
	
	public static NSTimestamp getDebutSemestreImpair(Number fannKey) {
		int Y = fannKey.intValue();
		return FormatHandler.strToDate("01/09/"+Y+" 02:00", "%d/%m/%Y %H:%M");
	}
	
	public static NSTimestamp getFinSemestreImpair(Number fannKey) {
		int Y = fannKey.intValue();
		return FormatHandler.strToDate("31/12/"+Y+" 23:59", "%d/%m/%Y %H:%M");
		
	}

	public static NSTimestamp getDebutSemestrePair(Number fannKey) {
		int Y = fannKey.intValue();
		int YY = Y+1;
		return FormatHandler.strToDate("01/01/"+YY+" 02:00", "%d/%m/%Y %H:%M");
	}

	public static NSTimestamp getFinSemestrePair(Number fannKey) {
		int Y = fannKey.intValue();
		int YY = Y+1;
		return FormatHandler.strToDate("31/08/"+YY+" 23:59", "%d/%m/%Y %H:%M");
	}
	
	
	
	
	public static int getAnneeForFannKeyAndWeek(Number fannKey,int week) {
		
		int startWeek1,endWeek2;
		
		int annee = fannKey.intValue();
		
		NSTimestamp debutSem1 = getDebutSemestreImpair(fannKey);
		NSTimestamp finSem2 = getFinSemestrePair(fannKey);
		
		GregorianCalendar cal = null;
		
		cal = new GregorianCalendar();
		cal.setTime(debutSem1);
		startWeek1 = cal.get(Calendar.WEEK_OF_YEAR);
		
		
		cal = new GregorianCalendar();
		cal.setTime(finSem2);
		endWeek2 = cal.get(Calendar.WEEK_OF_YEAR);
		
		if(startWeek1==endWeek2) {
			endWeek2--;
		}
		
		if(week>=1 && week<=endWeek2) {
			annee = fannKey.intValue()+1;
		}
		else {
			annee = fannKey.intValue();
		}
		
		return annee;
	}
		
	
	
	public static NSArray listeSemainesForAnneeScolaire(Number fannKey) {
		
		NSTimestamp debutSem1 = getDebutSemestreImpair(fannKey);
		//NSTimestamp finSem1   = getFinSemestreImpair(fannKey);
		
		NSTimestamp debutSem2 = getDebutSemestrePair(fannKey);
		NSTimestamp finSem2 = getFinSemestrePair(fannKey);
		
		
		int startWeek1,endWeek1,startWeek2,endWeek2;
		
		endWeek1 = getMaxWeekInYear( fannKey.intValue() );
		
		GregorianCalendar cal = new GregorianCalendar();
		
		cal.setTime(debutSem1);
		startWeek1 = cal.get(Calendar.WEEK_OF_YEAR);
		
		cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, fannKey.intValue()+1);
		
		/*
		cal = new GregorianCalendar();
		cal.setTime(debutSem2);
		startWeek2 = cal.get(Calendar.WEEK_OF_YEAR);
		*/
		startWeek2 = 1;
		
		cal = new GregorianCalendar();
		cal.setTime(finSem2);
		endWeek2 = cal.get(Calendar.WEEK_OF_YEAR);
		/*
		System.out.println("debutSem1="+debutSem1);
		System.out.println("debutSem2="+debutSem2);
		System.out.println("finSem2="+finSem2);
		
		
		
		System.out.println("startWeek1="+startWeek1);
		System.out.println("endWeek1="+endWeek1);
		System.out.println("startWeek2="+startWeek1);
		System.out.println("endWeek2="+startWeek1);
		*/
		
		NSMutableArray liste = new NSMutableArray();
		
		for(int i=startWeek1;i<=endWeek1;i++) {
			liste.add(new Integer(i));
		}
		
		
		if(startWeek1==endWeek2) {
			endWeek2--;
		}
		
		for(int i=startWeek2;i<=endWeek2;i++) {
			liste.add(new Integer(i));
		}
		
		return liste;
	
	}
	
	/** donne les dates de debut et de fin de la semaine dans l'annee passee */
	public static NSTimestamp[] getBeginAndEndOfWeek(int weeknumber, int year) {

		NSTimestamp debut, fin;
		GregorianCalendar cal = new GregorianCalendar();
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		cal.setMinimalDaysInFirstWeek(4);
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.WEEK_OF_YEAR, weeknumber);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		cal.setTime(cal.getTime());
		debut = new NSTimestamp(cal.getTime());
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		cal.setTime(cal.getTime());
		fin = new NSTimestamp(cal.getTime());
		return new NSTimestamp[] { debut, fin };
	}

	/** getMaxWeekInYear : retourne le nombre de semaines de l'annee : 52 ou 53
	 *  @param year l'annee d'evaluation */
	public static int getMaxWeekInYear(int year) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		cal.setMinimalDaysInFirstWeek(4);
		cal.set(Calendar.YEAR, year);
		cal.setTime(cal.getTime());
		return cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
	}
	
	
	
	
}
