package Repaso;

import java.util.Scanner;

import programacionUD2.unidad2.RetoGrinch;

public class Repaso {
	public static void main(String[] args) {
		Repaso r = new Repaso();
		Scanner miEscaner = new Scanner(System.in);
		System.out.println("Escribe cuántos números deseas considerar: ");
		int numAConsiderar = miEscaner.nextInt();
		r.sumaNum(numAConsiderar,miEscaner);
		System.out.println(r.sumaNum(numAConsiderar,miEscaner));
	}
	

	int sumaNum(int numAConsiderar,Scanner miEscaner) {
		int resultado = 0;
		for (int i = 0; (i < numAConsiderar); i++) {
			System.out.println("Escribe un número: ");
			int numero = miEscaner.nextInt();
			if (numero % 2 == 0) {
				resultado = (resultado + numero);

			}
		}
		return resultado;
	}
	
}


