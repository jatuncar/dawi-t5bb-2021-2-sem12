package org.ciberfarma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

// inner Join productos -- categoria

@Entity
public class ProdCat {
	@Id
	@Column(name = "id_prod")
	private String codigo;
	
	@Column(name = "des_prod")
	private String nomprod;
	
	@Column(name = "stk_prod")
	private int stock;
	
	@Column(name = "pre_prod")
	private double precio;
	
	@Column(name = "descripcion")
	private String categoria;

	@Override
	public String toString() {
		return "ProdCat [codigo=" + codigo + ", nomprod=" + nomprod + ", stock=" + stock + ", precio=" + precio
				+ ", categoria=" + categoria + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNomprod() {
		return nomprod;
	}

	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
