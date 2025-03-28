package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import examen1.modelo.MiembroBase;

public class MiembroLista {
	protected int id;
	protected String email;
	protected String nombre;
	private int contadorAmigos;
	private static int contadorIdentificador;
	protected String [] amigos;
	
	

	public MiembroLista(String email, String nombre, int contadorAmigos) {
		super();
		this.id = id+contadorIdentificador;
		this.email = email;
		this.nombre = nombre;
		this.contadorAmigos = contadorAmigos;
		contadorIdentificador=contadorIdentificador+1;
		this.amigos= new ArrayList <MiembroBase>();
	
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
		MiembroLista other = (MiembroLista) obj;
		return Objects.equals(email, other.email) && id == other.id;
	}

	
	public boolean isAmigo(MiembroLista a) {
		return amigos.contains(a);
		
	}

public List<MiembroLista> addAmigo (MiembroLista a){
	int num =0;
	List < MiembroLista > lista = new ArrayList <MiembroLista> ();
	lista.add(a);
	return lista;

	}


@Override
public String toString() {
	return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + "]";
}


}
