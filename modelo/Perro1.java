package modelo;

import java.time.LocalDate;

public class Perro1 extends Mascota {

	private String raza;
	private boolean pulgas;
	
	public Perro1(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
		super(nombre, edad, estado, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String habla() {
		// TODO Auto-generated method stub
		return "guau";
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public boolean isPulgas() {
		return pulgas;
	}
	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}
	

}
