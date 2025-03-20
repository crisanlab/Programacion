package vehiculo;

public class Patinete extends VehiculoGeneral {
	
	private int tiempoAutonomia;
	private String marca;
	private String modelo;
	private double cuantiaFianza;
	private boolean estaPagadaFianza;
	
	
	
	
	public Patinete(int id, String[] alquieres, boolean estaDisponible, int tiempoAutonomia, String marca,
			String modelo, double cuantiaFianza, boolean estaPagadaFianza) {
		super(id, alquieres, estaDisponible);
		this.tiempoAutonomia = tiempoAutonomia;
		this.marca = marca;
		this.modelo = modelo;
		this.cuantiaFianza = cuantiaFianza;
		this.estaPagadaFianza = estaPagadaFianza;
	}



	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return this.isEstaDisponible();
	}
	
	
	public int getTiempoAutonomia() {
		return tiempoAutonomia;
	}



	public void setTiempoAutonomia(int tiempoAutonomia) {
		this.tiempoAutonomia = tiempoAutonomia;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public double getCuantiaFianza() {
		return cuantiaFianza;
	}



	public void setCuantiaFianza(double cuantiaFianza) {
		this.cuantiaFianza = cuantiaFianza;
	}



	public boolean isEstaPagadaFianza() {
		return estaPagadaFianza;
	}



	public void setEstaPagadaFianza(boolean estaPagadaFianza) {
		this.estaPagadaFianza = estaPagadaFianza;
	}


public boolean getEstaAbonadaFianza() {
	return this.estaPagadaFianza;
}

	
	

}
