package videojuegos;

public class Caballero extends Personaje {

	public Caballero(String nombre, int nivel, int puntosVida, String arma) {
		super(nombre, nivel, puntosVida, arma);

	}
	@Override
	boolean esAtacado (Personaje p){
		boolean atacado;
	if (p instanceof Mago)	
		atacado =true;
	else if (p instanceof Arquero){
		atacado=true;
	}
	else {
		atacado=false;
	}
		return atacado;	
	}

}
