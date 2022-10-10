package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.services.IClienteService;
import com.example.demo.models.entity.Cliente;

@RestController/**/
@RequestMapping("/api")/**/
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;

	@GetMapping("/clientes")/*ESTA VOLVIENDO */
	public List<Cliente> index(){
		return clienteService.findAll();		
	}
}
