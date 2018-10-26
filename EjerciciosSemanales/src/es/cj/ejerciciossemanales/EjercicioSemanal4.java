package es.cj.ejerciciossemanales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioSemanal4 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce el número a mostrar la posición: ");
		int elegido = sc.nextInt();
		int contador = 0;
		int tabla [] = new int [20];
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(20);
		}
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i]+" ");
		}
		System.out.println();
		Arrays.sort(tabla);
		int busqueda = Arrays.binarySearch(tabla, elegido);
		for (int i = 0; i < tabla.length; i++) {
			if (elegido == tabla[i]) {
				contador= contador + 1;
			}
		}
		if (busqueda > 0) {
			System.out.println("Su número se encuentra en la posición: "+busqueda);
			
		}else {
			System.out.println("No se encuentra el número solicitado, por favor introduzca otro número.");
		}
		System.out.println("El número "+elegido+" aparece "+contador);
	}

}

