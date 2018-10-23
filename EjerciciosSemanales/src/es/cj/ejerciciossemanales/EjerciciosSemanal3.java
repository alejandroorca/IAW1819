package es.cj.ejerciciossemanales;

import java.util.Scanner;

public class EjerciciosSemanal3 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduzca un número para saber si es abundante: ");
		int numero = sc.nextInt();
		int abundancia = comprobarabundancia(numero);

		if (abundancia > numero) {
			System.out.println("Es abundante.");
		} else {
			System.out.println("No es abundante.");
		}

	}

	private static int comprobarabundancia(int numero) {
		int divisor = 0;

		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				divisor = divisor + i;
			}
			
		}
		return divisor;
	}
}