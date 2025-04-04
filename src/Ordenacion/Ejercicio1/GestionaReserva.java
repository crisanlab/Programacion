package Ordenacion.Ejercicio1;

import java.util.Collections;
import java.util.List;

public class GestionaReserva {
	public static void main(String[] args) {
		
		Animal a1 = new Animal (5, "pepe");
		Animal a2 = new Animal (1, "Juan");
		Animal a3 = new Animal (8, "Maria");
		Animal a4 = new Animal (15, "Carlos");
		Animal a5 = new Animal (20, "Dario");
		
		ReservaAnimales r1 = new ReservaAnimales ("Reserva 1","Sevilla",300);
		
		r1.addAnimal(a1);
		r1.addAnimal(a2);
		r1.addAnimal(a3);
		
		r1.mostarAnimales();
		
		
		
		List <Animal> listaAnimal = r1.fromSetToList();
		//Sin ordenador
		System.out.println(listaAnimal);
		//Ordenados por nombre
		Collections.sort(listaAnimal);
		System.out.println(listaAnimal);
		//Al añadir otro se añade al final, no esta ordenados denuevo
		listaAnimal.add(a4);
		System.out.println(listaAnimal);
		//Lo vuelvo a ordenar
		Collections.sort(listaAnimal);
		System.out.println(listaAnimal);
		
		r1.addAnimal(a5);
		System.out.println(listaAnimal);
		
	}
}
