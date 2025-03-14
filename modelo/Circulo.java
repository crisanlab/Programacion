package modelo;

public class Circulo {
	private double radio;
	private  static int contador;
	private int id;
	public final static double PI =3.1416;

	public Circulo(double radio) {
		super();
		this.radio = radio;
		this.id = contador+1; // lo estático no necesita this
		contador=contador + 1;
	}

	protected double getRadio() {
		return radio;
	}

	protected void setRadio(double radio) {
		this.radio = radio;
	}

	
	


	@Override
	public String toString() {
		return "Circulo [radio= " + radio + ", id= " + id + "  area= "+ this.calculaArea()+"]";
	}

	public double calculaArea () {
		return PI*this.radio*this.radio;
	}
	
	
	

}
