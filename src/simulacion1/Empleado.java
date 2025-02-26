package simulacion1;

import java.util.Objects;

public class Empleado {
	protected String nombre;
	protected String DNI;
	private double salarioBase;
	
	
	public Empleado(String nombre, String dNI, double salarioBase) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		setSalarioBase(salarioBase);
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected String getDNI() {
		return DNI;
	}

	protected void setDNI(String dNI) {
		boolean esDni=false;
		if(getDNI().matches("\\d{8}[A-Za-z]{1}")) {
			
		}
		DNI = dNI;
	}


	protected double getSalarioBase() {
		return salarioBase;
	}


	protected void setSalarioBase(double salarioBase) {
		if (salarioBase > 0) {
			this.salarioBase = salarioBase;
		}else {
			System.out.println("Error, se asigna SMI");
			this.salarioBase = 1134;
		}
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(DNI, nombre, salarioBase);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return  this.getDNI().equals(other.getDNI()); //comparar 2 dni
	}


	@Override
	public String toString() {
		return  "DNI:" +getDNI() + "nombre"+ getNombre() + "salarioBase" +
	}
	
	

}
