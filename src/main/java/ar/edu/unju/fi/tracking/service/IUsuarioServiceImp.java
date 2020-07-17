/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tracking.model.Usuario;
import ar.edu.unju.fi.tracking.repository.IUsuarioDAO;

/**
 * Clase que implementara los servicio para la peticion del usuario
 * @author Ema
 *
 */
@Service
public class IUsuarioServiceImp /*implements IUsuarioService */{

//	@Autowired
	//private IUsuarioDAO iUsuario;
	
  /**
   * Metodo que crea un usuario y me permite obtener la contraseñena del usuario y gurdar ese usuario
   * que ingresa
   */
/*	@Override
	public void crear(Usuario unUsuario) {
		String pas = unUsuario.getPassword();
		BCryptPasswordEncoder   bCryptPasswordEncoder  = new BCryptPasswordEncoder(8);
		unUsuario.setPassword(bCryptPasswordEncoder.encode(pas));
		iUsuario.save(unUsuario);
	
	}

	@Override
	public void eliminar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Usuario> listarTodos() {
		// retorna todos los usuarios 
		return  iUsuario.findAll();
	}
	/**
	 * Metodo que busca un usuario en la bd por el numero de id
	 * @return usuarioEncontrado
	 */

/*	@Override
	public Optional<Usuario> encontrarUsuario(Long id) {
		Optional <Usuario> usuarioEncontrado = iUsuario.findById(id);
		return usuarioEncontrado;
	}
   /**
     * 
    */
	/*@Override
	public Usuario encontrarUsuarioNombre(Usuario usuario) throws Exception {
		Usuario usuarioEncontrado = iUsuario.findByApellidoReal(usuario.getApellidoReal()).orElseThrow(()-> new Exception("No se encontro el usaurio"));
		if (!usuarioEncontrado.getPassword().equals(usuario.getPassword())) {
			usuarioEncontrado = null;
		}
	return usuarioEncontrado;

}
	@Override
	public String redirigirUsuario(Usuario usuario) {
		
		return null;
	}

	@Override
	public Optional<Usuario> findByApellidoReal(String apellidoReal) {
		// TODO Auto-generated method stub
		return null;
	}	*/
}
