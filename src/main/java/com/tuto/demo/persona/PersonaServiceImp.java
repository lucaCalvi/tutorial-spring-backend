package com.tuto.demo.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService {
	@Autowired
	private PersonaRepositorio repositorio;

	@Override
	public List<Persona> getPersonas() {
		return repositorio.findAll();
	}

	@Override
	public Persona getPersona(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Persona insertPersona(Persona persona) {
		return repositorio.save(persona);
	}

	@Override
	public Persona updatePersona(Persona persona) {
		return repositorio.save(persona);
	}

	@Override
	public Persona deletePersona(int id) {
		Persona persona = repositorio.findById(id);
		if(persona != null) {
			repositorio.delete(persona);
		}
		return persona;
	}

}
