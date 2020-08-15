package com.ibformation.cinema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibformation.cinema.bo.Cinema;
import com.ibformation.cinema.dao.CinemaDao;

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


}
