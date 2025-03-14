package controlador;

import java.util.Arrays;

import modelo.*;

public class GestionaFactoria {
	public static void main(String[] args) {
		Robot r1= new  RobotPintor(null, 0, null, null);
		Robot r2=new RobotSoldador(null, 0, null, null, 0, null);
		int contador=0;
		Robot [] inventarioRobots = new Robot[20];
		
		inventarioRobots[contador]=r1;
		contador +=1;
		
		
		
	}

}
