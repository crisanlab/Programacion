package herencia;

public class Vehiculo {
	    private String dueno;
	    private int numPuertas;
	    private int numRuedas;
	    private String calificacionEcologica;
	    
	    public Vehiculo(String dueno, int numPuertas, int numRuedas, String calificacionEcologica) {
	        this.dueno = dueno;
	        this.numPuertas = numPuertas;
	        this.numRuedas = numRuedas;
	        this.calificacionEcologica = calificacionEcologica;
	    }
	    public String getDueno() {
	        return dueno;
	    }

	    public void setDueno(String dueno) {
	        this.dueno = dueno;
	    }

	    public int getNumPuertas() {
	        return numPuertas;
	    }

	    public void setNumPuertas(int numPuertas) {
	        this.numPuertas = numPuertas;
	    }

	    public int getNumRuedas() {
	        return numRuedas;
	    }

	    public void setNumRuedas(int numRuedas) {
	        this.numRuedas = numRuedas;
	    }

	    public String getCalificacionEcologica() {
	        return calificacionEcologica;
	    }

	    public void setCalificacionEcologica(String calificacionEcologica) {
	        this.calificacionEcologica = calificacionEcologica;
	    }
	    public Vehiculo() {}

	    public boolean tieneLicenciaParaCircular(String ciudad) {
	    	return true;
	    }

}
