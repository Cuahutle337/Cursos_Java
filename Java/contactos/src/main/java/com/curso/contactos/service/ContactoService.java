package com.curso.contactos.service;

import com.curso.contactos.model.Contacto;
import com.curso.contactos.repository.IContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactoService implements IContactoService{

    @Autowired
    private IContactoRepository contactoRepository;

    @Override
    public List<Contacto> finAll() {
        return contactoRepository.findAll();
    }

    @Override
    public Contacto FindById(Integer idContacto) {
        return contactoRepository.findById(idContacto).orElse(null);
    }

    @Override
    public void saveContacto(Contacto contacto) {
        contactoRepository.save(contacto);
    }

    @Override
    public void eliminarContacto(Contacto contacto) {

        contactoRepository.delete(contacto);

    }
}
