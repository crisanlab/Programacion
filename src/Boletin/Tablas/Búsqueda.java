package Boletin.Tablas;

public class Búsqueda {
public static void main(String[] args) {
	String [] diasSemana = {"Lunes","Martes","Miércoles","jueves","Viernes","Sabado","Domingo"};
	int pos = 0;
	String dia = "Hola";
	dia.equals("Miércoles");
	while (pos < diasSemana.length && diasSemana[pos].equals("Miércoles"))
	{
		System.out.println(diasSemana[pos]);
		pos = pos +1;
	}
}
}
