package controlador;

import java.util.Scanner;

import modelo.CorreoElectronico;

public class GestionaCorreo {
	public static void main(String[] args) {
		Scanner miEscaner = new Scanner(System.in);
		System.out.println("introduce un correo: ");
		String correo = miEscaner.next();

		boolean sigo = true;
		while(sigo) {
			
			int contadorCorreosValidos = 0;
			CorreoElectronico [] correos = new CorreoElectronico [5];
			if (CorreoElectronico.validaCorreo(correo)) {
				CorreoElectronico c = new CorreoElectronico (correo);
				correos [contadorCorreosValidos] = c;
				contadorCorreosValidos = contadorCorreosValidos+1;
				
			}
			sigo= (contadorCorreosValidos==5);
			//(contadorCorreosValidos !=5)? true:false;
		}
	}

}
