package es.cj.datos;

import java.util.Arrays;

public class Ejercicio4 {
private static int suma = 0;
private static int cont = 0, valor = 0;
private static int A [] = new int [10];
	public static void main(String[] args) {
		//Escriba un método que, dada una cadena de caracteres, de la suma de todos los dígitos que hay en ella. 
		//Por ejemplo, si la cadena es abc12de3f4, dará como resultado 10.	
		String cadena = "abc12de3f4";
		System.out.println("La cadena es: "+cadena);
		SumaNumeros(cadena);
		System.out.println(suma);
	}

	private static void SumaNumeros(String cadena) {
		 for(int i=0; i < cadena.length(); i++){
	         if (Character.isDigit(cadena.charAt(i))){
	        	 valor = valor + Character.getNumericValue(cadena.charAt(i));
	        	 A[cont]= valor;
	             valor = 0;
	             cont++;
	         }
	}
		 for (int i = 0; i < A.length; i++) {
			suma = suma + A[i];
		}

	}
}