package com.ibformation.dao;

import org.springframework.data.repository.CrudRepository;

import com.ibformation.bo.Film;

public interface FilmDAO extends CrudRepository<Film, Integer>{

	
}
