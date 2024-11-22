package com.udemy.curso.model;

public class Monitor{

    private final int idMonitor;
    private String marca;
    private Double tamanioMonitor;
    private static int contadorMonutores;

    private Monitor() {
        this.idMonitor = ++contadorMonutores;

    }

    public Monitor( String marca, Double tamanioMonitor) {
        this();
        this.marca = marca;
        this.tamanioMonitor = tamanioMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamanioMonitor=" + tamanioMonitor +
                '}';
    }
}
