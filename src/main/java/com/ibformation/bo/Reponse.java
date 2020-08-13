package com.ibformation.bo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reponse", catalog = "cinema")
@Data
@NoArgsConstructor
public class Reponse implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3052333598613790707L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Cinema", unique = true, nullable = false)
	private Integer idCinema;
	
	@Column(name = "reponse_Reponse", length = 65535)
	private String reponseReponse;

	@Column(name = "vraie_reponse_Question")
	private Boolean vraieReponseQuestion;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "reponses", cascade = CascadeType.ALL)
	private Set<Question> questions = new HashSet<>();

	public Reponse(String reponseReponse, Boolean vraieReponseQuestion, Set<Question> questions) {
		this.reponseReponse = reponseReponse;
		this.vraieReponseQuestion = vraieReponseQuestion;
		this.questions = questions;
	}

}
