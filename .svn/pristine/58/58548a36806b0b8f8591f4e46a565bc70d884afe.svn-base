package com.ibformation.cinema2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibformation.cinema2.bo.Cinema;
import com.ibformation.cinema2.bo.Film;
import com.ibformation.cinema2.bo.Salle;
import com.ibformation.cinema2.dao.CinemaDao;

@Service
public class CinemaServiceImp implements CinemaService {
	@Autowired
	private CinemaDao cinemaDao;

	@Override
	public Optional<Cinema> findById(Integer id) {
		return cinemaDao.findById(id);
	}

	@Override
	public List<Cinema> findAll() {
		return (List<Cinema>) cinemaDao.findAll();
	}

	@Override
	public Cinema createOrUpdate(Cinema cinema) {
		return cinemaDao.save(cinema);
	}

	@Override
	public void deleteById(Integer id) {
		cinemaDao.deleteById(id);
	}

	@Override
	public List<Cinema> findBySalleId(int salleId) {

		return cinemaDao.findBySallesContaining(new Salle(salleId));
	}

	@Override
	public List<Cinema> findByCinemaId(int cinemaId) {
		return cinemaDao.findBySalles_Seances_film(new Film(cinemaId));
	}
}
