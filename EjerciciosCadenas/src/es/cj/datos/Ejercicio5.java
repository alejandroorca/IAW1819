package es.cj.datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	private static Scanner sc = new Scanner(System.in);
	private static String cadenaf = "";
	private static String cadena;
	private static int cadenan;
	private static int posicion;
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
			cadenan = sc.nextInt();
		} while (cadenan < 0);
		System.out.println(ComparaYResuelve(cadena));
	}
	private static String ComparaYResuelve(String cadena2) {
		for (int i = 0; i < cadena.length(); i++) {
			posicion = cadenan + Character.getNumericValue(cadena.charAt(i));
			String letra = Integer.toBinaryString(posicion);
			if (posicion < 27 && posicion > 0) {
				cadenaf=""+letra;
			} else {
				cadenaf=""+cadenan;
			} 
		}
		return cadenaf;
		
	}


}
