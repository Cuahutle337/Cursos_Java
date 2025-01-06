package com.curso.inventarios.controller;

import com.curso.inventarios.model.Producto;
import com.curso.inventarios.service.ProductoServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("inventario-app")
@CrossOrigin("http:localhost:4200")
public class ProductoController {

    private static final Logger logger = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoServiceImp productoService;

    @GetMapping("/productos")
    public List<Producto> getProductos(){

        List<Producto>productos = this.productoService.findAll();
        logger.info("Productos Obtenidos");
        productos.forEach((producto ->logger.info(producto.toString())));
        return productos;

    }
}
