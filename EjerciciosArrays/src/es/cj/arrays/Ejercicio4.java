package es.cj.arrays;

import java.util.Scanner;

public class Ejercicio4 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//4 Leer 2 tablas de n n�meros y mezclarla en una tercera tabla de la siguiente forma: 
		//1� de A, 1� de B, 2� de A, 2� de B, 3� de A, 3� de B,...
		
		System.out.println("Introduzca el n�mero de valores a crear: ");
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
