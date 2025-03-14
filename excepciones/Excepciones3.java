package excepciones;

import java.util.InputMismatchException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.Scanner;

public class Excepciones3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un número entero: ");
		int numero ;

		try {
			numero = scanner.nextInt();
			String cadena = " ";
			System.out.println(cadena.charAt(10));
			System.out.println("Detrás del input");
			
		} catch (InputMismatchException e) {
		
			//System.out.println("Entro en el catch 1:" + e.getCause());
			//System.out.println("Entro en el catch 1:" + e.getMessage());
			System.out.print("Ingresa un número entero: ");
			numero = scanner.nextInt();
		} 
		catch (StringIndexOutOfBoundsException a) {
			System.out.println("Entro en el catch 2:" +a.getCause());
			System.out.println("Entro en el catch 2:" + a.getMessage());
		} 
	
		finally {
			System.out.println("Pase lo que pase,salgo");
		}
	}

}
