package es.repaso.ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	
	private static Scanner sc = new Scanner(System.in);
	private static int [] tabla;
	private static int auxiliar;
	public static void main(String[] args) {
		System.out.println("Introduzca el valor de la tabla: ");
		int numero = sc.nextInt();
		tabla = new int [numero];
		CrearNumeros();
		Desplazar();
		MostrarNumeros();
	}

	private static void MostrarNumeros() {
		System.out.println();
		System.out.println(Arrays.toString(tabla));
		
	}

	private static void Desplazar() {
		auxiliar = tabla[tabla.length - 1];
		for (int i = tabla.length - 1; i > 0; i--) {
			tabla[i] = tabla[i-1];
		}
		tabla[0] = auxiliar;
	}

	private static void CrearNumeros() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(10)+1;
			System.out.print(tabla[i]+ " ");
		}
		
	}

}
