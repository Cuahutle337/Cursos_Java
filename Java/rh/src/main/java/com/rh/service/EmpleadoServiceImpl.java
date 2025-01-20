package com.rh.service;

import com.rh.model.Empleados;
import com.rh.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleados save(Empleados empleado) {

        return this.empleadoRepository.save(empleado);

    }

    @Override
    public List<Empleados> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleados findById(Integer id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Empleados empleado) {

        empleadoRepository.delete(empleado);

    }
}
