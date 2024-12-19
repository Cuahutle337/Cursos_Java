package com.curso.contactos.service;

import com.curso.contactos.model.Contacto;

import java.util.List;

public interface IContactoService {

    public List<Contacto> finAll();

    public Contacto FindById(Integer idEmpleado);

    public void saveContacto(Contacto contacto);

    public void eliminarContacto(Contacto contacto);

}
