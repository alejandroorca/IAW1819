package es.cj.dao;

import es.cj.bean.Coche;

public interface CocheDAO {

	public boolean insertar (Coche c);
	public boolean actualizar (Coche oldcar, Coche newcar);
	public boolean actualizarVelocidad (Coche c, int velocidad);
	public boolean borrar (String nombre, String marca);
	public void borrarTodos();
	public Coche buscarCochePrecio (double precio);
	public Coche buscarCochesFechasFabric (int anyo_ini, int anyo_fin);
	public void listar();
}
