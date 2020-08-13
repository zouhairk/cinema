package com.ibformation.bo;
 
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
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

 
@Entity
@Table(name = "jeu", catalog = "cinema")
@Data
@NoArgsConstructor
public class Jeu implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6722736653999656249L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Jeu", unique = true, nullable = false)
	private Integer idJeu;

	@Column(name = "libelle_Jeu", length = 100)
	private String libelleJeu;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "avoir_question_jeu", catalog = "cinema", joinColumns = {
			@JoinColumn(name = "id_Jeu", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_Question", nullable = false, updatable = false) })
	private Set<Question> questions = new HashSet<>(0);

	public Jeu(String libelleJeu, Set<Question> questions) {
		this.libelleJeu = libelleJeu;
		this.questions = questions;
	}

}
