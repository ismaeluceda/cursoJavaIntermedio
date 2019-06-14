package main;

import javax.security.auth.login.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import cfg.Configuracion;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;

public class Main {

	public static ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
	
	public static void main(String[] args) {
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		p.setTitulo("La guerra de las galaxias");
		p.setDirector("George Lucas");
		p.setGenero("sci-fi");
		p.setYear(1979);
		
		GestorPelicula gestor = context.getBean("gestorPelicula",GestorPelicula.class);
		int id = gestor.insertar(p);
		System.out.println("id creado: " + id);
		System.out.println(gestor.listar());
		
		p.setTitulo("El imperio contrapaca");
		gestor.modificar(p);
		System.out.println(gestor.listar());
		
		//Pelicula p2 = new Pelicula();
		//p2.setId(1);
		Pelicula p2 = gestor.buscar(1);
		p2.setTitulo("El retorno del jedi");
		gestor.modificar(p2);
		System.out.println(gestor.listar());
		
		
	}

}
