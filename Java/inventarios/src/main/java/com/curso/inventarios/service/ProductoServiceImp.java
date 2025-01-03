package com.curso.inventarios.service;

import com.curso.inventarios.model.Producto;
import com.curso.inventarios.repository.ProductoRespository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductoServiceImp implements IproductoService{

    @Autowired
    private ProductoRespository productoRepo;

    @Override
    public List<Producto> findAll() {
        return productoRepo.findAll();
    }

    @Override
    public Producto findById(Integer idProducto) {
        return productoRepo.findById(idProducto).orElse(null);
    }

    @Override
    public void delete(Producto producto) {
        productoRepo.delete(producto);

    }

    @Override
    public void save(Producto producto) {

        productoRepo.save(producto);

    }
}