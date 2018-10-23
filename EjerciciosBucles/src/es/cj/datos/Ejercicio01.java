package es.cj.datos;

import java.util.Scanner;

public class Ejercicio01 {

	// Pedir 5 números, mostrar la media de los positivos, negativos y cantidad de ceros.
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double numeropos=0;
		double numeroneg=0;
		int contadorpositivo = 0, contadornegativo = 0, contadorceros = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nº: ");
			double numero = sc.nextDouble();
			
			if (numero > 0) {
				numeropos = numeropos + numero;
				// numeropos += numero;
				contadorpositivo++;
			} else if (numero < 0) {
				numeroneg += numero;
				contadornegativo++;
			} else {
				contadorceros++;
			}
			
		}
		
		System.out.println("La media de positivos es de "+ (numeropos/contadorpositivo));
		System.out.println("La media de negativos es de "+ (numeroneg/contadornegativo));
		System.out.println("La media de ceros es de "+ contadorceros);
	}
	
	
	
}
