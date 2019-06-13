package modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import modelo.entidades.Pelicula;

@Repository
public class DaoPeliculaArray implements DaoPelicula {

	private List<Pelicula> listaPelicula = new ArrayList<>();

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
