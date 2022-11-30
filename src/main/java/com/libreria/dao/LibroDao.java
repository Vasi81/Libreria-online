package com.libreria.dao;

import java.util.ArrayList;
import java.util.List;

import com.libreria.entitybeans.Libro;

public interface LibroDao {

	List<Libro> findAll();

	Libro findById(long isbn);

	int altaLibro(Libro libro);

	int borrarLibro(Libro libro);

	int modificarLibro(Libro libro, long isbn);

	List<Libro> muestraNovedades();

	List<Libro> findByTitulo(String titulo);

	List<Libro> findByTema(String descTema);

	ArrayList<Libro> addCarrito(Libro libro);

}
