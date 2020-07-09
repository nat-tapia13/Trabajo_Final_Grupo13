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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
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
	 * 
	 */
	private static final long serialVersionUID = 7716326146968727998L;

	/**
	 * Representa el identificacion univoca de la localidad
	 */
	@Id
	@Column(name = "ID_LOCALIDAD")
	private Long id;
	
	/**
	 * Representa el nombre de una localidad o pueblo
	 */
	@Column(name = "NOMBRE")
	private String nombre;
	
	/**
	 * Representa una lista de registros tracking que se realizaron en la localidad
	 */
	@Autowired
	@OneToMany(mappedBy = "localidad")
	private List<RegistroTracking> registros = new ArrayList<RegistroTracking>();
	
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
	
	/**
	 * @return the registros
	 */
	public List<RegistroTracking> getRegistros() {
		return registros;
	}
	/**
	 * @param registros the registros to set
	 */
	public void setRegistros(List<RegistroTracking> registros) {
		this.registros = registros;
	}
	//-----------------Método toString------------------------
	@Override
	public String toString() {
		return "Localidad [nombre=" + nombre + "]";
	}
	
}
