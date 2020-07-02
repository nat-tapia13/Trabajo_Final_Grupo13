/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * Representa una localidad
 * @author Dalila
 *
 */
@Component("unaLocalidad")
@Entity
@Table(name = "localidades")
public class Localidad implements Serializable {
	
	/**
	 * Representa el identificacion univoca de la localidad
	 */
	@Id
	@Column(name = "id_localidad")
	private Long id;
	
	/**
	 * Representa el nombre de una localidad o pueblo
	 */
	private String nombre;
	
	/**
	 * Representa una lista de registros tracking que se realizaron en la localidad
	 */
	private List<Localidad> localidades = new ArrayList<Localidad>();
	
	//---------------CONTRUCTORES-------------------
	/**
	 * Constructor  por defecto
	*/
	public Localidad() {
		// TODO Auto-generated constructor stub
	}
	//Constructor Parametrisado
	/**
	 * @param nombre
	 */
	public Localidad(String nombre) {
		super();
		this.nombre = nombre;
	}
	//-------------METODOS ACCESORES-----------------
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
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
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//-----------------Método toString------------------------
	@Override
	public String toString() {
		return "Localidad [nombre=" + nombre + "]";
	}
	
}
