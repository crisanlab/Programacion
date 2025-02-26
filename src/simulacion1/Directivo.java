package simulacion1;

import java.util.Objects;

public class Directivo extends Empleado {
	
	private float bonificacion;

	public Directivo(String nombre, String dNI, double salarioBase, float bonificacion) {
		super(nombre, dNI, salarioBase);
		this.nombre = nombre;
		DNI = dNI;
		this.bonificacion = bonificacion;
	}



	protected float getBonificacion() {
		return bonificacion;
	}


	protected void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bonificacion);
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
		Directivo other = (Directivo) obj;
		return Float.floatToIntBits(bonificacion) == Float.floatToIntBits(other.bonificacion);
	}

	


	@Override
	public String toString() {
		return "Directivo [bonificacion=" + bonificacion + ", nombre=" + nombre + ", DNI=" + DNI
				+ ",]";
	}



	protected double bonificacion (double salarioBase,float bonificacion) {
		double salarioTotal= salarioBase * bonificacion;
				return salarioTotal;
		
		

	
	}
	
}
