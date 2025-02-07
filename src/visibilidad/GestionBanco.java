package visibilidad;

import java.time.LocalDate;

public class GestionBanco {

	public static void main(String[] args) {
		
		Persona titular = new Persona ("12345678A","José","Garcia",LocalDate.of(2004, 10, 12));
		Persona autorizado = new Persona ("12345678A","José","Garcia",LocalDate.of(2004, 10, 12));
		CuentaBancaria cuenta = new CuentaBancaria (0.0,"ES0621005639287623",titular);
		
		//cuenta.setSaldo(100); ingreso dinero, modifico el saldo de la cuenta solo si es publica
	
		cuenta.ingresarDinero(autorizado, 100);
		
	}
}
