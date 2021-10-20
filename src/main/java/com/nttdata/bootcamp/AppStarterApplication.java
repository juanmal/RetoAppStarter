package com.nttdata.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.Nombre;

@SpringBootApplication
public class AppStarterApplication {
	
	@Autowired
	private Nombre n;
	
	public static void main(String[] args) {
		SpringApplication.run(AppStarterApplication.class, args);
	}

}
