package com.curso.contactos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
<<<<<<< HEAD
@Data
@AllArgsConstructor
@NoArgsConstructor
=======
@AllArgsConstructor
@NoArgsConstructor
@Data
>>>>>>> f5505c065684277173a1695232ee856291a75baa
@ToString
public class Contacto {

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeqContact")
    @SequenceGenerator(name = "mySeqContact", sequenceName = "CONTACTO_SEQ", allocationSize = 1)
    private Integer idContacto;
=======
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "contacto_seq", allocationSize = 1, name = "CUST_SEQ")
    private int idContacto;
>>>>>>> f5505c065684277173a1695232ee856291a75baa
    private String nombre;
    private String celular;
    private String email;
}
