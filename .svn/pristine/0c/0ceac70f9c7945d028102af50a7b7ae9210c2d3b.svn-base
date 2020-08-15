package com.ibformation.cinema2.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibformation.cinema2.bo.Compte;
import com.ibformation.cinema2.dao.CompteDao;

@Service
@Component
public class CompteServiceImp implements CompteService {
	
	@Autowired
	private CompteDao compteDao;

	@Override
	public Optional<Compte> findById(Integer id) {
		return compteDao.findById(id);
	}

	@Override
	public List<Compte> findAll() {
		return (List<Compte>) compteDao.findAll();
	}

	@Override
	public Compte createOrUpdate(Compte o) {
		return compteDao.save(o);
	}

	@Override
	public void deleteById(Integer id) {
		compteDao.deleteById(id);
	}

	@Override
	public boolean connexion(Compte c) throws SQLException {
		return compteDao.connexion(c);
	}

	@Override
	public boolean deconnexion(Compte c) throws SQLException {
		return compteDao.deconnexion(c);
	}

	@Override
	public boolean verifierEmail(Compte c) throws SQLException {
		return compteDao.verifierEmail(c);
	}

}
