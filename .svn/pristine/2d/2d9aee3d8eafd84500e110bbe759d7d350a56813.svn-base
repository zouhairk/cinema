package com.ibformation.cinema2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibformation.cinema2.bo.Film;
import com.ibformation.cinema2.dao.FilmDAO;

@Service
@Component
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmDAO filmDao;

	@Override
	public Optional<Film> findById(Integer id){
		return filmDao.findById(id);
	}

	@Override
	public List<Film> findAll() {
		return (List<Film>) filmDao.findAll();
	}

	@Override
	public Film createOrUpdate(Film f) {
		return filmDao.save(f);
	}

	@Override
	public void deleteById(Integer id) {
		filmDao.deleteById(id);
	}

}