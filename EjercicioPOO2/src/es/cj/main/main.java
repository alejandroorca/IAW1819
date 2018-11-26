package es.cj.main;

import es.cj.clases.Circulo;
import es.cj.clases.Punto;

public class main {

	public static void main(String[] args) {
		Punto p1 = new Punto(2,3);
		Punto p2 = new Punto(4,5);
		
		double dist = p1.calcularDistanciaDesde(p2);

		System.out.println("Distancia:"+dist);
		
		Circulo c = new Circulo(10, 30, 40);
		System.out.println("�rea: "+c.calcularArea());
		System.out.println("Per�metro: "+c.calcularPerimetro());
		System.out.println("Ditancia: "+c.calcularDistanciaDesde(p1));
	}

}
