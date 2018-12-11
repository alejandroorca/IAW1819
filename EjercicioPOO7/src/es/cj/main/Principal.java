package es.cj.main;

import es.cj.base.Palabra;
import es.cj.dao.PalabraDAO;
import es.cj.dao.PalabraDAOListas;

public class Principal {

	public static void main(String[] args) {
		
		PalabraDAO pDAO = new PalabraDAOListas();
		
		
		Palabra p1 = new Palabra("Hola", "Saludo formal");
		
		Palabra p2 = new Palabra("Adiós", "Despedida formal");
		
		pDAO.anadir(p1);
		pDAO.anadir(p2);
		pDAO.buscar(p1);
		pDAO.anadir(p2);
		
		pDAO.listar();
		
		if (pDAO.borrar(p2)) {
			System.out.println("Palabra borrada.");
		} else {
			System.out.println("Palabra no encontrada.");
		}
		if (pDAO.buscar(p2)) {
			System.out.println("Palabra encontrada");
		} else {
			System.out.println("Palabra no encontrada");
		}
		
		System.out.println("Palabra de Hola: " + pDAO.obtenerDefinicion("hola"));
	}

}
