package com.rh.model;

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
public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLEADORH_SEQ")
    @SequenceGenerator(sequenceName = "EMPLEADORH_SEQ", allocationSize = 1, name = "EMPLEADORH_SEQ")
    private Integer idEmpleado;
    private String nombre;
    private Double sueldo;
    private String departamento;



}
