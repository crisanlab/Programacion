package herencias;

import herencia.Vehiculo;

public class Camion1 extends Vehiculo {
	  private int tonelajeKilos;
	    private int numPasajeros;
	    private int numEjes;
		public Camion1(String dueno, int numPuertas, int numRuedas) {
			super(dueno, numPuertas, numRuedas);
			// TODO Auto-generated constructor stub
		}
		public Camion1(String dueno, int numPuertas, int numRuedas, int tonelajeKilos, int numPasajeros, int numEjes) {
			super(dueno, numPuertas, numRuedas);
			this.tonelajeKilos = tonelajeKilos;
			this.numPasajeros = numPasajeros;
			this.numEjes = numEjes;
		}
		public int getTonelajeKilos() {
			return tonelajeKilos;
		}
		public void setTonelajeKilos(int tonelajeKilos) {
			this.tonelajeKilos = tonelajeKilos;
		}
		public int getNumPasajeros() {
			return numPasajeros;
		}
		public void setNumPasajeros(int numPasajeros) {
			this.numPasajeros = numPasajeros;
		}
		public int getNumEjes() {
			return numEjes;
		}
		public void setNumEjes(int numEjes) {
			this.numEjes = numEjes;
		}
		@Override
		public String toString() {
			return "Camion1 [tonelajeKilos=" + tonelajeKilos + ", numPasajeros=" + numPasajeros + ", numEjes=" + numEjes
					+ ", dueno=" + dueno + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + "]";
		}
	    
	    

}
