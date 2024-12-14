package com.empleados.controller;

import com.empleados.model.Empleado;
import com.empleados.service.EmpleadoServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private EmpleadoServiceImpl empleadoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String inicial(ModelMap model){

        List<Empleado> empleados = empleadoService.listarEmpleados();

        empleados.forEach((empleado)-> logger.info(empleado.toString()));

        //compartimos el modelo con la vista
        model.put("empleados", empleados);
        return "index";
    }
    
    
    @RequestMapping(value = "/agregar", method = RequestMethod.GET)
    public String mostrarAgregar() {
    	return "agregar";
    }
    
    @RequestMapping(value ="/agregar", method = RequestMethod.POST )
    public String agregar(@ModelAttribute("empleadoForma") Empleado empleado, HttpServletRequest request) {
    	
    	logger.info("empleado a agregar" + empleado.toString());
    	empleadoService.guardarEmpleado(empleado);
    	return "redirect:/"; // refirige al path inicial
    	
    }
    
    @RequestMapping(value = "/editar", method = RequestMethod.GET)
    public String mostrarEditar(@RequestParam int idEmpleado, ModelMap modelo) {
    	
    	Empleado empleado = empleadoService.buscarEmpleadoById(idEmpleado);
    	logger.info("Empleado a Editar:" + idEmpleado);
    	
    	modelo.put("empleado", empleado);
    	return "editar";
    	
    }

    @RequestMapping(value = "/editar",method = RequestMethod.POST)
    public String editarEmpleado(@ModelAttribute ("empleadoForma") Empleado empleado, HttpServletRequest request){

        logger.info("Editando empleado");
        empleadoService.guardarEmpleado(empleado);

        return "redirect:/";
    }
    
//    @RequestMapping(value = "/eliminar", method = RequestMethod.GET)
//    public String eliminar(@RequestParam int idEmpleado, ModelMap modelo) {
//
//    	logger.info("Empleado a Eliminar" +  idEmpleado);
//    	Empleado empleado = empleadoService.buscarEmpleadoById(idEmpleado);
//    	modelo.put("empleado", empleado);
//    	return "eliminar";
//
//    }
    
//    @RequestMapping(value = ("/eliminar"),method = RequestMethod.POST)
//    public String eliminarEmpleado(@ModelAttribute("empleadoForma") Empleado empleado, HttpServletRequest request) {
@RequestMapping(value = ("/eliminar"),method = RequestMethod.GET)
public String eliminarEmpleado(@RequestParam int idEmpleado) {

        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(idEmpleado);
    logger.info("Eliminando Empleado" + empleado.toString());
    	empleadoService.eliminarEmpleado(empleado);
    	
    	return "redirect:/";
    }
    
}
