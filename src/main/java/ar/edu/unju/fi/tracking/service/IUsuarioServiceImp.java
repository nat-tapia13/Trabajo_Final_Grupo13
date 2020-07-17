/**
 * 
 */
package ar.edu.unju.fi.tracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
public class IUsuarioServiceImp implements IUsuarioService {
	@Autowired
	private IUsuarioDAO iuser;
	@Override
	public void crear(Usuario usuario) {
		String pas= usuario.getPassword();
		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder(4);
		usuario.setPassword(encoder.encode(pas));
		iuser.save(usuario);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> encontrarUsuario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario encontrarUsuarioNombre(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String redirigirUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> findByApellidoReal(String apellidoReal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> obtenerUsuarios() {
		// TODO Auto-generated method stub
		return iuser.obtenerU();
	}

	
}
