/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ema
 * 
 * Clase RegistroTracking representa el registro del Tracking
 * Tracking: es el seguimiento de la ruta del camionero o de un vehiculo particular
 *
 */

@Entity
@Table(name = "registros")
@Component("unRegistroTracking")
public class RegistroTracking implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * Representa la fecha y hora del registro
	 */
	private LocalDateTime fechaHora;
	
	/**
	 * Representa el vehiculo que se va a registrar
	 */
	@Autowired
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_vehiculo")
	private Vehiculo vehiculo;
	
	/**
	 * Representa el o los tripulantes del vehiculo
	 */
	@Autowired
	@ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	private List<Tripulante> tripulantes;
	
	/**
	 * Representa la localidad donde se está registrando el Tracking
	 */
	@Autowired
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_localidad")
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
	 * @return the fechaHora
	 */
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	/**
	 * @param fechahora the fechahora to set
	 */
	public void setFechaHora(LocalDateTime fechahora) {
		this.fechaHora = fechahora;
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
	 * @return the tripulantes
	 */
	public List<Tripulante> getTripulantes() {
		return tripulantes;
	}

	/**
	 * @param tripulante the tripulantes to set
	 */
	public void setTripulantes(List<Tripulante> tripulante) {
		this.tripulantes = tripulante;
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

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	//-----------------------------Método toString---------------------------------
	@Override
	public String toString() {
		return "RegistroTracking [fechahora=" + fechaHora + ", vehiculo=" + vehiculo + ", tripulante=" + tripulantes
				+ ", localidad=" + localidad + ", detalleLugarRegistro=" + detalleLugarRegistro + "]";
	}
	
	
	

}
