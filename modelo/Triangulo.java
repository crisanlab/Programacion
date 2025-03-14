package modelo;

public abstract class Triangulo extends Figura {

	int base=10;
	int altura = 10;
	@Override
	public double calcularArea() {
		
		return (base*altura)/2;
	}
	
	
}
	

