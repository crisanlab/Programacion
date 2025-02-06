package Boletin6.Funciones;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	Ejercicio1 e = new Ejercicio1();
	System.out.println(e.sumaCifra());
	

	
}
	int sumaCifra() {
	int resultado = 0;
	Scanner miEscaner = new Scanner(System.in);
	System.out.println("Escribe el primer número: ");
	String num1 = miEscaner.next();
	System.out.println("Escribe el segundo número: ");
	int num2 = miEscaner.nextInt();
	
	if (validaNumero(num1,num2)) {
		for (int i=0; i < num2  ; i++) {;
			String numEntero= Character.toString(num1.charAt(i)); //Pasalo a cadena
			int numCambiado= Integer.parseInt(numEntero); //Pasalo a numero
			resultado = resultado + numCambiado;
			
		}
		
	}
	
	return resultado;
}
	boolean validaNumero(String num1, int num2 ) {
		boolean esValido=false;
		if (num2 < num1.length() ) {
			esValido =true;
		}
		else {
			Scanner miEscaner = new Scanner(System.in);
			System.out.println("Escribe el primer número: ");
			num1 = miEscaner.next();
			System.out.println("Escribe el segundo número: ");
			num2 = miEscaner.nextInt();
			validaNumero(num1,num2);
		}
		return esValido;
			
	}
}
