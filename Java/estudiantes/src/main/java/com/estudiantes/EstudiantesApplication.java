package com.estudiantes;

import com.estudiantes.model.Estudiante;
import com.estudiantes.service.EstudienteServiceImpl;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner{

	@Autowired
	private EstudienteServiceImpl estudianteService;

	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion");
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicacion Finalizada");

	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Ejecutando metodo run de spring" );
		List<Estudiante> listaEstudiante = estudianteService.listarEstudiantes();

		listaEstudiante.forEach((estudiante -> logger.info( estudiante.toString())));

		var idEstudiante = 1;
		Estudiante estudiante = estudianteService.buscarEstudiante(idEstudiante);

		if(estudiante != null){
			logger.info("Estudiante encontrado: " + estudiante + nl);
		}

		Estudiante gua = new Estudiante();
		gua.setNombre("Prueba1");
		gua.setApellido("otro");
		gua.setTelefono("988888888");
		gua.setEmail("prueba@gmail.com");
		estudianteService.guardarEstudiante(gua);


	}
}
