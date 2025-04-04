package ordenacionAgendaContactos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionaAgenda {

	public static void main(String[] args) {
		
		 Agenda agenda = new Agenda();
	     Scanner scanner = new Scanner(System.in);
	     agregarContacto(scanner,agenda);
	     Scanner input = new Scanner(System.in);
			boolean salir = false;
			while (!salir) {
				int opcion = f.menu(input);

				switch (opcion) {
				case 1: {
					agenda.agregarContacto(c);
					break;
				}

				case 2: {

					agenda.eliminarContanto(c);

					break;
				}

				case 3: {

			

					break;
				}

				case 4: {
				
					break;
				}

				case 5: {
					salir = agenda.salirPrograma();
					break;
				}

				default:
					System.out.println("Valor inexperado: " + opcion + ". Por favor, ingrese opción nuevamente.");
					System.out.println();
				}
			}
	    
	}
	
	int menu(Scanner input) {
		int opcion;
		System.out.println("--- Menu ---");
		System.out.println("1. Agregar un nuevo contacto a la agenda");
		System.out.println("2. Eliminar un contacto existente de la agenda");
		System.out.println("3. Buscar un contacto por su nombre y apellido y mostrar su número de teléfono e email");
		System.out.println("4. Mostrar todos los contactos de la agenda en orden alfabético por nombre y apellidos.");
		System.out.println("5. Salir del programa");
		System.out.println();
		System.out.println("Introduce la opción del menú: ");
		opcion = input.nextInt();
		return opcion;

	}

	
	private static void agregarContacto (Scanner miescaner,Agenda agenda) {
		System.out.println("Escribe el nombre:");
		String nombre= miescaner.nextLine();
		System.out.println("Escribe el apellido:");
		String apellido= miescaner.nextLine();
		System.out.println("Escribe el email:");
		String email= miescaner.nextLine();
		System.out.println("Escribe la direccion:");
		String direccion= miescaner.nextLine();
		System.out.println("Escribe el numero de telefono:");
		int numero= miescaner.nextInt();
		Contacto c1 = new Contacto(nombre, apellido, email, direccion, numero);
		agenda.addContacto(c1);
		System.out.println("Contacto añadido");
		System.out.println();	
	}
	
	private static void eliminarContacto (Scanner miescaner,Agenda agenda) {
		System.out.println("Escribe el nombre:");
		String nombre= miescaner.nextLine();
		System.out.println("Escribe el apellido:");
		String apellido= miescaner.nextLine();
	
	}
}
