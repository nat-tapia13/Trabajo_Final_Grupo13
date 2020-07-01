/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author Ema
 *Representa la interface Usuario con sus metodos abstractos
 */


public interface IUsuarioDAO {
	
	public void guardar();
	
	public Usuario modificar();
	
	public void eliminar();
	
	public Usuario consultar();

}
