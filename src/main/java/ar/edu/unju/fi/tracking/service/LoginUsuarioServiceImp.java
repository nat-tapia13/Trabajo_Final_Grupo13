package ar.edu.unju.fi.tracking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tracking.model.Usuario;
import ar.edu.unju.fi.tracking.repository.IUsuarioDAO;

/**
 * Clase creada para el logueo del usuario 
 * @author Natalia
 *
 */
//UserDetailsService:Busca o Guarda el usuario con el que voy a trabajar.Sirve para la autenticación del usuario y contraseña.
//UserDetails:Viene de la dependencia SPRINT SECURITY
@Service
public class LoginUsuarioServiceImp implements UserDetailsService  {
	
	@Autowired
	IUsuarioDAO iusuario;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	Usuario usuarioEncontrado = iusuario.findById(Long.parseLong(username)).orElseThrow(()->new UsernameNotFoundException("Login invalido"));
	List<GrantedAuthority> tipos  = new ArrayList<>();
	GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(usuarioEncontrado.getTipoUsuario());
	tipos.add(grantedAuthority);

				
	UserDetails user = (UserDetails)new User(username,usuarioEncontrado.getPassword(),tipos);
	return user;
			
	}	
}
