/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tracking.model.Usuario;
import ar.edu.unju.fi.tracking.repository.IUsuarioDAO;

/**
 * @author Ema
 *
 */
@Service
public class IUsuarioServiceImp implements IUsuarioService {

	@Autowired
	private IUsuarioDAO iusuario;

	@Override
	public void guardar(Usuario unUsuario) {

		String pas = unUsuario.getPassword();
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(8);
		unUsuario.setPassword(bCryptPasswordEncoder.encode(pas));
		iusuario.save(unUsuario);

	}

	@Override
	public void eliminar() {

	}
	
	@Override
	public Iterable<Usuario> listarTodos() {
		// Metodo que devulve todos los usuarios logueados
		return iusuario.findAll();

	}

	@Override
	public Usuario consultar() {
		// TODO Auto-generated method stub
		return null;
	}
}
