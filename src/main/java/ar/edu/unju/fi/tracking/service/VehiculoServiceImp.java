/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.time.LocalDateTime;
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
	public List<Vehiculo> listarVehiculos(String nombre) {
		
		List<Vehiculo> vehiculos = ivehiculo.listarPorLocalidad(nombre);
		
		return vehiculos;
	}

	@Override
	public Optional<Vehiculo> consultar(Long id) {
		
		return ivehiculo.findById(id);
	}

	@Override
	public List<Vehiculo> listarVehiculosFiltro(String fecha_inicial, String fecha_fin,String nombre_localidad) {
		return ivehiculo.listarPorLocalidadFechaYHora(fecha_inicial, fecha_fin, nombre_localidad);
	}
	
}
