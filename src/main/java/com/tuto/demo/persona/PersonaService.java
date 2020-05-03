package com.tuto.demo.persona;

import java.util.List;

public interface PersonaService {
	List<Persona> getPersonas();
	Persona getPersona(int id);
	Persona insertPersona(Persona persona);
	Persona updatePersona(Persona persona);
	Persona deletePersona(int id);
}
