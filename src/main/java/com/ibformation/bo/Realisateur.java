package com.ibformation.bo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "realisateur", catalog = "cinema")
@Data
@NoArgsConstructor
public class Realisateur implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2870754712050750881L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Auteur", unique = true, nullable = false)
	private Integer idAuteur;

	@Column(name = "nom_Realisateur", length = 100)
	private String nomRealisateur;

	@Column(name = "prenom_Realisateur", length = 100)
	private String prenomRealisateur;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_naissance_Auteur", nullable = false, length = 19)
	private Date dateNaissanceAuteur;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "realisateurs")
	private Set<Film> films = new HashSet<>(0);

	public Realisateur(Date dateNaissanceAuteur) {
		this.dateNaissanceAuteur = dateNaissanceAuteur;
	}

	public Realisateur(String nomRealisateur, String prenomRealisateur, Date dateNaissanceAuteur, Set<Film> films) {
		this.nomRealisateur = nomRealisateur;
		this.prenomRealisateur = prenomRealisateur;
		this.dateNaissanceAuteur = dateNaissanceAuteur;
		this.films = films;
	}

}
