package traza;

public class Traza1 {
		public int variableNoEstatica;
		public static int variableEstatica;


		public Traza1(int valor) {
			this.variableNoEstatica = valor;
			Traza1.variableEstatica = Traza1.variableEstatica++;
		}


		public int getVariableNoEstatica() {
			return variableNoEstatica;
		}


		public void setVariableNoEstatica(int variableNoEstatica)   {
			this.variableNoEstatica = variableNoEstatica;
		}


		public static int getVariableEstatica() {
			return variableEstatica;
		}


		public static void setVariableEstatica(int variableEstatica) {
			Traza1.variableEstatica = variableEstatica;
		}


		public static void main(String[] args) {
			Traza1 objeto1 = new Traza1(5);
			Traza1 objeto2 = new Traza1(10);
			System.out.println(objeto1.getVariableNoEstatica());
			System.out.println(getVariableEstatica());
			System.out.println(objeto2.getVariableNoEstatica());
			System.out.println(getVariableEstatica());
		}
	



}
