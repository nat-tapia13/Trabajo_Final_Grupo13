package ar.edu.unju.fi.tracking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.tracking.model.RegistroTracking;
import ar.edu.unju.fi.tracking.service.IRegistroTrackingService;

@Controller
@RequestMapping
public class MainTrackingController {
	/**
	@RequestMapping("/logeo")
	public String ingresar(Model model) {
	return "logeo" ;
	
}**/
	//@Autowired
	//IRegistroTrackingDAO registroRepository;
	//descomentar lo q sigue
	@Autowired
	IRegistroTrackingService registroService;
	@Autowired
	private RegistroTracking registro;
	@RequestMapping("/registro")
	public String getRegistroTrackingForm(Model model) {
		return "registro";
	}
	
	@GetMapping("/registro")
	public String agregar(Model model) {
		
		model.addAttribute("registro",registro);
		return "registro";
	}
	
	@PostMapping("/save")
	public String guardar(@Valid RegistroTracking registro,Model model) {
		registroService.guardarDatos(registro);
		return "redirect:/registro";
	}
	
	//solo hasta aqui
	
	/**
	@GetMapping
	public String registro(Model model) {
		model.addAttribute("registro",new RegistroTracking());
		model.addAttribute("registros",registroRepository.findAll());
		return "registro";
	}**/
	
}