package com.tuto.demo.libro;

import java.util.List;

public interface LibroService {
	List<Libro> getLibrosPersona(int idPersona);
	Libro getLibro(int id);
	Libro insertLibro(Libro libro);
	Libro updateLibro(Libro libro);
	Libro deleteLibro(int id);
}
