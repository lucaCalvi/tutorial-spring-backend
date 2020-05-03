package com.tuto.demo.libro;

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
@RequestMapping("/api/libros")
public class LibroControlador {
	@Autowired
	LibroService service;
	
	@GetMapping(path = {"/persona/{id}"})
	public List<Libro> getLibrosPersona(@PathVariable("id") int idPersona) {
		return service.getLibrosPersona(idPersona);
	}
	
	@GetMapping(path = {"/{id}"})
	public Libro getLibro(@PathVariable("id") int id) {
		return service.getLibro(id);
	}
	
	@PostMapping
	public Libro insertLibro(@RequestBody Libro libro) {
		return service.insertLibro(libro);
	}
	
	@PutMapping(path = {"/{id}"})
	public Libro updateLibro(@RequestBody Libro libro, @PathVariable int id) {
		libro.setId(id);
		return service.updateLibro(libro);
	}
	
	@DeleteMapping(path = {"/{id}"})
	public Libro deleteLibro(@PathVariable int id) {
		return service.deleteLibro(id);
	}
}
