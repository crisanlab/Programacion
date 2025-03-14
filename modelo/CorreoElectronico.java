package modelo;

public class CorreoElectronico {
	
	private String nombre;
	private String dominio;
	
	
	
	public CorreoElectronico(String correoCompleto) {
		super();
		String [] partes = correoCompleto.split("@");
		this.nombre=partes[0];
		this.dominio=partes[1];
	}



	public static boolean validaCorreo (String correo) {
		boolean valida=true;
		valida=correo.matches("\\[a-zA-Z1-9-+@+[a-zA-Z1-9_]+(.+[a-zA-Z1-9-])$");
		return valida;
		}
}


