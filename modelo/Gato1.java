package modelo;

import java.time.LocalDate;

public class Gato1 extends Mascota {
	
	private String color;
	private boolean peloLargo;
	
	public Gato1(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
		super(nombre, edad, estado, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return toString();
	}
	
	
	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}

	

	}


