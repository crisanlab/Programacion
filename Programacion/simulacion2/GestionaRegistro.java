package simulacion2;

import java.time.LocalDate;

public class GestionaRegistro {
	public static void main(String[] args) {
		RegistroTrafico registro = new RegistroTrafico ();
		
		
		//Registro los vehiculos
		Vehiculo vehiculo1 = new Vehiculo ("VIN123", 12345, "Toyota","Corolla", 2015,"Juan Perez");
		Vehiculo vehiculo2 = new Vehiculo ("VIN345", 56789, "Ford","Focus", 2018,"Ana Lopez");
	
        registro.registrarVehiculo(vehiculo1);
        registro.registrarVehiculo(vehiculo2);
        System.out.println(registro);

//Registro rematriculaciones
        
        Rematriculacion rematriculacion1 = new Rematriculacion(LocalDate.of(2023, 5, 1), "VIN123", "VIN465");
        Rematriculacion rematriculacion2 = new Rematriculacion(LocalDate.of(2024, 3, 10), "VIN345", "VIN678");
	
        registro.registrarRematriculacion("VIN123", rematriculacion1);
        registro.registrarRematriculacion("VIN345", rematriculacion2);
        System.out.println("Nuevo registro: " + registro);
        
     // Buscar un vehículo por bastidor y mostrar sus rematriculaciones
        registro.mostrarRematriculacionesPorVehiculo("VIN123");
	
        System.out.println("Vehículos registrados:");
        for (Vehiculo vehiculo : registro.mostarVehiculosPorPropietario("Juan Perez")) {
            System.out.println("Matrícula: " + vehiculo.getNumMatricula());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Año de fabricación: " + vehiculo.getAnioFabricacion());
            System.out.println("Propietario: " + vehiculo.getPropietarioActual());
            System.out.println("Número de bastidor: " + vehiculo.getNumBastidor());
            System.out.println("Rematriculaciones:");
            vehiculo.mostrarRematriculaciones();
            System.out.println("------------------------");
        }

        
        
	 // Imprimir rematriculaciones para el vehículo con número de bastidor VIN123
    System.out.println("Rematriculaciones para el vehículo con número de bastidor VIN123:");
    registro.mostrarRematriculacionesPorVehiculo("VIN123");
	
}
}
