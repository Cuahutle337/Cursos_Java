package com.udemy.curso.dao;

import com.udemy.curso.db.Conexion;
import com.udemy.curso.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.udemy.curso.db.Conexion.getConexion;

public class EstudianteDao {

    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;

        Connection con = getConexion();

        String sql = "select * from estudiante order by id_estudiante";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("id_estudiante"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                estudiantes.add(estudiante);

            }

        } catch (SQLException sqleX) {

        } finally {
            try {
                con.close();
            } catch (Exception ex) {
                System.out.println("Ocurrio un error al cerrar la conexion");


            }
        }

        return estudiantes;
    }

    public Boolean findById(Estudiante estudiante){
        Boolean existeEstudiante = false;
        PreparedStatement ps = null;
        ResultSet rs;

        Connection con = getConexion();
        
        try{

            String sql = "select * from estudiante where id_estudiante = ?";

            ps = con.prepareStatement(sql);
            ps.setInt(1,estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }

        }catch (SQLException ex){

            System.out.println("Ocurrio un error al buscar el estudiante");
            return false;
        }finally {
            try{
                con.close();
            }catch (Exception ex){
                System.out.println("Ocurrio un error al cerrar la conexion");
            }
        }
    return false;
    }
}
