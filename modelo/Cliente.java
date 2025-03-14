package modelo;

public class Cliente {
	private String nombre;
	private String dni;
	private String apellido;
	
	
	public Cliente(String nombre, String dni,String apellido) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.apellido = apellido;
	}



	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDni() {
		return dni;
	}


	protected void setDni(String dni) {
		this.dni = dni;
	}


	protected String getApellido() {
		return apellido;
	}


	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}



	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", apellido=" + apellido + "]";
	}


}
