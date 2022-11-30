package com.libreria.entitybeans;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the lineas_pedido database table.
 * 
 */
@Entity
@Table(name="lineas_pedido")
@NamedQuery(name="LineasPedido.findAll", query="SELECT l FROM LineasPedido l")
public class LineasPedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NUM_ORDEN")
	private int numOrden;

	private int cantidad;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ALTA")
	private Date fechaAlta;

	@Column(name="PRECIO_VENTA")
	private BigDecimal precioVenta;

	//uni-directional many-to-one association to Libro
	@ManyToOne
	@JoinColumn(name="ISBN")
	private Libro libro;

	//bi-directional many-to-one association to Pedido
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="ID_PEDIDO")
	private Pedido pedido;

	public LineasPedido() {
	}

	public int getNumOrden() {
		return this.numOrden;
	}

	public void setNumOrden(int numOrden) {
		this.numOrden = numOrden;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public BigDecimal getPrecioVenta() {
		return this.precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "LineasPedido [numOrden=" + numOrden + ", cantidad=" + cantidad + ", fechaAlta=" + fechaAlta
				+ ", precioVenta=" + precioVenta + ", libro=" + libro + ", pedido=" + pedido + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numOrden;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LineasPedido))
			return false;
		LineasPedido other = (LineasPedido) obj;
		if (numOrden != other.numOrden)
			return false;
		return true;
	}

}