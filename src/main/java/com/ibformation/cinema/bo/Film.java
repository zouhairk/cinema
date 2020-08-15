package com.ibformation.cinema.bo;
 
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

 
@Entity
@Table(name = "film", catalog = "cinema")
@Data
@NoArgsConstructor
public class Film implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8563835883288827958L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Film", unique = true, nullable = false)
	private Integer idFilm;

	@Column(name = "nom_Film", length = 100)
	private String nomFilm;

	@Column(name = "duree_Film")
	private Integer dureeFilm;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_sortie_realiser", nullable = false, length = 19)
	private Date dateSortieRealiser;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "film")
	private Set<Programmer> programmers = new HashSet<>(0);

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "films")
	private Set<Langue> langues = new HashSet<>(0);

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "realiser", catalog = "cinema", joinColumns = {
			@JoinColumn(name = "id_Film", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_Auteur", nullable = false, updatable = false) })
	private Set<Realisateur> realisateurs = new HashSet<>(0);

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "appartenir_film_categorie", catalog = "cinema", joinColumns = {
			@JoinColumn(name = "id_Film", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_Categorie", nullable = false, updatable = false) })
	private Set<Categorie> categories = new HashSet<>(0);

	public Film(Date dateSortieRealiser) {
		this.dateSortieRealiser = dateSortieRealiser;
	}

	public Film(String nomFilm, Integer dureeFilm, Date dateSortieRealiser, Set<Programmer> programmers, Set<Langue> langues,
			Set<Realisateur> realisateurs, Set<Categorie> categories) {
		this.nomFilm = nomFilm;
		this.dureeFilm = dureeFilm;
		this.dateSortieRealiser = dateSortieRealiser;
		this.programmers = programmers;
		this.langues = langues;
		this.realisateurs = realisateurs;
		this.categories = categories;
	}

}
