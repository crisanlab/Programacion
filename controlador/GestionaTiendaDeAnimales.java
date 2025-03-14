package controlador;

import java.util.Arrays;

import modelo.*;
import modelo.Gato1;

public class GestionaTiendaDeAnimales {
public static void main(String[] args) {
	int contador=0;
	Gato1 g1 = new Gato1(null, 0, null, null);
	System.out.println(g1.equals(g1));
	
	Mascota [] mascotas = new Mascota [10];
	mascotas[contador]=g1;
	contador +=1;
	System.out.println(Arrays.toString(mascotas));
	
	
}
}
