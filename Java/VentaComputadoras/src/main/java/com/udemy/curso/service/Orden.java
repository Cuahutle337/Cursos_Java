package com.udemy.curso.service;

import com.udemy.curso.model.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {

    private final int idOrden;
    private final List<Computadora> computadoras;
    private static int contadorOrden;

    public Orden(){
        computadoras = new ArrayList<Computadora>();
        this.idOrden = ++contadorOrden;
    }

    public void agregarComputadore(Computadora computadora){
        computadoras.add(computadora);
    }

    public void mostrarOrden(){
        System.out.println("Orden #" + idOrden);
        System.out.println("Total Computadoras: " + computadoras.size());
        System.out.println();
        computadoras.forEach(System.out::println);
    }
}
