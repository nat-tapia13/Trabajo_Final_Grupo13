/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.tracking.model.Vehiculo;

/**
 * Representa la Interfaz Vehiculo y sus metodos abstractos
 * @author Dalila
 *
 */
public interface IVehiculoDAO extends JpaRepository<Vehiculo, Long> {
	
	//@Autowired
	//public List <Vehiculo> listarVehiculo();
	//public void guardar();

}
