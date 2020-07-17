/**
 * 
 */
package ar.edu.unju.fi.tracking.service;
import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author Ema
 *
 */
public interface IUsuarioService {
	
	public void crear(Usuario usuario);
	
	public List<Usuario> obtenerUsuarios();
	
	public void eliminar(Usuario usuario);
	
	public Usuario modificar();
	
	public Iterable<Usuario>listarTodos();

	public Optional <Usuario> encontrarUsuario(Long id);

	public Usuario encontrarUsuarioNombre(Usuario usuario) throws Exception;

	public String redirigirUsuario(Usuario usuario);
	
	public Optional<Usuario> findByApellidoReal(String apellidoReal);
}
