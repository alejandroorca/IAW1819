package es.repaso.ejercicios;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class EjerciciosTablas {

	private static Scanner sc = new Scanner(System.in); 
	private static int [] numeros;
	private static int [] pares;
	private static int [] impares;
	public static void main(String[] args) {
		int tamanyo;
		do {
			System.out.println("Nº de elementos:");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);
		
		numeros = new int[tamanyo];
		pares = new int[tamanyo];
		impares = new int[tamanyo];
		
		inicializarTablaNumeros();
		
		dividirParesImpares();
		
		mostrarResultados();
	}
	private static void mostrarResultados() {
		System.out.println("Números");
		System.out.println(Arrays.toString(numeros));
		System.out.println("Tabla de pares");
		for (int i = 0; i < pares.length && pares[i] !=0; i++) {
			System.out.print(pares[i]+ " ");
		}
		System.out.println();
		System.out.println("Tabla de impares");
		for (int i = 0; i < impares.length && impares[i] !=0; i++) {
			System.out.print(impares[i]+ " ");
		}
		
	}
	private static void dividirParesImpares() {
		int contPares = 0, contImpares = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2==0) {
				pares[contPares] = numeros[i];
				contPares++;
			} else {
				impares[contImpares] = numeros[i];
				contImpares++;
			}
		}
		
	}
	private static void inicializarTablaNumeros() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= new Random().nextInt(50) + 1;
		}
		
	}
}



