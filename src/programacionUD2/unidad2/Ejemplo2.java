package programacionUD2.unidad2;

import java.util.Scanner;

public class Ejemplo2 {
	public static void main(String[] args) {
		System.out.println("Escribe tu edad:");
		Scanner miEscaner = new Scanner(System.in);
		int edad = miEscaner.nextInt();
		if (edad > 60) {
			double descuento = 0.3 ;
			System.out.println("El descuento es del 30%");
			System.out.println("Escribe el precio:");
			Scanner miPrecio = new Scanner(System.in);
			float precio=miPrecio.nextFloat();
			double descuentoMayor = precio * descuento;
			System.out.println("El descuento es de:"+descuentoMayor);
					
		}
		else {
			double descuento1 = 0.1;
			System.out.println("El descuento es del 10%");
			System.out.println("Escribe el precio:");
			Scanner miPrecio = new Scanner(System.in);
			float precio=miPrecio.nextFloat();
			double descuentoMenor = precio * descuento1;
			System.out.println("El descuento es de:"+ descuentoMenor);
		}
			
	}

}
