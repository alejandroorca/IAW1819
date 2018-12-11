package es.cj.bean;

public class Coche {

	private int anyo_fabricacion;
	private int velocidad;
	private double precio;
	private String nombre;
	private String marca;
	
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAnyo_fabricacion() {
		return anyo_fabricacion;
	}

	public void setAnyo_fabricacion(int anyo_fabricacion) {
		this.anyo_fabricacion = anyo_fabricacion;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Coche(int anyo_fabricacion, int velocidad, double precio, String nombre, String marca) {
		super();
		this.anyo_fabricacion = anyo_fabricacion;
		this.velocidad = velocidad;
		this.precio = precio;
		this.nombre = nombre;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Coche [anyo_fabricacion=" + anyo_fabricacion + ", velocidad=" + velocidad + ", precio=" + precio
				+ ", nombre=" + nombre + ", marca=" + marca + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anyo_fabricacion;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + velocidad;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (anyo_fabricacion != other.anyo_fabricacion)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		if (velocidad != other.velocidad)
			return false;
		return true;
	}
	
	
}
