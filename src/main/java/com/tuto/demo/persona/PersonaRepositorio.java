package com.tuto.demo.persona;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PersonaRepositorio extends Repository<Persona, Integer>{
	List<Persona> findAll();
	Persona findById(int id);
	Persona save(Persona persona);
	void delete(Persona persona);
}
