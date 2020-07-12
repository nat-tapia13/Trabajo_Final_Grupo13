/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tracking.model.Vehiculo;
import ar.edu.unju.fi.tracking.repository.IVehiculoDAO;

/**
 * @author Ema
 *
 */

@Service
public class VehiculoServiceImp implements IVehiculoService{

	@Autowired
	private IVehiculoDAO ivehiculo;
	
	@Override
	public void guardar(Vehiculo vehiculo) {

		ivehiculo.save(vehiculo);
		
	}

	@Override
	public List<Vehiculo> listarVehiculo() {
		
		List<Vehiculo> vehiculos = ivehiculo.findAll();
		
		return vehiculos;
	}

	@Override
	public Optional<Vehiculo> consultar(Long id) {
		
		return ivehiculo.findById(id);
	}
	
}
