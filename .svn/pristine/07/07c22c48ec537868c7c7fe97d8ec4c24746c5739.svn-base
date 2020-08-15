package com.ibformation.cinema2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibformation.cinema2.bo.Salle;
import com.ibformation.cinema2.dao.SalleDao;

@Service
@Component
public class SalleServiceImp implements SalleService {

	@Autowired
	private SalleDao salleDaoImp;

	@Override
	public Optional<Salle> findById(Integer id) {
		return salleDaoImp.findById(id);
	}

	@Override
	public List<Salle> findAll() {
		return (List<Salle>) salleDaoImp.findAll();
	}

	@Override
	public Salle createOrUpdate(Salle o) {
		return salleDaoImp.save(o);
	}

	@Override
	public void deleteById(Integer id) {
		salleDaoImp.deleteById(id);
	}

}
