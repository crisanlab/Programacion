package videojuegos;

public class Arquero extends Personaje {

	public Arquero(String nombre, int nivel, int puntosVida) {
		super(nombre, nivel, puntosVida,"Flecha");
		
	}
	
	@Override
	boolean esAtacado (Personaje p){
		boolean atacado;
	if (p instanceof Mago)	
		atacado =true;
	else {
		atacado=false;
	}
		return atacado;	
	}
	
	boolean esAtacado (Personaje p,int distancia){
		boolean atacado;
		if (p instanceof Mago)	
			atacado =true;
		else if (p instanceof Caballero && distancia < 50) {
			atacado=true;
		}
		else {
			atacado=false;
		}
			return atacado;
		
	}
	
}
