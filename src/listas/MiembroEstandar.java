package listas;

public class MiembroEstandar extends MiembroBase {
	private static int maximoAmigos;




	public MiembroEstandar(String email, String nombre, int contadorAmigos) {
		super(email, nombre, contadorAmigos);
	}




	@Override
	public String getTipoUsuario() {
	String respuesta=("Estandar");
		return respuesta ;
	}




	@Override
	public String toString() {
		return "MiembroEstandar [id=" + id + ", email=" + email + ", nombre=" + nombre + ", TipoUsuario="
				+ getTipoUsuario() + "]";
	}
	
	

}
