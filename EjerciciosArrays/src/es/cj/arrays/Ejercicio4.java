package es.cj.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	private static Scanner sc = new Scanner(System.in);
	
	// Leer 2 tablas de n números y mezclarla en una tercera tabla de la siguiente forma:
	// 1º de A, 1º de B, 2º de A, 2º de B, 3º de A, 3º de B,...
	
	public static void main(String[] args) {
		
		System.out.print("Cantidad de números en la tabla : ");
		int cantidad = sc.nextInt();
		int numeros1 [] = new int [cantidad];
		char abc [] = new char [26];
		int num = 0;
		int num1 = 0;
		for (int i = 0; i < numeros1.length; i++) {
			numeros1[i] = num1;
			num1 = num1 + 1;
		}
		Arrays.toString(numeros1);
		for (char a = 'A'; a <= 'Z'; a++) {
			abc[num] = a;
			num++;
		}
		Arrays.toString(abc);
		int cont1 = 0;
		int cont2 = 0;
		int total = numeros1.length + abc.length;
		int nuevaT [] = new int [total];
		for (int i = 0; i < nuevaT.length; i++) {
			nuevaT[i] = numeros1[cont1] + abc[cont2];
			cont1++;
			cont2++;
		}
				
		
		System.out.println("Tabla primera");
		for (int i = 0; i < numeros1.length; i++) {
			System.out.print(numeros1[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Tabla segunda");
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i]+" ");
		}
		System.out.println();
		System.out.println("Tabla aleatoria");
		System.out.println(Arrays.toString(nuevaT));
		
	}

}