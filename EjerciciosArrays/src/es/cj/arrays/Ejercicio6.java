package es.cj.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1. 
		 * Eliminar el valor de esa posición y desplazar todos los elementos para no dejar 
		 * el hueco vacío
		 */
		System.out.println("Inserte el número de valores de la tabla: ");
		int numero  = sc.nextInt();
		int cont = 0;
		int tabla [] = new int [numero];
		int num = 0;
		System.out.println("Inserte el número a eliminar: ");
		int borrado = sc.nextInt();
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(10);
			}
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == borrado) {
				cont++;
			}
			if (cont == 1) {
				
			}
			
		}

		}
		}
	}
