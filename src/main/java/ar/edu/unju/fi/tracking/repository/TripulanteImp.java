package ar.edu.unju.fi.tracking.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.ProyectoFinalGrupo13Application;
import ar.edu.unju.fi.tracking.model.Tripulante;

/**
 * Representa la clase implementadora de la Interfaz Tripulante
 * @author Dalila
 *
 */
@Repository ("tripulanteImp")
public class TripulanteImp implements ITripulanteDAO {
	
    @Autowired
	private Tripulante tripulante;
    
    public static Logger LOG =LoggerFactory.getLogger(ProyectoFinalGrupo13Application.class);
	
    /**
	 * Este metodo guarda un Tripulante en la BD
	 */
	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto tripulante en la BD
	 LOG.info("Los datos de tripulante han sido guardadados"+tripulante.getNombres()+","+tripulante.getApellido());	
					
	}
	/**
	 * Este metodo consulta los tripulantes en la BD
	 * @return el tripulante que reunas las condiciones de consulta
	 */
	@Override
	public Tripulante consultar() {
		// accion ejecutada para consultar un objeto tripulante en la BD
	 LOG.info("Se han realizado las consultas de tripulante");
		return tripulante;
	}

}
