package es.cj.main;

import es.cj.clases.Persona;

public class main {

	public static void main(String[] args) {
		Persona p = new Persona();
		Persona p1 = new Persona("H", 78.6, 1.80, "Julio", 18, "78674859N");
		Persona p2 = new Persona("H", 78.4, 1.88, "Julio", 17, "78674859G");
		Persona p3 = new Persona("H", 78.8, 1.81, "Julio", 18, "78674859H");
		
		System.out.println(p1.calcularIMC());
		
		System.out.println(p2.esMayorDeEdad());

	}

}
