package Ordenacion.Ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Animal implements Comparable<Animal> {
	private int id;
	private String nombre;
	private String especie;
	private int edad;
	private ClasificacionComida clasificacionComida;
	private LocalDate fechaNacimiento;
	private double peso;
	private Medio medio;
	private ClasificacionGestion clasificacionGestion;
	
	
	public Animal(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public Animal(int id, String nombre, String especie, int edad, ClasificacionComida clasificacionComida,
			LocalDate fechaNacimiento, double peso, Medio medio, ClasificacionGestion clasificacionGestion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.clasificacionComida = clasificacionComida;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.medio = medio;
		this.clasificacionGestion = clasificacionGestion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return id == other.id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ClasificacionComida getClasificacionComida() {
		return clasificacionComida;
	}
	public void setClasificacionComida(ClasificacionComida clasificacionComida) {
		this.clasificacionComida = clasificacionComida;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Medio getMedio() {
		return medio;
	}
	public void setMedio(Medio medio) {
		this.medio = medio;
	}
	public ClasificacionGestion getClasificacionGestion() {
		return clasificacionGestion;
	}
	public void setClasificacionGestion(ClasificacionGestion clasificacionGestion) {
		this.clasificacionGestion = clasificacionGestion;
		
	}
	
	

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + "]";
	}
	@Override
	public int compareTo (Animal otroAnimal) {
		int resultadoComparar = this.nombre.compareTo(otroAnimal.getNombre());
		
		return resultadoComparar;
				
	

	}
	

}
