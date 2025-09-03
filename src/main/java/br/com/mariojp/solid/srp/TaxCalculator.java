package br.com.mariojp.solid.srp;

public class TaxCalculator {
	
	public double calculate(double tax) {
		//getProperty recebe a String e retorna seu valor correspondente sobre a taxa 
		String taxProperty = System.getProperty("tax.rate", "0.40");
		// Transforma o valor correspondente em  double e retorna a taxa do parâmetro do método multiplicado pela taxRate
		double taxrate = Double.parseDouble(taxProperty);
		return tax * taxrate;
	}

}
