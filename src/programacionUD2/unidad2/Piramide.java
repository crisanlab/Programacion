package programacionUD2.unidad2;

import java.util.Scanner;

public class Piramide {
	public static void main(String[] args) {
		Scanner miEscaner = new Scanner(System.in);
		System.out.println("Escribe un número:");
		int numero = miEscaner.nextInt();
		String cadena = "";
		System.out.println("Triangulo");
		for (int i =1 ; i <= numero ; i++) {
			cadena = cadena + "*" ;
			System.out.println(cadena);
		}
		
	}

}
