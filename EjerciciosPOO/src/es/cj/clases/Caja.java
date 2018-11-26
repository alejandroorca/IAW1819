package es.cj.clases;

public class Caja {

	// Atributos
			private double ancho;
			private double alto;
			private double largo;
			

		// Constructores
			public Caja(double ancho, double alto, double largo) {

				this.ancho = ancho;
				this.alto = alto;
				this.largo = largo;
			}


			public Caja() {
				// TODO Auto-generated constructor stub
			}


			// GET Y SET
			public double getAncho() {
				return ancho;
			}


			public void setAncho(double ancho) {
				this.ancho = ancho;
			}


			public double getAlto() {
				return alto;
			}


			public void setAlto(double alto) {
				this.alto = alto;
			}


			public double getLargo() {
				return largo;
			}


			public void setLargo(double largo) {
				this.largo = largo;
			}	
		
			// Métodos
			
			public double obtenerVolumen() {
				return ancho * alto * largo;
			}
			
			public double obtenerVolumen(double valor) {
				return ancho * alto * largo;
			}


			@Override
			public String toString() {
				return "Caja [ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + "]";
			}
			
			public boolean equals(Caja aux) {
				if (this.ancho == aux.ancho && this.alto == aux.alto && this.largo == aux.largo) {
					return true;
				} else {
					return false;
				}
			}

}
