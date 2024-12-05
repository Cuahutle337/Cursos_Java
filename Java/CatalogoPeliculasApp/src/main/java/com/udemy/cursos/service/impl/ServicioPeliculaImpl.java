package com.udemy.cursos.service.impl;

import com.udemy.cursos.dominio.Pelicula;
import com.udemy.cursos.service.IServicioPelicula;

import java.util.List;

public class ServicioPeliculaImpl implements IServicioPelicula {

    private final List<Pelicula> peliculas = List.of();
    @Override
    public List<Pelicula> listaPeliculas() {
        return List.of();
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {

    }

    @Override
    public List<Pelicula> buscarPelicula(Pelicula pelicula) {
        return List.of();
    }
}
