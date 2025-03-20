package deportista;

public class Deportista implements ICompeticion {

	protected int tiempoCalentamiento;
	protected double calorias;
	protected int horasEntrenamiento;
	protected Prueba [] pruebas ;
	protected String nombre;
	protected int edad;
	protected double peso;
	protected double altura;
	
	
	
	@Override
	public void competir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getTiempoPrueba() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	void addPrueba (String s) throws CompeticionException {
		
	}

}
