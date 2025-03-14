package modelo;

public abstract class Animal {// abstracto ( todos los animales emiten sonido y comen)
	String nombre;
	public abstract String getSonidoQueEmite (); // metodo abstracto, no tiene llaves 
	public abstract String getAlimento ();
		
	
}
