package programacionUD2.unidad2;

import java.util.Scanner;

public class RetoGrinch {
public static void main(String[] args) {
	RetoGrinch r= new RetoGrinch ();
	
	String fichero = r.quitaHackeo("202837847ghackGrinch_elfos.pdf");
}
String quitaHackeo (String nombreFichero) {
	int posicion = nombreFichero.indexOf("hackGrinch_");
	String ficheroFinal= nombreFichero.substring(posicion);
	System.out.println(ficheroFinal);
	String nombreFicheroSinHackeo = new String ("hola");
	
	return nombreFicheroSinHackeo;
}
}
