package es.repaso.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
	private static Scanner sc = new Scanner(System.in);
	private static int [] tabla;
	private static int posicion = -1;
	public static void main(String[] args) {
		
		System.out.println("Introduzca el número del tamaño de la tabla: ");
		 int size = sc.nextInt();
		 tabla = new int [size];
		do {
			System.out.println("Introduzca el número a eliminar: ");
			posicion = sc.nextInt();
		} while (posicion < 0 || posicion > size);
		
		RellenarTabla();
		MostrarTabla();
		Eliminado(posicion);
		System.out.println();
		MostrarTabla();
	}
	private static void Eliminado(int posicion) {
		for (int i = posicion; i < tabla.length -1; i++) {
			
			tabla[i] = tabla[i + 1];
		}
		tabla[tabla.length-1] = 0;
	}
	private static void MostrarTabla() {
		for (int i = 0; i < tabla.length && tabla[i] !=0; i++) {
			System.out.print(tabla[i]+ " ");
			
		}
		
	}
	private static void RellenarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(10)+1;
		}
		
	}


}
