package vehiculo;

public class VehiculoCombustible extends VehiculoGeneral{
	protected String matricula;
	protected boolean esDiesel;
	protected String modelo;
	protected String marca;
	
	
	public VehiculoCombustible(int id, String[] alquieres, boolean estaDisponible, String matricula, boolean esDiesel,
			String modelo, String marca) {
		super(id, alquieres, estaDisponible);
		this.matricula = matricula;
		this.esDiesel = esDiesel;
		this.modelo = modelo;
		this.marca = marca;
	}


	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public double getPrecioPorDia() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public float getImporteGenrado() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
