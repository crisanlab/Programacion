package vehiculo;

import java.time.LocalDate;

public class Alquiler {
private int id;
private VehiculoGeneral vehiculo;
private String numPermisoC;
private String dni;
private LocalDate fechaInicio;
private LocalDate fechaFin;
private int numDias;
private EstadoAlquiler estado;




public Alquiler(int id, VehiculoGeneral vehiculo, String numPermisoC, String dni, LocalDate fechaInicio,
		LocalDate fechaFin, int numDias, EstadoAlquiler estado) {
	super();
	this.id = id;
	this.vehiculo = vehiculo;
	this.numPermisoC = numPermisoC;
	this.dni = dni;
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.numDias = numDias;
	this.estado = estado;
}




public int getId() {
	return id;
}




public void setId(int id) {
	this.id = id;
}




public VehiculoGeneral getVehiculo() {
	return vehiculo;
}




public void setVehiculo(VehiculoGeneral vehiculo) {
	this.vehiculo = vehiculo;
}




public String getNumPermisoC() {
	return numPermisoC;
}




public void setNumPermisoC(String numPermisoC) {
	this.numPermisoC = numPermisoC;
}




public String getDni() {
	return dni;
}




public void setDni(String dni) {
	this.dni = dni;
}




public LocalDate getFechaInicio() {
	return fechaInicio;
}




public void setFechaInicio(LocalDate fechaInicio) {
	this.fechaInicio = fechaInicio;
}




public LocalDate getFechaFin() {
	return fechaFin;
}




public void setFechaFin(LocalDate fechaFin) {
	this.fechaFin = fechaFin;
}




public int getNumDias() {
	return numDias;
}




public void setNumDias(int numDias) {
	this.numDias = numDias;
}




public EstadoAlquiler getEstado() {
	return estado;
}




public void setEstado(EstadoAlquiler estado) {
	this.estado = estado;
}




	
}
