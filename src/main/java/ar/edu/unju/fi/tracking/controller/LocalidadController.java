/**
 * 
 */
package ar.edu.unju.fi.tracking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

import ar.edu.unju.fi.tracking.model.Localidad;
import ar.edu.unju.fi.tracking.service.ILocalidadService;

/**
 * @author Ema Talavera
 *
 */
@Controller
@RequestMapping
public class LocalidadController {
	/**
	@Autowired
	ILocalidadService localidadService;
	
	@Autowired
	Localidad localidad;
	
	@GetMapping("/nuevaLocalidad")
	public String agregar(Model model) {
		
		model.addAttribute("localidad", localidad);
		
		return null;
	}
	
	@PostMapping("/save")
	public String guardar(@Valid Localidad localidad, Model model) {
	
		localidadService.guardar(localidad);
		
		return null;
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		
		Optional<Localidad> localidad = localidadService.listarId(id);
		model.addAttribute("localidad", localidad);
		return null;
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(Model model, @PathVariable Long id) {
		
		localidadService.eliminar(id);
		
		return null;
	}
**/
}
