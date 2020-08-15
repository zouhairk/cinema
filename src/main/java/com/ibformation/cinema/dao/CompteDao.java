package com.ibformation.cinema.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibformation.cinema.bo.Compte;
@Repository
 
public interface CompteDao extends CrudRepository<Compte, Integer>, CustomizedCompteRepository {
	
}
