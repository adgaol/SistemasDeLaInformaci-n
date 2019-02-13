package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LoginController {
	@RequestMapping("/")
	public String buscador(Model model) {

		

		return "index";
	}
	@RequestMapping("/hp")
	public String homeP(Model model) {

		

		return "HomeProfesional";
	}
	@RequestMapping("/log")
	public String log(@RequestParam String user, String password, Model model) {
		Profesional p1=new Profesional("p1@correo.es", "p1");
		if(user.equals(p1.getUser())&&password.equals(p1.getPassword()))
			return "HomeProfesional";
		else 
			return "";
		

		
	}
}
