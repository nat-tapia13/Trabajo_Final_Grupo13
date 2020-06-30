/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import ar.edu.unju.fi.tracking.model.Tripulante;

/**
 * Representa la  Interfaz Tripulante con sus metodos abstractos
 * @author Dalila
 *
 */
public interface ITripulanteDAO {
	public void guardar();
	public Tripulante consultar();

}
