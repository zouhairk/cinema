package com.ibformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibformation.bo.Cinema;
import com.ibformation.dao.CinemaDao;

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
