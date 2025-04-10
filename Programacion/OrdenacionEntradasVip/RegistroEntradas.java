package OrdenacionEntradasVip;

import java.util.HashMap;
import java.util.Map;

public class RegistroEntradas {
	private Map<Influencer,EntradaVip> entradas;

	public RegistroEntradas(Map<Influencer, EntradaVip> entradas) {
		super();
		entradas = new HashMap<>(); //mas rapido si no hay que guardar ordenado
	}
	
	public void añadirEntrada (Influencer influencer, EntradaVip entrada) {
		if (!entradas.containsKey(influencer)) {
			entradas.put(influencer, entrada);
		} else {
			System.out.println("Ya se ha asignado una entrada a este/a influencer");
		}
	}

public EntradaVip buscarEntrada (Influencer influencer) {
	return entradas.getOrDefault(influencer, null);
}

public void confirmarAsistencia (Influencer influencer) {
	EntradaVip entrada = entradas.get(influencer);
	if (entrada != null) {
		entrada.setEstadoEntrada(EntradaVip.);
	}
}

public void cancelarAsistencia(Influencer influencer) {
	EntradaVip entrada = entradas.get(influencer);
	if (entrada != null) {
		entrada.setEstadoEntrada(EntradaVip.EstadoEntrada.CANCELADA);
	}
}

public void listarConfirmados () {
	System.out.println("Influencer confirmados: ");
	for (Map.Entry<Influencer,EntradaVip> entry : entradas.entrySet()) {
		if (entry.getValue().getEstadoEntrada() == EntradaVip.EstadoEntrada.CONFIRMADA) {
			System.out.println(entry.getKey() + "-"+ entry.getValue());
		}
	}
}

public void listarCancelados () {
	System.out.println("Influencer cancelados: ");
	for (Map.Entry<Influencer, EntradaVip> entry : entradas.entrySet()) {
			if (entry.getValue().getEstadoEntrada() == EntradaVip.EstadoEntrada.CANCELADA) {
				System.out.println(entry.getKey() + "-" + entry.getValue());
			}
	}
}

public void listarPendientes() {
	System.out.println("Influencer pendientes de confirmar: ");
	for (Map.Entry<Influencer,EntradaVip>entry : entradas.entrySet()) {
		if (entry.getValue().getEstadoEntrada() == EntradaVip.EstadoEntrada.ENVIADA) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}

public void listarTopInfluencers() {
	
}
}
