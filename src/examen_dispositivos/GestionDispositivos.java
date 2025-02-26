package examen_dispositivos;


public class GestionDispositivos {
	public static void main(String[] args) {
		Smartphone s1= new Smartphone("Samsung","Galaxy S21",900,false,2);
		Laptop l1 = new Laptop ("Samsung","S123",1500,30,3);
		PCSobremesa pc1 = new PCSobremesa ("Samsung","S453",750,50,false);
		
		Dispositivo d1 = new Smartphone("Samsung","Galaxy S21",900,false,2);
		Dispositivo d2 = new Laptop("LG", "123LG", 2500, 120,1.5);
		Dispositivo d3 = new PCSobremesa("LG", "LG587", 700,30, true);
		
		System.out.println(s1);
		System.out.println(l1);
		System.out.println(pc1);
		System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        s1.equals(d1);
        System.out.println(s1.equals(d1));
        System.out.println(l1.equals(d2));
        
        boolean esDispositivo1 = d1 instanceof Smartphone ;
        System.out.println("Es Smartphone?"+esDispositivo1);
        
        boolean esDispositivo2 = d2 instanceof Laptop ;
        System.out.println("Es laptop?"+esDispositivo2);
        
        boolean esDispositivo3 = d3 instanceof PCSobremesa ;
        System.out.println("Es PCSobremesa?"+esDispositivo3);
        
        
      Smartphone e1 = (Smartphone)d1;
      e1.getCantidadCamaras();
      
      Laptop l2 = (Laptop)d2;
      l2.getPeso();
      
      PCSobremesa pc2 = (PCSobremesa)d3;
      pc2.isTieneGPUdedicada();
      
      
      
      
      
        
        
	
	}

}
