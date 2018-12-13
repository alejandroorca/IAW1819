package es.cj.bean;

public class NIF {

	private String numero;
	private String letra;
	
	public NIF() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NIF(String numero) {
		super();
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLetra() {
		return letra;
	}

	@Override
	public String toString() {
		return "DNI: " + numero + "-" + letra;
	}

	private String ObtenerLetra (String numero) {
		int numero1= Integer.parseInt(numero);
		String cadena ="TRWAGMYFPDXBNJZSQVHLCKE";
		int cuenta = numero1%23;
		
		return cadena.substring(cuenta, cuenta+1);
		
	}
	
	public void leer(String numeroent) {
		
		this.numero = numeroent;
		this.letra = ObtenerLetra(numeroent);
		
	}
	
	
	
}
