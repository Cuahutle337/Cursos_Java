package com.curso.entity;

public class Persona {

    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    public Persona(String nombre, String tel, String email) {
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
}
