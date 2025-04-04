package Ejercicio2.Listas;

import java.util.Collections;
import java.util.List;

public class GestionaEquipos {
public static void main(String[] args) {
	Alumno a1=new Alumno("Maria","12345678A");
	Alumno a2=new Alumno("Pepe","87654321B");
	Alumno a3=new Alumno("Juan","74938734C");
	Alumno a4=new Alumno("Carlos","29674437D");
	
	Equipo p = new Equipo("Equipo1");
	Equipo p2 = new Equipo("Equipo2");
	
	try {
		p2.addAlumno(a4);
		p.addAlumno(a3);
	} catch (DeportivosException e) {
		System.out.println("Error:"+ e.getMessage());
	}
	try {
		p.deleteAlumno(a1);
	} catch (DeportivosException e) {
		System.out.println("Error:"+ e.getMessage());
	}
	
	System.out.println("Lista equipo");
	System.out.println(p.toString());    
	System.out.println(p2.toString());  
	
	
	
	Collections.sort();
	
  }
}
