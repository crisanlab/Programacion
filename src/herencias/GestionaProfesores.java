package herencias;

import java.time.LocalDate;

public class GestionaProfesores {
	public static void main(String[] args) {
		ProfesorInterino interino1 = new ProfesorInterino("Pepe","Ingles",LocalDate.now().plusMonths(6));
		Profesor interino2 = new ProfesorInterino("Pepa","Historia",LocalDate.now().plusMonths(4));
		
		System.out.println(interino1.getFechaFinContrato());
		
		ProfesorInterino p3 = (ProfesorInterino)interino2; // Down Casting del tipo padre convierto al tipo hijo
		
	    System.out.println(p3.getFechaFinContrato());
		
		
		ProfesorTitular titular1= new ProfesorTitular ("Antonio","Filosofia",LocalDate.now().minusYears(1));
		System.out.println(titular1.getFechaAdjudicacionPlaza());
		Profesor titular2= new ProfesorTitular("Antonia","Lengua",LocalDate.now().plusMonths(10));
		
		ProfesorTitular p4 = (ProfesorTitular) titular2;
		System.out.println(p4.getFechaAdjudicacionPlaza());
		
		Profesor p5 = (Profesor)interino1; // Up Casting de hijo convierto a padre 
		System.out.println(p5.getSueldo());
		
		ProfesorTitular t1= (ProfesorTitular)interino2; // ClasCastException en tiempo de ejecución porque entre profesor interino y profesor titular no hay nada
	}

	
}
