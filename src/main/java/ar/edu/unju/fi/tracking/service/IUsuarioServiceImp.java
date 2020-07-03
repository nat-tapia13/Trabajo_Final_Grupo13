/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import ar.edu.unju.fi.tracking.model.Usuario;
import ar.edu.unju.fi.tracking.repository.IUsuarioDAO;

/**
 * @author Ema
 *
 */
public class IUsuarioServiceImp implements IUsuarioService{

	private IUsuarioDAO iusuario;
	
	@Override
	public void guardar() {
		
		iusuario.guardar();
		
	}

	@Override
	public Usuario modificar() {
		
		Usuario usuario = iusuario.modificar();
		
		return usuario;
	}

	@Override
	public void eliminar() {

		iusuario.eliminar();
		
	}

	@Override
	public Usuario consultar() {
		
		Usuario usuario = iusuario.consultar();
		
		return usuario;
	}

}
