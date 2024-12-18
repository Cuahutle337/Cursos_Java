package com.curso.contactos.repository;

import com.curso.contactos.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContacto extends JpaRepository<Contacto,Integer>{
}
