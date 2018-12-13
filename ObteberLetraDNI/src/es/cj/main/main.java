package es.cj.main;

import java.util.Scanner;

import es.cj.bean.NIF;

public class main {
private static Scanner sc = new Scanner(System.in);
private static String entrada;
	public static void main(String[] args) {
		NIF n = new NIF();
		
		do {
			System.out.println("Introduzca número para obtener letra: ");
			
			entrada = sc.nextLine();
		
			n.leer(entrada);
			System.out.println(n.toString());
			
		} while (entrada.length() < 9);

		
	}

}
