package herencia;

import java.util.Objects;

public class Persona1 {
	
private String nombre;
private String apellidos;
private int edad;
private float salario;

public Persona1() {
	// TODO Auto-generated constructor stub
}
	
public Persona1(String nombre, String apellidos, int edad, float salario) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	this.salario = salario;
}

	protected void concentarse () {
		System.out.println("Concentrarse padre");
	}

	protected void concentrarse (String ciudad) {
		System.out.println("Metodo concentrarse del padre con String: "+ ciudad);
	}
	
	protected void concentrarse (int dias) {
		System.out.println("Metodo concentrarse del padre con String: "+ dias);
	}
	
	
	protected void viajar ( String ciudad) {
		System.out.println("viajar padre");
	}


protected String getNombre() {
	return nombre;
}
protected void setNombre(String nombre) {
	this.nombre = nombre;
}
protected String getApellidos() {
	return apellidos;
}
protected void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
protected int getEdad() {
	return edad;
}
protected void setEdad(int edad) {
	this.edad = edad;
}
protected float getSalario() {
	System.out.println("getSalario de Persona1");
	return salario;
}
protected void setSalario(float salario) {
	this.salario = salario;
}
@Override
public String toString() {
	return "Persona1 [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", salario=" + salario + "]";
}



@Override
public int hashCode() {
	return Objects.hash(apellidos, edad, nombre, salario);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Persona1 other = (Persona1) obj;
	return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(nombre, other.nombre)
			&& Float.floatToIntBits(salario) == Float.floatToIntBits(other.salario);
}

}
