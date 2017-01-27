//
// ReportsProxy.java
// Physalis
//
// Created by François ADOUR on 04/04/07.
// Copyright (c) 2007 __MyCompanyName__. All rights reserved.
//

package org.cocktail.superplaner.serveur.gestionimpression;

import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

public class ReportsGenerator {

	String dbConnectionURL, username, password, jdbcDriverName;
	Connection connection = null;

	public ReportsGenerator(String dbConnectionURL, String username, String password, String jdbcDriverName) {
		this.dbConnectionURL = dbConnectionURL;
		this.username = username;
		this.password = password;
		this.jdbcDriverName = jdbcDriverName;
	}

	public byte[] getPdfBytesForReport(String reportPathName, Map parameters) throws Exception {

		Class.forName(jdbcDriverName);
		connection = DriverManager.getConnection(dbConnectionURL, username, password);

		JasperPrint jasperPrint = JasperFillManager.fillReport(reportPathName, parameters, connection);

		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
		JRPdfExporter jrpdfexporter = new JRPdfExporter();
		jrpdfexporter.setParameter(JRExporterParameter.OUTPUT_STREAM, bytearrayoutputstream);
		jrpdfexporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
		jrpdfexporter.exportReport();

		connection.close();

		return bytearrayoutputstream.toByteArray();
	}

}
