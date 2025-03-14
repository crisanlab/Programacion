package modelo;

public class Audio extends ElementosMultimedia{
	

double duracionMinutos;
	
	public Audio (int id, String ubicacion, String nombre, String genero) {
		super(id, ubicacion, nombre, genero);
		// TODO Auto-generated constructor stub

}
	
	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return super.estaDisponible();
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return super.getDevuelveDiasPrestamo();
	}
	
	
}