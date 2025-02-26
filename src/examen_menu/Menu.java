package examen_menu;

import java.time.LocalDate;

public class Menu {
	private int id;
	private String nombre;
	private int consumoCalorico;
	private double  precioVenta;
	private double precioCoste;
	private TipoDieta tipoDieta;
	private LocalDate dia;
	private int unidades;
	
	
	public Menu(int id, String nombre, int consumoCalorico, double precioVenta, double precioCoste, TipoDieta tipoDieta,
			LocalDate dia, int unidades) {
		super();
		this.id = id;
		this.nombre = nombre;
		setConsumoCalorico(consumoCalorico);
		setPrecioVenta(precioVenta);
		setPrecioCoste(precioCoste);
		this.tipoDieta = tipoDieta;
		this.dia = dia;
		this.unidades = unidades;
	}


	protected int getId() {
		return id;
	}


	protected void setId(int id) {
		this.id = id;
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected int getConsumoCalorico() {
		return consumoCalorico;
	}


	protected void setConsumoCalorico(int consumoCalorico) {
		if (getConsumoCalorico() < 1000) {
			
		System.out.println("Es bajo en calorias");
			
		}else {
	
		System.out.println("Alto en calorias");}
	}


	protected double getPrecioVenta() {
		return precioVenta;
	}


	protected void setPrecioVenta(double precioVenta) {
		double porcentaje= 0;
		double precioFinal=0;
		porcentaje=(getPrecioCoste()*30)/100;
		precioFinal=getPrecioCoste()+porcentaje;
		if (precioVenta < precioFinal) {
			System.out.println("El precio de venta debe ser el precio de coste + un 30%");
			this.precioVenta = getPrecioCoste()-(getPrecioCoste()*30)/100;
		} else {
		this.precioVenta = precioVenta;}
	}


	protected double getPrecioCoste() {
		return precioCoste;
	}


	protected void setPrecioCoste(double precioCoste) {
		if (precioCoste < 0) {
			this.precioCoste = 0;
		}else {
		this.precioCoste = precioCoste;}
	}


	protected TipoDieta getTipoDieta() {
		return tipoDieta;
	}


	protected void setTipoDieta(TipoDieta tipoDieta) {
		this.tipoDieta = tipoDieta;
	}


	protected LocalDate getDia() {
		return dia;
	}


	protected void setDia(LocalDate dia) {
		this.dia = dia;
	}


	protected int getUnidades() {
		return unidades;
	}


	protected void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	@Override
	public String toString() {
		return "Menu: "+ nombre + ","+ "tipo: " + tipoDieta + "," + "precio venta : " + precioVenta + "euros,fecha: " + dia; 
	}
	
	
	public double calculaPrecioMenuConPromoción () {
		double precioConPromocion = 0;
		if (getPrecioVenta()<= 10) {
			precioConPromocion = getPrecioVenta() - 1.00 ;
		}else if (getPrecioVenta() > 10) {
			precioConPromocion= getPrecioVenta()-(getPrecioVenta()*10)/100;
		}else {
			System.out.println();
		}
		
		return precioConPromocion;
		
	}
	
	
	

}
