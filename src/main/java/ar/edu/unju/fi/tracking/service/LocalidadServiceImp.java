package ar.edu.unju.fi.tracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tracking.model.Localidad;
import ar.edu.unju.fi.tracking.repository.ILocalidadDAO;

@Service
public class LocalidadServiceImp implements ILocalidadService{
	
	@Autowired
	private ILocalidadDAO ilocalidad;

	@Override
	public void eliminar(Long id) {

		ilocalidad.deleteById(id);
		
	}

	@Override
	public void guardar(Localidad localidad) {
		
		ilocalidad.save(localidad);
		
	}
	
	@Override
	public Optional<Localidad> listarId(Long id){
	
		return ilocalidad.findById(id);
	}

	@Override
	public List<Localidad> listarLocalidades() {
		return ilocalidad.listarLocalidadesOrdenado();
	}

}
