package es.cj.datos;

public class Ejercicio3 {

	public static void main(String[] args) {
//Aplicar las operaciones b�sicas de modificaci�n de Strings a la cadena �Uno dosuno�, 
//a�adiendo caracteres al final, cambiando la �o� por �e� y pas�ndola a may�scula.
		String cadena1 = "Uno dosuno";
		String ultimo = cadena1.substring(cadena1.length()-1);
		cadena1 = cadena1.replace(ultimo, "e");
		cadena1 = cadena1.replace(ultimo, cadena1.toUpperCase());
		System.out.println(cadena1);
	}

}
