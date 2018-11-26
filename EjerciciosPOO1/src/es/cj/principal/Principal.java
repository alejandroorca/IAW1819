package es.cj.principal;

import es.cj.clases.CuentaOperaciones;
import es.cj.clases.Cuentas;

public class Principal {

	public static void main(String[] args) {
		
		Cuentas c1 = new Cuentas();
		Cuentas c2 = new Cuentas("Yo", "123456789", 200, 2.1);
		
		c1.setNombre("Tú");
		
		CuentaOperaciones.ingresar(100, c1);
		CuentaOperaciones.reintegro(100, c2);
		
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
