package examen;

// una función para cargar los datos (nombre del pokemon y nivel, otra que imprime el menú para elegir lo que quieras, otra para que la maquina seleccione su nivel)
import java.util.Scanner;
import java.util.Random;

public class Pokemon {
	public static void main(String[] args) {
		Scanner miEscaner = new Scanner(System.in);
		Pokemon p = new Pokemon ();
		String[] nombres = new String[15];
		int [] niveles = new int[15]; 
	
		int opcion = 0;
	    
	    while (opcion != 4) {
	        p.imprimeMenu();
	        opcion = miEscaner.nextInt();
		
		switch (opcion) {
		case 1:
			 System.out.println("Nombre del pokemon: ");
			String nombrePokemon= miEscaner.next();
			 System.out.println("Dime el nivel inicial: ");
			int nivel= miEscaner.nextInt();
			 System.out.println(nombrePokemon);
			 System.out.println(nivel);
		}
		 break;
		 
	     case 2:
	    	System.out.println("Escoge posisción: ");
	    	int posicion = miEscaner.nextInt();
	    	p.numAleatorio();
	    	p.batalla(maquina,posicion);
	    	
            break;

        case 3:
            
            break;
    }
	case 4:
        System.out.println("Saliendo...");
        break;
}
}

int numAleatorio() {
	Random aleatorioR= new Random(); 
	int maquina = aleatorioR.nextInt(15);
	return maquina;
	}

    String batalla(maquina,posicion){
    	if(posicion != maquina) {
    		
    	}
    	
    	
   String cargaDatos (String [] nombrePokemon,int [] nivel) { 	
	  
   }
	
	void imprimeMenu(){
		System.out.println("Menú:");
	    System.out.println("1. Capturar pokémon");
	    System.out.println("2. Realizar Batalla");
	    System.out.println("3. Mostrar Pokédex");
	    System.out.println("4. Finalizar");
	    System.out.print("Seleccione una opción: ");
	}
}