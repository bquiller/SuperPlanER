package org.cocktail.superplaner.serveur.metier;

import java.math.BigDecimal;

import com.webobjects.foundation.NSKeyValueCoding;

public interface IMaquetteAp extends NSKeyValueCoding {

	public String toString();

	public String mhcoCode();

	public BigDecimal mapValeur();

	public Number mapSeuil();

	public String mapLibelle();

	public Number fannKey();

	public String colorCode();
}
