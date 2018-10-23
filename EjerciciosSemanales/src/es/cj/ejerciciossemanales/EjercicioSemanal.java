package es.cj.ejerciciossemanales;

import java.util.Scanner;

public class EjercicioSemanal {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	// (09/10/18) Se solicita leer un número entero positivo y determinar si es un número de 1,2,3 o 4 cifras.
		
		System.out.println("Introduzca un número positivo de como máximo de cuatro cifras: ");
		
		int num = sc.nextInt();
		
		if (num > 0 && num <= 9999) {
			
			if (num < 10) {
				System.out.println("El número es de una cifra.");
			}
		     else if (num <= 99) {
				System.out.println("El número introducido es de dos cifras.");
			} else if (num <= 999 && num >= 100) {
				System.out.println("El número introducido es de tres cifras");
			} else {
				System.out.println("El número es de cuatro cifras");
			}
			
		} else {
			System.out.println("Error, compruebe los parámetros introducidos");
		}
		
		
		
	}

}
