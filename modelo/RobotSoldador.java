package modelo;

public class RobotSoldador extends Robot {
	
	private double temperatura;
	private String especificacion;
	
	

	public RobotSoldador(String modelo, int bateria, String combustible, String descripcion, Estado estado) {
		super(modelo, bateria, combustible, descripcion, estado);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String ejecutarTarea() {
	
		return toString();
		
	}
	@Override
	public boolean recargar() {
		boolean recarga=false;
		if (this.getEstado()==Estado.APAGADO) {
			recarga=true;
			System.out.println("Recargando por"+ this.getCombustible());
		}else {
			System.out.println("Estoy encendido y no puedo recargar");
		}
		return recarga;
		
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public String getEspecificacion() {
		return especificacion;
	}

	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}

	@Override
	public String toString() {
		return "RobotSoldador [Temperatura=" + getTemperatura() + ", Especificacion()=" + getEspecificacion()
				+ "]";
	}

	
	
	
	
}
