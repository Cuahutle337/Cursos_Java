package com.empleados.repository;

import com.empleados.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmpleadoRepository extends JpaRepository<Empleado,Integer> {



}
