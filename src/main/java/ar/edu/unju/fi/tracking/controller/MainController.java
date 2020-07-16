package ar.edu.unju.fi.tracking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping({"/","/loguin"})
	public String ingresar(Model model) {
	return "loguin" ;
	
 }
	@GetMapping ("/index")
	public String seguir(Model model) {
			return "index" ;
		
	}
}