package herencia;

public class CocheElectrico extends Automovil {
	private String tipoBateria;

	public CocheElectrico(String dueno, int numPuertas, int numRuedas, CalificacionEco calificacionEcologica) {
		super(dueno, numPuertas, numRuedas, calificacionEcologica);
	
	}

	protected String getTipoBateria() {
		return tipoBateria;
	}

	protected void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}
	
	
}
