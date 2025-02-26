package examen_menu;

import java.time.LocalDate;
import java.util.Objects;

import simulacion1.JoseAndres;

public class Cliente {
    private String dni;
    private String nombre;
    private  String apellidos;
    private  int edad;
    private  TipoDieta tipoDieta;
    private LocalDate fechaInscripcion;
    private boolean esVip;
    
    
	public Cliente(String dni, String nombre, String apellidos, int edad, TipoDieta tipoDieta,
			LocalDate fechaInscripcion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.tipoDieta = tipoDieta;
		this.fechaInscripcion = fechaInscripcion;
	}


	
	
	protected String getDni() {
		return dni;
	}




	protected void setDni(String dni) {
		this.dni = dni;
	}




	protected String getNombre() {
		return nombre;
	}




	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}




	protected String getApellidos() {
		return apellidos;
	}




	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	protected int getEdad() {
		return edad;
	}




	protected void setEdad(int edad) {
		this.edad = edad;
	}




	protected TipoDieta getTipoDieta() {
		return tipoDieta;
	}




	protected void setTipoDieta(TipoDieta tipoDieta) {
		this.tipoDieta = tipoDieta;
	}




	protected LocalDate getFechaInscripcion() {
		return fechaInscripcion;
	}




	protected void setFechaInscripcion(LocalDate fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}




	protected boolean isEsVip() {
		return esVip;
	}




	protected void setEsVip(boolean esVip) {
		this.esVip = esVip;
	}




	@Override
	public int hashCode() {
		return Objects.hash(dni, edad);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return this.getDni().equals(other.getDni()) && getEdad() > 0;
		
	}
    
    
    public boolean hayQueHacerPromocion() {
    	boolean valida= false;
    	if (getEdad() > 65) {
    		valida=true;
    	}else if  (isEsVip() == true) {
    		valida=true;
    	}
    	
		return valida;
    	
    }




	}

    


