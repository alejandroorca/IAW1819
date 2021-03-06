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
	public void borrar(String nombre, String marca) {
		for (Coche coche : catalogo) {
			if (coche.getNombre().equals(nombre) && coche.getMarca().equals(marca)) {
				catalogo.remove(coche);
			}
		}
	}

	@Override
	public void borrarTodos() {
			catalogo.removeAll(catalogo);
		

	}

	@Override
	public String buscarCochePrecio(double precio) {
		for (Coche coche : catalogo) {
			if (coche.getPrecio()==precio) {
			return	coche.toString();
			}
		}
		return null;
	}

	@Override
	public String buscarCochesFechasFabric(int anyo_ini, int anyo_fin) {
		for (Coche coche : catalogo) {
			if (coche.getAnyo_fabricacion()>=anyo_ini && coche.getAnyo_fabricacion()<=anyo_fin ) {
				return	coche.toString();
			}
		}
		return null;
	}

	@Override
	public void listar() {
		for (Coche coche : catalogo) {
			System.out.println(coche);
		}
	}

}
