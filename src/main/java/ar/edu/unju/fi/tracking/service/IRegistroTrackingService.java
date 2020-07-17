/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.tracking.model.RegistroTracking;

/**
 * @author Ema
 *
 */
public interface IRegistroTrackingService {
	
	public void guardarDatos(RegistroTracking registro);
	
	public List<RegistroTracking> listarRegistrosPorLocalidad(String fechaIni,String fechaFin,String nombreLocalidad);
	
	public List<RegistroTracking> listarRegistrosPorDNI(String dni_tripulante);
	
	public List<RegistroTracking> listarRegistrosPorPatente(String patente_tripulante);
	
	public Optional<RegistroTracking> listarTripulantes(Long id);
	
	public List<RegistroTracking> listar();

}
