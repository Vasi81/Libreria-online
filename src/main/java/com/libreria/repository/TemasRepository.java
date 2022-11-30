package com.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libreria.entitybeans.Tema;

public interface TemasRepository extends JpaRepository <Tema, Integer> {

}
