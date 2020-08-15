package com.ibformation.cinema.dao;

import org.springframework.data.repository.CrudRepository;

import com.ibformation.cinema.bo.Film;

public interface FilmDAO extends CrudRepository<Film, Integer>{

	
}
