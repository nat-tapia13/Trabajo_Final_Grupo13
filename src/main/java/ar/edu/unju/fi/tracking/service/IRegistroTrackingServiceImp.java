/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<RegistroTracking> listarRegistrosPorDNI(String dni_tripulante) {
		
		return registroDaoImp.listarRegistrosPorDNI(dni_tripulante);
	}

	@Override
	public List<RegistroTracking> listarRegistrosPorPatente(String patente_tripulante) {
		
		return registroDaoImp.listarRegistrosPorPatente(patente_tripulante);
	}

	@Override
	public List<RegistroTracking> listarRegistrosPorLocalidad(String fechaIni, String fechaFin,
			String nombreLocalidad) {
		
		return registroDaoImp.listarRegistrosPorLocalidad(fechaIni, fechaFin, nombreLocalidad);
	}

	@Override
	public Optional<RegistroTracking> listarTripulantes(Long id) {
		// TODO Auto-generated method stub
		return registroDaoImp.findById(id);
	}

	@Override
	public List<RegistroTracking> listar() {
		// TODO Auto-generated method stub
		return registroDaoImp.findAll();
	}

}
