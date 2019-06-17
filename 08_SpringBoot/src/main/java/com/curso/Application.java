package com.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.curso.entidades.Pelicula;
import com.curso.modelo.persistencia.DaoPelicula;

/*
 * Esta anotacion engloba 3 anotaciones spring
 * @Configuration, decimos que en esta clase puede haber metodos anotados con @Bean
 * @ComponentScan, automaticamente un proyecto springboot va a buscar anotaciones spring dentro de este paquete y subpaquetes
 * @EnableAutoConfiguration, decimos a spring que queremos arrancar la aplciacion anadiendo al contexto spring todos los beans que crea oportunos para que nuestra aplicacion funcione, 
 * y que esten tambien las clases en nuestro classpath
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		DaoPelicula daoPelicula = context.getBean("daoPelicula",DaoPelicula.class);
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		
		p.setDirector("Bruce Willis");
		p.setTitulo("La jungla de cristal2");
		p.setGenero("X");
		p.setYear(1999);
		
		daoPelicula.save(p);
		
		System.out.println(daoPelicula.findAll());
		
		
	}

}
