package com.ibformation.cinema2.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibformation.cinema2.bo.Cinema;
import com.ibformation.cinema2.bo.Film;
import com.ibformation.cinema2.bo.Salle;
@Repository
public interface CinemaDao extends CrudRepository<Cinema, Integer> {

	public List<Cinema> findBySallesContaining(Salle salle);
	
	public List<Cinema> findBySalles_Seances_film(Film film);
}
