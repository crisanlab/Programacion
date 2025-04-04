package agendaMapa;

import java.util.Map;
import java.util.TreeMap;

public class AgendaMapa {
private Map<String,Contacto> agenda;

public AgendaMapa() {
	super();
	this.agenda = new TreeMap<String, Contacto>();
}


public Map<String, Contacto> getAgenda() { //el mapa necesita clave( en este caso telefono) y valor
	return agenda;
}

public void setAgenda(Map<String, Contacto> agenda) {
	this.agenda = agenda;
}


}
