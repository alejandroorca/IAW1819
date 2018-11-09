package es.cj.datos;

import java.util.Scanner;

public class Ejercicio2 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Realizar un programa que reciba dos cadenas de caracteres y 
		//cuente el número de apariciones de la primera en la segunda.
		String cadena1, cadena2;
		do {
			System.out.println("Introduzca la palabra: ");
			cadena1 = sc.nextLine();
		} while (cadena1.length() == 0);
		do {
			System.out.println("Introduzca la frase: ");
			cadena2 = sc.nextLine();
		} while (cadena2.length() == 0);
		int cont=0;
		int pos = cadena2.indexOf(cadena1);
		while (pos != -1) {
			cont++;
			pos = cadena2.indexOf(cadena1, pos+1);
			
		}
		
		System.out.println("La palabra aparece: "+cont+" veces.");
	}

}
