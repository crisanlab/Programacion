package listas;

public class GestionaMiembroLista {
	public static void main(String[] args) {
		
		MiembroBase m1 = new MiembroEstandar("pepe","pepe@gmail.com", 0);
		MiembroBase m2 = new MiembroEstandar("pepa","pepa@gmail.com", 0);
		MiembroBase m3 = new MiembroEstandar("maria","maria@gmail.com", 0);
		
		try {
			m1.addAmigo(m2);
			m1.addAmigo(m3);
			m1.addAmigo(m2);
		} catch (GuzmanitosException e) {
			System.out.println(e.getMessage());
			throw new GuzmanitosException("Excepcion");
		}
	for (MiembroBase m: m1.getAmigos()) {
		System.out.println(m);
	}
	}
	
}
