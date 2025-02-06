package programacionUD2.unidad2;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		Scanner miEscaner = new Scanner(System.in);
		int opcion;
		do
		{
			System.out.println("1.Asignar surtidor");
			System.out.println("2.Consultar estado");
			System.out.println("3.Asignar precio");
			System.out.println("4.Recoger surtidor");
			System.out.println("5.Cerrar");
			System.out.println();
			System.out.println("Escribe la opcion (en numeros):");
			opcion = miEscaner.nextInt();
			
			switch (opcion) {
			case 1:
				 System.out.println("Has elegido: Asignar susrtidor");
				 System.out.println();
	                break;
			case 2:
				System.out.println("Has elegido:Consultar estado");
				System.out.println();
	            break;
			case 3:
				System.out.println("Has elegido:Asignar precio");
				System.out.println();
	            break;
			case 4:
				System.out.println("Has elegido:Recoger surtidor");
				System.out.println();
	            break;
			case 5:
				System.out.println("Has elegido:Cerrar");
				System.out.println();
	            break;
			default:
				 System.out.println("Operación no válida. Por favor, elige una opción válida.");
				 System.out.println();
	                break;
			
			}
		}
		while (opcion !=5);
		
		
       }			
			
	}
