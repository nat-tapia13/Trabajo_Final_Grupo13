

$(document).ready(function(e){
	$("#listarTripulantes").hide();
});

$("#mostrarListaTripulante").click(function(e){
	e.preventDefault();
	$("#listarTripulantes").fadeIn(1000);
});

$("#btn-cerrar-popup").click(function() {
	$("#listarTripulantes").fadeOut(1000);
});