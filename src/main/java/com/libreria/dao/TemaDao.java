package com.libreria.dao;

import java.util.List;

import com.libreria.entitybeans.Tema;

public interface TemaDao {

	List<Tema> findAll();

	int altaTema(Tema tema);

	int findById(int idTema);

	int borrarTema(Tema tema);

	int modificarTema(Tema tema, int idTema);

	List<Tema> findByTema(String descTema);

}
