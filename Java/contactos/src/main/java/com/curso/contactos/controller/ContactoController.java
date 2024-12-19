package com.curso.contactos.controller;

import com.curso.contactos.model.Contacto;
import com.curso.contactos.service.ContactoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ContactoController {

    public static Logger logger = LoggerFactory.getLogger(ContactoController.class);

    @Autowired
    private ContactoService contactoService;

    @GetMapping(value = "/ ")
    public String iniciar(ModelMap modelo){

        List<Contacto> listaContactos =  contactoService.findAll();
        modelo.put("contactos",listaContactos);
        return "index";

    }

    @GetMapping("/agregar")
    public String mostrarAgregar(){
        return "agregar";
    }

    @PostMapping(value = "/agregar")
    public String agregarCpontacto(@ModelAttribute("contactoForma") Contacto contacto){

        contactoService.saveContacto(contacto);

        return "redirect:/";

    }

    @GetMapping("/editar/{id}")
    public String mostrarEditar(@PathVariable(value = "id") int idContacto, ModelMap model){

        Contacto contacto = contactoService.findById(idContacto);
        model.put("contacto",contacto);

        return "editar";
    }

    @PostMapping(value = "/editar")
    public String editarContacto(@ModelAttribute("contacto") Contacto contacto){

        contactoService.saveContacto(contacto);

        return "redirect:/";
    }

    @GetMapping(value = "/eliminar/{id}")
    public String eliminarContacto(@PathVariable(value = "id") int idContacto){

        Contacto contacto = new Contacto();
        contacto.setIdContacto(idContacto);
        contactoService.eliminarContacto(contacto);
        return "redirect:/";

    }
}
