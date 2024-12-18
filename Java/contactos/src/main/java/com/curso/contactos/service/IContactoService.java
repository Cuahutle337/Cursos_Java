package com.curso.contactos.service;

import com.curso.contactos.model.Contacto;

import java.util.List;

public interface IContactoService {

    public List<Contacto> findAll();

    public Contacto findById(Integer idContacto);

    public void saveContacto(Contacto contacto);

    public void eliminarContacto(Contacto contacto);
}
