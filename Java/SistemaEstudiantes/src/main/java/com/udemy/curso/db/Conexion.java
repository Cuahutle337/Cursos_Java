package com.udemy.curso.db;

import java.sql.*;

import java.sql.Connection;
import javax.sql.PooledConnection;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.driver.OracleDriver;
import oracle.jdbc.replay.OracleDataSourceFactory;
import oracle.jdbc.replay.OracleDataSource;
import oracle.jdbc.replay.OracleConnectionPoolDataSource;

public class Conexion {

   public static Connection getConexion(){

       Connection conexion = null;
       try
       {
           //Se carga el driver JDBC
           DriverManager.registerDriver( new OracleDriver() );

           //nombre del servidor
          // String nombre_servidor = "127.0.0.1";
           //numero del puerto
           String numero_puerto = "1522";
           //SID
           //String sid = "xe";
           //URL "jdbc:oracle:thin:@nombreServidor:numeroPuerto:SID"
           String url = "jdbc:oracle:thin:@practicas_high?TNS_ADMIN=/Users/Efrain/Documents/Cursos/Java/Wallet_Practicas";


           //Nombre usuario y password
           String usuario = "ADMIN";
           String password = "20Et@ni@e1989";

           //Obtiene la conexion
            conexion = DriverManager.getConnection( url, usuario, password );

           //Para realiza una consulta
          // Statement sentencia = conexion.createStatement();
          // ResultSet resultado = sentencia.executeQuery( "SELECT * FROM estudiante" );

           //Se recorre el resultado obtenido
           //while ( resultado.next() )
           //{
               //Se imprime el resultado colocando
               //Para obtener la primer columna se coloca el numero 1 y para la segunda columna 2 el numero 2
            //  System.out.println ( resultado.getInt( 1 ) + "\t" + resultado.getString( 2 ) );
           //}

           //Cerramos la sentencia
          // sentencia.close();
       }catch( Exception e ){
           e.printStackTrace();
       }
       return conexion;
   }


}
