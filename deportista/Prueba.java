package deportista;

import java.time.LocalDate;

public class Prueba {
 
	protected int id;
	protected LocalDate fechaPrueba;
	protected EstadoPrueba estado;
	
	
	public Prueba(int id, LocalDate fechaPrueba, EstadoPrueba estado) {
		super();
		this.id = id;
		this.fechaPrueba = fechaPrueba;
		this.estado = estado;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getFechaPrueba() {
		return fechaPrueba;
	}


	public void setFechaPrueba(LocalDate fechaPrueba) {
		this.fechaPrueba = fechaPrueba;
	}


	public EstadoPrueba getEstado() {
		return estado;
	}


	public void setEstado(EstadoPrueba estado) {
		this.estado = estado;
	}
	
	
	
}
