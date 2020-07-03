/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.util.List;

import ar.edu.unju.fi.tracking.model.Vehiculo;
import ar.edu.unju.fi.tracking.repository.IVehiculoDAO;

/**
 * @author Ema
 *
 */
public class IVehiculoServiceImp implements IVehiculoService{

	private IVehiculoDAO ivehiculo;
	
	@Override
	public void guardar() {

		ivehiculo.guardar();
		
	}

	@Override
	public List<Vehiculo> listarVehiculo() {
		
		List<Vehiculo> vehiculos = ivehiculo.listarVehiculo();
		
		return vehiculos;
	}

	@Override
	public Vehiculo consultar() {

		Vehiculo vehiculo = ivehiculo.consultar();
		
		return vehiculo;
	}
	
}
