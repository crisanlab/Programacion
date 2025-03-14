package modelo;

public class Rapaz extends Animal3 {

	public Rapaz(String nombre, TipoFamilia tipoFamilia, String lugar, Animal3[] animalesQueCome,
			Animal3[] animalesComidos) {
		super(nombre, tipoFamilia, lugar, animalesQueCome, animalesComidos);
		// TODO Auto-generated constructor stub
	}

	
	
	public Rapaz() {
		super();
	
	}



	@Override
	public boolean huir(Animal3 a) {
	
		return (a instanceof Leon);
	}

	@Override
	public boolean atacar(Animal3 a) {
	
		return (a instanceof Serpiente || a instanceof Roedor);
	}

	
	

}
