package modelo;

public class RobotPintor extends Robot {



	public RobotPintor(String modelo, int bateria, String combustible, String descripcion, Estado estado) {
		super(modelo, bateria, combustible, descripcion, estado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ejecutarTarea() {
		String tarea="Aplicar pintura";
		return tarea;
	}

	@Override
	public boolean recargar() {
		System.out.println("Recargando por electricidad");
		return true;
	}
	
	

}
