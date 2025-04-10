package simulacion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vehiculo {
	
	private String numBastidor;
	private int numMatricula;
	private String marca;
	private String modelo;
	private int anioFabricacion;
	private String propietarioActual;
	private List <Rematriculacion> rematriculaciones;
	

	public Vehiculo(String numBastidor, int numMatricula, String marca, String modelo, int anioFabricacion,
			String propietarioActual) {
		super();
		this.numBastidor = numBastidor;
		this.numMatricula = numMatricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.propietarioActual = propietarioActual;
		this.rematriculaciones = new ArrayList<>();
	}

	
	
	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getPropietarioActual() {
		return propietarioActual;
	}



	public void setPropietarioActual(String propietarioActual) {
		this.propietarioActual = propietarioActual;
	}



	public List<Rematriculacion> getRematriculaciones() {
		return rematriculaciones;
	}



	public void setRematriculaciones(List<Rematriculacion> rematriculaciones) {
		this.rematriculaciones = rematriculaciones;
	}

public void registrarRematriculacion (Rematriculacion rematriculacion) {
	rematriculaciones.add(rematriculacion);
}
	
public void mostrarRematriculaciones () {
	for (Rematriculacion rematriculacion : rematriculaciones) {
		System.out.println(rematriculacion.getInformacionRematriculacion());
	}
}

public List<Rematriculacion> getRematriculacionesPorAnio(int anio) {
	List<Rematriculacion> resultado = new ArrayList<>();
	for (Rematriculacion rematriculacion : rematriculaciones) {
		if (rematriculacion.getFechaMatriculacion().getYear() == anio) {
			resultado.add(rematriculacion);
		}
	}
	return resultado;
}

	@Override
	public int hashCode() {
		return Objects.hash(numBastidor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return numBastidor == other.numBastidor;
	}
	@Override
	public String toString() {
		return "Vehiculo [numBastidor=" + numBastidor + ", numMatricula=" + numMatricula + ", marca=" + marca
				+ ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + ", propietarioActual="
				+ propietarioActual + "]";
	}
	
	
	
}
