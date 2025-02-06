package programacionUD2.unidad2;

import java.util.Scanner;

public class Reto {
public static void main(String[] args) {
	String [] listaLuces = new String [10] ;
	Scanner miEscaner = new Scanner(System.in);
	System.out.println("Escribe S (si funciona)y N (si no funciona)");
	String respuesta = miEscaner.next();
	respuesta.toLowerCase();
	int pos = 0;
	while (pos < listaLuces.length) {
		System.out.println("Escribe S (si funciona)y N (si no funciona)");
		String cadena = "";
		if ( cadena.equals('S'))
				{
			String listaLucesNoFundidas;
			listaLucesNoFundidas= listaLucesNoFundidas + 1;
			System.out.println(listaLucesNoFundidas);
		}
		if (cadena.equals('N'))
		{
			String listaLucesFundidas;
			listaLucesFundidas= listaLucesFundidas + 1;
			System.out.println(listaLucesFundidas);
		}
	}
}

}
