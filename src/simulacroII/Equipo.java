package simulacroII;

import java.util.Objects;

public class Equipo {

	private  String nombre;
	private String direccion;
	private String sistemaOperativo;
	private int  numIncidente;
	//private Usuario usuario;
	
	public Equipo(String nombre, String direccion, String sistemaOperativo, int numIncidente) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.sistemaOperativo = sistemaOperativo;
		this.numIncidente = numIncidente;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDireccion() {
		return direccion;
	}

	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	protected String getSistemaOperativo() {
		return sistemaOperativo;
	}

	protected void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	protected int getNumIncidente() {
		return numIncidente;
	}

	protected void setNumIncidente(int numIncidente) {
		this.numIncidente = numIncidente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(direccion, other.direccion);
	}

	@Override
	public String toString() {
		return nombre + " - " + direccion + " : " + numIncidente ;
		//pcJuan -  3C:D9:2B:88:99:AA : 2 
	}


	
}
