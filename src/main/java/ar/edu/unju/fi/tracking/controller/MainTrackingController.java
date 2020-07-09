package ar.edu.unju.fi.tracking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainTrackingController {

	@RequestMapping("/logeo")
	public String ingresar(Model model) {
	return "logeo" ;
	
}
}