package com.ibformation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibformation.bo.Compte;
@Repository
 
public interface CompteDao extends CrudRepository<Compte, Integer>, CustomizedCompteRepository {
	
}
