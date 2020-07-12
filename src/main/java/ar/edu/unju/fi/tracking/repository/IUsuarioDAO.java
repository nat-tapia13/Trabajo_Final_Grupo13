/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author Ema
 *Representa la interface Usuario con sus metodos abstractos
 */

public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{

	//@Autowired
	//public Optional<Usuario> findByeNombre(String nombreUsuario);

}
