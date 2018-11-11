package es.cj.datos;

import java.util.Scanner;

public class Ejercicio6 {
private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Introduzca el texto: ");
		String palabra = sc.nextLine();
		System.out.println("Texto en morse: ");
		System.out.println(Convertir(palabra));
		


	}

	private static String Convertir(String palabra) {
		String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", // a-i
	            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", // j-q
	            ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".......", // r-" "
	            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", // A-G
	            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", // H-P
	            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", // Q-X
	            "-.--", "--..", "......." }; // Y-Z

	    String abecedario = (String) "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
	    int posicion = 0;
	    String conversion = "";

	    for (int f = 0; f < palabra.length(); f++) {
	        posicion = abecedario.indexOf(palabra.charAt(f));
	        conversion = conversion + morse[posicion] + " ";

	    }
	    return conversion;
		
	}

}
