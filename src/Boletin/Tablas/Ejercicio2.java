package Boletin.Tablas;

public class Ejercicio2 {
	public static void main(String[] args) {
		String [] diasSemana = {"Lunes","Martes","Miércoles","jueves","Viernes","Sabado","Domingo"};
		int pos=0 ; 
		while (pos < diasSemana.length ) {
			if (pos < 5)
			{
			System.out.println("Laborable:"+ diasSemana[pos]);
			}
		
			else
			{
			System.out.println("Festivo:"+ diasSemana[pos]);
			}
			pos =pos +1;
		}
	
	}

}
