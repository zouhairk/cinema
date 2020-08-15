package com.ibformation.cinema2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibformation.cinema2.bo.Seance;
import com.ibformation.cinema2.dao.SeanceDao;

@Service
@Component
public class SeanceServiceImp implements SeanceService {

	@Autowired
	private SeanceDao seanceDao;

	@Override
	public Optional<Seance> findById(Integer id) {
		return seanceDao.findById(id);
	}

	@Override
	public List<Seance> findAll() {
		return (List<Seance>) seanceDao.findAll();
	}

	@Override
	public Seance createOrUpdate(Seance o) {
		return seanceDao.save(o);
	}

	@Override
	public void deleteById(Integer id) {
		seanceDao.deleteById(id);
	}

}
