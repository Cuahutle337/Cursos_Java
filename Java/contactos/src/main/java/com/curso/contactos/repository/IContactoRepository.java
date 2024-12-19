package com.curso.contactos.repository;

import com.curso.contactos.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactoRepository extends JpaRepository<Contacto,Integer>{
}
