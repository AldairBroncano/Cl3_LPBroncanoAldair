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
	//Esto permite acceder a los métodos de CrudRepository sin necesidad de crear manualmente una instancia del repositorio.

	@Override
	public List<TblProducto> ListadoProductos() {
		return (List<TblProducto>) iproductorepository.findAll();
		//que recupera todos los productos de la base de datos y los devuelve como una lista.
	}

	@Override
	public void RegistrarProducto(TblProducto producto) {
		iproductorepository.save(producto);
		//Guarda el producto pasado como parámetro en la base de datos utilizando el método save() del repositorio.
	}

	@Override
	public TblProducto BuscarporId(Integer id) {
		return iproductorepository.findById(id).orElse(null);
		//Este método busca un producto en la base de datos usando su ID. Utiliza 
		//findById(id), que devuelve un Optional. Si el producto no se encuentra, 
		//devuelve null gracias al método orElse(null).
	}

	@Override
	public void Eliminar(Integer id) {
		iproductorepository.deleteById(id);
		//Implementa el método Eliminar, que elimina un producto de la base de datos
		//usando su ID con el método deleteById(id).
	}
}
