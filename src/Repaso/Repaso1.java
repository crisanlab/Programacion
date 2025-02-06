package Repaso;

public class Repaso1 {
	public static void main(String[] args) {
		Repaso r = new Repaso();
		int [] tablaResultado = r.calculaTabla();
		for(int valor:tablaResultado) {
			System.out.println(valor);
		}
	}
	int [] calculaTabla()
	{
		int[] tabla = new int [10];
		for (int i=0; i< tabla.length;i++)
		{
			System.out.println("Introduce un número: ");
			tabla[i]= 2;
		}
		
		
		return tabla;
	}
}


int [] cargaNumeros()
{
	
}
String [] cargaCadenasMinusculas()
{
	
}
String [] modificaPalabrasMinusculas()
{
	
}