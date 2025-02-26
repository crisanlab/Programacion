package ejemplo_enum;

public class Principal {
	public static void main(String[] args) {
		Principal principal = new Principal();
		DiaDeLaSemana dia1 = DiaDeLaSemana.LUNES; //Definición de la clase, el tipo 
		System.out.println(dia1);
		principal.setMes(principal.getMes().ENERO);
		
		for (DiaDeLaSemana dia : DiaDeLaSemana.values()) {
			if (dia == DiaDeLaSemana.MARTES) {
				System.out.println("Hoy es martes");
			}
		}
	}
	
	

}
