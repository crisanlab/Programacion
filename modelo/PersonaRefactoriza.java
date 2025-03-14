package modelo;

public class PersonaRefactoriza {

	  String nombre;

	    public PersonaRefactoriza(String nombre) {
		super();
		this.nombre = nombre;
	}

		public void identificarse() {
	        System.out.println("Soy una persona y me llamo " + nombre);
	    }



	class Empleado extends PersonaRefactoriza {
	    public Empleado(String nombre) {
	    	
			super(nombre);
			
		}

		public void trabajar() {
	        System.out.println(nombre + " está trabajando.");
	    }
	}


	class Cliente2 extends PersonaRefactoriza {
	    public Cliente2(String nombre) {
			super(nombre);
			
		}

		public void comprar() {
	        System.out.println(nombre + " está comprando.");
	    }
	}


	// Agregamos más clases para hacer evidente el problema


	class Estudiante extends PersonaRefactoriza {
	    public Estudiante(String nombre) {
			super(nombre);
			
		}

		public void estudiar() {
	        System.out.println(nombre + " está estudiando.");
	    }
	}


	// Un problema surge aquí: ¿qué pasa si un Estudiante también es Empleado?
	class EstudianteEmpleado extends Estudiante3 {
	    public EstudianteEmpleado(String nombre) {
			super(nombre);
			
		}

		public void trabajar() {
	        System.out.println(nombre + " está estudiando y trabajando.");
	    }
	}


	// Agregamos otra clase con otro comportamiento
	class Artista extends PersonaRefactoriza {
	    public Artista(String nombre) {
			super(nombre);
			
		}

		public void pintar() {
	        System.out.println(nombre + " está pintando.");
	    }

}


	public String ejecutaAccion() {
		// TODO Auto-generated method stub
		return null;
	}
