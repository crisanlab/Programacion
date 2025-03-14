package modelo;

public class Empleado3 extends Persona3 implements IAccion {



	@Override
	public String ejecutaAccion() {
	return "Trabajador que trabaja";
		
	}
	

	@Override
	public String toString() {
		return ejecutaAccion();
	}


	
}
