package com.ibformation.cinema2.bo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Cinema implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5099062944132734738L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@OneToOne
	private Adresse adresse;
	@OneToMany(mappedBy = "cinema", fetch = FetchType.LAZY)
	private Set<Salle> salles=new HashSet<>();

	public Cinema(String nom_cinema, Adresse adresse) {
		super();
		this.nom = nom_cinema;
		this.adresse = adresse;
	}

}
