package modelo;

import java.util.Objects;

public abstract class Robot {
private int id;
private String modelo;
private int bateria;
private String combustible;
private String descripcion;
private Estado estado;
private static int contador;

public Robot(String modelo,int bateria, String combustible, String descripcion,Estado estado) {
	super();
	this.id = contador +1;
	this.modelo = modelo;
	setBateria(bateria);
	this.combustible = combustible;
	this.descripcion = descripcion;
	contador=contador+1;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getBateria() {
	return bateria;
}

public void setBateria(int bateria) {
	if (bateria > 10 ) {
		System.out.println("Hay bateria suficiente");
		this.bateria = bateria;
	}else {
		System.out.println("No hay bateria suficiente");
		this.bateria = bateria;
		}
	}
	


public String getCombustible() {
	return combustible;
}

public void setCombustible(String combustible) {
	this.combustible = combustible;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public Estado getEstado() {
	return estado;
}

public void setEstado(Estado estado) {
	this.estado = estado;
}

public static int getContador() {
	return contador;
}

public static void setContador(int contador) {
	Robot.contador = contador;
}


public abstract  String ejecutarTarea();
public abstract boolean recargar();

@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Robot other = (Robot) obj;
	return id == other.id;
}

@Override
public String toString() {
	return "Robot [id=" + id + ", modelo=" + modelo + ", bateria=" + bateria + ", estado=" + estado + "]";
}




}
