/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.tracking.model.Vehiculo;

/**
 * Representa la clase implementadora de la Interfaz Vehiculo
 * @author Dalila
 *
 */
@Repository ("vehiculoImp")
public class VehiculoImp implements IVehiculoDAO {
	/**
	 * Este metodo Guarda un vehiculo en la DB
	 */
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Muestra una lista de vehiculos
	 *	- por localidad y rango de fecha - hora
	 * 	- por tripulante con ordenacion por fecha - hora
	 *  - por patente de vehiculo con ordenacion por fecha - hora
	 *  @return el vehiculo que reune las condiciones
	 */

	@Override
	public List<Vehiculo> listarVehiculo() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Este metodo consilta los vehiculos en la BD
	 * @return el vehiculo que reunas las condiciones de consulta
	 */
	@Override
	public Vehiculo consultar() {
		// TODO Auto-generated method stub
		return null;
	}

}
