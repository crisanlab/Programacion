package excepciones.CrearExcepciones;

import java.util.Scanner;

public class GestionaExcepcionesEjercicio5 {
	public static void main(String[] args) {
		GestionaExcepcionesEjercicio5 num1 = new GestionaExcepcionesEjercicio5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int num= sc.nextInt();
		try{
			num1.metodo1(num);
		} catch (MiExcepcion e) {
			System.out.println(e.getMessage());
		}
	}
	public void metodo1 (int num) throws MiExcepcion{
		try {
			if (num % 2 !=0) {
				throw new MiExcepcion("Lanzo mi excepcion");
			}
		}
			catch(MiExcepcion e)
			{
				System.out.println(e.getMessage());
				throw e;
			}
		} 
		}
