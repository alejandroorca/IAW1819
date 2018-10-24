package es.cj.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//2 Leer n números ordenados crecientemente. Pedir al usuario un número y buscarlo en la tabla. 
		//Se debe mostrar la posición en la que se encuentra. Si no está, indicarlo con un mensaje
		System.out.println("Indique cuántos números quieres tener en la lista: ");
		int numero = sc.nextInt();
		System.out.println("Introduce el número a mostrar la posición: ");
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
			System.out.println("Su número se encuentra en la posición: "+busqueda);
			
		}else {
			System.out.println("No se encuentra el número.");
		}
	}

}
