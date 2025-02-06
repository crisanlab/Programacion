package Boletin.Tablas;

public class Ejercicio5 {
	public static void main(String[] args) {
		int tabla1 [] = {1,2,3,4};
		int tabla2 [] = {1,2,5,7};
		boolean encontrado = true;
		if (tabla1.length == tabla2.length){
		for (int pos=0 ; pos < tabla1.length;)
		{
			while (tabla1[pos] == tabla2[pos])
			{
				encontrado = true;
				pos++;
			}
			if (tabla1[pos] != tabla2[pos]) {
				encontrado=false;
			System.out.println("Las listas son distintas");
			}
		}
	}
	}
}

