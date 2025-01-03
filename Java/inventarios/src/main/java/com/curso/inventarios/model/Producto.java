package com.curso.inventarios.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCTO_SEQ")
    @SequenceGenerator(sequenceName = "PRODUCTO_SEQ", allocationSize = 1, name = "PRODUCTO_SEQ")
    private Integer idProducto;
    private String descripcion;
    private Double precio;
    private Integer existencia;
}
