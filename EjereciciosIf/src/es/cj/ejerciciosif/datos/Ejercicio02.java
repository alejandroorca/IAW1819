package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		// Pedir al usuario día, mes y año. Comprobar que la fecha es correcta, incluido bisiestos
		System.out.println("Año: ");
		int year = sc.nextInt();
		System.out.println("Mes: ");
		int month = sc.nextInt();
		System.out.println("Día: ");
		int day = sc.nextInt();
		
		boolean fechaCorrecta = false;
		
		if (year > 0) {
		
			boolean bisiesto =((year % 4 == 0 && year %100 != 0) || (year % 400 ==0));
			if (month >=1 && month <=12) {
				switch (month) {
				case 2:
					if (day >=1 && day >=29 && bisiesto) {
						fechaCorrecta = true;}
					else if (day >= 1 && day <= 28 && !bisiesto) {
						fechaCorrecta = true;}
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (day >= 1 && day <= 31) {
						fechaCorrecta = true;
						}
                  break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (day >=1 && day <= 30) {
						fechaCorrecta = true;
					}
					break;
				default:
					break;
				}
			}
		}
		
		if (fechaCorrecta) {
		System.out.println("Fecha correcta.");	
		} else {
			System.out.println("Fecha incorrecta.");
		}
		
	}
	
	
	
}
