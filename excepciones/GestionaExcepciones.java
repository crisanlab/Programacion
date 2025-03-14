package excepciones;

import java.io.IOException;
import java.util.InputMismatchException;

public class GestionaExcepciones {
	
	/*public static void main(String[] args) //throws IOException --> solucion 1
	{ //try,catch --> solucion 2
		try {
			throw new InputMismatchException("InputMismatchException porque quiero");
		}/*
		catch(IOException e)
		{
			System.out.println("Ocurre una excepcion: "+e.getMessage());
		}*/
		//System.out.println("Llego aquí");
	//}
	
	public static void main(String[] args) throws IOException {
		GeneraExcepcion g = new GeneraExcepcion();
		//g.generaIOException();
		g.generaInputMismatchException ();
	}
}
