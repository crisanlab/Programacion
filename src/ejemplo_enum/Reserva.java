package ejemplo_enum;

public class Reserva {

	
	private enum Mes {
		ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE;
	}
	
	Mes mes = Mes.ENERO;
	

public static void main(String[] args) {
	
	Mes mes2= Mes.valueOf("CRISTINA");
	System.out.println(mes2);
	
	
}


protected Mes getMes() {
	return mes;
}


protected void setMes(Mes mes) {
	this.mes = mes;
}
	}
	

