/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.util.List;

import ar.edu.unju.fi.tracking.model.Vehiculo;

/**
 * @author Ema
 *
 */
public interface IVehiculoService {
	
	public void guardar();
	
	public List <Vehiculo> listarVehiculo();

	public Vehiculo consultar();


}
