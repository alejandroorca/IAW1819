package es.cj.main;

import es.cj.clases.Caja;

public class Principal {

	public static void main(String[] args) {
	
		Caja c = new Caja(1,2,3);
		Caja c1 = new Caja(1,2,3);
		
		//c.setAlto(23);
		
		System.out.println("El alto es de "+c.getAlto());
	
		System.out.println("Volumen: "+c.obtenerVolumen(3));
		
		System.out.println(c);
		System.out.println(c1);
		
		if (c.equals(c1)) {
			System.out.println("Iguales");
		} else {
			System.out.println("Distintas");
		}
	}				
	

}
