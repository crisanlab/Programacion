package examen_dispositivos;

public class Smartphone extends Telefono {
	private int cantidadCamaras;

	public Smartphone(String marca, String modelo, double precio, boolean tieneTecladoFisico, int cantidadCamaras) {
		super(marca, modelo, precio, tieneTecladoFisico);
		this.cantidadCamaras = cantidadCamaras;
	}
	
	@Override
	public double calcularPrecioDescuento(){
		double descuento=(getPrecio()*15)/100;
		double precioConDescuento = getPrecio()-descuento;
		return precioConDescuento;
		
		
}

	protected int getCantidadCamaras() {
		return cantidadCamaras;
	}

	protected void setCantidadCamaras(int cantidadCamaras) {
		this.cantidadCamaras = cantidadCamaras;
	}

}
