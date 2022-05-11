package com.moi.Primer.VC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String Saludo() {
		return "ejemplo";
	}
	
	@GetMapping("/Ejemplo1")
	public String Ejemplo() {
		return "ejemplo1";
	}
	
}