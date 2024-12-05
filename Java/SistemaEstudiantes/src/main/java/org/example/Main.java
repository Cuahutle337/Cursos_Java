package org.example;

import com.udemy.curso.dao.EstudianteDao;
import com.udemy.curso.db.Conexion;
import com.udemy.curso.dominio.Estudiante;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Conexion conexion = new Conexion();

       // Connection connection = conexion.crearConexion();

        EstudianteDao dao = new EstudianteDao();
         var estudiante =  dao.listarEstudiantes();

         estudiante.forEach(System.out::println);

         Estudiante est = new Estudiante(1);
         var existe = dao.findById(est);
        System.out.println("Existe Estudiante: " +existe);

    }
}