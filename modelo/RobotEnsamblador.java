package modelo;

public class RobotEnsamblador extends Robot {

	
	public RobotEnsamblador(String modelo, int bateria, String combustible, String descripcion, Estado estado) {
		super(modelo, bateria, combustible, descripcion, estado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ejecutarTarea() {
		String tarea="Ensamblar piezas";
		return tarea;
	}

	@Override
	public boolean recargar() {
		boolean recarga=false;
		if (this.getEstado()==Estado.APAGADO) {
			System.out.println("Recargando por"+ this.getCombustible());
			recarga=true;
		}else {
			System.out.println("Estoy encendido y no puedo recargar");
		}
		return recarga;
	}

	
	
}
