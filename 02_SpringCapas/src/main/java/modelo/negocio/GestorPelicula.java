package modelo.negocio;

import java.util.List;

import modelo.entidades.Pelicula;
import modelo.persistencia.DaoPelicula;

public class GestorPelicula {
	
	private DaoPelicula daoPelicula;
	
	public boolean insertar(Pelicula p) {
		if("".equals(p.getTitulo())) {
			return false;
		}
		daoPelicula.insertar(p);
		return true;
	}
	
	public List<Pelicula> listar(){
		return daoPelicula.listar();
	}

	public DaoPelicula getDaoPelicula() {
		return daoPelicula;
	}

	public void setDaoPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}

}

