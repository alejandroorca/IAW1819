package es.cj.clases;

public class Persona {

	private String sexo;
	private double peso;
	private double altura;
	private String nombre;
	private int edad;
	private String dni;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String sexo, double peso, double altura, String nombre, int edad, String dni) {
		super();
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	public double calcularIMC() {
		double pesoi = this.getPeso()/(Math.pow(this.getAltura(), 2));
		int a = 0;
		if (pesoi < 20) {
			
			 a = -1;
		} else if (pesoi >=20 && pesoi <=25) {
			 a = 0;
		} else if (pesoi > 25) {
			 a = 1;
		}
		
		return a;
	}
	
	public boolean esMayorDeEdad() {
		boolean a = false;
		if (this.getEdad() >= 18) {
			a = true;
		} else {
			
			a = false;
		}
		return a;
	}
	
}
