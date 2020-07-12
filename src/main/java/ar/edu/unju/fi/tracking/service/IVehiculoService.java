/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.fi.tracking.model.Vehiculo;

/**
 * @author Ema
 *
 */
public interface IVehiculoService {
	
	@Autowired
	public void guardar(Vehiculo vehiculo);
	
	@Autowired
	public List <Vehiculo> listarVehiculo();

	@Autowired
	public Optional<Vehiculo> consultar(Long id);


}
