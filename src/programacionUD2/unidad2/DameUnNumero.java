package programacionUD2.unidad2;

import java.util.Scanner;

public class DameUnNumero {
	public static void main(String[] args) {
		int x=3;
		double y=1.2;
		System.out.println("Dame un numero entero:");
		Scanner sc=new Scanner(System.in); //Leo del teclado
		int numero= sc.nextInt(); //Dame un numero entero
		System.out.println(numero);
	}
	

}
