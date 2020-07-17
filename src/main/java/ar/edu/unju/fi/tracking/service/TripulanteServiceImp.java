/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tracking.model.Tripulante;
import ar.edu.unju.fi.tracking.repository.ITripulanteDAO;

/**
 * @author Ema
 *
 */
@Service
public class TripulanteServiceImp implements ITripulanteService{

	@Autowired
	private ITripulanteDAO itripulante;

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tripulante consultar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
