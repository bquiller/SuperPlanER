//
// Log.java
// Gedagogie
//
// Created by Adour on Tue Feb 10 2004.
// Copyright (c) 2004 Universite de La Rochelle. All rights reserved.
//

package org.cocktail.superplaner.utils;

import java.util.Date;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSTimestamp;

public class Log {

	long start = 0;

	public Log() {
	}

	public void startOp(String op) {
		start = (new Date()).getTime();
		NSLog.out.appendln(">>start " + op);
	}

	public void endOp() {
		long end = (new Date()).getTime();
		NSLog.out.appendln(">>ended : ms-" + (end - start) + "\n");
	}

	public void endOp(String msg) {
		long end = (new Date()).getTime();
		NSLog.out.appendln(">>ended : ms-" + (end - start));
		NSLog.out.appendln("> " + msg + "\n");
	}

	public static void printArray(NSArray array, String msg) {
		if (msg != null) {
			NSLog.out.appendln(msg);
		}
		for (int i = 0; i < array.count(); i++) {
			NSLog.out.appendln(array.objectAtIndex(i));
		}
	}

	public static void printArray(NSArray array) {
		for (int i = 0; i < array.count(); i++) {
			NSLog.out.appendln(array.objectAtIndex(i));
		}
	}

	public static void printPeriodicites(NSArray periodicites, String msg) {
		String format = "%d/%m/%Y %H:%M";
		if (msg != null) {
			NSLog.out.appendln(msg + ":");
		}
		for (int i = 0; i < periodicites.count(); i++) {
			if (i % 2 == 0) {
				NSLog.out.appendln("-------");
				NSLog.out.appendln("deb = " + FormatHandler.dateToStr((NSTimestamp) periodicites.objectAtIndex(i), format));
			}
			else {
				NSLog.out.appendln("fin = " + FormatHandler.dateToStr((NSTimestamp) periodicites.objectAtIndex(i), format));
			}
		}
	}

	public static void out(Object obj) {
		NSLog.out.appendln(obj.toString());
	}

	public static void out(Object sender, Object obj) {
		NSLog.out.appendln(sender.getClass().getName() + " - " + obj.toString());
	}

	public static void out(int i) {
		NSLog.out.appendln(String.valueOf(i));
	}

}
