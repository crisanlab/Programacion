package objetos;

public class Participante {
	String nick;
	String nombre;
	int edad;
	float puntuacion;
	public Participante(String nick, String nombre, int edad, float puntuacion) {
		super();
		this.nick = nick;
		this.nombre = nombre;
		this.edad = edad;
		this.puntuacion = puntuacion;
	}
	@Override
	public String toString() {
		return "Participante [nick=" + nick + ", nombre=" + nombre + ", edad=" + edad + ", puntuacion=" + puntuacion
				+ "]";
	}

	
}
