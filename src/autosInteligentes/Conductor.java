package autosInteligentes;

public class Conductor {
	private String nombre;
	private int anyo;
	
	public Conductor(String nombre, int anyo) {
		super();
		this.nombre = nombre;
		setAnyo(anyo);
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getAnyo() {
		return anyo;
	}

	protected void setAnyo(int anyo) {
		if (anyo > 0) {
		this.anyo = anyo;
		}else {
			this.anyo = 0;
		}
	}

	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", anyo=" + anyo + "]";
	}
	
	

}
