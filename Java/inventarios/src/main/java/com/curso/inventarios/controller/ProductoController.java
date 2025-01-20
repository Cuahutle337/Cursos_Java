package com.curso.inventarios.controller;

import com.curso.inventarios.excepcion.RecursoException;
import com.curso.inventarios.model.Producto;
import com.curso.inventarios.service.ProductoServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("inventario-app")
@CrossOrigin("http://localhost:4200")
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
    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto){

        logger.info("Producto a agregar:" + producto.toString());
        return this.productoService.save(producto);

    }

    @GetMapping("/productos/{id}")
    public ResponseEntity<Producto> obtenerProductoById(@PathVariable int id){

        Producto producto = this.productoService.findById(id);

        if(producto != null)
        return ResponseEntity.ok(producto);
        else
            throw  new RecursoException("No se encontro informacion del producto solicitado");
    }

    @PutMapping("/productos/{id}")
    public ResponseEntity<Producto>editarProducto(@PathVariable int id,@RequestBody Producto productoActualizado){

        Producto producto = this.productoService.findById(id);
        producto.setDescripcion(productoActualizado.getDescripcion());
        producto.setExistencia(productoActualizado.getExistencia());
        producto.setPrecio(productoActualizado.getPrecio());
        this.productoService.save(producto);

        return ResponseEntity.ok(producto);
    }

    @DeleteMapping("/productos/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteProducto(@PathVariable int id){

        Map<String,Boolean> respuesta = new HashMap<>();
        Producto producto = this.productoService.findById(id);
        if(producto != null){

            this.productoService.delete(producto);
            respuesta.put("Eliminado",Boolean.TRUE);
        }else{
            respuesta.put("Eliminado",Boolean.FALSE);
            throw new RecursoException("El producto a eliminar no existe");
        }

        return ResponseEntity.ok(respuesta);

    }
}
