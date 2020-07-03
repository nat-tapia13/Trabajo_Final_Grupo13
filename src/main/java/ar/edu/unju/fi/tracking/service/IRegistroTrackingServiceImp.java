/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import ar.edu.unju.fi.tracking.repository.IRegistroTrackingDAO;

/**
 * @author Ema
 *
 */
public class IRegistroTrackingServiceImp implements IRegistroTrackingService{

	private IRegistroTrackingDAO iregistro;
	
	@Override
	public void guardarDatos() {
		
		iregistro.guardadDatos();
		
	}

}
