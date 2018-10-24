package es.cj.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//2 Leer n n�meros ordenados crecientemente. Pedir al usuario un n�mero y buscarlo en la tabla. 
		//Se debe mostrar la posici�n en la que se encuentra. Si no est�, indicarlo con un mensaje
		System.out.println("Indique cu�ntos n�meros quieres tener en la lista: ");
		int numero = sc.nextInt();
		System.out.println("Introduce el n�mero a mostrar la posici�n: ");
		int elegido = sc.nextInt();
		int encontrado = 0;
		int tabla [] = new int [numero];
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(numero);
			
			System.out.print(tabla[i]+" ");
		}
		System.out.println();
		int busqueda = Arrays.binarySearch(tabla, elegido);
		if (busqueda > 0) {
			System.out.println("Su n�mero se encuentra en la posici�n: "+busqueda);
			
		}else {
			System.out.println("No se encuentra el n�mero.");
		}
	}

}
