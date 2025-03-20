package vehiculo;

public abstract class VehiculoGeneral implements IAlquilable{
	protected int id;
	protected String alquieres[];
	protected boolean estaDisponible;
	
public abstract float getImporteGenrado();



public VehiculoGeneral(int id, String[] alquieres, boolean estaDisponible) {
	super();
	this.id = id;
	this.alquieres = alquieres;
	this.estaDisponible = estaDisponible;
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String[] getAlquieres() {
	return alquieres;
}

public void setAlquieres(String[] alquieres) {
	this.alquieres = alquieres;
}

public boolean isEstaDisponible() {
	return estaDisponible;
}

public void setEstaDisponible(boolean estaDisponible) {
	this.estaDisponible = estaDisponible;
}



}
