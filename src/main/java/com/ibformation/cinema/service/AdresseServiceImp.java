package com.ibformation.cinema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibformation.cinema.bo.Adresse;
import com.ibformation.cinema.dao.AdresseDao;


@Component
@Service
public class AdresseServiceImp implements AdresseService {
	
	@Autowired
	private AdresseDao adresseDao;

	public Optional<Adresse> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adresse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Adresse createOrUpdate(Adresse o) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
