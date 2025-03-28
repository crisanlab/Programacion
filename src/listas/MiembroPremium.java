package listas;

public class MiembroPremium extends MiembroBase{

	private TipoPremium tipoPremium;
	private static int maximoAmigos;
	
	

public MiembroPremium(String email, String nombre, int contadorAmigos, TipoPremium tipoPremium) {
		super(email, nombre, contadorAmigos);
		this.tipoPremium = tipoPremium;
	}


public static int getMaximoamigos() {
	
	return maximoAmigos=100;
}


@Override
public String toString() {
	return "MiembroPremium [id=" + id + ", email=" + email + ", nombre=" + nombre + ", TipoUsuario="
			+ getTipoUsuario() + "]";
}


@Override
public String getTipoUsuario() {
	String respuesta;
	if(tipoPremium==TipoPremium.PREMIUM) {
		respuesta=("PREMIUM: PREMIUM");
	} else {
		respuesta=("PREMUIM:PREMIUM_VIP");
	}
	return respuesta;
}





}
