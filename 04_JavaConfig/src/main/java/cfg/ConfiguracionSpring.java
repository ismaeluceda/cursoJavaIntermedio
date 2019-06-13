package cfg;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import modelo.entidades.Director;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.DaoPelicula;
import modelo.persistencia.DaoPeliculaArray;

//Esta clase va a llevar toda la configuracion de spring
//Podemos dar de alta aqui los objetos o podemos decir que busque anotaciones spring en la aplicacion
//Es decir, esta clase busca sustituir el xml

public class ConfiguracionSpring {

	//por defecto el id del bean es el nombre del metodo
	@Bean("directorBean")//aunque se puede dar un id especifico
	@Scope("prototype")
	public Director director() { 
		Director director = new Director();
		director.setEdad(18);
		return director;
	}
	
	@Bean
	@Scope("prototype")
	//por defecto Spring intenta pasar un objeto de tipo Director (autowire)
	//si hay mas de uno da error, pero se puede usar la etiqueta @qualifier
	public Pelicula pelicula(@Qualifier("directorBean") Director director) {
		Pelicula p = new Pelicula();
		p.setDirector(director);
		p.setTitulo("");
		return p;
	}
	
	@Bean
	public DaoPelicula daoPelicula() {
		DaoPeliculaArray dao = new DaoPeliculaArray();
		dao.setListaPelicula(new ArrayList<>());
		return dao;
	}
	
	@Bean
	public GestorPelicula gestor(DaoPelicula daoPelicula) {
		GestorPelicula gestor = new GestorPelicula();
		gestor.setDaoPelicula(daoPelicula);
		return gestor;
	}
	
	
}
