package ar.edu.unju.fi.tracking.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.ProyectoFinalGrupo13Application;
import ar.edu.unju.fi.tracking.model.Localidad;

@Repository("localiadImp")
public class LocalidadImp /*implements ILocalidadDAO*/{

	/*
	@Autowired
	public static Logger LOG =LoggerFactory.getLogger(ProyectoFinalGrupo13Application.class);
	@Override
	public void guardar(Localidad localidad) {
		//acción ejecutada para guardar un objeto localidad en la BD
	LOG.info("La localidad fue guardada"+localidad.getNombre());	
	
	}

	@Override
	public void modificar(Localidad localidad) {
		//// se modifa el objeto localidad de la BD
		LOG.info("Se modifo localidad en la base de datos");
	}

	@Override
	public void eliminar() {
		//se elimina el objeto localidad de la BD
		LOG.info("Se elimino localidad de la bd");
	}

	*/

}
