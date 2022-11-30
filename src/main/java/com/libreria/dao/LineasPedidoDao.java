package com.libreria.dao;

import java.util.List;

import com.libreria.entitybeans.LineasPedido;

public interface LineasPedidoDao {

	List<LineasPedido> findAll();

	LineasPedido findbyId(int idPedido);

	int altaLineasPedido(LineasPedido lp);

	int borrarLineasPedido(LineasPedido lp);

	int modificarLineasPedido(LineasPedido lp, int idPedido);

}
