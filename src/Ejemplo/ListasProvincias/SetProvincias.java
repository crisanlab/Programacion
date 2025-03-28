package Ejemplo.ListasProvincias;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetProvincias {

public static void main(String[] args) {
	ListaProvincias listaProvincias = new ListaProvincias();
	   Set <Provincia> provincias=new HashSet<Provincia>();
	
		
	        provincias.add(new Provincia ("Sevilla",1950000));
			provincias.add(new Provincia ("Cadiz",1240000));
			provincias.add(new Provincia ("Huelva",524000));
			provincias.add(new Provincia ("Cadiz",1300000));

		    System.out.println("Lista final");
		    for (Provincia p: provincias) {
		    	System.out.println(p.toString());
		    }
			
			
		
  }
}
	

