package com.curso.contactos.service;

import com.curso.contactos.model.Contacto;

import java.util.List;

public interface IContactoService {

<<<<<<< HEAD
    public List<Contacto> finAll();

    public Contacto FindById(Integer idEmpleado);
=======
    public List<Contacto> findAll();

    public Contacto findById(Integer idContacto);
>>>>>>> f5505c065684277173a1695232ee856291a75baa

    public void saveContacto(Contacto contacto);

    public void eliminarContacto(Contacto contacto);
<<<<<<< HEAD

=======
>>>>>>> f5505c065684277173a1695232ee856291a75baa
}
