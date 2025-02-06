package objetos;

public class Vehiculo {

	String marca;
	String modelo;
	int anyoFabricacion;
	String tipoCombustible;
	float capacidadTotal;
	float cantidadCombActual;
	float comsumoPorLitros100kms;
	public Vehiculo(String marca, String modelo, int anyoFabricacion, String tipoCombustible, int capacidadTotal,
			int cantidadCombActual, float consumo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anyoFabricacion = anyoFabricacion;
		this.tipoCombustible = tipoCombustible;
		this.capacidadTotal = capacidadTotal;
		this.cantidadCombActual = cantidadCombActual;
		this.comsumoPorLitros100kms = consumo ;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anyoFabricacion=" + anyoFabricacion
				+ ", tipoCombustible=" + tipoCombustible + ", capacidadTotal=" + capacidadTotal
				+ ", cantidadCombActual=" + cantidadCombActual + "]";
	}
	
	float calculaComsumo (float kms) {
		float consumo = ( kms* consumoPorlitros100kms)/100)
	}

	
}
