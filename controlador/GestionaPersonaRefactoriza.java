package controlador;

import modelo.*;

public class GestionaPersonaRefactoriza {
	
	public static void main(String[] args) {
		Persona3 carlos = new Persona3("Carlos R.");
		IAccion [] acciones = carlos.getAcciones();
		acciones[0]= new Estudiante3();
		System.out.println(carlos);
		Persona3 cristina = new Persona3 ("Cristina");
		IAccion [] acciones1 = cristina.getAcciones();
		acciones1[0]= new Estudiante3();
		acciones1[1]= new Empleado3();
		System.out.println(cristina);
		
		
		

	}
	

}
