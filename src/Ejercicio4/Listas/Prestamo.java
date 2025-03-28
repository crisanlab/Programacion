package Ejercicio4.Listas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import ListasEjercicio3.Libro;


public class Prestamo {
	private List<Prestamo> prestamos;
	private int id;
	private Libro libro;
	private String nombreUsuarioDni;
	private LocalDate fechaPrestamo;
	
	
	public Prestamo(List<Prestamo> prestamos, int id, Libro libro, String nombreUsuarioDni, LocalDate fechaPrestamo) {
		super();
		this.prestamos = new LinkedList<Prestamo>();
		this.id = id;
		this.libro = libro;
		this.nombreUsuarioDni = nombreUsuarioDni;
		this.fechaPrestamo = fechaPrestamo;
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getNombreUsuarioDni() {
		return nombreUsuarioDni;
	}

	public void setNombreUsuarioDni(String nombreUsuarioDni) {
		this.nombreUsuarioDni = nombreUsuarioDni;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaPrestamo, libro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return Objects.equals(fechaPrestamo, other.fechaPrestamo) && Objects.equals(libro, other.libro);
	}
	
	

}
