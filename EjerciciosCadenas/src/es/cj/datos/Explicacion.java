package es.cj.datos;

import java.util.Arrays;

public class Explicacion {

	public static void main(String[] args) {
		String cadena = new String("hola");
		String cadena2 = "HOLA";

		if (cadena.equalsIgnoreCase(cadena2)) {
			System.out.println("Iguales");
		}else {
			System.out.println("Distintas");
		}
		System.out.println(cadena.concat(cadena2));
		
		if (cadena.contains("la")) {
			System.out.println("Lo tiene.");
			System.out.println(cadena.indexOf("a"));
			System.out.println(cadena.lastIndexOf("a"));
			System.out.println(cadena.toLowerCase().lastIndexOf("a"));
			
			if (cadena.equals("") || cadena.length() == 0 || cadena.isEmpty()) {
				System.out.println("Cadena vacía");
			}
		}
		String cadena1 = cadena.replace("h", "P");
		System.out.println(cadena1);
		
		System.out.println(cadena1.substring(0, 3));
		
		char [] letras = cadena1.toCharArray();
		System.out.println(Arrays.toString(letras));
		
		String usuario = " alejandro ";
		usuario = usuario.trim(); // Quitar espacios
		System.out.println(usuario);
		StringBuffer sb = new StringBuffer(cadena1);
		
		sb.insert(0, "Inicio");
		System.out.println(sb.toString());
		
		sb.deleteCharAt(3);
		sb.replace(0, 3, "avion");
		System.out.println(sb.toString());
		
		sb.reverse();
		
		String frase = "Hola que tal estás 12;34;46";
		String [] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
		String [] numeros = palabras[4].split(";");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
