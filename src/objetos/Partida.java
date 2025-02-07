package objetos;

import java.util.Arrays;

public class Partida {
	private String nombre;
	private Participante [] participantes ;
	private Participante ganador;
	
	
	public Partida(String nombre, Participante[] participantes, Participante ganador) {
		super();
		this.nombre = nombre;
		this.participantes = participantes;
		this.ganador = ganador;
	}

	@Override
	public String toString() {
		return "Partida [nombre=" + nombre + ", participantes=" + Arrays.toString(participantes) + ", ganador="
				+ ganador + "]";
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Participante[] getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Participante[] participantes) {
		this.participantes = participantes;
	}

	public Participante getGanador() {
		return ganador;
	}

	public void setGanador(Participante ganador) {
		this.ganador = ganador;
	}

	float calculaJugadorMayorPunt(){
	float mayorPuntuacion= 0;
	for (Participante p : this.participantes) {
		if (mayorPuntuacion < )
	}
	
	
	
	return participanteGanador;
	
	}
	
	imprimeganador () void

}
