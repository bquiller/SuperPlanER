package org.cocktail.superplaner.serveur.components;

import java.util.Date;

import org.cocktail.fwkcktlpersonne.common.metier.PersonneDelegate;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolInscriptionEtudiant;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteAp;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionAp;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionEc;
import org.cocktail.scolaritefwk.serveur.metier.eos.EOScolMaquetteRepartitionUe;
import org.cocktail.superplaner.serveur.DBHandler;
import org.cocktail.superplaner.serveur.Session;
import org.cocktail.superplaner.serveur.components.controlers.PlanningCtrl;
import org.cocktail.superplaner.serveur.metier.IndividuUlr;
import org.cocktail.superplaner.serveur.metier.ScolGroupeGrp;
import org.cocktail.superplaner.serveur.metier.ScolGroupeObjet;
import org.cocktail.superplaner.serveur.metier.ScolInscriptionAp;
import org.cocktail.superplaner.serveur.metier.ScolInscriptionEtudiant;
import org.cocktail.superplaner.serveur.metier.ScolInscriptionGrp;
import org.cocktail.superplaner.serveur.pojo.EvenementPojo;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EOSQLQualifier;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOAndQualifier;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSTimestamp;

import er.ajax.AjaxProxy;
import er.extensions.eof.ERXKeyFilter;

public class GenericCalendar extends MyWOComponent {

	private static final long serialVersionUID = -5673113379993989646L;

	private AjaxProxy ajaxProxy;

	private static long oneDay = 24 * 60 * 60 * 1000;
	private static long oneMinute = 60 * 1000;

	private PlanningCtrl planCtrl;

	public GenericCalendar(WOContext context) {
		super(context);
	}

	public WOActionResults modifyEvent() {
		// TODO 
		//		System.out.println("In modifyEvent");
		return pageWithName("AddEvent");
	}

	/**
	 * @return the isEditable
	 */
	public boolean isEditable() {
		//		System.out.println(session.editMode);
		return false; // !session.isEtudiant();
	}

	// Java-WebObject side, we receive the index and simple return what they asked for, as for any java call. 
	public String eventAtIndex(EvenementPojo event) {
		// session.setEvent();
		session.setEvent(event);
		//		System.out.println("event.end " + event.getEnd());
		return "eventAtIndex : "+event;
	}

	public void addEvent(Date debut, Date fin, boolean allDay) {
		EvenementPojo newEvent = new EvenementPojo(new NSTimestamp(debut),new NSTimestamp(fin));
		newEvent.setAllDay(allDay);

		//		System.out.println(newEvent);

		session.setEvent(newEvent);
	}

	public void eventDrop(EvenementPojo event,int dayDelta,int minuteDelta,boolean allDay) {
		long toAdd = oneDay * dayDelta + oneMinute * minuteDelta;

		event.setStart(new Date(event.getStart().getTime() + toAdd));
		event.setEnd(new Date(event.getEnd().getTime() + toAdd));

		event.setAllDay(allDay);
	}

	public void eventResize(EvenementPojo event,int dayDelta,int minuteDelta) {
		// reservations.remove(event);
		long toAdd = oneDay * dayDelta + oneMinute * minuteDelta;

		event.setEnd(new Date(event.getEnd().getTime() + toAdd));
	}


	/**
	 * @return the ajaxProxy
	 */
	public AjaxProxy ajaxProxy() {
		return ajaxProxy;
	}

	/**
	 * @param ajaxProxy the ajaxProxy to set
	 */
	public void setAjaxProxy(AjaxProxy ajaxProxy) {
		this.ajaxProxy = ajaxProxy;
	}

	public ERXKeyFilter resaFilter() {
		ERXKeyFilter filter = ERXKeyFilter.filterWithAll();
		return filter;
	}

