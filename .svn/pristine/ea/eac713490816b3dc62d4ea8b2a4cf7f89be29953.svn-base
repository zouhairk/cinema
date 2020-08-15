package com.ibformation.cinema2.bo;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Adresse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2893714056713833385L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;

	private String rue;
	private String ville;
	private String pays;
	private String codePostal;

	public Adresse(String rue, String ville, String pays, String codePostal) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
		this.codePostal = codePostal;
	}

}
