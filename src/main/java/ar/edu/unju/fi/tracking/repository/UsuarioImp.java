package ar.edu.unju.fi.tracking.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author Ema
 *Representa la clase implementadora de la interface IUsuarioDAO
 *
 */

@Repository("usuarioImp")
public  interface UsuarioImp extends IUsuarioDAO {

	@Autowired
	Optional<Usuario> findByApellidoReal(String apellidoReal);
		
}
