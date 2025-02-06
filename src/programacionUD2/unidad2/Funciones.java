package programacionUD2.unidad2;

import java.util.Scanner;

public class Funciones {
	public static void main(String[] args) {
		Funciones f= new Funciones();
		
		int resultado = f. sumaNum(4,7);
		System.out.println("La suma es :" + resultado);
		
		String listaNombres [] = f. generaLista();
		for (String nombre : listaNombres)
		{
			System.out.println(nombre);
		}
	}	
int sumaNum (int num1, int num2) {
 return num1+num2;
}
String [] generaLista() {
	String [] nombres = new String[5];
	Scanner miEscaner = new Scanner(System.in);
	for ( int i=0; i < 5 ; i++) 
	{
		System.out.println("Escribe un nombre:");
		String nombre = miEscaner.next();
		nombres[i] = nombre;
		
	}
	return nombres;
	
}
}

