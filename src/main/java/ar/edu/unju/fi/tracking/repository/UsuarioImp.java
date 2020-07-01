/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author Ema
 *Representa la clase implementadora de la interface IUsuarioDAO
 *
 */

@Repository("usuarioImp")
public class UsuarioImp implements IUsuarioDAO{

	/**
	 * Guarda un objeto de tipo Usuario
	 */
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Modifica el objeto de tipo Usuario
	 */
	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Elimina el objeto de tipo Usuario
	 */
	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Muestra los atributos un objeto de tipo usuario
	 * 
	 */
	@Override
	public Usuario consultar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
