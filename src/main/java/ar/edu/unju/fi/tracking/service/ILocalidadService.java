/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import ar.edu.unju.fi.tracking.model.Localidad;

/**
 * @author Ema
 *
 */
public interface ILocalidadService {
	
	public void guardar();
	
	public Localidad modificar();
	
	public void eliminar();

}
