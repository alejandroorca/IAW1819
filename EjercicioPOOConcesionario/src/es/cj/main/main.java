package es.cj.main;

import es.cj.bean.Coche;
import es.cj.dao.CocheDAOListas;

public class main {

	public static void main(String[] args) {
		
		CocheDAOListas cDAO = new CocheDAOListas();
		
		Coche c = new Coche(2019, 300, 15.000, "Audi R8", "Audi");
		Coche c1 = new Coche(2020, 500, 10, "Jason", "Friday 13th");
		
		if (cDAO.insertar(c)) {
			System.out.println("Se ha insertado correctamente el vehículo.");
		} else {
			System.out.println("Error, ya existe un vehículo con las mismas");
		}

		if (cDAO.insertar(c1)) {
			System.out.println("Se ha insertado correctamente el vehículo.");
		} else {
			System.out.println("Error, ya existe un vehículo con las mismas");
		}
		
		System.out.println(cDAO.buscarCochePrecio(10));
		
		System.out.println(cDAO.buscarCochesFechasFabric(2010, 2019));
		
		if (cDAO.actualizar(c, c1)) {
			System.out.println("Se ha actualizado correctamente el vehículo.");
		} else {
			System.out.println("Error, no se encuentra vehículo.");
		}
		
		cDAO.borrarTodos();
		cDAO.listar();
	}

}
