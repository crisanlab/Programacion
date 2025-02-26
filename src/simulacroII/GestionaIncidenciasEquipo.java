package simulacroII;

public class GestionaIncidenciasEquipo {
	public static void main(String[] args) {
		
		Equipo equipo1= new Equipo ("Pepe", "3C:D9:2B:88:99:AA : 2", "windows", 1);
		Equipo equipo2= new Equipo ("Juan", "2A:D9:2B:88:99:AA : 2","windows", 2);
		Equipo equipo3= new Equipo ("Antonio", "3C:D9:2B:77:99:AA : 2","windows", 3);
		Equipo equipo4 = new Equipo ("Maria","5C:D9:2B:88:99:AA : 2", "windows", 0);
		
		Incidente indicente1 = new Incidente (1,"pepe","Error",2021-04-03,2021-04-22,EstadoIncidente.CERRADA,Criticidad.MEDIA,equipo1);
		Incidente incidente2 = new Incidente(2,"Juan","Error", "2022-06-07", "2022-06-08",EstadoIncidente.ANALIZADA,Criticidad.LEVE,equipo1);
		Incidente incidente3 = new Incidente(3,"Antonio","Error","2022-06-06","2022-06-09",EstadoIncidente.ANALIZADA,Criticidad.LEVE, null)
		Incidente incidente4 = new Incidente(4,"Pepe","Error","2023-06-09","2023-07-09",EstadoIncidente.ANALIZADA,Criticidad.CRITICA, null)
		Incidente incidente5 = new Incidente(5,"","Error","2023-07-08","2023-09-09",EstadoIncidente.CERRADA,Criticidad.LEVE, null)
		Incidente incidente6 = new Incidente(6,"","Error","2023-06-08","2023-07-08",EstadoIncidente.CERRADA,Criticidad.GRAVE, null)
		
		
		
		
		Incidencia [] = {indicente1,indicente2,indicente3,indicente4,indicente5,indicente6}; //Guardar incidencias
	}

}
