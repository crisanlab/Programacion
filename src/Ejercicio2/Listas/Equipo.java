package Ejercicio2.Listas;

import java.util.HashSet;
import java.util.Set;

public class Equipo {
	private String nombreEquipo;
	private Set <Alumno> alumnos= new HashSet <Alumno>();
	
	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		alumnos = new HashSet <Alumno>();
	}


	public String getNombreEquipo() {
		return nombreEquipo;
	}


	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}


	public Set<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public boolean addAlumno (Alumno a) throws DeportivosException {
		boolean agregado= false;
		if (alumnos.contains(a) ) {
			throw new DeportivosException ("El alumno ya estaba agregado");
		}else {
			agregado = alumnos.add(a);
		}
		return agregado;
		
		
	}
	
	public boolean deleteAlumno (Alumno a) throws DeportivosException {
		boolean existe= false;
		if (alumnos.contains(a) ) {
			alumnos.remove(a);	
			existe=true;
		}else {
			existe = false;
			throw new DeportivosException ("El alumno que intentas borrar no existe");
			
		}
		return existe;
		
	}
	
	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", alumnos=" + alumnos + "]";
	}


	public Equipo unionEquipos (Equipo e ) {
		Equipo union = new Equipo("Equipos unidos");
				union.alumnos.addAll(this.alumnos);
		union.alumnos.addAll(e.alumnos);
		return union;
				}
	
	public Equipo interseccionEquipos (Equipo e ) {
		Equipo inter = new Equipo ("Jugadores que forman parte de los dos equipos");
		inter.alumnos.addAll(this.alumnos);
		inter.alumnos.retainAll(e.alumnos);
		return inter;
	}
	
	
}
