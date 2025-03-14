package modelo;

public class Conversor {

	public final static double EUROS = 0.95;
	public final static double DOLARES = 1.05;

	double convierteAEuros(double euros){
	double conversionEuros = euros * EUROS;
	return conversionEuros;
}
	static double convierteADolares (double dolar) {
		double conversionDolares = dolar * DOLARES;
		return conversionDolares;
		
	}
}
