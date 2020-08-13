package com.ibformation.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibformation.bo.Categorie;
import com.ibformation.dao.CategorieDAO;

@Service
@Transactional
public class CategorieServiceImpl implements CategorieService {

	@Autowired
	private CategorieDAO catDao;

	public CategorieServiceImpl() {
	}

	@Override
	public Optional<Categorie> find(Integer id) throws SQLException {
		return catDao.find(id);
	}

	@Override
	public List<Categorie> findAll() throws SQLException {
		return catDao.findAll();
	}

	@Override
	public boolean save(Categorie o) throws SQLException {
		return catDao.save(o);
	}

	@Override
	public boolean update(Categorie o) throws SQLException {
		return catDao.update(o);
	}

	@Override
	public boolean delete(Categorie o) throws SQLException {
		return catDao.delete(o);
	}
}