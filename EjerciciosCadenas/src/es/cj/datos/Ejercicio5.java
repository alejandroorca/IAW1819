package es.cj.datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	private static Scanner sc = new Scanner(System.in);
	private static String cadenaf = "";
	private static String cadena;
	private static String cadenan;
	private static char abc [] = new char [26];
	public static void main(String[] args) {
		// 5.Dada una cadena y un c�digo entero aleatorio. 
		//Generar una cadena cifrada donde cada car�cter se sustituye por el car�cter situado n posiciones despu�s del mismo. 
		//Debe empezar por la letra A si la suma del car�cter con el codigo es mayor que Z.
		do {
			System.out.println("Introduce texto a encriptar: ");
			cadena = sc.nextLine();
		} while (cadena.isEmpty());
		do {
			System.out.println("Introduce el valor num�rico: ");
			cadenan = sc.nextLine();
		} while (cadenan.isEmpty() || cadenan.length() > cadena.length());
		CrearABC();
		ComparaYResuelve(cadena);
	}
	private static void ComparaYResuelve(String cadena2) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter =;
			if (cadena.substring(i).equalsIgnoreCase(abc[i])) {
				
			} 
		}
		
	}
	private static void CrearABC() {
		for (int i = 0; i < abc.length; i++) {
			abc[i] = (char) ('a' + i);
			System.out.print(abc[i]+ " ");
}		
	}

}
