package com.empleados.service;

import com.empleados.model.Empleado;

import java.util.List;

public interface IEmpleadoService {

    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoById(Integer idEmpleado);

    public void guardarEmpleado (Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);

}
