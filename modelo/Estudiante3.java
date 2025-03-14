package modelo;

public class Estudiante3 extends Persona3 implements IAccion{

	

	@Override
	public String ejecutaAccion() {
		return "Estudiante estudia";
		
	}

	@Override
	public String toString() {
		return ejecutaAccion();
	}

	
	
}
