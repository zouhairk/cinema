package com.ibformation.cinema2.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Langue implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1272281128033814239L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private String libelle;
	public Langue(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	
}
