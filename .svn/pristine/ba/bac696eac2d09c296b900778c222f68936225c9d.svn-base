package com.ibformation.cinema2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibformation.cinema2.bo.Realisateur;
import com.ibformation.cinema2.dao.RealisateurDAO;

@Service
@Component
public class RealisateurServiceImpl implements RealisateurService {

	@Autowired
	private RealisateurDAO realDao;

	@Override
	public Optional<Realisateur> findById(Integer id) {
		return realDao.findById(id);
	}

	@Override
	public List<Realisateur> findAll() {
		return (List<Realisateur>) realDao.findAll();
	}

	@Override
	public Realisateur createOrUpdate(Realisateur r) {
		return realDao.save(r);
	}

	@Override
	public void deleteById(Integer id) {
		realDao.deleteById(id);
	}
}