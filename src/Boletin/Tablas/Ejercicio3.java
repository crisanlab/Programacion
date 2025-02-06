package Boletin.Tablas;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner miEscaner = new Scanner(System.in);
		System.out.println("Escribe el número a buscar:");
		int lista [] = {1,3,4,7};
		int numBuscar= miEscaner.nextInt();
		boolean encontrado = false;
		int posicion = 9999 ;
		int i = 0;
		while (i < lista.length && !encontrado) {
		for ( int i= 0; i < lista.length; i++) {
			if (numBuscar == lista[i]) {
				System.out.println("Este número está en posicicion:"+ i);
			}
		
		else {
			if (numBuscar < lista[i] && numBuscar > lista [i- 1]) {
				int pos = i;
				System.out.println("El número está en la posicion: -" + pos);}

	}

 while (!encontrado && i < lista.length)
 {
	 
 }
}
}
}