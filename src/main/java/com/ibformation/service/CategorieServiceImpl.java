package com.ibformation.service;

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

	@Override
<<<<<<< .mine
	public Optional<Categorie> find(Integer id) {
		return catDao.find(id);
||||||| .r3
	public Optional<Categorie> find(Integer id) throws SQLException {
		return catDao.find(id);
=======
	public Optional<Categorie> findById(Integer id) {
		return catDao.findById(id);
>>>>>>> .r12
	}

	@Override
<<<<<<< .mine
	public List<Categorie> findAll() {
		return catDao.findAll();
||||||| .r3
	public List<Categorie> findAll() throws SQLException {
		return catDao.findAll();
=======
	public List<Categorie> findAll() {
		return (List<Categorie>) catDao.findAll();
>>>>>>> .r12
	}

	@Override
<<<<<<< .mine
	public boolean save(Categorie o) {
||||||| .r3
	public boolean save(Categorie o) throws SQLException {
=======
	public Categorie createOrUpdate(Categorie o) {
>>>>>>> .r12
		return catDao.save(o);
	}

	@Override
<<<<<<< .mine
	public boolean update(Categorie o) {
		return catDao.update(o);
||||||| .r3
	public boolean update(Categorie o) throws SQLException {
		return catDao.update(o);
=======
	public void deleteById(Integer id) {
		catDao.deleteById(id);
>>>>>>> .r12
	}

<<<<<<< .mine
	@Override
	public boolean delete(Categorie o) {
		return catDao.delete(o);
	}
||||||| .r3
	@Override
	public boolean delete(Categorie o) throws SQLException {
		return catDao.delete(o);
	}
=======
>>>>>>> .r12
}