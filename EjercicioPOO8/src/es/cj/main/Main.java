package es.cj.main;

import es.cj.bean.Coche;
import es.cj.dao.CocheDAO;
import es.cj.dao.CocheDAOLista;

public class Main {

	public static void main(String[] args) {
		
		CocheDAO cDAO = new CocheDAOLista();
		
		Coche c1 = new Coche(2017, 250, 99.360, "Audi RS 5 Coupé", "Audi");
		
		Coche c2 = new Coche(2019, 300, 232.500, "Hyundai Accent GL", "Hyundai");
		
		
		cDAO.insertar(c1);
		cDAO.insertar(c2);
		cDAO.actualizarVelocidad(c1, 300);
		System.out.println(cDAO.buscarCochePrecio(99.36));
		
		System.out.println(cDAO.buscarCochesFechasFabric(2017, 2019));
		
		cDAO.borrar("Audi RS 5 Coupé", "Audi");
		
		cDAO.borrarTodos();
		
		cDAO.listar();
		
		

	}

}
