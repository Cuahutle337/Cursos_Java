package com.curso.banco.cuentas.model;

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
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOUNT_SEQ")
    @SequenceGenerator(sequenceName = "ACCOUNT_SEQ", allocationSize = 1, name = "ACCOUNT_SEQ")
    private Integer idCuenta;
    private String nombre;
    private String tipoCuenta;
    private Double saldo;
}
