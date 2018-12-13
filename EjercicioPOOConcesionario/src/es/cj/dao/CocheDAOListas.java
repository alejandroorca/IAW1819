package es.cj.dao;

import java.util.ArrayList;
import java.util.List;

import es.cj.bean.Coche;

public class CocheDAOListas implements CocheDAO {
	
	List<Coche> concesionario = new ArrayList<>();

	@Override
	public boolean insertar(Coche c) {
			if (!concesionario.contains(c)) {
				concesionario.add(c);
				return true;
				
		}
		return false;
	}

	@Override
	public boolean actualizar(Coche oldcar, Coche newcar) {
		for (Coche coche : concesionario) {
			if (coche.equals(coche)) {
				coche.setAnyo_fabricacion(newcar.getAnyo_fabricacion());
				coche.setMarca(newcar.getMarca());
				coche.setNombre(newcar.getNombre());
				coche.setPrecio(newcar.getPrecio());
				coche.setVelocidad(newcar.getVelocidad());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean actualizarVelocidad(Coche c, int velocidad) {
		for (Coche coche : concesionario) {
			if (coche.equals(c)) {
				coche.setVelocidad(velocidad);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean borrar(String nombre, String marca) {
		for (Coche coche : concesionario) {
			if (coche.getNombre().equals(nombre) && coche.getMarca().equals(marca)) {
				concesionario.remove(coche);
				return true;
			}
		}
		return false;
	}

	@Override
	public void borrarTodos() {
		concesionario.removeAll(concesionario);
	}

	@Override
	public Coche buscarCochePrecio(double precio) {
		for (Coche coche : concesionario) {
			if (coche.getPrecio()==precio) {
				return coche;
			}
		}
		return null;
		

	}

	@Override
	public Coche buscarCochesFechasFabric(int anyo_ini, int anyo_fin) {
		for (Coche coche : concesionario) {
			if (coche.getAnyo_fabricacion()>= anyo_ini && coche.getAnyo_fabricacion()<=anyo_fin) {
				return coche;
			}
		}
		return null;
		
	}

	@Override
	public void listar() {
		for (Coche coche : concesionario) {
			System.out.println(coche);
		}
	}

}
