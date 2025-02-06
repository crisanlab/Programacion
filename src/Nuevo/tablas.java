package Nuevo;

public class tablas {
public static void main(String[] args) {
	
 boolean comparaTablas(int [] tabla1, int [] tabla2)
	{
		boolean iguales = true;
		if (tabla1.length != tabla2.length)
			for(int i =0; i< tabla1.length; i++) {
				tabla1[i] != tabla2[i]
						iguales = false;
			}
			
		return iguales;
	
}
	
}
