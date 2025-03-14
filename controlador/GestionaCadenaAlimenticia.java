package controlador;

import java.util.Arrays;

import modelo.*;

public class GestionaCadenaAlimenticia {
	public static void main(String[] args) {
	Animal3 []  atacaLeon = {new Leon()};
	Animal3 []  atacaRoedor = {new Roedor(),new Rapaz()};
	Animal3 a1 = new Serpiente("cobra", TipoFamilia.SERPIENTE,"selva",atacaLeon,atacaRoedor);
	Animal3 a2 = new Rapaz("Aguila", null, null, null, null);
	Animal3 a3 = new Rapaz(null, null, null, null, null);
	Animal3 a4 = new Roedor(null, null, null, null, null);
	Animal3 a5 = new Leon(null, null, null, null, null);
	
	System.out.println(a1.atacar(new Leon()));
	
	System.out.println(a1.getAnimalesQueCome());
	
	System.out.println(a1.getAnimalesComidos());
	
	}

}
