package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.Nombre;

@RestController
public class Controlador {
	
	@Autowired
	private Nombre nombre;
	
	@GetMapping("/hola")
	public String getNombre() {
		return nombre.getNombre();
	}
}
