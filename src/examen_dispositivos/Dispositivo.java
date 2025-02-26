package examen_dispositivos;

import java.util.Objects;

public class Dispositivo {
	private String marca;
	private String modelo;
	private double precio;
	
	
	public Dispositivo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		setPrecio(precio);
	}


	protected String getMarca() {
		return marca;
	}


	protected void setMarca(String marca) {
		this.marca = marca;
	}


	protected String getModelo() {
		return modelo;
	}


	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}


	protected double getPrecio() {
		return precio;
	}


	protected void setPrecio(double precio) {
		
		if(precio<0) {
			System.out.println("Error");
			this.precio = 1.00;
		}else {
		
		this.precio = precio;}
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, precio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	

	@Override
	public String toString() {
		return "Marca:" + marca + "- Modelo:" + modelo + "- Precio: "+ getPrecio() + "  -Precio con descuento: " + calcularPrecioDescuento();
	}


	public double calcularPrecioDescuento(){
		double descuento=(getPrecio()*10)/100;
		double precioConDescuento = getPrecio()-descuento;
		return precioConDescuento;
		
	}

}
