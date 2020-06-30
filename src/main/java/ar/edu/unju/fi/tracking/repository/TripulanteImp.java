/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.tracking.model.Tripulante;

/**
 * Representa la clase implementadora de la Interfaz Tripulante
 * @author Dalila
 *
 */
@Repository ("tripulanteImp")
public class TripulanteImp implements ITripulanteDAO {
	/**
	 * Este metodo guarda un TRipulante en la BD
	 */
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Este metodo consilta los tripulantes en la BD
	 * @return el tripulante que reunas las condiciones de consulta
	 */
	@Override
	public Tripulante consultar() {
		// TODO Auto-generated method stub
		return null;
	}

}
