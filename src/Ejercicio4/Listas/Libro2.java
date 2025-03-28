package Ejercicio4.Listas;

import java.util.Objects;

import ListasEjercicio3.EstadoLibro;
import ListasEjercicio3.Libro;

public class Libro2 {
	private String titulo;
	private String autor;
	private String genero;
	private int anyoPublicacion;
	private EstadoLibro estado;
	private String isbn;

	public Libro2(String titulo, String autor, String genero, int anyoPublicacion, EstadoLibro estado, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anyoPublicacion = anyoPublicacion;
		this.estado = estado;
		this.isbn = isbn;
	}

	

	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}



	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}



	public EstadoLibro getEstado() {
		return estado;
	}



	public void setEstado(EstadoLibro estado) {
		this.estado = estado;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro2 other = (Libro2) obj;
		return Objects.equals(isbn, other.isbn);
	}



	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", anyoPublicacion="
				+ anyoPublicacion + ", estado=" + estado + "]";
	}

}
