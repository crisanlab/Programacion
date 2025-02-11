package herencias;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {
	public ProfesorTitular(String nombre, String nombreDepartamento, LocalDate localDate) {
		super(nombre, nombreDepartamento);
		// TODO Auto-generated constructor stub
	}

	private LocalDate fechaAdjudicacionPlaza;

	public ProfesorTitular(String nombre, LocalDate fechaAdjudicacionPlaza) {
		super(nombre);
		this.fechaAdjudicacionPlaza = fechaAdjudicacionPlaza;
	}

	protected LocalDate getFechaAdjudicacionPlaza() {
		return fechaAdjudicacionPlaza;
	}

	protected void setFechaAdjudicacionPlaza(LocalDate fechaAdjudicacionPlaza) {
		this.fechaAdjudicacionPlaza = fechaAdjudicacionPlaza;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [fechaAdjudicacionPlaza=" + fechaAdjudicacionPlaza + ", getNombreDepartamento()="
				+ getNombreDepartamento() + ", getNombre()=" + getNombre() + "]";
	}
	

}
