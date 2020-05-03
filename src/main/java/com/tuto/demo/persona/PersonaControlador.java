package com.tuto.demo.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/personas")
public class PersonaControlador {
	
	@Autowired
	PersonaService service;
	
	@GetMapping
	public List<Persona> getPersonas() {
		return service.getPersonas();
	}
	
	@PostMapping
	public Persona insertPersona(@RequestBody Persona persona) {
		return service.insertPersona(persona);
	}
	
	@GetMapping(path = {"/{id}"})
	public Persona getPersona(@PathVariable("id") int id) {
		return service.getPersona(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Persona updatePersona(@RequestBody Persona persona, @PathVariable("id") int id) {
		persona.setId(id);
		return service.updatePersona(persona);
	}
	
	@DeleteMapping(path = {"/{id}"})
	public Persona deletePersona(@PathVariable("id") int id) {
		return service.deletePersona(id);
	}
}
