package ar.edu.unju.fi.tracking.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * Clase que representa a un Usuario
 * @author Natalia
 * 
 */
@Component
public class Usuario implements Serializable {

	/*
	 * ATRIBUTOS
	 * 
	 */
	
	/**
	 * Atributo que representa el nombre del usuario
	 */
	private String nombreUsuario;
	
	/**
	 * Atributo que representa la contraseña del usuario
	 */
	private String password;
	
	/**
	 * Atributo que representa el nombre real del usuaurio
	 */
	private String nombreReal;
	
	/**
	 * Atributo que representa el apellido real del usuario
	 */
	private String apellidoReal;
	
	/**
	 *Atributo que representa al tipo de usuario
	 */
	private String tipoUsuario;
	
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
	public Usuario(String nombreUsuario,String password,String nombreReal,String apellidoReal,String tipoUsuario) {
		
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
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", password=" + password + ", nombreReal=" + nombreReal
				+ ", apellidoReal=" + apellidoReal + ", tipoUsuario=" + tipoUsuario + ", getNombreUsuario()="
				+ getNombreUsuario() + ", getPassword()=" + getPassword() + ", getNombreReal()=" + getNombreReal()
				+ ", getApellidoReal()=" + getApellidoReal() + ", getTipoUsuario()=" + getTipoUsuario() + "]";
	}
	
	
}
