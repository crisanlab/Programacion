package herencia;

public class GestionaVehiculos {
	public static void main(String[] args) {
		vehiculo c1 = new automovil("Pepe",5,5,Calificaci);
		Vehiculo c2 = new Coche ("Pepa",3,4,"Eco");
		
		boolean esVehiculo = c1 instanceof Vehiculo;
		System.out.println("Es Vehiculo?"+esVehiculo);
		
		boolean esCoche = c1 instanceof Coche;
		System.out.println("Es coche?"+esCoche);
		
		
		boolean esCamion2 = c2 instanceof Vehiculo;
		//System.out.println("Es camión?"+c2 instanceof Camion));
		
	}

}
