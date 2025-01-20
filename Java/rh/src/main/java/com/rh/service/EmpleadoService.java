package com.rh.service;

import com.rh.model.Empleados;

import java.util.List;

public interface EmpleadoService {

    public Empleados save(Empleados empleado);

    List<Empleados> findAll();

    Empleados findById(Integer id);

    public void delete(Empleados empleado);
}
