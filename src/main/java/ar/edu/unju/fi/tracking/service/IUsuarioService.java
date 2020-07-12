/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author Ema
 *
 */
public interface IUsuarioService {
	
	@Autowired
	public void guardar(Usuario usuario);
	
	public void eliminar();
	
	@Autowired
	public Usuario consultar();
	
	@Autowired
	public Iterable<Usuario>listarTodos();

}
