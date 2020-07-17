package ar.edu.unju.fi.tracking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.edu.unju.fi.tracking.model.Localidad;

public interface ILocalidadDAO extends JpaRepository<Localidad, Long>{

	@Query("select l from Localidad l order by l.nombre")
	public List<Localidad> listarLocalidadesOrdenado();
}
