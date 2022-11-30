package com.libreria.dao;

import java.util.List;

import com.libreria.entitybeans.Perfile;

public interface PerfileDao {

	List<Perfile> findAll();

	int findById(int idPerfile);

	int altaPerfil(Perfile perfile);

	int borrarPerfil(Perfile perfile);

	int modificarPerfil(Perfile perfile, int idPerfile);

}
