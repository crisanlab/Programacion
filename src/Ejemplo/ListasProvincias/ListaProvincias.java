package Ejemplo.ListasProvincias;

import java.util.LinkedList;
import java.util.List;


public class ListaProvincias {

	private List<Provincia> provincias=new LinkedList<Provincia>();

	public boolean addSinRepetido (Provincia p) throws ProvinciaRepetidaException {
		boolean agregado= false;
		if (provincias.contains(p) ) {
			throw new ProvinciaRepetidaException("Provincia repedita");
		}else {
			agregado = provincias.add(p);
		}
		return agregado;
		
		
	}
	
	public Provincia setSinRepetidos (int index, Provincia nuevaProvincia) throws ProvinciaRepetidaException {
		Provincia actual = provincias.get(index);
		if (provincias.contains(nuevaProvincia))
			throw new ProvinciaRepetidaException("Provincia repedita");
		else 
			actual = provincias.set(index,nuevaProvincia);
		
		return actual;
	
	
}
	public static void main(String[] args) {
		
		ListaProvincias listaProvincias = new ListaProvincias();
		
		try {
			listaProvincias.addSinRepetido(new Provincia ("Sevilla",1950000));
			listaProvincias.addSinRepetido(new Provincia ("Cadiz",1240000));
			listaProvincias.addSinRepetido(new Provincia ("Huelva",524000));
			listaProvincias.addSinRepetido(new Provincia ("Cadiz",1300000));
		} catch (ProvinciaRepetidaException e) {
			System.out.println("Error:"+ e.getMessage());
		}
		System.out.println("Lista final");
		for (Provincia p: listaProvincias.provincias) {
			System.out.println(p);
		}
 }
}