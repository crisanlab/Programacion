package programacionUD2.unidad2;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner miEscaner = new Scanner(System.in);
		System.out.println("Escribe el primer número:");
		int numero1 = miEscaner.nextInt();
		System.out.println("Escribe el segundo número:");
		int numero2= miEscaner.nextInt();
		System.out.println("Escribe la operación que quires realizar:");
		String operacion = miEscaner.next();
		operacion.toLowerCase();
		switch (operacion) {
			case "sumar":
				 System.out.println("Resultado de la suma: " + (numero1 + numero2));
	                break;
			case "restar":
				System.out.println("Resultado de la resta: " + (numero1 - numero2));
                break;
			case "multiplicar":
				System.out.println("Resultado de la multiplicación: " + (numero1 * numero2));
                break;
			case "dividir":
				System.out.println("Resultado de la división: " + (numero1 / numero2));
                break;
			default:
				 System.out.println("Operación no válida. Por favor, escribe una operación válida.");
	                break;
			
		}
		
				
	}

}
