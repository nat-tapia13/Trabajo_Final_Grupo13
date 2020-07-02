/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author Ema
 * 
 * Clase RegistroTracking representa el registro del Tracking
 * Tracking: es el seguimiento de la ruta del camionero o de un vehiculo particular
 *
 */

@Component("unRegistroTracking")
public class RegistroTracking implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	/**
	 * Representa la fecha y hora del registro
	 */
	private LocalDateTime fechahora;
	
	/**
	 * Representa el vehiculo que se va a registrar
	 */
	@Autowired
	private Vehiculo vehiculo;
	
	/**
	 * Representa el o los tripulantes del vehiculo
	 */
	@Autowired
	private List<Tripulante> tripulante;
	
	/**
	 * Representa la localidad donde se está registrando el Tracking
	 */
	@Autowired
	private Localidad localidad;
	
	/**
	 * Representa el detalle del registro del Tracking
	 */
	private String detalleLugarRegistro;
	
	//--------------Constructores----------------
	/**
	 * Constructor por defecto
	 */
	public RegistroTracking() {
		
	}
	
	//---------------------Métodos Accesores-------------------------

	/**
	 * @return the fechahora
	 */
	public LocalDateTime getFechahora() {
		return fechahora;
	}

	/**
	 * @param fechahora the fechahora to set
	 */
	public void setFechahora(LocalDateTime fechahora) {
		this.fechahora = fechahora;
	}

	/**
	 * @return the vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	 * @param vehiculo the vehiculo to set
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	/**
	 * @return the tripulante
	 */
	public List<Tripulante> getTripulante() {
		return tripulante;
	}

	/**
	 * @param tripulante the tripulante to set
	 */
	public void setTripulante(List<Tripulante> tripulante) {
		this.tripulante = tripulante;
	}

	/**
	 * @return the localidad
	 */
	public Localidad getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return the detalleLugarRegistro
	 */
	public String getDetalleLugarRegistro() {
		return detalleLugarRegistro;
	}

	/**
	 * @param detalleLugarRegistro the detalleLugarRegistro to set
	 */
	public void setDetalleLugarRegistro(String detalleLugarRegistro) {
		this.detalleLugarRegistro = detalleLugarRegistro;
	}

	//-----------------------------Método toString---------------------------------
	@Override
	public String toString() {
		return "RegistroTracking [fechahora=" + fechahora + ", vehiculo=" + vehiculo + ", tripulante=" + tripulante
				+ ", localidad=" + localidad + ", detalleLugarRegistro=" + detalleLugarRegistro + "]";
	}
	
	
	

}
