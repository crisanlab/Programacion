package examen_dispositivos;

public class Laptop extends Computadora{

	private double peso;

	public Laptop(String marca, String modelo, double precio, int capacidadRam, double peso) {
		super(marca, modelo, precio, capacidadRam);
		this.peso = peso;
	}
	
	
	
	protected double getPeso() {
		return peso;
	}



	protected void setPeso(double peso) {
		this.peso = peso;
	}



	@Override
	public double calcularPrecioDescuento(){
		double descuento=0;
		double precioConDescuento = 0;
		if(getPeso() > 2) {
		descuento=(getPrecio()*20)/100;
		precioConDescuento = getPrecio() - descuento;
		} else {
			descuento=(getPrecio()*12)/100;}
		precioConDescuento = getPrecio() - descuento;
		return precioConDescuento;
	}
}
