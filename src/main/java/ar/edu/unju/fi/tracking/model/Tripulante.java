package ar.edu.unju.fi.tracking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * Esta clase representa a al tripulante 
 * @author Dalila
 *
 */
@Entity
@Table(name="tripulantes")
@Component("unTripulante")
public class Tripulante implements Serializable{
	
	private static final long serialVersionUID=1L;
	/**
	 * Representa la identificacion unica del tripulante
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID",length=10,nullable=false)
	private String documento;
	/**
	 * Representa el apellido del tripulante
	 */
	@Column(name="ID_APELLIDO",length=10,nullable=false)
	private String apellido;
	/**
	 * Representa el nombre completo del tripulante
	 */
	@Column(name="ID_NOMBRES",length=10,nullable=false)
	private String nombres;
	/**
	 * Representa la nacionalidad del tripulante
	 */
	@Column(name="ID_NACIONALIDAD",length=20,nullable=false)
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
	
	//---------------------Método toString-------------------------
	@Override
	public String toString() {
		return "Tripulante [documento=" + documento + ", apellido=" + apellido + ", nombres=" + nombres
				+ ", nacionalidad=" + nacionalidad + "]";
	}
	
	
	
}
