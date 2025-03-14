package modelo;

import java.util.Arrays;

public abstract  class Animal3 implements IDepredador,IPresa  {

	private String nombre;
	protected TipoFamilia tipoFamilia;
	private String lugar;
	private Animal3 [] animalesQueCome;
	private Animal3 [] animalesComidos;
	
	public Animal3(String nombre, TipoFamilia tipoFamilia, String lugar, Animal3[] animalesQueCome,
			Animal3[] animalesComidos) {
		super();
		this.nombre = nombre;
		this.tipoFamilia = tipoFamilia;
		this.lugar = lugar;
		this.animalesQueCome = animalesQueCome;
		this.animalesComidos = animalesComidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoFamilia getTipoFamilia() {
		return tipoFamilia;
	}
	public void setTipoFamilia(TipoFamilia tipoFamilia) {
		this.tipoFamilia = tipoFamilia;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public Animal3[] getAnimalesQueCome() {
		return animalesQueCome;
	}
	public void setAnimalesQueCome(Animal3[] animalesQueCome) {
		this.animalesQueCome = animalesQueCome;
	}
	public Animal3[] getAnimalesComidos() {
		return animalesComidos;
	}
	public void setAnimalesComidos(Animal3[] animalesComidos) {
		this.animalesComidos = animalesComidos;
	}
	
	@Override
	public boolean huir(Animal3 a) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean atacar(Animal3 a) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public Animal3() {
		super();
		this.setAnimalesComidos(new Animal3 [10]);
		this.setAnimalesQueCome(new Animal3 [10]);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Animal3 [nombre=" + nombre + ", tipoFamilia=" + tipoFamilia + ", lugar=" + lugar + ", animalesQueCome="
				+ Arrays.toString(animalesQueCome) + ", animalesComidos=" + Arrays.toString(animalesComidos) + "]";
	}
	
	
	
	
}
