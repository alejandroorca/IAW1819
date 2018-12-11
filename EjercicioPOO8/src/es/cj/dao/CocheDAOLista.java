package es.cj.dao;

import java.util.ArrayList;
import java.util.List;

import es.cj.bean.Coche;

public class CocheDAOLista implements CocheDAO {

	private List<Coche> catalogo = new ArrayList<>();
	
	@Override
	public void insertar(Coche c) {
		if (!catalogo.contains(c)) {
			catalogo.add(c);
		} 
	}

	@Override
	public void actualizar(Coche oldcar, Coche newcar) {
		for (Coche coche : catalogo) {
			if (coche.equals(oldcar)) {
				coche.setAnyo_fabricacion(newcar.getAnyo_fabricacion());
				coche.setMarca(newcar.getMarca());
				coche.setNombre(newcar.getNombre());
				coche.setPrecio(newcar.getPrecio());
				coche.setVelocidad(newcar.getVelocidad());
			}
		}
	}

	@Override
	public void actualizarVelocidad(Coche c, int velocidad) {
		for (Coche coche : catalogo) {
			if (coche.equals(c)) {
				coche.setVelocidad(velocidad);
			}
		}

	}

	@Override
	public Coche borrar(String nombre, String marca) {
		for (Coche coche : catalogo) {
			if (condition) {
				
			}
		}
		return null;
	}

	@Override
	public void borrarTodos() {
		// TODO Auto-generated method stub

	}

	@Override
	public Coche buscarCochePrecio(double precio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coche buscarCochesFechasFabric(int anyo_ini, int anyo_fin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub

	}

}
