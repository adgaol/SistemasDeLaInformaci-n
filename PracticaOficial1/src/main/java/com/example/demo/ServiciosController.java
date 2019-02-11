package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ServiciosController {
	@RequestMapping("/mostrarA")
	public String mostrar( Model model) {
		
		
		Servicio servico=new Servicio("Fontaneria", "Arreglar el desague", "Fontaneria", 360, 100);

		model.addAttribute("name",servico.getNombre() );

		return "mostrarA";
	}
}
