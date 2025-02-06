package objetos;

import java.util.Arrays;

public class Equipo {

	String nombreEquipo;
	int [] puntuaciones;
    Persona [] personas;
	public Equipo(String nombreEquipo, int[] puntuaciones, Persona[] personas) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.puntuaciones = puntuaciones;
		this.personas = personas;
	}
	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", puntuaciones=" + Arrays.toString(puntuaciones)
				+ ", personas=" + Arrays.toString(personas) + "]";
	}
    
    float calculaMediaEdad()
    {
    	float mediaEdad=0f;
    	float edades=0f;
    	Persona [] tablaPersona= this.personas;
    	for(Persona p : tablaPersona)
    	{
    		edades= edades+p.edad;
    	
    		mediaEdad=edades/tablaPersona.length;
    	}
    	
    	return mediaEdad;
    }
		
	}
