package com.carlosqeje.demostar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class Holamundocontroller {

	@RequestMapping("/saludar")
	public String saludar() {
		return "Hola mundo 1";
	}
}
