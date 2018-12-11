package es.cj.clases;

import java.util.UUID;

public class Password {

	private int longitud = 8;
	private String contrasena;
	
	public Password() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contrasena = generarPassword();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}
	
	public boolean esFuerte() {
		int cont = 0, cont1 = 0, cont2 = 0;
		boolean fuerte = false;
		for (int i = 0; i < contrasena.length(); i++) {
			char letra = contrasena.charAt(i);
			if (Character.isUpperCase(letra)) {
				cont++;
			} else if (Character.isLowerCase(letra)) {
				cont1++;
			} else if (Character.isDigit(letra)){
				cont2++;
			}
		}
		if (cont >= 2 && cont1 >=1 && cont2 >=5) {
			fuerte = true;
		} else {
			fuerte = false;
		}
		return fuerte;
	}
	
	public String generarPassword() {
		return UUID.randomUUID().toString().substring(0, longitud);
	}
}
