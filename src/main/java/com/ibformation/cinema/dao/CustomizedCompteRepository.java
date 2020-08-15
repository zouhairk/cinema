package com.ibformation.cinema.dao;

import java.sql.SQLException;

import com.ibformation.cinema.bo.Compte;

public interface CustomizedCompteRepository {
	public boolean connexion(Compte c) throws SQLException;

	public boolean deconnexion(Compte c) throws SQLException;

	public boolean verifierEmail(Compte c) throws SQLException;

}
