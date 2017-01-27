package org.cocktail.superplaner.serveur.gestionimpression;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSTimestamp;

public class ListeCours extends NSMutableArray {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7359807751474054742L;
	private NSTimestamp dateDebutMin;
	private NSTimestamp dateFintMin;

	public ListeCours() {
		super();
	}

	public void addObject(CoursImpress arg0) {
		super.addObject(arg0);
	}

	public void addObjects(ListeCours arg0) {
		super.addObject(arg0);
	}

	public boolean isComplexAtIndex(int arg0) {
		return (objectAtIndex(arg0)).getClass().getName().equals("org.cocktail.superplaner.serveur.gestionimpression.ListeCours");
	}

	public ListeCours listeCoursForCreneau(int arg0) {
		ListeCours tmp = new ListeCours();
		for (int j = 0; j < this.count(); j++) {
			if (!isComplexAtIndex(j)) {
				if (arg0 == ((CoursImpress) objectAtIndex(j)).numeroCreneau) {
					tmp.addObject(objectAtIndex(j));
				}
			}
			else {

				ListeCours listCours = (ListeCours) objectAtIndex(j);
				tmp.addObjectsFromArray(listCours.listeCoursForCreneau(arg0));
			}

		}
		return tmp;
	}

	public NSTimestamp dateDebutAtIndex(int index, NSTimestamp debutImpress) {
		if (isComplexAtIndex(index)) {
			NSTimestamp dateMin = debutImpress;
			for (int i = 0; i < ((NSArray) objectAtIndex(index)).count(); i++) {
				NSTimestamp currentDate = ((ListeCours) objectAtIndex(index)).dateDebutAtIndex(i, dateMin);

				if (currentDate.before(dateMin)) {
					dateMin = currentDate;
				}

			}
			return dateMin;
		}
		else {
			return ((CoursImpress) objectAtIndex(index)).heuredeb();
		}
	}

	public NSTimestamp dateFinAtIndex(int index, NSTimestamp finImpress) {
		if (isComplexAtIndex(index)) {
			NSTimestamp dateMax = finImpress;
			for (int i = 0; i < ((NSArray) objectAtIndex(index)).count(); i++) {
				NSTimestamp currentDate = ((ListeCours) objectAtIndex(index)).dateFinAtIndex(i, dateMax);

				if (currentDate.after(dateMax)) {
					dateMax = currentDate;
				}

			}
			return dateMax;
		}
		else {
			return ((CoursImpress) objectAtIndex(index)).heurefin();
		}
	}

	public int height(int i) {
		if (isComplexAtIndex(i)) {
			return ((NSArray) objectAtIndex(i)).count();
		}
		else {
			return 0;
		}
	}

	public void setDateDebutMin(NSTimestamp debutMin) {
		dateDebutMin = debutMin;
	}

	public void setDateFinMax(NSTimestamp finMax) {
		dateFintMin = finMax;
	}

	public NSTimestamp dateDebutMin() {
		return dateDebutMin;
	}

	public NSTimestamp dateFinMax() {
		return dateFintMin;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < this.count(); i++) {
			if (isComplexAtIndex(i)) {
				str = "\\" + ((ListeCours) this.objectAtIndex(i)).toString();
			}
			else {
				str = "\t" + ((CoursImpress) this.objectAtIndex(i)).toString();
			}
		}
		return str;
	}

}
