package com.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libreria.entitybeans.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

}
