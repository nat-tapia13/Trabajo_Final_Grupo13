/**
 * 
 */
package ar.edu.unju.fi.tracking.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.edu.unju.fi.tracking.model.Usuario;

/**
 * @author Ema
 *Representa la interface Usuario con sus metodos abstractos
 */

public interface IUsuarioDAO  extends JpaRepository<Usuario,Long>{

	public Optional<Usuario> findBynombreUsuario(String nombreUsuario);
	@Query("from Usuario u order by u.nombreReal")
	public List<Usuario> obtenerU();

}
