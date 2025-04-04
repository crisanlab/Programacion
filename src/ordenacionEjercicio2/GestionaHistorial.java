package ordenacionEjercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionaHistorial {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		GestionaHistorial f = new GestionaHistorial();
		List<Libro> listaLibrosBiblioteca = new ArrayList<Libro>();
		Biblioteca b = new Biblioteca(listaLibrosBiblioteca);
		boolean salir = false;
		while (!salir) {
			int opcion = f.menu(input);

			switch (opcion) {
			case 1: {
				
				input.n
				f.agregarPagina(p);
				break;
			}

			case 2: {

				f.consultarHistorialCompleto(b);

				break;
			}

			case 3: {

				f.consultarHistorialDia(b);

				break;
			}

			case 4: {
				f.consultarRegistrosUrl(b);
				break;
			}

			case 5: {
				f.borrarVisitas(b);
				break;
			}

	
			case 6: {
				salir = f.salirPrograma();
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
		System.out.println("1. Agregar página al historia");
		System.out.println("2. Consultar historial completo de todos los días");
		System.out.println("3. Consultar historial de un día");
		System.out.println("4. Consultar registros del historial para una url");
		System.out.println("5. Borrar visitas a una página");
		System.out.println("6. Salir");
		System.out.println();
		System.out.println("Introduce la opción del menú: ");
		opcion = input.nextInt();
		return opcion;

	}
	
}
