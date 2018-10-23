package es.cj.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//1 Leer n números enteros, guardarlos en la tabla y mostrar la media de los positivos, 
		//media negativos y el número de ceros
		
		System.out.println("Introduzca la cantidad de números: ");
		int numero = sc.nextInt();
		double ceros = 0, positivos = 0, negativos = 0;
		int tabla [] = new int [numero];
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(numero);
		}
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i]>0) {
				positivos = positivos + 1;
			} else if (tabla[i]<0) {
				negativos = negativos + 1;
			}else {
				ceros = ceros + 1;
			}
		}
		System.out.println("Hay una media de "+positivos+" positivos, "+negativos+" negativos y "+ceros+" de ceros.");
	}
	
}
