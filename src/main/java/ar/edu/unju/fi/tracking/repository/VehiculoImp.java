package ar.edu.unju.fi.tracking.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.ProyectoFinalGrupo13Application;
import ar.edu.unju.fi.tracking.model.Vehiculo;

/**
 * Representa la clase implementadora de la Interfaz Vehiculo
 * @author Dalila
 *
 */
@Repository ("vehiculoImp")
public class VehiculoImp implements IVehiculoDAO {
	
	@Autowired
	private Vehiculo vehiculo;
	
	public static Logger LOG =LoggerFactory.getLogger(ProyectoFinalGrupo13Application.class);
	/**
	 * Este metodo Guarda un vehiculo en la DB
	 */
	@Override
	public void guardar(Vehiculo vehiculo) {
		//accion ejecutada para guardar un objeto vheiculo en la BD
		LOG.info("El numero de patente del vheiculo fue guardado"+vehiculo.getPatente());
		
	}
	
	/**
	 * Muestra una lista de vehiculos
	 *	- por localidad y rango de fecha - hora
	 * 	- por tripulante con ordenacion por fecha - hora
	 *  - por patente de vehiculo con ordenacion por fecha - hora
	 *  @return el vehiculo que reune las condiciones
	 */

	@Override
	public List<Vehiculo> listarVehiculo() {
		// 
		return null;
	}
	/**
	 * Este metodo consulta los vehiculos en la BD
	 * @return el vehiculo que reunas las condiciones de consulta
	 */
	@Override
	public Vehiculo consultar() {
		//se muestran todos los datos de vehiculo 
		return vehiculo;
	}


}
