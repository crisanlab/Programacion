package objetos;

import java.util.Arrays;

public class Partida {
	String nombre;
	Participante [] participantes ;
	Participante ganador;
	
	
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
	
	float calculaJugadorMayorPunt(){
	float mayorPuntuacion= 0;
	participanteGanador=" ";
	Participante [] tablaParticipante= this.participantes;
	
	
	return participanteGanador;
	
	}
	
	imprimeganador () void

}
