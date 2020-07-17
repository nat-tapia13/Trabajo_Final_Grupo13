package ar.edu.unju.fi.tracking.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que representa a un Usuario
 * @author Natalia
 * 
 */
@Component("unUsuario")
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7009702195326876064L;
	
	/*
	 * ATRIBUTOS
	 * 
	 */
	/**
	 * Representa la identificacion univoca de un Usuario
	 */
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long id;
	/**
	 * Atributo que representa el nombre del usuario
	 */
	@Column (name="NOMBRE",length = 150, nullable = true)
	private String nombreUsuario;
	
	/**
	 * Atributo que representa la contraseña del usuario
	 */
	@Column (name= "PASSWORD",nullable = true)
	private String password;
	
	/**
	 * Atributo que representa el nombre real del usuaurio
	 */
	@Column (name="NOMBRE_REAL",length = 150, nullable = true)
	private String nombreReal;
	
	/**
	 * Atributo que representa el apellido real del usuario
	 */
	@Column (name="APELLIDO_REAL",length = 150, nullable = true)
	private String apellidoReal;
	
	/**
	 *Atributo que representa al tipo de usuario
	 */
	@Column (name="TIPO_USUARIO",length = 11, nullable = true)
	private String tipoUsuario;
	/**
	 * Representa una lista de registro que pertenecen a un Usuario
	 */
	@Autowired
	@OneToMany (mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<RegistroTracking> registro=new ArrayList<RegistroTracking>();
	
	/*
	 * CONSTRUCTORES
	 * 
	 */
	
	/**
	 * Constructor por defecto
	 * 
	 */
	
	public Usuario() {
		
	}
	/**
	 * Constructor parametrizado
	 * @param id
	 * @param nombreUsuario
	 * @param password
	 * @param nombreReal
	 * @param apellidoReal
	 * @param tipoUsuario
	 */
	public Usuario(Long id, String nombreUsuario, String password, String nombreReal, String apellidoReal,
			String tipoUsuario) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.nombreReal = nombreReal;
		this.apellidoReal = apellidoReal;
		this.tipoUsuario = tipoUsuario;
	}
	/*
	 * METODOS ACCESORES
	 * 
	 */

	/**
	 * Devuelve el nombre del usuario
	 * 
	 * @return this nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * Asigna un valor al nombreUsuario a Usuario
	 * @param nombreUsuario del nombreUsuario del Usuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * Devuelve la password del Usuaurio
	 * @return this password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Asigna un valor a password a password a Usuario
	 * @param password de password del Usuario
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Devuelve el valor nombre real del Usuario
	 * @return this nombreReal
	 */
	public String getNombreReal() {
		return nombreReal;
	}

	/**
	 * Asigna el valor a nombreReal del nombreReal a Usuario
	 * @param nombreReal del nombreReal del Usuario
	 */
	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}

	/**
	 * Devuelve el valor del ApellidoReal del Usuario
	 * @return this apellidoReal
	 */
	public String getApellidoReal() {
		return apellidoReal;
	}

	/**
	 * Asigna a apellidoReal el apellido real a Usuario
	 * @param apellidoReal del apellidoReal del Usuario
	 */
	public void setApellidoReal(String apellidoReal) {
		this.apellidoReal = apellidoReal;
	}

	/**
	 * Devulve el valor del tipo de usuario a Usuario
	 * @return this tipoUsuario
	 */
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * Asigna el valor tipoUsuario a tipoUsuario a Usuario
	 * @param tipoUsuario de tipoUsuario 
	 */
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
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
	 * @return the registro
	 */
	public List<RegistroTracking> getRegistro() {
		return registro;
	}
	/**
	 * @param registro the registro to set
	 */
	public void setRegistro(List<RegistroTracking> registro) {
		this.registro = registro;
	}
	
	//-----------------------------Método toString---------------------------------
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", password=" + password + ", nombreReal="
				+ nombreReal + ", apellidoReal=" + apellidoReal + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
		
}
