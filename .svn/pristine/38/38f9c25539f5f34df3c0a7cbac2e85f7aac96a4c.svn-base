package com.ibformation.cinema2.bo;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Film implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7274359566391007484L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	private String nom;
	private int duree;
	private LocalDate dateSortie;
	@ManyToMany
	private Set<Langue> langues = new HashSet<>(0);
	@ManyToMany
	private Set<Realisateur> realisateurs = new HashSet<>(0);
	@ManyToMany
	private Set<Categorie> categories = new HashSet<>(0);
	@OneToMany(mappedBy = "film",fetch = FetchType.LAZY)
	private Set<Seance> seances=new HashSet<>();

	public Film(String nom, int duree, LocalDate dateSortie, Set<Langue> langues, Set<Realisateur> realisateurs,
			Set<Categorie> categories) {
		super();
		this.nom = nom;
		this.duree = duree;
		this.dateSortie = dateSortie;
		this.langues = langues;
		this.realisateurs = realisateurs;
		this.categories = categories;
	}

	public Film(int id) {
		super();
		this.id = id;
	}

	
}
