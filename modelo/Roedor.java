package modelo;

public class Roedor extends Animal3 {

	public Roedor(String nombre, TipoFamilia tipoFamilia, String lugar, Animal3[] animalesQueCome,
			Animal3[] animalesComidos) {
		super(nombre, tipoFamilia, lugar, animalesQueCome, animalesComidos);
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Roedor() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public boolean huir(Animal3 a) {
	
		return (a instanceof Serpiente);
	}

	@Override
	public boolean atacar(Animal3 a) {
		
		return false;
	}

	
}
