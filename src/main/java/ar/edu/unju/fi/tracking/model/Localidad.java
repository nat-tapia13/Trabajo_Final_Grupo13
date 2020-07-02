/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * Representa una localidad
 * @author Dalila
 *
 */
@Component("unaLocalidad")
public class Localidad implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	/**
	 * Representa el nombre de una localidad o pueblo
	 */
	private String nombre;
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
