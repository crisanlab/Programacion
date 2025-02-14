package herencia;

public class Automovil extends Vehiculo {
	
	public Automovil(String dueno, int numPuertas, int numRuedas, CalificacionEco calificacionEcologica) {
		super(dueno, numPuertas, numRuedas);
		setCalificacionEcologica(calificacionEcologica);
	}


			
	protected enum CalificacionEco{
		ECO,O,B,C;
		
	}
	

	public CalificacionEco getCalificacionEcologica() { // get el valor
		return calificacionEcologica;
	}

	public void setCalificacionEcologica(CalificacionEco calificacionEcologica) { // set le pone valor
		if (calificacionEcologica.equals(CalificacionEco.ECO)|| calificacionEcologica.equals(CalificacionEco.O)|| calificacionEcologica.equals(CalificacionEco.B)|| (calificacionEcologica.equals(CalificacionEco.C))) {
		this.calificacionEcologica = calificacionEcologica;
		else if ()
	
	}

	@Override
	public String toString() {
		return "Automovil [calificacionEcologica=" + calificacionEcologica + "]";
	}


}
