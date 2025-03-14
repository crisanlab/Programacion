package controlador;

import java.util.Scanner;

import modelo.Persona;

public class GestionaPersona {
	
public static void main(String[] args) {
	/*Persona p1 = new Persona ("Pepe",20);
	Persona.validaSiDniValido("12c");
	System.out.println(p1); */
	
	GestionaPersona g = new GestionaPersona();
	g.imprimeNoEstatico(); //no es estatico, me creo new lo que sea
	GestionaPersona.imprimeEstatico();// es de tipo estatico asi que lo llamo desde la clase, tb valdria imprimeEstatico()
	
	//this.imprimeEstatico()  desde el this no accedo a lo que es estático
	
	Scanner miEscaner = new Scanner(System.in);
	System.out.println("introduce una cadena: ");
	String dni = miEscaner.next();
	
	while (!dni.equals("fin")) {
		
		if (Persona.validaSiDniValido(dni)) {
			Persona p1 = new Persona ("Pepe",20);
			
			System.out.println("Dni válido");
		} else {
			System.out.println("Dni no válido");
		}
		System.out.println("Escribe otra una cadena hasta poner fin:");
		dni = miEscaner.next();
	}
	
	
	
	
	
	/*Persona p2 = new Persona ("Jose",50);
	System.out.println(p2); */
		
}
	void imprimeNoEstatico() {
		System.out.println("No estático");
}

	static void imprimeEstatico () {
		System.out.println("Estático");
}
}