package ar.edu.unju.fi.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.tracking.model.Tripulante;

/**
 * Representa la  Interfaz Tripulante con sus metodos abstractos
 * @author Dalila
 *
 */
public interface ITripulanteDAO extends JpaRepository<Tripulante, Long> {
	//public void guardar();
	//public Tripulante consultar();

}
