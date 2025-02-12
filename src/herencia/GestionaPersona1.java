package herencia;

public class GestionaPersona1 {
	public static void main(String[] args) {
		Persona1 p = new Persona1 ("pepe","apellidos",30,30000);
		Persona1 p2 = new Entrenador ("pepe","apellidos",30,30000);
		Entrenador e = new Entrenador ("pepe","apellidos",30,30000);
		
		Entrenador p2ToEntreandor = (Entrenador)p2;//Casting pongo a lo que lo quiero convertir entre parentesis, seguido que la variable a convertir
		p2ToEntreandor.dirigirPartido();
		
		/*
		p.concentarse();
		p.concentrarse(30);
		p.concentrarse("30");
		*/
		
		p2.concentrarse(30); //Llama a personas porque Entrenador no tiene un metodo concentrarse al que se le pase un numero
	}

}
