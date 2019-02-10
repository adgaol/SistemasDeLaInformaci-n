$(document).ready(function(){
	var botonPendientes=$("#pendientes");
	botonPendientes.click(anadirPendientes);
	function anadirPendientes(){
		$("#contenido").load("serviciosPendientes.html");
		alert("mierda");
	}
}
)
