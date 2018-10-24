package es.cj.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//3 Leer tabla de n números y guardar en otra tabla los pares y en otra tabla los impares

		System.out.println("Introduce el número de números en tu lista: ");
		int numero = sc.nextInt();
		int tabla [] = new int [numero];
		int pares = 0;
		int impares = 0;
		int tablapares [] = new int [numero];
		int tablaimpares [] = new int [numero];
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(numero);
			if (tabla[i]%2==0) {
				pares = pares + 1;
				tablapares[pares] = tabla[i];
				
			} else {
				impares = impares + 1;
				tablaimpares[impares] = tabla[i];
				
			}
			
		}
		System.out.println("Tabla de pares");
		for (int i = 0; i < tablapares.length; i++) {
			System.out.print(tablapares[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Tabla de impares");
		for (int i = 0; i < tablaimpares.length; i++) {
			System.out.print(tablaimpares[i]+" ");
		}
	}
}
