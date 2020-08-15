package com.ibformation.cinema2.bo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Realisateur implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 4798588504806886771L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	@ManyToMany(mappedBy = "realisateurs")
	private Set<Film> films=new HashSet<>();
}
