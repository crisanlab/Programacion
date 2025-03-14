package modelo;

public class Persona {
	private static final double PI =3.1416; // con "final" no se puede cambiar su valor, con "static" es a nivel de clase
	
	
	private static int contador; // static no va asociado a objetos sino a la clase
	private int id;
	private String nombre;
	private int edad;
	
	
	public Persona(String nombre, int edad) {
		super();
		this.id = contador +1;
		this.nombre = nombre;
		this.edad = edad;
		contador=contador+1;
		
	}
	
	


	public static int getContador() {
		return contador;
	}




	public static void setContador(int contador) {
		Persona.contador = contador;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}




	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}



	public static boolean validaSiDniValido(String dni) {
		boolean esDni=false;
		if(dni.matches("\\d{8}[A-Za-z]{1}")) { //validar Dni
			esDni= true;
		}else {
			esDni =false;
		}
		return esDni;
	}
	
	void imprimeNoEstatico() {
		System.out.println("No estático");
	}
	
	
}
