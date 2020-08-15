package com.ibformation.cinema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibformation.cinema.bo.Langue;
import com.ibformation.cinema.dao.LangueDAO;

@Service
public class LangueServiceImpl implements LangueService {

	@Autowired
	private LangueDAO langueDao;

	@Override
	public Optional<Langue> findById(Integer id) {
		return langueDao.findById(id);
	}

	@Override
	public List<Langue> findAll() {
		return (List<Langue>) langueDao.findAll();
	}

	@Override
	public Langue createOrUpdate(Langue langue) {
		return langueDao.save(langue);
	}

	@Override
	public void deleteById(Integer id) {
		langueDao.deleteById(id);
	}
}