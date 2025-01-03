package com.curso.inventarios.repository;

import com.curso.inventarios.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRespository extends JpaRepository<Producto,Integer> {
}
