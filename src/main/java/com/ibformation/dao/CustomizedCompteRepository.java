package com.ibformation.dao;

import java.sql.SQLException;

import com.ibformation.bo.Compte;

public interface CustomizedCompteRepository {
	public boolean connexion(Compte c) throws SQLException;

	public boolean deconnexion(Compte c) throws SQLException;

	public boolean verifierEmail(Compte c) throws SQLException;

}
