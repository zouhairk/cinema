package com.ibformation.cinema.service;

import java.sql.SQLException;

import com.ibformation.cinema.bo.Compte;

public interface CompteService extends Service<Compte, Integer>{

	public boolean connexion(Compte c) throws SQLException;

	public boolean deconnexion(Compte c) throws SQLException;

	public boolean verifierEmail(Compte c) throws SQLException;

}
