package simulacion1;

public class GestionEmpleados {
	public static void main(String[] args) {
		Administrativo carlos = new Administrativo ("Carlos","12345678A",1200,40);
		Directivo juan = new Directivo ("Juan","87654321B",2800,15);
		
		System.out.println(carlos);
		System.out.println(juan);
	}

}
