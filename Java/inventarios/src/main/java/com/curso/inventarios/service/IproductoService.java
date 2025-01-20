package com.curso.inventarios.service;

import com.curso.inventarios.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IproductoService {

    public List<Producto> findAll();

    public Producto findById(Integer idProducto);

    public void delete(Producto producto);

    public Producto save(Producto producto);
}
