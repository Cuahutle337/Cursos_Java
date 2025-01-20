package com.rh.controller;

import com.rh.model.Empleados;
import com.rh.service.EmpleadoService;
import com.rh.service.EmpleadoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rh-app")
@CrossOrigin(value = "http://localhost:3000")
public class EmpleadoController {

    private static final Logger logger = LoggerFactory.getLogger(EmpleadoController.class);

    @Autowired
    private EmpleadoService empleadoService;

    //endpoint para obtener todos los empleado
    @GetMapping("/empleados")
    public List<Empleados> getEmpleados(){

        logger.info("se obtienen todos los empleados");
        var ltEmpleados = this.empleadoService.findAll();
        ltEmpleados.forEach(empleado -> logger.info(ltEmpleados.toString()));

        return ltEmpleados;

    }

    @PostMapping("/empleados")
    public Empleados guardarEmpleado(@RequestBody Empleados empleado){

        return this.empleadoService.save(empleado);

    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<Empleados>getEmpleadoById(@PathVariable int id){

        Empleados empleado = this.empleadoService.findById(id);

        return ResponseEntity.ok(empleado);

    }

    @DeleteMapping("empleado/{id}")
    public ResponseEntity<Map<String,Boolean>>delete(@PathVariable int id){

        Map<String,Boolean> respuesta = new HashMap<>();
        Empleados empleado = this.empleadoService.findById(id);
        if (empleado != null){
            this.empleadoService.delete(empleado);
            respuesta.put("respuesta", Boolean.TRUE);
        }else{
            respuesta.put("respuesta", Boolean.FALSE);
        }
        return ResponseEntity.ok(respuesta);

    }

    @PutMapping ("/empleado")
    public Empleados actualizaEmpleado(@PathVariable int id, @RequestBody Empleados empleadoAc){

        Empleados empleado = this.empleadoService.findById(id);
        if (empleado != null){
            empleado.setDepartamento(empleadoAc.getDepartamento());
            empleado.setNombre(empleadoAc.getNombre());
            empleado.setSueldo(empleadoAc.getSueldo());
            this.empleadoService.save(empleado);

        }
        return this.empleadoService.save(empleado);

    }


}
