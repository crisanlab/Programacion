package herencias;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
	public ProfesorInterino(String nombre, String nombreDepartamento, LocalDate localDate) {
		super(nombre, nombreDepartamento, sueldo);
		// TODO Auto-generated constructor stub
	}

	private LocalDate fechaFinContrato;

	public ProfesorInterino(String nombre, LocalDate fechaFinContrato) {
		super(nombre);
		this.fechaFinContrato = fechaFinContrato;
	}

	protected LocalDate getFechaFinContrato() {
		return fechaFinContrato;
	}

	protected void setFechaFinContrato(LocalDate fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [fechaFinContrato=" + fechaFinContrato + ", getNombreDepartamento()="
				+ getNombreDepartamento() + ", getNombre()=" + getNombre() + "]";
	}

	

}
