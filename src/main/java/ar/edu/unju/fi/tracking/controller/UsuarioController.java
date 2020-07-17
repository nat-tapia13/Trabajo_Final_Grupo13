/**
 * 
 */
package ar.edu.unju.fi.tracking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import ar.edu.unju.fi.tracking.model.Usuario;
import ar.edu.unju.fi.tracking.service.IUsuarioService;

/**
 * @author Dalila
 *
 */
@Controller
@RequestMapping
public class UsuarioController {
	@Autowired
	IUsuarioService usuarioservice;
	@Autowired
	private Usuario usuario;
	@RequestMapping("/abm")
	public String getUsuarioForm(Model model) {
		List<Usuario> usuarios =usuarioservice.obtenerUsuarios();
		model.addAttribute("usuarios",usuarios);
		return "abm";
	}
	
	@GetMapping("/nuevoUsuario")
	public String agregarUsuario(Model model) {
		model.addAttribute("usuario",usuario);
		return "nuevoUsuario";
	}
	@PostMapping("/saveUsuario")
	public String guardarU(@Valid Usuario usuario,Model model) {
		usuarioservice.crear(usuario);;
		
		return "redirect:/abm";
	}

}
