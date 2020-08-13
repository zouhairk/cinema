package com.ibformation.dao;

import org.springframework.data.repository.CrudRepository;

import com.ibformation.bo.Compte;

public interface CompteDao extends CrudRepository<Compte, Integer> {

	public boolean connexion(Compte c);

	public boolean deconnexion(Compte c);

	public boolean verifierEmail(Compte c);

}
