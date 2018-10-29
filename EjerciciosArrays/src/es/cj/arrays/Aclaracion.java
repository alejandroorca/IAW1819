package es.cj.arrays;

import java.util.Random;
import java.util.Scanner;

public class Aclaracion {

	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros = new int [20];
	
	private static int veces = 0, posicion = -1;
	
	public static void main(String[] args) {
		rellenarTabla();
		int num = 0;
		do {
	System.out.println("Introduzca el valor: ");
	num = sc.nextInt();
	
	if (num > 0) {
		calcularVecesPosicion(num);
		System.out.println("Veces: "+ veces);
		System.out.println("Posición: "+ posicion);
		//Inicialización de las variables globales
		veces = 0;
		posicion = -1;
	}
		} while (num!=0);
	System.out.println("FIN");
	}
	

	private static void calcularVecesPosicion(int num) {
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) {
				veces++;
				if (veces == 1) {
					posicion = i;
				}
			}
		}
	}


	private static void rellenarTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10)+1;
		}
	}
	
}
