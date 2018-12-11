package es.cj.main;

import es.cj.bean.Alumno;
import es.cj.dao.AlumnoDAO;
import es.cj.dao.AlumnoDAOListas;

public class Main {

	public static void main(String[] args) {
		AlumnoDAO alumDAO = new AlumnoDAOListas();
		
		Alumno a1 = new Alumno("Alejandro", "Ordóñez Caballero", 22, 8.0F);
		
		Alumno a2 = new Alumno("Alejandro", "Ordóñez Caballero", 22, 8.0F);
		
		alumDAO.anadir(a1);
		
		alumDAO.mostrarTodos();

	}

}
