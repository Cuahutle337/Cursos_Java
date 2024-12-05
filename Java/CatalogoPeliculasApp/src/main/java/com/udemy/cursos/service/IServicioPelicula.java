package com.udemy.cursos.service;

import com.udemy.cursos.dominio.Pelicula;

import java.util.List;

public interface IServicioPelicula {

    public List<Pelicula> listaPeliculas();

    public void agregarPelicula(Pelicula pelicula);

    public List<Pelicula> buscarPelicula(Pelicula pelicula);

}
