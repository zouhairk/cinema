package com.ibformation.cinema2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibformation.cinema2.bo.Categorie;
import com.ibformation.cinema2.dao.CategorieDAO;

@Service
@Transactional
public class CategorieServiceImpl implements CategorieService {

	@Autowired
	private CategorieDAO catDao;

	@Override
	public Optional<Categorie> findById(Integer id) {
		return catDao.findById(id);
	}

	@Override
	public List<Categorie> findAll() {
		return (List<Categorie>) catDao.findAll();
	}

	@Override
	public Categorie createOrUpdate(Categorie o) {
		return catDao.save(o);
	}

	@Override
	public void deleteById(Integer id) {
		catDao.deleteById(id);
	}

}