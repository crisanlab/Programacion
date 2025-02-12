package herencia;

public class GestionaPersona {
public static void main(String[] args) {
	Persona p = new Persona ("pepe","pepe@g.com");
	Persona p2 = new Persona ("pepe","pepe@g.com");
	System.out.println(p.toString());
	
	System.out.println(p.getClass().getName());
	
	System.out.println(p instanceof Persona);
	
	System.out.println(p.equals(p2));
	
	
}
}
