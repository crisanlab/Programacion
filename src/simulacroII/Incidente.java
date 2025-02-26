package simulacroII;

import java.time.LocalDate;
import java.util.Objects;

public class Incidente {
	 private int identificador;
	 private String nombre;
	 private String descripcion;
	 private LocalDate fechaRegistro;
	 private LocalDate fechaCierre;
	 private EstadoIncidente estado;
	 private Criticidad  criticidad;
	 private Equipo equipo;
	 
	 
	public Incidente(int identificador, String nombre, String descripcion, LocalDate fechaRegistro,
			LocalDate fechaCierre, EstadoIncidente estado, Criticidad criticidad, Equipo equipo) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaRegistro = fechaRegistro;
		setFechaCierre(fechaCierre);
		setEstado(estado);
		this.criticidad = criticidad;
		this.equipo = equipo;
	}


	protected int getIdentificador() {
		return identificador;
	}


	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected String getDescripcion() {
		return descripcion;
	}


	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	protected LocalDate getFechaRegistro() {
		return fechaRegistro;
	}


	protected void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	protected LocalDate getFechaCerro() {
		return fechaCierre;
	}


	protected void setFechaCierre(LocalDate fechaCierre) {
		if (estado != EstadoIncidente.CERRADA) {
			this.fechaCierre = null;
		}else {
		this.fechaCierre = fechaCierre;}
	}


	protected EstadoIncidente getEstado() {
		return estado;
	}


	protected void setEstado(EstadoIncidente estado) {
		if (estado ==EstadoIncidente.CERRADA) {
			this.fechaCierre=LocalDate.now();
		}else {
		this.estado = estado;}
	}


	protected Criticidad getCriticidad() {
		return criticidad;
	}


	protected void setCriticidad(Criticidad criticidad) {
		this.criticidad = criticidad;
	}


	protected Equipo getEquipo() {
		return equipo;
	}


	protected void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(criticidad, descripcion, equipo, estado, fechaCierre, fechaRegistro, identificador, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidente other = (Incidente) obj;
		return criticidad == other.criticidad && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(equipo, other.equipo) && estado == other.estado
				&& Objects.equals(fechaCierre, other.fechaCierre) && Objects.equals(fechaRegistro, other.fechaRegistro)
				&& identificador == other.identificador && Objects.equals(nombre, other.nombre);
	}

	
	@Override
	public String toString() {
		return nombre+ " - " +estado + criticidad  + " - " + fechaRegistro + equipo;}
	 
	 
	 public boolean esUrgente(){
		boolean urgente=false;
		LocalDate hoy = LocalDate.now();
		 if (criticidad == Criticidad.CRITICA) {
			 urgente=true;
		 }else if 
			 (criticidad== Criticidad.GRAVE && this.fechaRegistro.plusDays(7).isAfter(hoy)) {
			 urgente=true;
		 } else if 
			 (criticidad == Criticidad.MEDIA && this.fechaRegistro.plusMonths(1).isAfter(hoy)) {
			 urgente = true;
		 } else {
			 urgente = false;
		 }
		return urgente;
			 
	 }
	 
	 
	 
	
}
