package es.cj.datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	private static Scanner sc = new Scanner(System.in);
	private static String cadenaf = "";
	private static String cadena;
	private static String cadenan;
	private static char abc [] = new char [26];
	private static int posicion;
	public static void main(String[] args) {
		// 5.Dada una cadena y un código entero aleatorio. 
		//Generar una cadena cifrada donde cada carácter se sustituye por el carácter situado n posiciones después del mismo. 
		//Debe empezar por la letra A si la suma del carácter con el codigo es mayor que Z.
		do {
			System.out.println("Introduce texto a encriptar: ");
			cadena = sc.nextLine();
		} while (cadena.isEmpty());
		do {
			System.out.println("Introduce el valor numérico: ");
			cadenan = sc.nextLine();
		} while (cadenan.isEmpty() || cadenan.length() > cadena.length());
		CrearABC();
		System.out.println(ComparaYResuelve(cadena));
	}
	private static String ComparaYResuelve(String cadena2) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (caracter == abc[i]) {
			posicion = i + Character.getNumericValue(cadenan.charAt(i));
			if (posicion < 27 && posicion >= 0) {
				cadenaf =""+abc[posicion];
				posicion = 0;	
			} else if (posicion >= 27) {
				posicion = Character.getNumericValue(cadenan.charAt(i));
				cadenaf =""+abc[posicion];
				posicion=0;
			}
			
			} 
		}
		return cadenaf;
		
	}
	private static void CrearABC() {
		for (int i = 0; i < abc.length; i++) {
			abc[i] = (char) ('a' + i);
			System.out.print(abc[i]+ " ");
}		
	}

}
