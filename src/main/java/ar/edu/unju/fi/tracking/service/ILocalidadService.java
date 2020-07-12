/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tracking.model.Localidad;

/**
 * @author Ema
 *
 */

public interface ILocalidadService {

	@Autowired
	public void guardar(Localidad localidad);
	
	public void eliminar(Long id);
	
	@Autowired
	public Optional<Localidad> listarId(Long id);

}
