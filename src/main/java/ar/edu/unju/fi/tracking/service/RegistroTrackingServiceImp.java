/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tracking.model.RegistroTracking;
import ar.edu.unju.fi.tracking.repository.IRegistroTrackingDAO;

/**
 * @author Ema
 *
 */
@Service
public class RegistroTrackingServiceImp implements IRegistroTrackingService{

	@Autowired
	private IRegistroTrackingDAO iregistro;

	@Override
	public List<RegistroTracking> listarRegistrosPorDNI(String dni_tripulante) {
		
		return iregistro.listarRegistrosPorDNI(dni_tripulante);
	}

	@Override
	public List<RegistroTracking> listarRegistrosPorPatente(String patente_tripulante) {
		
		return iregistro.listarRegistrosPorPatente(patente_tripulante);
	}

	@Override
	public List<RegistroTracking> listarRegistrosPorLocalidad(String fechaIni, String fechaFin,
			String nombreLocalidad) {
		
		return iregistro.listarRegistrosPorLocalidad(fechaIni, fechaFin, nombreLocalidad);
	}

	@Override
	public void guardarDatos(RegistroTracking registro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<RegistroTracking> listarTripulantes(Long id) {
		// TODO Auto-generated method stub
		return iregistro.findById(id);
	}

}
