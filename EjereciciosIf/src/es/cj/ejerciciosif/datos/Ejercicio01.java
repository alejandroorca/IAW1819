package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio01 {
	
	// Pedir notas 0 a 10 y decir que tiene de nota
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
System.out.println("Ingrese la nota: ");
		double num = sc.nextDouble();
		
		if (num <= 4 && num >= 0) {
			System.out.println("Tienes suspenso");
		}  else if (num >= 5 && num < 6) {
			if (num < 6) {
				System.out.println("Tienes un suficiente.");
			} else { System.out.println("Tienes un bien.");}
		}else if (num > 6 && num < 7) {
			System.out.println("Tienes un bien");
		} else if (num >= 7 && num < 9) {
			System.out.println("Tienes un notable");
		} else if (num >= 9 && num <= 10) {
			System.out.println("Tienes un sobresaliente");
		} else {
			System.out.println("Valor no permitido");
		}
		
		switch ((int)num) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
		break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Valor no recogido");
			break;
		}
		
		
		
	}

}
