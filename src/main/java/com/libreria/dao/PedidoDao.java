package com.libreria.dao;

import java.util.List;

import com.libreria.entitybeans.Pedido;

public interface PedidoDao {

	List<Pedido> findAll();

	int altaPedido(Pedido pedido);

	int borrarPedido(Pedido pedido);

	int modificarPedido(Pedido pedido, int idPedido);

}
