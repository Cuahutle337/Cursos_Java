package com.curso.contactos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IContacto extends JpaRepository(Contacto,Integer){
}
