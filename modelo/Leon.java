package modelo;

import java.util.Arrays;

public class Leon extends Animal3 {

	public Leon(String nombre, TipoFamilia tipoFamilia, String lugar, Animal3[] animalesQueCome,
			Animal3[] animalesComidos) {
		super(nombre, tipoFamilia, lugar, animalesQueCome, animalesComidos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean huir(Animal3 a) {
	
		return false;
	}

	@Override
	public boolean atacar(Animal3 a) {
		// TODO Auto-generated method stub
		return true;
	}

	public Leon() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Leon [tipoFamilia=" + tipoFamilia + ", getNombre()=" + getNombre() + ", getTipoFamilia()="
				+ getTipoFamilia() + ", getLugar()=" + getLugar() + ", getAnimalesQueCome()="
				+ Arrays.toString(getAnimalesQueCome()) + ", getAnimalesComidos()="
				+ Arrays.toString(getAnimalesComidos()) + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
