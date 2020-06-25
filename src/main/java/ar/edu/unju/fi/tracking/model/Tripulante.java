/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

/**
 * Esta clase representa a al tripulante 
 * @author Dalila
 *
 */
public class Tripulante {
	/*
	 * Representa la identificacion unica del tripulante
	 */
	private String documento;
	/*
	 * Representa el apellido del tripulante
	 */
	private String apellido;
	/*
	 * Representa el nombre completo del tripulante
	 */
	private String nombres;
	/*
	 * Representa la nacionalidad del tripulante
	 */
	private String nacionalidad;
	//---------------CONTRUCTORES-------------------
	/**
	 * Constructor  por defecto
	 */
	public Tripulante() {
		// TODO Auto-generated constructor stub
	}
	//Constructor Parametrisado
	/**
	 * @param documento
	 * @param apellido
	 * @param nombres
	 * @param nacionalidad
	 */
	public Tripulante(String documento, String apellido, String nombres, String nacionalidad) {
		super();
		this.documento = documento;
		this.apellido = apellido;
		this.nombres = nombres;
		this.nacionalidad = nacionalidad;
	}
	//-------------METODOS ACCESORES-----------------
	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}
	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	@Override
	public String toString() {
		return "Tripulante [documento=" + documento + ", apellido=" + apellido + ", nombres=" + nombres
				+ ", nacionalidad=" + nacionalidad + "]";
	}
	
	
	
}
