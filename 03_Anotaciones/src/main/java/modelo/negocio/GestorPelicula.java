package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidades.Pelicula;
import modelo.persistencia.DaoPelicula;

@Service
public class GestorPelicula {
	
	@Autowired
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



}

