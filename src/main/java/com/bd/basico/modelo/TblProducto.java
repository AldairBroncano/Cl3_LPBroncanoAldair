package com.bd.basico.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_producto")
public class TblProducto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idProducto;

    private String nombre;
    private double precio;
    private int stock;
    private double precicomp;
    private String estado;
    private String descripcion;
    

    public TblProducto() {
    }


	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getPrecicomp() {
		return precicomp;
	}


	public void setPrecicomp(double precicomp) {
		this.precicomp = precicomp;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "TblProducto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", stock="
				+ stock + ", precicomp=" + precicomp + ", estado=" + estado + ", descripcion=" + descripcion + "]";
	}

   
	
	
    
    
}

