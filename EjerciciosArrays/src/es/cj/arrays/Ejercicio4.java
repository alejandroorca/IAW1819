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
		for (int i = 0; i < numeros1.length; i++) {
			numeros1[i] = new Random().nextInt(cantidad);
		}
		
		int cont1 = 0;
		int cont2 = 0;
		
		int numeros2 [] = new int [cantidad];
		for (int i = 0; i < numeros2.length; i++) {
			numeros2[i] = new Random().nextInt(cantidad);
		}
		
		int maxima = numeros1.length + numeros2.length;
		int nuevaT [] = new int [maxima];
				
		for (int i = 0; i < nuevaT.length; i++) {
			if(i%2==0) {
				nuevaT[i]=numeros1[cont1];
				cont1+=1;
			}else if(i%2==1) {
				nuevaT[i]=numeros2[cont2];
				cont2+=1;
			}
		}
		System.out.println("Tabla primera");
		for (int i = 0; i < numeros1.length; i++) {
			System.out.print(numeros1[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Tabla segunda");
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i]+" ");
		}
		System.out.println();
		System.out.println("Tabla aleatoria");
		System.out.println(Arrays.toString(nuevaT));
		
	}

}