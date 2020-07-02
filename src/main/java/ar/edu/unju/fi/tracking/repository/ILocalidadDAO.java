package ar.edu.unju.fi.tracking.repository;

import ar.edu.unju.fi.tracking.model.Localidad;

public interface ILocalidadDAO {

	public void guardar();
	
	public Localidad modificar();
	
	public void eliminar();
}
