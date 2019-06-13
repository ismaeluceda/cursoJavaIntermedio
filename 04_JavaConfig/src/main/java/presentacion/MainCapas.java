package presentacion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import cfg.ConfiguracionSpring;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;

public class MainCapas {
	
	public static ApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);
	public static void main(String[] args) {
		
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		p.setTitulo("La guerra de las galaxias");
		p.getDirector().setNombre("George Lucas");
		p.setGenero("sci-fi");
		p.setYear(1979);
		
		GestorPelicula gestor = context.getBean("gestor",GestorPelicula.class);
		gestor.insertar(p);
		System.out.println(gestor.listar());
	}
}
