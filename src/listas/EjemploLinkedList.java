package listas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
	public static void main(String[] args) {
		
	List<String> ciudades = new LinkedList<String>();
	ciudades.add("Madrid"); 
	ciudades.add("Barcelona");
	ciudades.add("Sevilla");
	ciudades.add("Madrid"); //repetido

	//Iteramos sobre el conjunto
	Iterator<String> itr = ciudades.iterator();
	while(itr.hasNext()) //.hasNext() mirar si hay elementos
		 System.out.println(itr.next());
   }
}