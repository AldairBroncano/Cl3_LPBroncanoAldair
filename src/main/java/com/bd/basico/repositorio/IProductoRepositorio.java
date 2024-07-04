package com.bd.basico.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.bd.basico.modelo.TblProducto;

public interface IProductoRepositorio extends CrudRepository<TblProducto, Integer> {

}
