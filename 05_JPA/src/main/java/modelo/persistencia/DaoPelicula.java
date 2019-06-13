package modelo.persistencia;

import java.util.List;

import modelo.entidades.Pelicula;

public interface DaoPelicula {

		/**
		 * Metodo que persiste una pelicula
		 * @param p La pelicula que vamos a persistir
		 * @return el id de la pelicula que hemos dado de alta
		 */
		public int insertar(Pelicula p);
		
		/**
		 * Metodo que persiste una pelicula
		 * @param p La pelicula que queremos modificar
		 * @return la pelicula modificada
		 */
		public Pelicula modificar(Pelicula p);

		public Pelicula buscar(int id);
		public int borrar(int id);
		public List<Pelicula> listar();

}
