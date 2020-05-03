package com.tuto.demo.libro;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface LibroRepositorio extends Repository<Libro, Integer> {
	List<Libro> findByIdPersona(int idPersona);
	Libro findById(int id);
	Libro save(Libro libro);
	void delete(Libro libro);
}
