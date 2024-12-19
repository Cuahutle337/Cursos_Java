package com.curso.contactos.model;

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
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeqContact")
    @SequenceGenerator(name = "mySeqContact", sequenceName = "CONTACTO_SEQ", allocationSize = 1)
    private Integer idContacto;
    private String nombre;
    private String celular;
    private String email;
}
