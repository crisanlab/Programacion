package simulacion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RegistroTrafico {
private Map<String,Vehiculo> vehiculos;

public RegistroTrafico () {
	vehiculos = new TreeMap <>();
	
}
 public void registrarVehiculo (Vehiculo vehiculo) {
	 vehiculos.put(vehiculo.getNumBastidor(),vehiculo);
 }
 
public Map <String,Vehiculo> getVehiculos (){
	return vehiculos;
}

 public void registrarRematriculacion (String numBastidor, Rematriculacion rematriculacion) {
	 Vehiculo vehiculo = vehiculos.get(numBastidor);
	 if (vehiculo != null) {
		 vehiculo.registrarRematriculacion(rematriculacion);
	 }
 }
 
 
 public Vehiculo buscarVehiculoPorBastidor (String numBastidor) {
	 return vehiculos.get(numBastidor);
 }
 
 public List <Vehiculo> mostarVehiculosPorPropietario (String propietarioActual) {
	 List<Vehiculo> resultado = new ArrayList<>();
	 for (Vehiculo vehiculo : vehiculos.values()) {
		 if (vehiculo.getPropietarioActual().equals(propietarioActual)) {
			 resultado.add(vehiculo);
		 }
	}
return resultado;
 }
 public List<Vehiculo> mostrarVehiculosPorAnioRematriculacion (int anio) {
	 List <Vehiculo> resultado = new ArrayList <>();
	 for (Vehiculo vehiculo : vehiculos.values()) {
		 if (!vehiculo.getRematriculacionesPorAnio(anio).isEmpty()) {
			 resultado.add(vehiculo);
		 }
	 }
 return resultado;
 }
 
 public void mostrarRematriculacionesPorVehiculo (String numBastidor) {
	 Vehiculo vehiculo = vehiculos.get(numBastidor);
	 if (vehiculo != null) {
		 vehiculo.mostrarRematriculaciones();
	 }
 }
@Override
public String toString() {
	return "RegistroTrafico [vehiculos=" + vehiculos + "]";
}
 
 
}
