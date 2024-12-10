package com.estudiantes.service;

import com.estudiantes.model.Estudiante;
import com.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudienteServiceImpl implements IEstudianteService{

    @Autowired
    private EstudianteRepository repository;

    @Override
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> listaEstudiantes = repository.findAll();
        return listaEstudiantes;
    }

    @Override
    public Estudiante buscarEstudiante(Integer idEstudiante) {
        Estudiante estudiante = repository.findById(idEstudiante).orElse(null);
        return estudiante;
    }


    @Override
    public void guardarEstudiante(Estudiante estudiante) {

        repository.save(estudiante);

    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {

        repository.delete(estudiante);

    }
}
