package modelo;


public abstract class Aves extends Mascota {
	private String pico;
	private boolean vuela;

	public abstract boolean volar();
	public String getPico() {
		return pico;
	}
	public void setPico(String pico) {
		this.pico = pico;
	}
	public boolean isVuela() {
		return vuela;
	}
	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
	
	
}


	

