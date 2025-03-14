package modelo;

import traza.Traza1;

public class CompruebaVisibilidad {
	   private   int privado = 1;
	   int paquete = 2; 
	   protected int protegido = 3;
	   public    int publico = 4;
	   
	public CompruebaVisibilidad(int privado, int paquete, int protegido, int publico) {
		super();
		this.privado = privado;
		this.paquete = paquete;
		this.protegido = protegido;
		this.publico = publico;
	}


	protected int getPrivado() {
		return privado;
	}

	protected void setPrivado(int privado) {
		this.privado = privado;
	}

	protected int getPaquete() {
		return paquete;
	}

	protected void setPaquete(int paquete) {
		this.paquete = paquete;
	}

	protected int getProtegido() {
		return protegido;
	}

	protected void setProtegido(int protegido) {
		this.protegido = protegido;
	}

	protected int getPublico() {
		return publico;
	}

	protected void setPublico(int publico) {
		this.publico = publico;
	}

	@Override
	public String toString() {
		return "CompruebaVisibilidad [privado=" + privado + ", paquete=" + paquete + ", protegido=" + protegido
				+ ", publico=" + publico + "]";
	}
	
	
	   
	   
	}



