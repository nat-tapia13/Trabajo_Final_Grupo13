/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author Ema
 *
 */
public interface IUsuarioService {
	
	public void guardar();
	
	public Usuario modificar();
	
	public void eliminar();
	
	public Usuario consultar();

}
