package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginController {
	@RequestMapping("/log")
	public String mostrar(@RequestParam String user, String password, Model model) {
		Profesional p1=new Profesional("p1@correo.es", "p1");
		if(user.equals(p1.getUser())&&password.equals(p1.getPassword()))
			return "HomeProfesional.html";
		else 
			return "";
		

		
	}
}
