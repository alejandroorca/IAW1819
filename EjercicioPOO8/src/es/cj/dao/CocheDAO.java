package es.cj.dao;

import es.cj.bean.Coche;

public interface CocheDAO {
	public void insertar(Coche c);
	public void actualizar(Coche oldcar, Coche newcar);
	public void actualizarVelocidad(Coche c, int velocidad);
	public void borrar(String nombre, String marca);
	public void borrarTodos();
	public String buscarCochePrecio(double precio);
	public String buscarCochesFechasFabric(int anyo_ini, int anyo_fin);
	public void listar();
}
