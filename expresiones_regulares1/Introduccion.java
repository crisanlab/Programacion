package expresiones_regulares1;

public class Introduccion {
	public static void main(String[] args) {
		String num="12345678A";
		String car ="ABC";
		System.out.println(num.matches("\\d{8}"));
		System.out.println(num.matches("\\d{8}[A-Za-z]{1}")); //valida DNI
		
		
		
	}

}