	/**
	 * ShowAction, result accessible par /SuperPlanER.woa/ra/ReservationTest/1.json
	 * @return un JSON de la forme suivante :
	 * 
			 {start = 2010-09-21 06:30:00 Etc/GMT; 
			  resa = 1; 
			  jour = 3; 
			  libelle = "BRICE QUILLERIE"; 
			  deplace = 1; 
			  title = "Aniv Danaé "; 
			  end = 2010-09-21 18:00:00 Etc/GMT; 
			  reservation = _EOIntegralKeyGlobalID[Reservation (java.lang.Integer)33703]; 
			  rang = 0; ccolor = "r"; }
	 */
	public NSArray<EvenementPojo> events(Date start, Date end) {
		//		System.out.println("Start : " + start + " End : " + end);

		IndividuUlr ind = IndividuUlr.fetchIndividuUlr(session().defaultEditingContext(), IndividuUlr.PERS_ID_KEY, session.selectedPersonne().persId());
		NSMutableArray<EvenementPojo> reservations = new NSMutableArray<EvenementPojo>();
		// EOIndividu eoind = EOIndividu.fetchByKeyValue(session().defaultEditingContext(), IndividuUlr.NO_INDIVIDU_KEY, session.applicationUser().getNoIndividu());

		planCtrl = new PlanningCtrl(session.defaultEditingContext());
		if ("ETUDIANT".equals(ind.indQualite())) {

			// EOEtudiant etudiant = EOEtudiant.etudiantForIndividu(session.defaultEditingContext(), eoind);
			// EOScolInscriptionEtudiant insc = EOScolInscriptionEtudiant.fetchByKeyValue(session.defaultEditingContext(), EOScolInscriptionEtudiant.NO_INDIVIDU_KEY, session.applicationUser().getNoIndividu());
			

			NSArray<ScolInscriptionEtudiant> inscriptions;
			if (!myCalendar()) {
				NSMutableArray<EOQualifier> quals = new NSMutableArray<EOQualifier>(); 
				EOQualifier qual = new EOKeyValueQualifier(EOScolInscriptionEtudiant.PERS_ID_KEY, EOQualifier.QualifierOperatorEqual, session.selectedPersonne().persId());
				quals.add(qual);
				
				EOEntity inscription = EOUtilities.entityNamed(edc,"ScolInscriptionEtudiant");
				String[] param = {session.applicationUser().getLogin()};
				quals.add(new EOSQLQualifier(inscription, "fspn_key in (select fhab.fspn_key from SCOLARITE.SCOL_DROIT_LOGIN dlog, SCOLARITE.SCOL_DROIT_DIPLOME ddip, SCOLARITE.scol_formation_habilitation fhab " +
						"where dlog.dlog_login = '%@' and ddip.dlog_key = dlog.dlog_key and fhab.fhab_key = ddip.fhab_key)", param));
				
				System.out.println("##################################### Fetch ...");
				inscriptions = ScolInscriptionEtudiant.fetchScolInscriptionEtudiants(session.defaultEditingContext(), new EOAndQualifier(quals), null);
				System.out.println("##################################### Fetched : " + inscriptions);
			} else {
				EOQualifier qual = new EOKeyValueQualifier(EOScolInscriptionEtudiant.PERS_ID_KEY, EOQualifier.QualifierOperatorEqual, session.selectedPersonne().persId());

				inscriptions = ScolInscriptionEtudiant.fetchScolInscriptionEtudiants(session.defaultEditingContext(), qual, null);
			}


			for (ScolInscriptionEtudiant insc : inscriptions) {
				// session.setFannKey(new Long(0));
				// if (insc.fannKey() > session.getFannKey()) session.setFannKey(insc.fannKey());
				session.setFannKey(new Long(2016));

				NSArray<ScolInscriptionAp> aps = insc.scolInscriptionAP();

				NSArray<ScolInscriptionGrp> grps = insc.scolInscriptionGrps();
				NSMutableArray<ScolGroupeGrp> selGrps = new NSMutableArray<ScolGroupeGrp>();
				for (ScolInscriptionGrp grp : grps) {
					selGrps.add(grp.scolGroupeGrp());
				}
				for (ScolGroupeObjet obj : session.selectedGroups) {
					selGrps.add(obj.scolGroupeGrp());
				}

				//				System.out.println("Aps : " + aps.size());
				//				System.out.println("Groupes : " + grps.size());

				NSArray<EvenementPojo> resasTmp;

				resasTmp = planCtrl.requestPlanningInscAp(new NSTimestamp(start), new NSTimestamp(end), DBHandler.globalIDsForObjects(session.defaultEditingContext(),aps), new NSArray(), selGrps);
				reservations.addAll(resasTmp);

				resasTmp = planCtrl.requestPlanningSemestres(new NSTimestamp(start), new NSTimestamp(end), DBHandler.globalIDsForObjects(session.defaultEditingContext(), new NSArray()));
				reservations.addAll(resasTmp);
			}
		}
		
		if (session().getSelectedSearchSemestre() != null) {
			NSArray<EOEnterpriseObject> semestres = new NSMutableArray<EOEnterpriseObject>();
			semestres.add(session().getSelectedSearchSemestre());
			
			NSArray<EOScolMaquetteAp> gidAps = new NSMutableArray<EOScolMaquetteAp>();
			for (Object mrue : session().getSelectedSearchSemestre().toFwkScolarite_ScolMaquetteRepartitionUes()) {
					for (Object mrec : ((EOScolMaquetteRepartitionUe)mrue).toFwkScolarite_ScolMaquetteUe().toFwkScolarite_ScolMaquetteRepartitionEcs()) {
						for (Object mrap : ((EOScolMaquetteRepartitionEc)mrec).toFwkScolarite_ScolMaquetteEc().toFwkScolarite_ScolMaquetteRepartitionAps()) {
							EOScolMaquetteAp ap = ((EOScolMaquetteRepartitionAp)mrap).toFwkScolarite_ScolMaquetteAp();
							gidAps.add(ap);
					}
				}
			}
			NSArray<EvenementPojo> resasTmp;
			resasTmp = planCtrl.requestPlanningAp(new NSTimestamp(start), new NSTimestamp(end), DBHandler.globalIDsForObjects(session.defaultEditingContext(), gidAps), new NSArray(), null);
			if (resasTmp != null) reservations.addAll(resasTmp);
			System.out.println(":::::::::::::::::::::::::> " + DBHandler.globalIDsForObjects(edc, semestres));
			// resasTmp = planCtrl.requestPlanningSemestres(new NSTimestamp(start), new NSTimestamp(end), DBHandler.globalIDsForObjects(session.defaultEditingContext(), semestres));
			// if (resasTmp != null) reservations.addAll(resasTmp);
			
		} else reservations.addAll(planCtrl.requestCalendarIndividu(new NSTimestamp(start), new NSTimestamp(end), session().defaultEditingContext().globalIDForObject(ind), 0));

		return reservations;
	}

	/**
	 * @return the myCalendar
	 */
	public boolean myCalendar() {
		return ((Session) session()).getSelectedSearchSemestre() == null && ((Session) session()).selectedPersonne().persId().equals(((Session) session()).applicationUser().getPersId());
	}

	public void reset() {
		((Session) session()).setSelectedSearchSemestre(null);
		((Session) session()).setSelectedFormation(null);
		((Session) session()).setSelectedPersonne(PersonneDelegate.fetchPersonneByPersId(session()
						.defaultEditingContext(), ((Session) session()).applicationUser().getPersId()));
	}

}