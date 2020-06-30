/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import java.util.List;

import ar.edu.unju.fi.tracking.model.Vehiculo;

/**
 * Representa la Interfaz Vehiculo y sus metoos abstractos
 * @author Dalila
 *
 */
public interface IVehiculoDAO {
	public void guardar();
	public List <Vehiculo> listarVehiculo();
	public Vehiculo consultar();

}
