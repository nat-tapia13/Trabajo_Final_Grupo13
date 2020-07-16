package ar.edu.unju.fi.tracking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	/**@Autowired
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
	*/
	//solo hasta aqui
	
	/**
	@GetMapping
	public String registro(Model model) {
		model.addAttribute("registro",new RegistroTracking());
		model.addAttribute("registros",registroRepository.findAll());
		return "registro";
	}**/
	
}