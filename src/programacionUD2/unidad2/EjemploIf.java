package programacionUD2.unidad2;

import java.util.Scanner;

public class EjemploIf {

	public static void main(String[] args) {
		System.out.println("Dime un numero:");
		Scanner miEscaner = new Scanner(System.in);
		int numero = miEscaner.nextInt();
		if (numero > 7) {
			System.out.println("Es mayor que 7");
			System.out.println("Hola");
		}

	}
}
