package com.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libreria.entitybeans.Usuario;

public interface UsuariosRepository extends JpaRepository <Usuario, String>{

}
