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
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.tracking.model.Localidad;
import ar.edu.unju.fi.tracking.model.Vehiculo;
import ar.edu.unju.fi.tracking.service.ILocalidadService;
import ar.edu.unju.fi.tracking.service.IVehiculoService;

/**
 * @author Ema Talavera
 *
 */
@Controller
@RequestMapping
public class VehiculoController {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private ILocalidadService localidadService;
	
	@GetMapping("/listarVehiculos1")
	public String listar(@Valid String fechaIni,@Valid String fechaFin,@Valid String nombre,Model model){
		List<Localidad> localidades = localidadService.listarLocalidades();
		//List<Vehiculo> vehiculos = vehiculoService.listarVehiculos(nombre);
		
		List<Vehiculo> vehiculos = vehiculoService.listarVehiculosFiltro(fechaIni, fechaFin, nombre);
		
		model.addAttribute("vehiculos", vehiculos);
		model.addAttribute("localidades", localidades);
		return "listarVehiculos";
	}
	
	
	
}
