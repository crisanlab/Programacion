package controlador;

import java.time.LocalDate;

import modelo.Cliente;
import modelo.CuentaBancaria;

public class GestionaCuentas {
	public static void main(String[] args) {
		Cliente titular1 = new Cliente("Juan","12345678A","Lopez");
		Cliente titular2 = new Cliente("Maria","87654321B","Diaz");
		Cliente titular3 = new Cliente("Ana","74839576C","Perez");
		Cliente autorizado1 = new Cliente ("Juan","12345678A","Lopez");
		Cliente autorizado2 = new Cliente ("Luis","87294765T","Gomez");
		Cliente autorizado3 = new Cliente ("Pepe","98543675n","Rodriguez");
		
		CuentaBancaria c1= new CuentaBancaria(1500,LocalDate.of(2025, 02, 10),"ES2400123443234544",titular1,autorizado1);
		CuentaBancaria c2= new CuentaBancaria(2300,LocalDate.of(2025, 02, 10),"ES2400123303234044",titular2,null);
		CuentaBancaria c3= new CuentaBancaria(1200,LocalDate.of(2025, 02, 10),"ES2400432143234543",titular3,autorizado3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
                 System.out.println(CuentaBancaria.getContador());
	}

}
