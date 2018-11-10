package es.repaso.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
//Aplicaremos varias actividades en este
	
	private static Scanner sc = new Scanner(System.in);
	private static int numero1, numero2, numero3;
	public static void main(String[] args) {
		System.out.println("Introduzca el primer número: ");
		numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		numero2 = sc.nextInt();
		System.out.println("Introduzca el año: ");
		numero3 = sc.nextInt();
		
		SonIguales(numero1,numero2);
		EsMultiplo(numero1,numero2);
		ComprobarFecha(numero1,numero2,numero3);
	}
	private static void ComprobarFecha(int numero12, int numero22, int numero32) {
		boolean fecha = false;
		boolean	bisiesto = ((numero3 % 4 == 0 && numero3 %100 != 0) || (numero3 % 400 ==0));
		
		if (numero3 > 0 && numero2 > 0) {
			switch (numero2) {
			case 2:
				if (numero1 >= 29 && bisiesto) {
					fecha = true;
				} else if (numero1 >= 28 && !bisiesto) {
					fecha = true;
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (numero1 >= 1 && numero1 <= 31) {
					fecha = true;
					}
              break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (numero1 >=1 && numero1 <= 30) {
					fecha = true;
				}
				break;

			default:
				break;
			}
			if (fecha) {
				System.out.println("Correcto.");
			} else {
				System.out.println("Incorrecto.");
			}
		} 
		
	}
	private static void EsMultiplo(int numero12, int numero22) {
		if (numero1 % numero2 == 0) {
			System.out.println("Son múltiplos.");
		} else {
			System.out.println("No son múltiplos.");
		}
		
	}
	private static void SonIguales(int numero12, int numero22) {
		if (numero1 == numero2) {
			System.out.println("Son iguales.");
		}else {
			System.out.println("No son iguales.");
		}		
	}

}