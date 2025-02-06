package programacionUD2.unidad2;

import java.util.Scanner;

public class Ejemplo2SinIf {
	public static void main(String[] args) {
		float descuento,precio;
		System.out.println("Escribe tu edad:");
		int edad = miEscaner.nextInt();
		descuento = (edad > 60) ? 0.3F : 0.1F;
		
			System.out.println("El descuento es del 30%");
			System.out.println("Escribe el precio:");
			Scanner miPrecio = new Scanner(System.in);
			precio=miPrecio.nextFloat();
			
		}
		else {
			descuento1 = 0.1;
			System.out.println("El descuento es del 10%");
			System.out.println("Escribe el precio:");
			Scanner miPrecio = new Scanner(System.in);
			precio=miPrecio.nextFloat();
			descuentoMenor = precio * descuento1;
			precioFinal=precio - descuentoMenor;
			System.out.println("El descuento es de:"+ descuentoMenor);
			System.out.println("El precio final es:"+descuentoMenor);
		}
		descuentoMayor = precio * descuento;
		precioFinal=precio - descuentoMayor;
		System.out.println("El descuento es de:"+descuentoMayor);
		System.out.println("El precio final es:"+descuentoMayor);
				
	}

}
