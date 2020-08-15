package com.ibformation.cinema2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibformation.cinema2.bo.Adresse;
import com.ibformation.cinema2.dao.AdresseDao;


@Component
@Service
public class AdresseServiceImp implements AdresseService {
	
	@Autowired
	private AdresseDao adresseDao;

	@Override
	public Optional<Adresse> findById(Integer id) {
		return adresseDao.findById(id);
	}

	@Override
	public List<Adresse> findAll() {
		return (List<Adresse>) adresseDao.findAll();
	}

	@Override
	public Adresse createOrUpdate(Adresse o) {
		return adresseDao.save(o);
	}

	@Override
	public void deleteById(Integer id) {
		adresseDao.deleteById(id);
	}
	

}
