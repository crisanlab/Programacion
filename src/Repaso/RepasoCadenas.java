package Repaso;

import java.util.Arrays;
import java.util.Scanner;

public class RepasoCadenas {
	public static void main(String[] args) {
		
	RepasoCadenas r = new RepasoCadenas();
	String [] palabras = r.cargaTabla();
	String [] numeros = r.cargaNumeros(palabras);
	String [] minusculas = r.filtraPrimeraMinuscula(palabras);
	//String [] modificadas = r.modificaPalabras();
	r.imprimeTabla(palabras);
	System.out.println(numeros);
	r.imprimeTabla(numeros);
	r.imprimeTabla(minusculas);
	System.out.println(Arrays.toString(minusculas));
	System.out.println(minusculas);
	
	


	}
	String[] cargaTabla ()
	{
		Scanner miEscaner = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		String  frase = miEscaner.nextLine();
		String [] tabla = frase.split(" ");
		return tabla;
	}
	String [] cargaNumeros (String[] tabla)
	{
		String [] numeros = new String [tabla.length];
		for (int i=0; i< tabla.length ; i++)
		{
			if (isCadenaEsNumero(tabla[i])) {
				numeros[i] = tabla[i];
		}
		}
		return numeros;
	}
	
	boolean isCadenaEsNumero(String palabra ) {
		boolean es = true;
		for (int i=0;i < palabra.length();i++)
		{
			Character c = palabra.charAt(i);
			es= es && Character.isDigit(c);
			
			}
		
		return es;
	}
	
	boolean esMinusculaPrimeraLetra(String [] palabra) {
		boolean esMinuscula= false;
		if (Character.isLowerCase(palabra.charAt(0)))
				esMinuscula = true;
		return esMinuscula;
		}		
	
	
	String [] filtraPrimeraMinuscula (String [] tabla )
	{
		String [] minusculas = new String [tabla.length];
		for (int i=0; i< tabla.length ; i++)
		{
			if (esMinusculaPrimeraLetra(tabla[i])) {
				minusculas[i] = tabla[i];
		}
		}
		return minusculas;
	}
	
	String [] convierteTabla (String[] palabras)
	{
	String [] convertidas = new String [palabras.length];
	// tengo que iterar palabra a palabra e ir guardando la palabra ya convertida
	return convertidas;
	}
	
	
	String [] modificaPalabras(String palabra)
	{
		String palabraConvertida="";
		//Primer caracter a mayusculas palabra.CharAt(0)
		//La o por un 0 --> replaceAll ("o","0")
		//Ultimo caracter por la longitud  palabra.charAt(palabra.length()-1)
		return palabraConvertida;
	}
	void imprimeTabla (String [] tabla)
	{
		for (int i=0; i < tabla.length; i++)
		{
			System.out.println(tabla[i]);
		}
	}
}
