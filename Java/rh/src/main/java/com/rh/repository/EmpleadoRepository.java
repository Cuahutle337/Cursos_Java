package com.rh.repository;

import com.rh.model.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleados,Integer> {
}
