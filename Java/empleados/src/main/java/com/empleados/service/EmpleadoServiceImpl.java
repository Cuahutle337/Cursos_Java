package com.empleados.service;

import com.empleados.model.Empleado;
import com.empleados.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

    @Autowired
    private IEmpleadoRepository repository;

    @Override
    public List<Empleado> listarEmpleados() {
        return repository.findAll();
    }

    @Override
    public Empleado buscarEmpleadoById(Integer idEmpleado) {
        Empleado empl = repository.findById(idEmpleado).orElse(null);
        return  empl;
    }

    @Override
    public void guardarEmpleado(Empleado empleado) {

        repository.save(empleado);

    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {

        repository.delete(empleado) ;

    }
}
