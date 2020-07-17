/**
 * 
 */
package ar.edu.unju.fi.tracking.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.tracking.model.RegistroTracking;
import ar.edu.unju.fi.tracking.model.Tripulante;
import ar.edu.unju.fi.tracking.service.IRegistroTrackingService;
import ar.edu.unju.fi.tracking.service.ITripulanteService;

/**
 * @author Ema Talavera
 *
 */
@Controller
@RequestMapping
public class TripulanteController {
	
	/*@Autowired
	private ITripulanteService itripulante;
	
	@Autowired IRegistroTrackingService iregistro;
	
	@RequestMapping(value="/listarVehiculos/{idVehiculo}")
	public String listarTripulantes(@PathVariable("idVehiculo") Long idVehiculo,Model model) {
		
		List<Tripulante> tripulantes = itripulante.listar(idVehiculo);
		
		model.addAttribute("tripulantes",tripulantes);
		
		return "listarVehiculos";
	}*/

}
