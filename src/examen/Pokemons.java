package examen;

import java.util.Scanner;

public class Pokemons {
public static void main(String[] args) {
	Scanner miEscaner = new Scanner(System.in);
	Pokemons p = new Pokemons ();
	String [] Pokemons = new String[15];
	int [] nivelPokemon = new int [15];
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
		 String capturarPokemon;
		 
		// if (nombrePokemon.length < 15 & nivelPokemon.length < 15 ) {
        //     s.historial[s.historialIndex] = capturarPokemon;
        //     s.historialIndex++;  

        // } else {
             System.out.println("Se ha alcanzado el límite de jugadas registradas.");
         }
         System.out.println(zzzzz);
         System.out.println(nivelPokemon);
         
		
     break;
	}
	
	case 2:
	//	 s.mostrarHistorial();
    //    break;
	//case 3:
	//	System.out.println("Te has retirado. Saldo final: " + s.saldoTotal + "€");
     //   break;
	
}













void imprimeMenu(){
	System.out.println("Menú:");
    System.out.println("1. Capturar pokémon");
    System.out.println("2. Realizar Batalla");
    System.out.println("3. Mostrar Pokédex");
    System.out.println("4. Finalizar");
    System.out.print("Seleccione una opción: ");
}
