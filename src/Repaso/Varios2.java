package Repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Varios2 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Dime cuántos árboles hay");
	 int numArboles = sc.nextInt();
	String[] tipos = new String [numArboles] ;
	double [] diametros = new double [numArboles];
	double [] alturas = new double [numArboles];
	int [] edadesB = new int [numArboles];
	Varios2 v = new Varios2();
	int numeroArbolesTotales= v.cargaDatos(tipos,diametros,alturas,edadesB);
	System.out.println(Arrays.toString(diametros));
	double mediaAltura=v.calculaMediaAltura(alturas);
	System.out.println("Media alturas:" + mediaAltura);
	double alturaMax=v.calculaAlturaMaxima(alturas);
	double alturain=v.calculaAlturaMinima(alturas);
	double diametroMax=v.calculaDiametroMaximo(diametros);
	double diametroMin=v.calculaDiametroMinimo(diametros);
	double mediaEdades=v.calculaMediaEdades(edadesB);
	if(existeMas30Metros(alturas))
	{
		System.out.println("Existen árboles de nás de 30 mts");
	}
}

double calculaAlturaMaxima(double [] alturas)
{
	double maximo = 0;
	for ( int i = 0; i < alturas.length; i++) {
		if (maximo < alturas[i])
		{
			maximo=alturas[i];
		}
	}
	return maximo;
}

 boolean existeMas30Metros(double [] alturas)
 {
	 boolean existen = false;
	 int i = 0;
	 while ( i < alturas.length && !existen)
	 {
		 if (alturas[i]> 30)
		 {
			 existen = true;
		 }
		 i = i+1;
	 }
	 return existen;
 }

	double calculaMediaAltura(double [] alturas)
	{
		double media =0;
		double sumaAltura= 0;
		for ( int i =0; i< alturas.length; i++)
		{
			sumaAltura= sumaAltura+ alturas[i];
		}
		media = sumaAltura/alturas.length;
		return media;
	}

	
 int cargaDatos (String [] tipos, double [] diametros, double [] alturas, int []edadesB) {
	 int numeroTipoB = 0;
	 Scanner sc = new Scanner(System.in);
	 for ( int i= 0 ; i < tipos.length  ; i++) {
		 System.out.println("Dime el tipo de árbol:");
		 tipos[i] =sc.next().toUpperCase();
		 System.out.println("Diametro:");
		 diametros[i] =sc.nextDouble();
		 System.out.println("altura:");
		 alturas[i] =sc.nextDouble();
		 if(tipos[i].equals("B"))
		 {
			 System.out.println("edad:");
		 }
	return numeroTipoB;
		 }
 }
}
