package org.cocktail.superplaner.serveur.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;


public class EvenementPojo {

	private String className;
	private String title;
	private Date start;
	private Date end;
	private String libelle;

	private int jour;
	private int resa;
	private int deplace;
	private int rang;

	private boolean allDay;

	SimpleDateFormat dateFormatter =
		new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	SimpleDateFormat hourFormatter =
		new SimpleDateFormat("HH:mm");


	public EvenementPojo() {
	}
	public EvenementPojo(Date debut, Date fin) {
		start = debut;
		end = fin;
	}

	@Override
	public String toString() {
		return "Title : " + title + " Start : " + getStartAsString() + " End : " + getEndAsString();
	}

	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getResa() {
		return resa;
	}
	public void setResa(int resa) {
		this.resa = resa;
	}
	public int getDeplace() {
		return deplace;
	}
	public void setDeplace(int deplace) {
		this.deplace = deplace;
	}
	public int getRang() {
		return rang;
	}
	public void setRang(int rang) {
		this.rang = rang;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStart() {
		return start;
	}
	public String getStartAsString() {
		return dateFormatter.format(start);
	}
	public String getStartHourAsString() {
		return hourFormatter.format(start);
	}

	public void setStartHourAsString(String hour) {
		// TODO
	}
	public void setEndHourAsString(String hour) {
		// TODO
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public String getEndAsString() {
		return dateFormatter.format(end);
	}
	public String getEndHourAsString() {
		return hourFormatter.format(end);
	}
	public void setEnd(Date end) {
		this.end = end;
	}

	public boolean isAllDay() {
		return allDay;
	}
	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}
}
