package simulacion2;

import java.time.LocalDate;

public class Rematriculacion {

	private LocalDate fechaMatriculacion;
	private String matriculaInicial;
	private String matriculaFinal;
	
	public Rematriculacion(LocalDate fechaMatriculacion, String matriculaInicial, String matriculaFinal) {
		super();
		this.fechaMatriculacion = fechaMatriculacion;
		this.matriculaInicial = matriculaInicial;
		this.matriculaFinal = matriculaFinal;
	}

	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public String getMatriculaInicial() {
		return matriculaInicial;
	}

	public void setMatriculaInicial(String matriculaInicial) {
		this.matriculaInicial = matriculaInicial;
	}

	public String getMatriculaFinal() {
		return matriculaFinal;
	}

	public void setMatriculaFinal(String matriculaFinal) {
		this.matriculaFinal = matriculaFinal;
	}
	
	public String getInformacionRematriculacion() {
		return "Fecha: "+ fechaMatriculacion + ", De: " + matriculaInicial + " a " + matriculaFinal;
	}
}
