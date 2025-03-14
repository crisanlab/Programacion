package modelo;

public class Pelicula extends ElementosMultimedia {

	double duracionMinutos;
	
	
	
	public Pelicula(int id, String ubicacion, String nombre, String genero, double duracionMinutos) {
		super(id, ubicacion, nombre, genero);
		this.duracionMinutos = duracionMinutos;
	}

	double getDuracionMinutos() {
		return 0;
	}



	@Override
	public String toString() {
		return "Pelicula [duracionMinutos=" + duracionMinutos + ", getNombre()=" + getNombre() + ", getGenero()="
				+ getGenero() + "]";
	}




	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}



	
	
}
