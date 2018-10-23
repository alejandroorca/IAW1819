package es.cj.ejerciciossemanales;

import java.util.Scanner;

public class EjercicioSemanal2 {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//2 Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
				//Si trabaja 40 horas o menos se le paga 16€ por hora 
				//Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 20€ por cada hora extra.

				System.out.println("Introduce las horas trabajadas: ");
				
				int hora = sc.nextInt();
				int dinero = 0;
				if (hora <=40) {
					dinero = 16 * hora;
				} else {
					dinero = (hora - 40) * 20;
					dinero = dinero + (40 * 16);
				} System.out.println("Tiene un salario de: "+dinero+"€");
	}

}
