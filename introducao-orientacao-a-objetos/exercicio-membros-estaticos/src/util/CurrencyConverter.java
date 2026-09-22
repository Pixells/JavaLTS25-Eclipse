package util;

public class CurrencyConverter {

	public static double result(double cotacao, double precoDoll) {
		
		double valor = cotacao * precoDoll;
		double iof = valor * 0.06;
		double result = valor + iof;
		
		return result;
	}
	
}
