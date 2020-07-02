package ar.edu.unju.fi.tracking.repository;

import org.springframework.stereotype.Repository;

@Repository("regitroTrackingImp")
public class RegistroTrackingImp implements IRegistroTrackingDAO{

	/**
	 * Guarda los datos y registraen la Base de datos
	 * Datos que guarda:
	 * Fecha y Hora del registro
	 * Vehiculo que se está registrando
	 * Tripulantes que estan en el vehiculo
	 * Localidad donde se está haciendo el registro
	 * Detalle sobre el lugar donde se hace el registro
	 */
	@Override
	public void guardadDatos() {
		// TODO Auto-generated method stub
		
	}

}
