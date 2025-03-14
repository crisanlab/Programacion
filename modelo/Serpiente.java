package modelo;

public class Serpiente extends Animal3 {

	public Serpiente(String nombre, TipoFamilia tipoFamilia, String lugar, Animal3[] animalesQueCome,
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
		return (a instanceof Roedor );
	}

	public Serpiente() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}
