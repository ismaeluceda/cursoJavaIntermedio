package com.curso.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.modelo.persistencia.DaoPelicula;

//@Controller
//@ResponseBody
@RestController  //esta anotacion es la suma de las otras dos
public class ControladorPeliculas {
	
	//
	@Autowired
	private DaoPelicula daoPelicula;

}
