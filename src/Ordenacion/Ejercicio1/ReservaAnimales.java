package Ordenacion.Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ReservaAnimales {
	private String nombre;
	private String lugar;
	private int presupuestoAnual;
	private HashSet<Animal> listaAnimales;
	
	
	public ReservaAnimales(String nombre, String lugar, int presupuestoAnual) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.presupuestoAnual = presupuestoAnual;
		listaAnimales = new HashSet<Animal>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public int getPresupuestoAnual() {
		return presupuestoAnual;
	}


	public void setPresupuestoAnual(int presupuestoAnual) {
		this.presupuestoAnual = presupuestoAnual;
	}


	public HashSet<Animal> getListaAnimales() {
		return listaAnimales;
	}


	public void setListaAnimales(HashSet<Animal> listaAnimales) {
		this.listaAnimales = listaAnimales;
	}


	public ReservaAnimales(String nombre, String lugar, int presupuestoAnual, HashSet<Animal> listaAnimales) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.presupuestoAnual = presupuestoAnual;
		this.listaAnimales = listaAnimales;
	}
	
	void addAnimal (Animal a) {
	   listaAnimales.add(a);
	}

	void mostarAnimales () {

	System.out.println("Animales:" +getNombre() + listaAnimales.toString());
  }
	
	public List <Animal> fromSetToList () {
		
		List<Animal> animales = new ArrayList <Animal>();
	
		for (Animal animal : listaAnimales) {
			animales.add(animal);
			
		}
		
		return animales;
		
	}
	
	
}
