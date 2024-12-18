package com.curso.contactos.service;

import com.curso.contactos.model.Contacto;
import com.curso.contactos.repository.IContacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService implements IContactoService{

    @Autowired
    private IContacto contactoRepo;

    @Override
    public List<Contacto> findAll() {
        return contactoRepo.findAll();
    }

    @Override
    public Contacto findById(Integer idContacto) {
        return contactoRepo.findById(idContacto).orElse(null);
    }

    @Override
    public void saveContacto(Contacto contacto) {

        contactoRepo.save(contacto);

    }

    @Override
    public void eliminarContacto(Contacto contacto) {

        contactoRepo.delete(contacto);

    }
}
