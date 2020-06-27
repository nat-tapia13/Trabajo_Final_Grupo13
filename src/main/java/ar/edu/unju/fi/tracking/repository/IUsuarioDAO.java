/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author Ema
 *Representa la interface Usuario con sus metodos abstractos
 */

@Repository
public interface IUsuarioDAO {
	
	public void guardar();
	
	public Usuario modificar();
	
	public void eliminar();
	
	public Usuario consultar();

}
