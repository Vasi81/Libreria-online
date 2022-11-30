package com.libreria.dao;

import java.util.List;

import com.libreria.entitybeans.Usuario;

public interface UsuariosDao {

	List<Usuario> findAll();

	int altaUsuario(Usuario usuario);

	Usuario findByUserName(String username);

	int eliminarUsuario(Usuario usuario);

	int modificarUsuario(Usuario usuario);

}
