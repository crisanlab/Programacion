package examen_menu;

import java.time.LocalDate;

public class GestionaCatering {
	public static void main(String[] args) {
		Menu menu1 = new Menu (1,"Jueves Febrero", 900, 9,3,TipoDieta.VEGANO,LocalDate.of(2025, 02, 20), 3);
		Menu menu2 = new Menu (1,"Jueves Febrero", 1300, 15,3,TipoDieta.SIN_LACTOSA,LocalDate.of(2025, 02, 20), 3);
		Menu menu3 = new Menu (1,"Jueves Febrero", 1500, 15,7,TipoDieta.VEGANO,LocalDate.of(2025, 02, 20), 3);
		
		Cliente c1= new Cliente("1234567A", "pepe","diaz marquez", 70,TipoDieta.SIN_LACTOSA,LocalDate.of(2024, 02, 03));
		Cliente c2= new Cliente("1233467A", "juan","lopez sanchez", 40,TipoDieta.SIN_LACTOSA,LocalDate.of(2024, 02, 03));
		Cliente c3= new Cliente("125567A", "Maria","ruiz", 20,TipoDieta.SIN_LACTOSA,LocalDate.of(2024, 02, 03));
		
		
		
		
		
		
		
	}

}
