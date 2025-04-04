package ordenacionAgendaContactos;

import java.util.Objects;

public class Contacto implements Comparable<Contacto> {
	private String nombre;
	private String apellidos;
	private String email;
	private String direccion;
	private String numeroTelefono;
	
	
	
	public Contacto(String nombre, String apellidos, String email, String direccion, String numeroTelefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.direccion = direccion;
		this.numeroTelefono = numeroTelefono;
	}



	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public String getNumeroTelefono() {
		return numeroTelefono;
	}



	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}



	@Override
	public int compareTo(Contacto c) {
		int compare = this.nombre.compareTo(c.nombre);
		if (compare == 0)
			compare = this.apellidos.compareTo(c.apellidos);
		return compare;
	}



	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + ", numeroTelefono=" + numeroTelefono + "]";
	}


	

}
