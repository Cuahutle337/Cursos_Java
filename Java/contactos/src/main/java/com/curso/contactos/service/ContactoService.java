package com.curso.contactos.service;

import com.curso.contactos.model.Contacto;
<<<<<<< HEAD
import com.curso.contactos.repository.IContactoRepository;
=======
import com.curso.contactos.repository.IContacto;
>>>>>>> f5505c065684277173a1695232ee856291a75baa
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> f5505c065684277173a1695232ee856291a75baa
@Service
public class ContactoService implements IContactoService{

    @Autowired
<<<<<<< HEAD
    private IContactoRepository contactoRepository;

    @Override
    public List<Contacto> finAll() {
        return contactoRepository.findAll();
    }

    @Override
    public Contacto FindById(Integer idContacto) {
        return contactoRepository.findById(idContacto).orElse(null);
=======
    private IContacto contactoRepo;

    @Override
    public List<Contacto> findAll() {
        return contactoRepo.findAll();
    }

    @Override
    public Contacto findById(Integer idContacto) {
        return contactoRepo.findById(idContacto).orElse(null);
>>>>>>> f5505c065684277173a1695232ee856291a75baa
    }

    @Override
    public void saveContacto(Contacto contacto) {
<<<<<<< HEAD
        contactoRepository.save(contacto);
=======

        contactoRepo.save(contacto);

>>>>>>> f5505c065684277173a1695232ee856291a75baa
    }

    @Override
    public void eliminarContacto(Contacto contacto) {

<<<<<<< HEAD
        contactoRepository.delete(contacto);
=======
        contactoRepo.delete(contacto);
>>>>>>> f5505c065684277173a1695232ee856291a75baa

    }
}
