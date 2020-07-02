/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ema
 * 
 * CLase Vehiculo representa un vehiculo
 *
 */
@Component("unVehiculo")
public class Vehiculo implements Serializable {
	/**
	 * Representa la patente de un vehiculo
	 */
	private String patente;
	
	/**
	 * Representa el color del vehiculo
	 */
	private String color;
	
	/**
	 * Representa al titular dueño del vehiculo
	 */
	private String titular;
	
	/**
	 * Representa la marca del vehiculo
	 */
	private String marca;
	
	/**
	 * Representa el modelo del vehiculo
	 */
	private String modelo;
	
	/**
	 * Representa el tipo de vehiculo
	 */
	private String tipo;
	
	/**
	 * Representa el numero del chasis del vehiculo
	 */
	private String numeroChasis;
	
	/**
	 * Representa el numero de motor del vehiculo
	 */
	private String numeroMotor;
	
	/**
	 * Representa una lista de registroTracking asociadas a este vehivulo
	 */
	@Autowired
	@OneToMany(mappedBy = "vehiculo" , cascade = CascadeType.ALL)
	private List<RegistroTracking> registros = new ArrayList<RegistroTracking>();
	
	//----------------------Constructores de la clase------------------------
	/**
	 * Constructor por defecto
	 */
	public Vehiculo() {
		
	}
	
	//-----------------------Metodos Accesores----------------------------

	/**
	 * @return la patente de un vehiculo
	 */
	public String getPatente() {
		return patente;
	}

	/**
	 * @param setear la patente de un vehiculo
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/**
	 * @return el color de un vehiculo
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param setear el color de un vehiculo
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return el titular de un vehiculo
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param setear el titular de un vehiculo
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return la marca de un vehiculo
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param setear la marca de un vehiculo
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return el modelo de un vehiculo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param setear el modelo de un vehiculo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return el tipo de vehiculo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param setear el tipo de vehiculo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return el numero de chasis del vehiculo
	 */
	public String getNumeroChasis() {
		return numeroChasis;
	}

	/**
	 * @param setear el numero de chasis del vehiculo
	 */
	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}

	/**
	 * @return el numero de motor del vehiculo
	 */
	public String getNumeroMotor() {
		return numeroMotor;
	}

	/**
	 * @param setear el numero de motor del vehiculo
	 */
	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
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

	//--------------------------------Metodo toString-------------------------------------
	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", color=" + color + ", titular=" + titular + ", marca=" + marca
				+ ", modelo=" + modelo + ", tipo=" + tipo + ", numeroChasis=" + numeroChasis + ", numeroMotor="
				+ numeroMotor + "]";
	}
	
}
