package excepciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {
	public static void main(String[] args) {
		Double [] divisiones = new Double[20];
		Random num=new Random();
		for (int i=0;i < 20;i++) {
			try {
				int numAleatorio1=num.nextInt(10);
				int numAleatorio2=num.nextInt(10);
				 
		         if (numAleatorio2 == 0){
		        	 throw new ArithmeticException("El dividendo es 0");
		         }
		        
		         if(i>20) {
		        	 throw new ArrayIndexOutOfBoundsException("Guardando en más de 20");
		         }
		         divisiones[i]= (double)(numAleatorio1/numAleatorio2);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Ha salido un 0 en el dividendo");
			throw e1; //lanzo la excepcion de nuevo, sale en rojo(y para el programa)
		}
		
		catch(ArrayIndexOutOfBoundsException e2)
		{	  
			System.out.println(e2.getMessage());
			throw e2;
		}
		finally {
			try {
				for(int j=0; j < divisiones.length;j++) {
					if (divisiones[j] == null)
					{
						throw new NullPointerException ("Aqui no hay nada");
					}
					System.out.println(divisiones[j]);
				}
			//System.out.println(Arrays.toString(divisiones)) ;
			}
			catch(NullPointerException e3) {
				System.out.println(e3.getMessage());
				throw e3;
			}
		}
		}
		
	}
}
