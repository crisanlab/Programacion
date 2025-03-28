package listas;

import java.util.Arrays;
import java.util.Objects;

import modelo.Mascota;



public abstract  class MiembroBase {

	protected int id;
	protected String email;
	protected String nombre;
	private int contadorAmigos;
	private static int contadorIdentificador;
	protected String [] amigos;
	
	

	public MiembroBase(String email, String nombre, int contadorAmigos) {
		super();
		this.id = id+contadorIdentificador;
		this.email = email;
		this.nombre = nombre;
		this.contadorAmigos = contadorAmigos;
		contadorIdentificador=contadorIdentificador+1;
	
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getContadorAmigos() {
		return contadorAmigos;
	}


	public void setContadorAmigos(int contadorAmigos) {
		this.contadorAmigos = contadorAmigos;
	}


	
	public abstract String getTipoUsuario();
	
	
	
	
@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MiembroBase other = (MiembroBase) obj;
		return Objects.equals(email, other.email) && id == other.id;
	}

	
	public boolean isAmigo() {
		boolean isAmigo=false;
		for (int i=0;i<amigos.length;i++) {
			if(amigos == amigos ) {
				isAmigo=true;	
			} else {
				isAmigo=false;
			}
		}
		return isAmigo;
		
	}

void addAmigo ()  {
	
	}


@Override
public String toString() {
	return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + "]";
}







}
