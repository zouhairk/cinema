package com.ibformation.bo;
 
import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

 
@Entity
@Table(name = "cinema", catalog = "cinema")
@Data
@NoArgsConstructor

public class Cinema implements java.io.Serializable {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_adresse")
	private Adresse adresse;
	@Column(length = 100)
	private String nomCinema;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
	private Set<Salle> salles=new HashSet<>();
	
	
	public Cinema(Adresse adresse, String nomCinema, Set<Salle> salles) {
		super();
		this.adresse = adresse;
		this.nomCinema = nomCinema;
		this.salles = salles;
	}	

	
	
}
