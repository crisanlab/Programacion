package simulacion1;

import java.util.Objects;

public class Administrativo extends Empleado {
	
	private double extraProductividad;

	public Administrativo (String nombre, String dNI, double salarioBase, double extraProductividad) {
		super(nombre, dNI, salarioBase);
		this.nombre = nombre;
		DNI = dNI;
		this.extraProductividad = extraProductividad;
	}

	protected double getExtraProductividad() {
		return extraProductividad;
	}

	protected void setExtraProductividad(double extraProductividad) {
		
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(extraProductividad);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrativo other = (Administrativo) obj;
		return Double.doubleToLongBits(extraProductividad) == Double.doubleToLongBits(other.extraProductividad);
	}


	
	@Override
	public String toString() {
		return "Administrativo [extraProductividad=" + extraProductividad + ", nombre=" + nombre + ", DNI=" + DNI
				+ ", ]";
	}

	protected double extraProductividad (double salarioBase,double extraProductividad) {
		double salarioTotal= salarioBase + extraProductividad;
		
		return salarioTotal;
		
		
	}
}
