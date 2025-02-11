package herencias;

public class Coche extends Vehiculo {
	private String calificacionEcologica;

	public Coche(String dueno, int numPuertas, int numRuedas, String clase) {
		super(dueno, numPuertas, numRuedas);
		// TODO Auto-generated constructor stub
	}

	public Coche(String dueno, int numPuertas, int numRuedas, String calificacionEcologica) {
		super(dueno, numPuertas, numRuedas);
		this.calificacionEcologica = calificacionEcologica;
	}

	public String getCalificacionEcologica() {
		return calificacionEcologica;
	}

	public void setCalificacionEcologica(String calificacionEcologica) {
		this.calificacionEcologica = calificacionEcologica;
	}

	@Override
	public String toString() {
		return "Coche [calificacionEcologica=" + calificacionEcologica + ", dueno=" + dueno + ", numPuertas="
				+ numPuertas + ", numRuedas=" + numRuedas + "]";
	}

	

}
