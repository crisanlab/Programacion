package modelo;

import java.time.LocalDate;

public class Canario extends Aves {


	public Canario(String color, boolean vuela) {
		super();
		this.color = color;
		this.vuela = vuela;
	}

	private String color;
	private boolean vuela;
	
	
	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean volar() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
