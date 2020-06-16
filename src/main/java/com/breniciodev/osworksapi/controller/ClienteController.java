package com.breniciodev.osworksapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.breniciodev.osworksapi.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		Cliente cliente1 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("João Oliveira");
		cliente1.setEmail("joao.oliveira@hotmail.com");
		cliente1.setTelefone("62 98455-6358");
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setId(2L);
		cliente2.setNome("Elisama");
		cliente2.setEmail("elisama.oliveira@hotmail.com");
		cliente2.setTelefone("62 98425-3568");
		
		
		return Arrays.asList(cliente1, cliente2);
	}

}
