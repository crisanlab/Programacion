package videojuegos;

public class Mago extends Personaje {

	public Mago(String nombre, int nivel, int puntosVida) {
		super(nombre, nivel, puntosVida, "hechizo");
		
	}
	
	@Override
	boolean esAtacado (Personaje p){
		
		return false;
		
	
}
	boolean esAtacado (Personaje p,int distancia){
		
		return false;
		
	}
	
}