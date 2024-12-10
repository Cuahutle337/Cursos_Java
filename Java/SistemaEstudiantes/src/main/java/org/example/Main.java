package org.example;

import com.udemy.curso.dao.EstudianteDao;
import com.udemy.curso.db.Conexion;
import com.udemy.curso.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

       // Conexion conexion = new Conexion();

       // Connection connection = conexion.crearConexion();

        EstudianteDao dao = new EstudianteDao();
         var estudiante =  dao.listarEstudiantes();

         estudiante.forEach(System.out::println);

         Estudiante est = new Estudiante(1);
         var existe = dao.findById(est);
        System.out.println("Existe Estudiante: " +existe);

        Estudiante nuevo = new Estudiante();
        nuevo.setNombre("Emmi2");
        nuevo.setApellido("Cuahutle Garcia");
        nuevo.setEmail("bodoquito@gmail.com");
        nuevo.setTelefono("8111307629");
        var agrego = dao.nuevoEstudiante(nuevo);

        if(agrego) {
            System.out.println("estudiante agregado");

        }else
            System.out.println("no se agrego el estudiante:" + nuevo);

        estudiante = dao.listarEstudiantes();
        System.out.println("Estudiantes existentes: " + estudiante);

        Estudiante mod = new Estudiante();
        mod.setIdEstudiante(1);
        mod.setNombre("Pachon");
        mod.setApellido("pachoncito");
        mod.setTelefono("8112660231");
        mod.setEmail("pachoncito@gmail.com");
        var modifica = dao.modificaEstudiante(mod);

        if(modifica){
            System.out.println("se modifico correctamente");
            var estudian = dao.listarEstudiantes();
            System.out.println("Estudiantes existentes: " + estudian);
        }else{
            System.out.println("no se modifico el estudiante");
        }

    }




}