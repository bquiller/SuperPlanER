package org.cocktail.superplaner.serveur.gestionimpression;

//
// HCompPrintFactory.java
// EdtScol
//
// Created by fadour on Tue Apr 26 2005.
// Copyright (c) 2005 __MyCompanyName__. All rights reserved.
// @
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringWriter;

import org.cocktail.fwkcktlwebapp.common.print.CktlPrinter;
import org.cocktail.fwkcktlwebapp.common.util.CktlXMLWriter;
import org.cocktail.fwkcktlwebapp.common.util.StreamCtrl;
import org.cocktail.fwkcktlwebapp.server.CktlConfig;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSData;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSTimestamp;

import org.cocktail.superplaner.utils.FormatHandler;

public class HCompPrintFactory {

	private static HCompPrintFactory hCompPrintFactoryInstance;

	// elements utiles au serveur de PDFs.
	private String maquetteID;
	private CktlPrinter printer;
	private byte[] xmlbytes;
	private ByteArrayInputStream xmlStream;

	private CktlConfig cfg;

	private HCompPrintFactory(CktlConfig cfg) {
		this.cfg = cfg;
	}

	public static HCompPrintFactory getInstance(CktlConfig cfg) {
		if (hCompPrintFactoryInstance == null) {
			hCompPrintFactoryInstance = new HCompPrintFactory(cfg);
		}
		return hCompPrintFactoryInstance;
	}

	/** genere le pdf d'edition pour des hcomp par atome pedagogique */
	public NSData getPdfDataHcompAp(NSDictionary liste) throws Exception {

		maquetteID = cfg.stringForKey("MAQUETTE_HCOMP_AP");
		StringWriter aStringWriter = new StringWriter();
		CktlXMLWriter w = new CktlXMLWriter(aStringWriter);

		w.setCharsToEscape("<>&");
		w.setEscapeSpecChars(true);

		w.startDocument();
		w.startElement("hcomp");
		w.startElement("header");
		w.writeElement("diplome", (String) liste.objectForKey("diplome"));
		w.writeElement("parcours", (String) liste.objectForKey("parcours"));
		w.writeElement("semestre", (String) liste.objectForKey("semestre"));
		w.writeElement("annee_univ", (String) liste.objectForKey("annee"));
		w.writeElement("date_edition", FormatHandler.dateToStr(new NSTimestamp(), "%d/%m/%Y"));
		w.writeElement("etat", (String) liste.objectForKey("etat"));
		w.writeElement("ap", (String) liste.objectForKey("ap"));
		w.endElement();// header

		w.startElement("elements");
		NSArray lignes = (NSArray) liste.objectForKey("lignes");
		for (int i = 0; i < lignes.count(); i++) {
			NSDictionary ligne = (NSDictionary) lignes.objectAtIndex(i);
			w.startElement("element");
			w.writeElement("nom_complet", (String) ligne.objectForKey("nom_complet"));
			w.writeElement("nombre_heures", (String) ligne.objectForKey("nombre_heures"));
			w.endElement();
		}

		w.endElement(); // elements

		w.endElement();
		w.endDocument();
		w.close();

		xmlbytes = aStringWriter.toString().getBytes();
		xmlStream = new ByteArrayInputStream(xmlbytes);
		InputStream pdfStream = genererPDF(xmlStream, xmlbytes.length, maquetteID);

		if (pdfStream == null) {
			throw new Exception("Le flux PDF est nul.");
		}

		ByteArrayOutputStream tmpByteArrayOutputStream = new ByteArrayOutputStream();
		StreamCtrl.writeContentToStream(pdfStream, tmpByteArrayOutputStream, -1);

		return new NSData(tmpByteArrayOutputStream.toByteArray());
	}

	/** pdfDatailHeures */
	public NSData getPdfDetailHeures(NSDictionary liste) throws Exception {
		maquetteID = cfg.stringForKey("MAQUETTE_HCOMP_INDIVIDU");
		StringWriter aStringWriter = new StringWriter();
		CktlXMLWriter w = new CktlXMLWriter(aStringWriter);

		w.setCharsToEscape("<>&");
		w.setEscapeSpecChars(true);

		w.startDocument();
		w.startElement("hcomp");
		w.startElement("header");

		w.writeElement("nom_complet", (String) liste.objectForKey("nom_complet"));
		w.writeElement("total", (String) liste.objectForKey("total"));

		w.writeElement("diplome", (String) liste.objectForKey("diplome"));
		w.writeElement("parcours", (String) liste.objectForKey("parcours"));
		w.writeElement("semestre", (String) liste.objectForKey("semestre"));
		w.writeElement("annee_univ", (String) liste.objectForKey("annee"));

		w.writeElement("date_edition", FormatHandler.dateToStr(new NSTimestamp(), "%d/%m/%Y"));
		w.writeElement("etat", (String) liste.objectForKey("etat"));
		w.endElement();// header

		w.startElement("elements");

		w.startElement("element");
		w.writeElement("type_ap", (String) liste.objectForKey("type_ap"));
		w.writeElement("libelle_ap", (String) liste.objectForKey("libelle_ap"));

		NSArray periodicites = (NSArray) liste.objectForKey("periodicites");
		NSTimestamp tmp;
		for (int i = 0; i < periodicites.count(); i += 2) {
			tmp = (NSTimestamp) periodicites.objectAtIndex(i);
			w.startElement("periodicite");
			w.writeElement("date", FormatHandler.dateToStr(tmp, "%d/%m/%Y"));
			w.writeElement("heure_deb", FormatHandler.dateToStr(tmp, "%H:%M"));
			tmp = (NSTimestamp) periodicites.objectAtIndex(i + 1);
			w.writeElement("heure_fin", FormatHandler.dateToStr(tmp, "%H:%M"));
			w.endElement();
		}

		w.endElement(); // element
		w.endElement(); // elements

		w.endElement();
		w.endDocument();
		w.close();

		xmlbytes = aStringWriter.toString().getBytes();
		xmlStream = new ByteArrayInputStream(xmlbytes);
		InputStream pdfStream = genererPDF(xmlStream, xmlbytes.length, maquetteID);

		if (pdfStream == null) {
			throw new Exception("Le flux PDF est nul.");
		}

		ByteArrayOutputStream tmpByteArrayOutputStream = new ByteArrayOutputStream();
		StreamCtrl.writeContentToStream(pdfStream, tmpByteArrayOutputStream, -1);

		return new NSData(tmpByteArrayOutputStream.toByteArray());

	}

	/**
	 * impression immédiate du pdf param xmlstream le fichier d'entree param la taille du fichier d'entree param maquetteID la maquette a
	 * faire appel dans Six return InputStream le fichier de sortie
	 */
	private InputStream genererPDF(InputStream xmlstream, int streamSize, String maquetteID) throws Exception {
		InputStream stream = null;

		try {
			printer = CktlPrinter.newDefaultInstance(cfg);
		}
		catch (ClassNotFoundException e) {
			NSLog.out.appendln("Erreur instantiation CktlPrinter : " + e.getMessage());
			return stream;
		}
		stream = printer.printFileImmediate(maquetteID, xmlStream, streamSize);
		int jobId = printer.getJobID();
		if (printer.hasSuccess()) {
			return stream;
		}
		else {
			NSLog.out.appendln("Erreur Six :  " + printer.getMessage());
			NSLog.out.appendln("jobId " + jobId);
			return null;
		}
	}

}
