/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import java.util.List;

import ar.edu.unju.fi.tracking.model.Vehiculo;

/**
 * Representa la Interfaz Vehiculo y sus metodos abstractos
 * @author Dalila
 *
 */
public interface IVehiculoDAO {
	
	public List <Vehiculo> listarVehiculo();
	public void guardar();
	public Vehiculo consultar();

}
