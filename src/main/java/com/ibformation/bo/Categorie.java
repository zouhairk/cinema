package com.ibformation.bo;
 
import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

 
@Entity
@Table(name = "categorie", catalog = "cinema")
@Data
@NoArgsConstructor
public class Categorie implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4784640397242937109L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Categorie", unique = true, nullable = false)
	private Integer idCategorie;
	
	@Column(name = "nom_Categorie", length = 100)
	private String nomCategorie;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	private Set<Film> films = new HashSet<>(0);

	public Categorie(String nomCategorie, Set<Film> films) {
		this.nomCategorie = nomCategorie;
		this.films = films;
	}

}
