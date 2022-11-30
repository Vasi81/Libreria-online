package com.libreria.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entitybeans.Libro;
import com.libreria.repository.LibroRepository;

@Service
public class LibroImpl implements LibroDao {

	@Autowired
	private LibroRepository lrepo;

	@Override
	public List<Libro> findAll() {

		return lrepo.findAll();
	}

	@Override
	public Libro findById(long isbn) {

		return lrepo.findById(isbn).orElse(null);
	}

	@Override
	public int altaLibro(Libro libro) {
		int filas = 0;
		try {
			lrepo.save(libro);
			filas = 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int borrarLibro(Libro libro) {
		int filas = 0;
		try {
			lrepo.delete(libro);
			filas = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int modificarLibro(Libro libro, long isbn) {
		if (findById(isbn) != null) {
			lrepo.save(libro);
			return 1;
		} else
			return 0;
	}

	@Override
	public List<Libro> muestraNovedades() {
		List<Libro> listaNovedades = new ArrayList<Libro>();

		for (Libro lib : lrepo.findAll()) {
			if (lib.getNovedad().equalsIgnoreCase("s"))
				listaNovedades.add(lib);
		}

		return listaNovedades;
	}

	@Override
	public List<Libro> findByTitulo(String titulo) {
		
		return null;
	}

	@Override
	public List<Libro> findByTema(String descTema) {
		return null;
	}

	@Override
	public ArrayList<Libro> addCarrito(Libro libro) {
		ArrayList<Libro>lib = new ArrayList<Libro>();
		if(lib != null) {
			lib.add(libro);
		}
		return lib;
	}

}
