package com.curso.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.entidades.Pelicula;

public interface DaoPelicula extends JpaRepository<Pelicula, Integer>{

}
