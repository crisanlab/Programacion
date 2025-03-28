package listas;

import java.util.ArrayList;
import java.util.List;

public class AñadirLista {

	public static void main(String[] args) {
		
		List < String > lista = new ArrayList <String> ();
		//String [] tabla = new String[10]; //tabla
		lista.add("Pedro");
		lista.add("David");
		lista.add("Miguel");
		lista.add("Antonio");
		lista.add("Pedro");
		
		lista.remove("Pedro");//.remove() eliminar elemento
		lista.remove(1);// .remove() elimina por posicion
		
		/*for (String cadena:tabla) {
			System.out.println(cadena);
		}*/
		
		
		
		for (String cadena:lista) { // recorro la lista para imprimirla
			System.out.println(lista);
		}
		
		System.out.println(lista.size()); //.size() (saber la longitud, cuantos elementos tengo)
	}

	
}
