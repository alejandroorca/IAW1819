package es.cj.datos;

import java.util.Arrays;

public class Ejercicio5 {
	
	private static char abc [] = new char [26];
	public static void main(String[] args) {
		// 5.Dada una cadena y un c�digo entero aleatorio. 
		//Generar una cadena cifrada donde cada car�cter se sustituye por el car�cter situado n posiciones despu�s del mismo. 
		//Debe empezar por la letra A si la suma del car�cter con el codigo es mayor que Z.
		
		CrearABC();
		String cadenaf= "";
	}
	private static void CrearABC() {
		for (int i = 0; i < abc.length; i++) {
			abc[i] = (char) ('a' + i);
			System.out.print(abc[i]+ " ");
}		
	}

}
