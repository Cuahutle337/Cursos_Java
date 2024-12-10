package com.estudiantes.service;

import com.estudiantes.EstudiantesApplication;
import com.estudiantes.model.Estudiante;

import java.util.List;

public interface IEstudianteService {

    public List<Estudiante> listarEstudiantes();

    public Estudiante buscarEstudiante(Integer idEstudiante);

    public void guardarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Estudiante estudiante);



}
