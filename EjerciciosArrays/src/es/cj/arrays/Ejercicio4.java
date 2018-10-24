package es.cj.arrays;

import java.util.Scanner;

public class Ejercicio4 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//4 Leer 2 tablas de n números y mezclarla en una tercera tabla de la siguiente forma: 
		//1º de A, 1º de B, 2º de A, 2º de B, 3º de A, 3º de B,...
		
		System.out.println("Introduzca el número de valores a crear: ");
		int numero = sc.nextInt();
		int num = 0;
		char abc [] = new char [27];
		int numeros [] = new int [numero];
		String ultima [] = new String [numero+27];		
		for (char a = 'a'; a <= 'z'; a++) {
			abc[num] = a;
			num++;
		}
		for (int i = 1; i < numeros.length; i++) {
			numeros[i] = i;
		}
		for (int j = 0; j < ultima.length; j++) {
			ultima[j] = (numeros[j]+abc[j]); 
		}
		
}
}
