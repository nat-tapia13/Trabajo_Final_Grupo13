package ar.edu.unju.fi.tracking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.edu.unju.fi.tracking.model.RegistroTracking;

public interface IRegistroTrackingDAO extends JpaRepository<RegistroTracking, Long> {

	@Query(value="select * from registros where id_vehiculo in (select id_vehiculo from vehiculos where patente = ?1) order by fecha_y_hora desc",nativeQuery = true)
	public List<RegistroTracking> listarRegistrosPorPatente(String patente);
	
	@Query(value="select * from registros where id_registro in(select id_registro from registro_tripulante where id_tripulante in (select id_tripulante from tripulantes where documento = ?1))order by fecha_y_hora desc",nativeQuery = true)
	public List<RegistroTracking> listarRegistrosPorDNI(String dni_tripulante);
	
	@Query(value="select * from registros where (fecha_y_hora between ?1 AND ?2) and id_localidad in (select id_localidad from localidades where nombre = ?3)",nativeQuery = true)
	public List<RegistroTracking> listarRegistrosPorLocalidad(String fehca1,String fecha2,String nombre_localidad);
	
	
}
