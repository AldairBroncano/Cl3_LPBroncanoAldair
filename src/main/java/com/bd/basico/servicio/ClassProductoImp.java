package com.bd.basico.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.basico.modelo.TblProducto;
import com.bd.basico.repositorio.IProductoRepositorio;

@Service
public class ClassProductoImp implements IProductoServicio {
	
	@Autowired
	private IProductoRepositorio iproductorepository;

	@Override
	public List<TblProducto> ListadoProductos() {
		return (List<TblProducto>) iproductorepository.findAll();
	}

	@Override
	public void RegistrarProducto(TblProducto producto) {
		iproductorepository.save(producto);
	}

	@Override
	public TblProducto BuscarporId(Integer id) {
		return iproductorepository.findById(id).orElse(null);
	}

	@Override
	public void Eliminar(Integer id) {
		iproductorepository.deleteById(id);
	}
}
