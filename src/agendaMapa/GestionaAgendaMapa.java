package agendaMapa;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class GestionaAgendaMapa {
public static void main(String[] args) {
	Contacto c1 = new Contacto("Pepe","Arez","lllll","qoqoqo","12345678");
	Contacto c2 = new Contacto("Pepa","Barez","llggl","qoqtitio","9887654563");
	Contacto c3 = new Contacto("Pepo","Cerez","iilll","qoehehqo","845367854");
	AgendaMapa a = new AgendaMapa();
	
	
	a.getAgenda().put("845367854", c3);
	a.getAgenda().put("12345678", c1);
	a.getAgenda().put("9887654563", c2);

	
	a.getAgenda().put("845367854", c1);
	System.out.println(a.getAgenda().size());
	System.out.println(a.getAgenda().toString()); //Lo devuelvo todo en una cadena
	System.out.println(a.getAgenda().get("845367854"));
	System.out.println("Devuelvo clave:");
	System.out.println(a.getAgenda().keySet());  //La clave
	System.out.println("Devuelvo valores:");
	System.out.println( a.getAgenda().values()); //devuelve los contactos(valores)
	
	
	//iterador de mapas
	
	Set<Map.Entry <String,Contacto>> entradas = a.getAgenda().entrySet();
	
	Entry <String, Contacto> elemento;
	Iterator it = entradas.iterator();
	while (it.hasNext()) {
		elemento = (Entry <String, Contacto>)it.next();
		elemento.getKey();
		elemento.getValue();
		
	}
	
	
	
	
	
	
	
}
}
