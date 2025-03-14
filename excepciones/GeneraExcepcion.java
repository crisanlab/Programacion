package excepciones;

import java.io.IOException;
import java.util.InputMismatchException;

public class GeneraExcepcion {
	
	public void generaIOException () throws IOException 
	{ 
		try {
	
		throw new IOException();
		}
	catch (IOException e) {
		System.out.println("En el catch de IO");
		throw e;
	 }
  }
	public void generaInputMismatchException () throws InputMismatchException  { 
		try {
			throw new InputMismatchException();
			
			}
		catch (InputMismatchException e) {
			throw e;
		 }
		
	   }
}



