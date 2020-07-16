/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.fi.tracking.model.RegistroTracking;
import ar.edu.unju.fi.tracking.repository.IRegistroTrackingDAO;

/**
 * @author Ema
 *
 */
public class IRegistroTrackingServiceImp implements IRegistroTrackingService{

	@Autowired
	IRegistroTrackingDAO registroDaoImp;

	@Override
	public void guardarDatos(RegistroTracking registro) {
		registroDaoImp.save(registro);
		
	}


}
