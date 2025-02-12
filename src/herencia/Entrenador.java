package herencia;

public class Entrenador extends Persona1{
	

	private String idFederacion;
	
	public Entrenador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entrenador(String nombre, String apellidos, int edad, float salario, String idFederacion) {
		super(nombre, apellidos, edad, salario);
		this.idFederacion = idFederacion;
	}
	public Entrenador(String nombre, String apellidos, int edad, float salario) {
		super(nombre, apellidos, edad, salario);
	
        this.idFederacion="ESP";

}
	@Override
	protected void concentarse () {
		System.out.println("Concentrarse entrenador");
	}
	
	@Override
	protected void viajar ( String ciudad) {
		System.out.println("viajar hijo");
	}

	protected void dirigirPartido() {
		System.out.println("Dirigir partido Entrenador");
	}

	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getEdad()=" + getEdad() + ", getSalario()=" + getSalario() + "]";
	}




	
}