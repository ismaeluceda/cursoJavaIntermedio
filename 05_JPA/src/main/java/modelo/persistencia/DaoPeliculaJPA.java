package modelo.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import modelo.entidades.Pelicula;

@Repository
public class DaoPeliculaJPA implements DaoPelicula{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public int insertar(Pelicula p) {
		em.persist(p); //persist da de alta el objeto en la bbdd y actualiza la cache (el id generado)
		return p.getId();
	}

	@Override
	public Pelicula modificar(Pelicula p) {
		Pelicula p2 = em.merge(p); //merge se encarga de sincronizar la bbdd con el objeto
		return p2;
	}

	@Override
	public Pelicula buscar(int id) {
		Pelicula p = em.find(Pelicula.class, id);
		return p;
	}

	@Override
	public int borrar(int id) {
		//con hibernate puro podemos borrar directamente el objeto pasado
		//pero JPA solo trabaja con objetos que esten dentro del contexto JPA
		//por lo que primero tenemos que meter el objeto que queremos borrar en la cache
		
		Pelicula p = buscar(id);
		em.remove(p);
		return p.getId();
	}

	@SuppressWarnings(value = { "unchecked" })
	@Override
	public List<Pelicula> listar() {
		//para buscar una lista tenemos que utilizar el lenguaje JPQL
		//es una mezcla de POO y SQL
		return em.createQuery("select p from Pelicula p").getResultList();
	}

}
