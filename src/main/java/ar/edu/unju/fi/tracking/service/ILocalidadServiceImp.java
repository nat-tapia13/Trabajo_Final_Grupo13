package ar.edu.unju.fi.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.fi.tracking.model.Localidad;
import ar.edu.unju.fi.tracking.repository.ILocalidadDAO;

public class ILocalidadServiceImp implements ILocalidadService{
	
	@Autowired
	private ILocalidadDAO ilocalidad;

	@Override
	public void guardar() {
		
		ilocalidad.guardar();
		
	}

	@Override
	public Localidad modificar() {
		
		Localidad localidad = ilocalidad.modificar();
		return localidad;
	}

	@Override
	public void eliminar() {

		ilocalidad.eliminar();
		
	}

}
