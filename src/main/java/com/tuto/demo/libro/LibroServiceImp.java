package com.tuto.demo.libro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	LibroRepositorio repositorio;

	@Override
	public List<Libro> getLibrosPersona(int idPersona) {
		return repositorio.findByIdPersona(idPersona);
	}	

	@Override
	public Libro getLibro(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Libro insertLibro(Libro libro) {
		return repositorio.save(libro);
	}

	@Override
	public Libro updateLibro(Libro libro) {
		return repositorio.save(libro);
	}

	@Override
	public Libro deleteLibro(int id) {
		Libro libro = repositorio.findById(id);
		if(libro != null) {
			repositorio.delete(libro);
		}
		return libro;
	}
}
