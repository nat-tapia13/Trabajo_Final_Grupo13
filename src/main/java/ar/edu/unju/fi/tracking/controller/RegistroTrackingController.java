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
		
		List<Tripulante> tripulantes = new ArrayList<Tripulante>();
		
		/*//for(int i=0;i<registros.size();i++) {
			 tripulantes = registros.get(0).getTripulantes();
		//}
		
		
		model.addAttribute("tripulantes", tripulantes);*/
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
