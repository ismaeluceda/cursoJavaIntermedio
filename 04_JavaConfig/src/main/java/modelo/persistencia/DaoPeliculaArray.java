package modelo.persistencia;

import java.util.List;

import modelo.entidades.Pelicula;

public class DaoPeliculaArray implements DaoPelicula {

	private List<Pelicula> listaPelicula;

	@Override
	public boolean insertar(Pelicula p) {
		// TODO Auto-generated method stub
		return listaPelicula.add(p);
	}

	@Override
	public List<Pelicula> listar() {
		// TODO Auto-generated method stub
		return listaPelicula;
	}

	public List<Pelicula> getListaPelicula() {
		return listaPelicula;
	}

	public void setListaPelicula(List<Pelicula> listaPelicula) {
		this.listaPelicula = listaPelicula;
	}
	
	
	
}
