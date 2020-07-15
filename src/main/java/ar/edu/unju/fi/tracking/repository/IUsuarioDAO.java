/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author Ema
 *Representa la interface Usuario con sus metodos abstractos
 */

public interface IUsuarioDAO  extends JpaRepository<Usuario,Long>{

	Optional<Usuario> findByApellidoReal(String apellidoReal);
	

}
