package ar.edu.unju.fi.tracking.repository;

import ar.edu.unju.fi.tracking.model.RegistroTracking;

public interface ILocalidadDAO {

	public void guardar();
	
	public RegistroTracking modificar();
	
	public void eliminar();
}
