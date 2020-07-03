/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import ar.edu.unju.fi.tracking.model.Tripulante;
import ar.edu.unju.fi.tracking.repository.ITripulanteDAO;

/**
 * @author Ema
 *
 */
public class ITripulanteServiceImp implements ITripulanteService{

	private ITripulanteDAO itripulante;
	
	@Override
	public void guardar() {

		itripulante.guardar();
		
	}

	@Override
	public Tripulante consultar() {
		
		Tripulante tripulante = itripulante.consultar();
		
		return tripulante;
	}

}
