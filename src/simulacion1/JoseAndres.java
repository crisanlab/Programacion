package simulacion1;

public class JoseAndres {
	private String nombre;
	private String dni;
	private double salarioBase;

	
	//Modificar el constructor
	public JoseAndres(String nombre, String dni, double salarioBase) {
		setNombre(nombre);
		setDni(dni);
		setSalarioBase(salarioBase);
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	private String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	protected double getSalarioBase() {
		return salarioBase;
	}

	private void setSalarioBase(double salarioBase) {
		if (salarioBase < 0) {
			System.out.println("[ERROR]: El salario base no puede ser negativo");
			this.salarioBase = 1134.00;
		}else {
			this.salarioBase = salarioBase;			
		}
	}
	
	protected double calcularSalario() {
		return salarioBase;
	}

	@Override
	public String toString() {
		return "DNI: " + getDni() + " - Nombre: " + getNombre() + " - Salario: " + this.calcularSalario();
	}
	//Imprimir DNI,NOMBRE,SALARIO

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JoseAndres other = (JoseAndres) obj;
		return this.getDni().equals(other.getDni()); //Comparar DNI
	}

}
