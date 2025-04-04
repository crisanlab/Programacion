package ordenacionEjercicio2;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class PaginaWeb implements Comparable<PaginaWeb> {
	private String url;
	private LocalDate fecha;
	
	
	public PaginaWeb(String url, LocalDateTime fechaYHora) {
		super();
		this.url = url;
		this.fecha = fecha;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public LocalDateTime getFechaYHora() {
		return fecha;
	}


	public void setFechaYHora(LocalDateTime fechaYHora) {
		this.fecha = fecha;
	}


	@Override
	public int hashCode() {
		return Objects.hash(fechaYHora);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		return Objects.equals(fecha, other.fecha);
	}


	@Override
	public int compareTo(PaginaWeb o) {
		// TODO Auto-generated method stub
		return 0;
	}



	
	
	

}
