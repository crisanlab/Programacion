package Boletin.Tablas;

public class Ejercicio1 {
	public static void main(String[] args) {
		String [] diasSemana = {"Lunes","Martes","Miércoles","jueves","Viernes","Sabado","Domingo"};
		for (int pos=0; pos < diasSemana.length; pos++ )
		{
			if (pos < 5)
			{
			System.out.println("Laborable:"+ diasSemana[pos]);
			}
		
			else
			{
			System.out.println("Festivo:"+ diasSemana[pos]);
			}
		}
	}
}
		

