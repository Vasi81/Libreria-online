package com.libreria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.libreria.entitybeans.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
	
	@Query ("select l from Libro l where l.titulo like %:titulo%")
	public List<Libro>findByPalabra(String titulo);
	
	@Query("select l from Libro l where l.tema.descTema=?1")
	public List<Libro>findByTema(String descTema);
	

}
