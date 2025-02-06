package Boletin.Tablas;

import java.util.Scanner;

public class Reto2 {
public static void main(String[] args) {
	Scanner miEscaner = new Scanner(System.in);
	System.out.println("Escribe el número de renos:");
	int numRenos = miEscaner.nextInt();
	int [] tablacarrera = new int [numRenos] ;
	int pos=0;
	while (pos < (tablacarrera.length) ) {
		System.out.println("Dime la posición del reno:");
		int posReno = miEscaner.nextInt();
		tablacarrera[pos]= posReno;
		System.out.println(tablacarrera[posReno]);
		pos = pos +  1;

	}
	System.out.println("Escribe la longitud de la pista:");
	int longitudPista = miEscaner.nextInt();
	System.out.println("El número de renos es:" + numRenos);
	System.out.println("La longitud de la pista es:" + longitudPista);
	System.out.println(tablacarrera[numRenos]);
    String cadena = ("@" + "-"+"r") ;  
  
}
}
