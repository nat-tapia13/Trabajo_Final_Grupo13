package ar.edu.unju.fi.tracking.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Esta clase representa a al tripulante 
 * @author Dalila
 *
 */
@Component("unTripulante")
@Entity
@Table(name="tripulantes")
public class Tripulante implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	/**
	 * Representa la identificacion unica del tripulante
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TRIPULANTE",length=10,nullable=false)
	private Long id;
	
	@Column
	private String documento;
	/**
	 * Representa el apellido del tripulante
	 */
	@Column(name="APELLIDO",length=10,nullable=false)
	private String apellido;
	/**
	 * Representa el nombre completo del tripulante
	 */
	@Column(name="NOMBRES",length=10,nullable=false)
	private String nombres;
	/**
	 * Representa la nacionalidad del tripulante
	 */
	@Column(name="NACIONALIDAD",length=20,nullable=false)
	private String nacionalidad;
	
	/**
	 * Representa una lista de Registro Tracking perteneciente a este Tripulante
	 */
	@Autowired
	@ManyToMany(mappedBy = "tripulantes")
	private List<RegistroTracking> registros = new ArrayList<RegistroTracking>();
	
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
	
	//---------------------Método toString-------------------------
	@Override
	public String toString() {
		return "Tripulante [documento=" + documento + ", apellido=" + apellido + ", nombres=" + nombres
				+ ", nacionalidad=" + nacionalidad + "]";
	}
	
	
	
}
