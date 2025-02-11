package herencias;

public class GestionaVehiculos {
	public static void main(String[] args) {
		Coche c1 = new Coche("Pepe",5,5,"A");
		Vehiculo c2 = new Coche ("Pepa",3,4,"Eco");
		
		boolean esVehiculo = c1 instanceof Vehiculo;
		System.out.println("Es Vehiculo?"+esVehiculo);
		
		boolean esCoche = c1 instanceof Coche;
		System.out.println("Es coche?"+esCoche);
		
		
		boolean esCamion2 = c2 instanceof Vehiculo;
		//System.out.println("Es camión?"+c2 instanceof Camion));
		
	}

}
