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
 * Clase que representa a un Usuario
 * @author Natalia
 * 
 */
@Component("unUsuario")
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	/*
	 * ATRIBUTOS
	 * 
	 */
	/**
	 * Representa la identificacion univoca de un Usuario
	 */
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long id;
	/**
	 * Atributo que representa el nombre del usuario
	 */
	@Column (name="nombre_usuario",length = 150, nullable = true)
	private String nombreUsuario;
	
	/**
	 * Atributo que representa la contraseña del usuario
	 */
	@Column (name= "password",length = 8,nullable = true)
	private String password;
	
	/**
	 * Atributo que representa el nombre real del usuaurio
	 */
	@Column (name="nombre_real",length = 150, nullable = true)
	private String nombreReal;
	
	/**
	 * Atributo que representa el apellido real del usuario
	 */
	@Column (name="apellido_real",length = 150, nullable = true)
	private String apellidoReal;
	
	/**
	 *Atributo que representa al tipo de usuario
	 */
	@Column (name="tipo_usuario",length = 11, nullable = true)
	private String tipoUsuario;
	
	private List<RegistroTraiking>
	
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
	 * 
	 * @param nombreUsuario
	 * @param password
	 * @param nombreReal
	 * @param apellidoReal
	 * @param tipoUsuario
	 */
	public Usuario(String nombreUsuario, String password, String nombreReal, String apellidoReal,
			String tipoUsuario) {
		super();
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
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", password=" + password + ", nombreReal="
				+ nombreReal + ", apellidoReal=" + apellidoReal + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
	
	
}
