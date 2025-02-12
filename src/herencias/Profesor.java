package herencias;

public class Profesor extends Persona {
	

	private String nombreDepartamento;
	
	protected double sueldo; 
	
	public Profesor(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Profesor(String nombre, String nombreDepartamento,double sueldo) {
		super(nombre);
		this.nombreDepartamento = nombreDepartamento;
		this.sueldo= sueldo; 
	}

	protected String getNombreDepartamento() {
		return nombreDepartamento;
	}

	protected void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	
	

	protected double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Profesor [nombreDepartamento=" + nombreDepartamento + ", getNombre()=" + super.getNombre() + "]";
	}


	
	
	
	

}
