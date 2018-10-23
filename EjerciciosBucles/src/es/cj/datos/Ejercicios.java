package es.cj.datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Programa que muestre y calcule el producto de los n primeros números impares
		System.out.println("Introduzca el número: ");
		int numero = sc.nextInt();
		int cont = 0;
		int multi = 1;
		int conti = 0;
		
		do {
			cont++;
			
			if (cont%2 != 0) {
				conti++;
				multi = multi * cont;
			}
						
		} while (conti < numero);
		

		System.out.println("La multiplicación de sus impares es de: " + multi);
		
		//4 Escribir un programa que lea un número desde 
		// el teclado y realice la suma de los 100 números siguientes, 
		// mostrando el resultado en pantalla 
		
		System.out.println("Introduzca número: ");
		int numero1 = sc.nextInt();
		int total = numero1 + 100;
		int sumatotal = 0;
			for (int i = numero1; i <= total;i++) {
				sumatotal=sumatotal+i;
				
			}
			System.out.println("La suma de sus 100 primeros números es de "+sumatotal);
			
			//5 pedir un número y calcular su factorial
			System.out.println("Introduce un número para calcular su factorial: ");
			int numero2 = sc.nextInt();
			int factor = 1;
			
			for(int i=1;i < (numero2+1);i++) {
				factor = factor * i;
			}
			System.out.println(numero2+"! es igual a: "+factor);
			
			//6 Diseñe una aplicación que muestre las tablas de multiplicar del 1 al 10. 
			//Además, solicite al usuario que tabla quiere mostrar.
			
			System.out.println("Introduzca el número para mostrar su tabla de multiplicación: ");
			int numero3= sc.nextInt();
			int tabla = 1;
			for(int i=1; i < 11; i++) {
				
				tabla = numero3 * i;
				System.out.println(tabla);
			}
		
			// 7 Pida un número al usuario e indique cuántos números primos hay entre 1 y el número
			
			System.out.println("Nº: ");
			int numero4 = sc.nextInt();
			int contador;
			
			for (int i = 2; i < numero4; i++) {
				contador = 0;
				for (int j = 1; j <= i; j++) {
					if (i%j == 0) {
						contador++;
					}
				}
				if (contador == 2) {
					System.out.println(i);
				}
		}
			// 8 Pida al usuario n números y muéstrele ordenados (Para más adelante, se ve que se requiere de arrays)
			
			//9 Leer por teclado una serie de n números. La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente o si no están ordenados
			
			int numero5 = sc.nextInt();
			
			int cantidad = 0;
			
			do {
				System.out.println("Cantidad de números: ");
				cantidad = sc.nextInt();
			} while (cantidad <=0);
			
			// Devuelve 1 para creciente, -1 para decreciente y 0 para desordenado.
			int orden = comprobarOrden(cantidad);
			
			switch (orden) {
			case 1:
				System.out.println("Creciente");
				break;
			case -1:
				System.out.println("Decreciente");
				break;
			default:
				System.out.println("Desordenado");
				break;
			}
			
			//10 Dados dos números introducidos por teclado, indique si son amigos o no. Dos números son amigos si la suma de los divisores propios de uno de ellos es igual al otro (la unidad se considera divisor propio, pero no lo es el mismo número)
			//220 y 284
			//284 = 1 + 2 + 4 + 71 + 142 = 220
			//220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284.
			
			System.out.println("Introduzca dos números para ver si son amigos: ");
			int numero6 = sc.nextInt();
			int numero7 = sc.nextInt();
			int amigo = 0;
			int amigo2 = 0;
			boolean si = false;
			boolean si2= false;
			
			for (int i = 1; i < numero6; i++) {
				int pares = (numero6%i);
				if (pares == 0) {
					amigo = amigo + i;
				}
			}
			
			for (int j = 1; j < numero7; j++) {
				int par = (numero7%j);
				if (par == 0) {
					amigo2 = amigo + j;
				}
			}
					if (numero7 == amigo) {
						 si = true;
					}else {
						 si = false;
					}
					if (numero6 == amigo2) {
						si2 = true;
					} else {
						si2 = true;
					}
					
					if (si && si2) {
						System.out.println("Son amigos.");
						
					}else {
						System.out.println("No son amigos.");
					}

			
}

	private static int comprobarOrden(int cantidad) {
		
		int orden =0;
		
		boolean creciente = false;
		boolean decreciente = false;
		int num = 0, auxiliar = 0;
		for (int i = 0; i < cantidad; i++) {
			
			num = new Random().nextInt(100);
			System.out.println(num + "");
			
			if (i == 0) {
			 auxiliar = num;	
			} else {
				if (num >= auxiliar) {
					
					creciente = true;
				}else {
					decreciente = true;
				}
				auxiliar = num;
			}
		}
		
		if (creciente && !decreciente) {
			orden = 1;
		} else if (decreciente && !creciente) {
			orden = -1;
		}
		
		return orden;
	}
}
	
		
		
		
			
		
				
		
		
		
		
