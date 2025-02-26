package examen_dispositivos;

public class PCSobremesa extends Computadora {
	private boolean tieneGPUdedicada;

	public PCSobremesa(String marca, String modelo, double precio, int capacidadRam, boolean tieneGPUdedicada) {
		super(marca, modelo, precio, capacidadRam);
		this.tieneGPUdedicada = tieneGPUdedicada;
	}

	protected boolean isTieneGPUdedicada() {
		return tieneGPUdedicada;
	}

	protected void setTieneGPUdedicada(boolean tieneGPUdedicada) {
		this.tieneGPUdedicada = tieneGPUdedicada;
	}
	
	

}
