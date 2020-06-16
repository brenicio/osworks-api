package com.breniciodev.osworksapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public String Listar() {
		return "teste";
	}

}
