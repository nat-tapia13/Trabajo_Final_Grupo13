/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.edu.unju.fi.tracking.model.Vehiculo;

/**
 * Representa la Interfaz Vehiculo y sus metodos abstractos
 * @author Dalila
 *
 */
public interface IVehiculoDAO extends JpaRepository<Vehiculo, Long> {
	
	@Query(value = "select * from vehiculos where id_vehiculo in(select id_vehiculo from registros where id_localidad in (select id_localidad from localidades where nombre = ?1))",nativeQuery = true)
	//@Query("from Vehiculo v order by v.titular")
	public List<Vehiculo> listarPorLocalidad(String localidad);
	
	@Query(value = "select * from vehiculos where id_vehiculo in(select id_vehiculo from registros where (fecha_y_hora between ?1 AND ?2) and id_localidad in (select id_localidad from localidades where nombre = ?3))",nativeQuery = true)
	public List<Vehiculo> listarPorLocalidadFechaYHora(String fehca1,String fecha2,String localidad);
	
	//@Autowired
	//public List <Vehiculo> listarVehiculo();
	//public void guardar();

}
