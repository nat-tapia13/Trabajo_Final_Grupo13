/**
 * 
 */
package ar.edu.unju.fi.tracking.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.tracking.model.Localidad;
import ar.edu.unju.fi.tracking.model.RegistroTracking;
import ar.edu.unju.fi.tracking.model.Tripulante;
import ar.edu.unju.fi.tracking.service.ILocalidadService;
import ar.edu.unju.fi.tracking.service.IRegistroTrackingService;

/**
 * @author Ema Talavera
 *
 */
@Controller
@RequestMapping
public class RegistroTrackingController {
	
	@Autowired
	private IRegistroTrackingService iregistro;
	
	@Autowired
	private ILocalidadService localidadService;
	
	@Autowired
	private RegistroTracking registro;
	
	@Autowired
	private Tripulante tripulante;
	
	List<Tripulante> lista = new ArrayList<>();
	
//	@Autowired
	//private Usuario usuario;
	
	//@Autowired
	//IUsuarioDAO iUsuario;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<RegistroTracking> registros = iregistro.listar();
		
		model.addAttribute("registros", registros);
		
		return "listarRegistros";
	}
	
	/**
	 * 
	 * @param model
	 * @return fromulario para la carga del tripulante
	 */
	@GetMapping("/nuevoTripulante")
	public String agregarTipulante(Model model) {
		model.addAttribute("tripulante", tripulante);
		return "tripulante-form";
	}
	
	/**
	 * 
	 * @return
	 */
	@PostMapping("/cargarTripulante")
	public String guardarTripulante(@Valid Tripulante tripulante) {
		lista.add(tripulante);
		return "redirect:/nuevoRegistro";
	}
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/nuevoRegistro")
	public String agregar(Model model) {
		
		registro.setFechaHora(LocalDateTime.now());
		model.addAttribute("fecha", registro.getFechaHora());
		
		model.addAttribute("nuevoTripulante", tripulante);
		
		registro.setTripulantes(lista);

		model.addAttribute("registro", registro);
		
		return "registro-form";
	}
	
	@PostMapping("/saveRegistro")
	public String guardar(@Valid RegistroTracking registro,Model model) {
		registro.setFechaHora(LocalDateTime.now());
		iregistro.guardarDatos(registro);
		lista = new ArrayList<>();
		return "redirect:/listar";
	}
	
	@GetMapping("/listarRegistros")
	public String listarRegistros(@Valid String documento,Model model) {
		
		List<RegistroTracking> registros = iregistro.listarRegistrosPorDNI(documento);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		for(int i=0;i<registros.size();i++) {
			System.out.println("Registro id: "+registros.get(i).getId());
			String fechaHora = registros.get(i).getFechaHora().format(dateFormat);
			System.out.println(fechaHora);
			//registros.get(i).setFechaHora(LocalDateTime.parse(fechaHora, dateFormat));
			System.out.println("Registro Fehca y Hora: "+registros.get(i).getFechaHora());
			System.out.println("Registro Apellido: "+registros.get(i).getTripulantes().get(0).getApellido());
			System.out.println("Registro Patente: "+registros.get(i).getVehiculo().getPatente());
		}
		
		model.addAttribute("registros", registros);
		return "listarRegistroTripulante"; 
	}
	
	@GetMapping("/listarRegistrosPatente")
	public String listarRegistrosPatente(@Valid String patente,Model model) {
		
		List<RegistroTracking> registros = iregistro.listarRegistrosPorPatente(patente);
		model.addAttribute("registros", registros);
		return "listarRegistroPatente"; 
	}
	
	@GetMapping("/listarVehiculos")
	public String listarRegistrosPorLocalidad(@Valid String fechaIni,@Valid String fechaFin,@Valid String nombre,Model model) {
		List<Localidad> localidades = localidadService.listarLocalidades();
		model.addAttribute("localidades", localidades);
		
		List<RegistroTracking> registros = iregistro.listarRegistrosPorLocalidad(fechaIni, fechaFin, nombre);
		model.addAttribute("registros",registros);
		
		return "listarVehiculos";
	}
	
	@GetMapping("/listarVehiculos/{id}")
	public String obtenerTripulantes(Model model,@PathVariable Long id) {
		
		Optional<RegistroTracking> registros = iregistro.listarTripulantes(id);
		
		List<Tripulante> tripulantes = registros.get().getTripulantes();
		
		model.addAttribute("tripulantes", tripulantes);
		
		return "listaTripulanteRegistro";
	}
	

}
